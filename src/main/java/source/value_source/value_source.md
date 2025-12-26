## Limitations of @ValueSource

# One of the limitations of value sources is that they only support these types:

short (with the shorts attribute)
byte (bytes attribute)
int (ints attribute)
long (longs attribute)
float (floats attribute)
double (doubles attribute)
char (chars attribute)
java.lang.String (strings attribute)
java.lang.Class (classes attribute)
# Also, we can only pass one argument to the test method each time.

# Before going any further, note that we didn’t pass null as an argument. That’s another limitation — we can’t pass null through a @ValueSource, even for String and Class.