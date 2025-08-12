import sqlite3
import csv
from collections import defaultdict

# Connect to SQLite DB
conn = sqlite3.connect('shipment_database.sqlite')
cursor = conn.cursor()

# Insert data from spreadsheet_0.csv
with open('spreadsheet_0.csv', newline='') as file:
    reader = csv.DictReader(file)
    for row in reader:
        cursor.execute('''
            INSERT INTO products (product_name, category, manufacturer)
            VALUES (?, ?, ?)
        ''', (row['product_name'], row['category'], row['manufacturer']))

# Load shipment locations from spreadsheet_2.csv
shipment_locations = {}
with open('spreadsheet_2.csv', newline='') as file:
    reader = csv.DictReader(file)
    for row in reader:
        shipment_id = row['shipment_identifier']
        shipment_locations[shipment_id] = {
            'origin': row['origin'],
            'destination': row['destination']
        }

# Organize products by shipment from spreadsheet_1.csv
shipment_products = defaultdict(list)
with open('spreadsheet_1.csv', newline='') as file:
    reader = csv.DictReader(file)
    for row in reader:
        shipment_id = row['shipment_identifier']
        shipment_products[shipment_id].append(row['product_name'])

# Insert shipments and shipment_products
for shipment_id, product_list in shipment_products.items():
    origin = shipment_locations[shipment_id]['origin']
    destination = shipment_locations[shipment_id]['destination']

    # Inse
