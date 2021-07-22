
Potential Classes/Properties:

Table, items, water, Cylindrical, Cuboid, Cube, color, radius, height, width, length, volume

Table: Has-A-> items

Items: Has-A-> Color, volume,height

Cylindrical: Has-A: Color, radius, height,volume
Cuboid: Has-A: Color, width, length, height,volume
Cube: Has-A: Color, height,volume


===================================
Table: Has-A-> items

Items: Has-A-> Color, volume,height

Cylindrical: Has-A: Color, radius, height,volume
Cuboid: Has-A: Color, width, length, height,volume
Cube: Has-A: Color, height,volume


Cylindrical: IS-A Item + radius
Cuboid: IS-A Item + width + length
Cube: IS-A Item

Superclass: Item
Subclass: Cylindrical, Cuboid, Cube

===================================
Behaviours:

Table:
--- getTotalVolume
--- getTotalVolumeForCuboid
--- getTotalVolumeInYellowItems

Cylindrical: IS-A Item + radius
--- getVolume
--- getColor
Cuboid: IS-A Item + width + length
--- getVolume
--- getColor
Cube: IS-A Item
--- getVolume
--- getColor


===================================
Behaviours:

Table:
--- getTotalVolume
--- getTotalVolumeForCuboid
--- getTotalVolumeInYellowItems

Item:
--- getVolume
--- getColor

Cylindrical: IS-A Item + radius
Cuboid: IS-A Item + width + length
Cube: IS-A Item


