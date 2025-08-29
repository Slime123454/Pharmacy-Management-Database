# Pharmacy-Management-Database
A Java-based pharmacy management system that handles different types of medications, their taxes, and reimbursement calculations.

## Features

- **Medication Management**: Store and manage different types of medications
- **Tax Calculation**: Automatic tax calculation based on medication type
- **Reimbursement Tracking**: Track reimbursable medications
- **Multiple Medication Types**:
  - Homeopathic medicines
  - Antibiotics
  - Anti-inflammatory drugs

## Class Structure

- `Medicament` (Abstract Base Class)
  - [Homeopatique](cci:2://file:///home/slime/old%20slime/NetBeansProjects/pharmacie%20%281%29/src/main/java/com/mycompany/pharmacie/Homeopatique.java:10:0-35:1) (Homeopathic medicines)
  - `Antibiotique` (Antibiotics) - implements `Remboursable`
  - `Antiflamatoire` (Anti-inflammatory) - implements `Remboursable`
- [Pharmacie](cci:2://file:///home/slime/old%20slime/NetBeansProjects/pharmacie%20%281%29/src/main/java/com/mycompany/pharmacie/Pharmacie.java:1:0-22:2) (Main management class)
- `Remboursable` (Interface for reimbursable items)

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone [https://github.com/yourusername/pharmacy-management-system.git](https://github.com/yourusername/pharmacy-management-system.git)
   cd pharmacy-management-system
