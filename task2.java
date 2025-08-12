from graphviz import Digraph

dot = Digraph(comment='Processor UML Diagram', format='pdf')
dot.attr(rankdir='BT')  # Top-down layout

# Processor class
dot.node('Processor', '''<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">
  <TR><TD><B>Processor</B></TD></TR>
  <TR><TD>- modeHandler: ModeHandler</TD></TR>
  <TR><TD>- databaseHandler: DatabaseHandler</TD></TR>
  <TR><TD>+ configure(mode: ModeIdentifier, db: DatabaseIdentifier): void</TD></TR>
  <TR><TD>+ process(data: Datapoint): void</TD></TR>
</TABLE>>''', shape='plaintext')

# ModeHandler interface
dot.node('ModeHandler', '''<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">
  <TR><TD><B><I>ModeHandler</I></B></TD></TR>
  <TR><TD>+ handle(data: Datapoint, db: DatabaseHandler): void</TD></TR>
</TABLE>>''', shape='plaintext')

# Implementing Mode Handlers
for mode in ['Dump', 'Passthrough', 'Validate']:
    class_name = f"{mode}ModeHandler"
    dot.node(class_name, f"{class_name}\\nimplements ModeHandler")
    dot.edge(class_name, 'ModeHandler', arrowhead='onormal')

# DatabaseHandler interface
dot.node('DatabaseHandler', '''<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">
  <TR><TD><B><I>DatabaseHandler</I></B></TD></TR>
  <TR><TD>+ connect(): void</TD></TR>
  <TR><TD>+ insert(data: Datapoint): void</TD></TR>
  <TR><TD>+ validate(data: Datapoint): boolean</TD></TR>
</TABLE>>''', shape='plaintext')

# Implementing DB Handlers
for db in ['Postgres', 'Redis', 'Elastic']:
    class_name = f"{db}Handler"
    dot.node(class_name, f"{class_name}\\nimplements DatabaseHandler")
    dot.edge(class_name, 'DatabaseHandler', arrowhead='onormal')

# Supporting types
dot.node('Datapoint', 'Datapoint\n(predefined)', shape='box')
dot.node('ModeIdentifier', 'ModeIdentifier\n(enum)', shape='ellipse')
dot.node('DatabaseIdentifier', 'DatabaseIdentifier\n(enum)', shape='ellipse')

# Dependencies
dot.edge('Processor', 'ModeHandler', style='dashed', label='uses')
dot.edge('Processor', 'DatabaseHandler', style='dashed', label='uses')
dot.edge('Processor', 'Datapoint', style='dashed', label='uses')
dot.edge('Processor', 'ModeIdentifier', style='dashed', label='uses')
dot.edge('Processor', 'DatabaseIdentifier', style='dashed', label='uses')

# Render
dot.render('Processor_UML_Diagram', cleanup=False)
print("Diagram saved as Processor_UML_Diagram.pdf")
