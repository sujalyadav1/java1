from graphviz import Digraph

erd = Digraph('ERD', format='pdf')
erd.attr(rankdir='LR', size='8,5')

entities = {
    'Product': ['product_id (PK)', 'name', 'type', 'manufacturer_id (FK)'],
    'PetFood': ['product_id (PK, FK)', 'weight', 'flavor', 'target_health_condition'],
    'PetToy': ['product_id (PK, FK)', 'material', 'durability'],
    'PetApparel': ['product_id (PK, FK)', 'color', 'size', 'care_instructions'],
    'Animal': ['animal_id (PK)', 'species'],
    'ProductAnimal': ['product_id (PK, FK)', 'animal_id (PK, FK)'],
    'Manufacturer': ['manufacturer_id (PK)', 'name'],
    'Customer': ['customer_id (PK)', 'name', 'email'],
    'Transaction': ['transaction_id (PK)', 'customer_id (FK)', 'transaction_date'],
    'TransactionProduct': ['transaction_id (PK, FK)', 'product_id (PK, FK)', 'quantity'],
    'Location': ['location_id (PK)', 'name', 'zip_code'],
    'Shipment': ['shipment_id (PK)', 'origin_location_id (FK)', 'destination_location_id (FK)'],
    'ShipmentProduct': ['shipment_id (PK, FK)', 'product_id (PK, FK)', 'quantity']
}

for entity, attributes in entities.items():
    label = f"<<TABLE BORDER='1' CELLBORDER='0' CELLSPACING='0'><TR><TD><B>{entity}</B></TD></TR>"
    for attr in attributes:
        label += f"<TR><TD ALIGN='LEFT'>{attr}</TD></TR>"
    label += "</TABLE>>"
    erd.node(entity, label=label, shape='plaintext')

# Relationships
erd.edge('Product', 'Manufacturer', label='manufacturer_id', arrowhead='vee')
erd.edge('PetFood', 'Product', arrowhead='vee')
erd.edge('PetToy', 'Product', arrowhead='vee')
erd.edge('PetApparel', 'Product', arrowhead='vee')
erd.edge('ProductAnimal', 'Product', arrowhead='vee')
erd.edge('ProductAnimal', 'Animal', arrowhead='vee')
erd.edge('Transaction', 'Customer', label='customer_id', arrowhead='vee')
erd.edge('TransactionProduct', 'Transaction', arrowhead='vee')
erd.edge('TransactionProduct', 'Product', arrowhead='vee')
erd.edge('Shipment', 'Location', label='origin_location_id', arrowhead='vee')
erd.edge('Shipment', 'Location', label='destination_location_id', arrowhead='vee')
erd.edge('ShipmentProduct', 'Shipment', arrowhead='vee')
erd.edge('ShipmentProduct', 'Product', arrowhead='vee')

# Render ERD to PDF
erd.render('PetStore_ERD', cleanup=False)
print("Diagram saved as PetStore_ERD.pdf")
