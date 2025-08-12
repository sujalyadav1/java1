import pandas as pd

# Load your dataset (update the filename as needed)
df = pd.read_csv('geldium_dataset.csv')  # Replace with your actual file

# Step 1: Review data
print("Basic Info:")
print(df.info())

print("\nMissing Values:")
print(df.isnull().sum())

print("\nSummary Statistics:")
print(df.describe(include='all'))

# Step 2: Identify potential outliers and key risk indicators
if 'income' in df.columns:
    print("\nUnusually low income (<$5,000):", df[df['income'] < 5000].shape[0])

if 'number_of_open_accounts' in df.columns:
    print("\nUnusually high open accounts (>50):", df[df['number_of_open_accounts'] > 50].shape[0])

# Step 3: Correlation with delinquency (if available)
if 'delinquent' in df.columns:
    print("\nTop correlated variables with 'delinquent':")
    print(df.corr(numeric_only=True)['delinquent'].abs().sort_values(ascending=False)[1:4])

# Step 4: Missing Data Handling Table (Example)
missing_data_table = [
    {'Feature': 'credit_utilization', 'Method': 'Impute (median)', 'Justification': 'Median is robust to outliers.'},
    {'Feature': 'income', 'Method': 'Synthetic Generation', 'Justification': 'Preserve distribution for modeling.'},
    {'Feature': 'payment_history', 'Method': 'Remove', 'Justification': 'Excessive missingness (if >30%).'}
]

print("\nMissing Data Strategy Table:")
for row in missing_data_table:
    print(row)

# Step 5: Risk Indicators
print("\nHigh-Risk Indicators:")
if 'credit_utilization' in df.columns:
    print("- High credit utili
