package com.nimbusds.jose.shaded.json.writer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes27.dex */
public class ArraysMapper<T> extends JsonReaderI<T> {
    public static JsonReaderI<Boolean[]> MAPPER_BOOL;
    public static JsonReaderI<Byte[]> MAPPER_BYTE;
    public static JsonReaderI<Character[]> MAPPER_CHAR;
    public static JsonReaderI<Double[]> MAPPER_DOUBLE;
    public static JsonReaderI<Float[]> MAPPER_FLOAT;
    public static JsonReaderI<Integer[]> MAPPER_INT;
    public static JsonReaderI<Long[]> MAPPER_LONG;
    public static JsonReaderI<boolean[]> MAPPER_PRIM_BOOL;
    public static JsonReaderI<byte[]> MAPPER_PRIM_BYTE;
    public static JsonReaderI<char[]> MAPPER_PRIM_CHAR;
    public static JsonReaderI<double[]> MAPPER_PRIM_DOUBLE;
    public static JsonReaderI<float[]> MAPPER_PRIM_FLOAT;
    public static JsonReaderI<int[]> MAPPER_PRIM_INT;
    public static JsonReaderI<long[]> MAPPER_PRIM_LONG;
    public static JsonReaderI<short[]> MAPPER_PRIM_SHORT;
    public static JsonReaderI<Short[]> MAPPER_SHORT;

    public ArraysMapper(JsonReader jsonReader) {
        super(jsonReader);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public Object createArray() {
        return new ArrayList();
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public void addValue(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    static {
        JsonReader jsonReader = null;
        MAPPER_PRIM_INT = new ArraysMapper<int[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.1
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public int[] convert(Object obj) {
                List list = (List) obj;
                int[] iArr = new int[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    iArr[i] = ((Number) it.next()).intValue();
                    i++;
                }
                return iArr;
            }
        };
        MAPPER_INT = new ArraysMapper<Integer[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.2
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Integer[] convert(Object obj) {
                List list = (List) obj;
                Integer[] numArr = new Integer[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Integer) {
                            numArr[i] = (Integer) obj2;
                        } else {
                            numArr[i] = Integer.valueOf(((Number) obj2).intValue());
                        }
                        i++;
                    }
                }
                return numArr;
            }
        };
        MAPPER_PRIM_SHORT = new ArraysMapper<short[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.3
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public short[] convert(Object obj) {
                List list = (List) obj;
                short[] sArr = new short[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    sArr[i] = ((Number) it.next()).shortValue();
                    i++;
                }
                return sArr;
            }
        };
        MAPPER_SHORT = new ArraysMapper<Short[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.4
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Short[] convert(Object obj) {
                List list = (List) obj;
                Short[] shArr = new Short[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Short) {
                            shArr[i] = (Short) obj2;
                        } else {
                            shArr[i] = Short.valueOf(((Number) obj2).shortValue());
                        }
                        i++;
                    }
                }
                return shArr;
            }
        };
        MAPPER_PRIM_BYTE = new ArraysMapper<byte[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.5
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public byte[] convert(Object obj) {
                List list = (List) obj;
                byte[] bArr = new byte[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    bArr[i] = ((Number) it.next()).byteValue();
                    i++;
                }
                return bArr;
            }
        };
        MAPPER_BYTE = new ArraysMapper<Byte[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.6
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Byte[] convert(Object obj) {
                List list = (List) obj;
                Byte[] bArr = new Byte[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Byte) {
                            bArr[i] = (Byte) obj2;
                        } else {
                            bArr[i] = Byte.valueOf(((Number) obj2).byteValue());
                        }
                        i++;
                    }
                }
                return bArr;
            }
        };
        MAPPER_PRIM_CHAR = new ArraysMapper<char[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.7
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public char[] convert(Object obj) {
                List list = (List) obj;
                char[] cArr = new char[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    cArr[i] = it.next().toString().charAt(0);
                    i++;
                }
                return cArr;
            }
        };
        MAPPER_CHAR = new ArraysMapper<Character[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.8
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Character[] convert(Object obj) {
                List list = (List) obj;
                Character[] chArr = new Character[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        chArr[i] = Character.valueOf(obj2.toString().charAt(0));
                        i++;
                    }
                }
                return chArr;
            }
        };
        MAPPER_PRIM_LONG = new ArraysMapper<long[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.9
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public long[] convert(Object obj) {
                List list = (List) obj;
                long[] jArr = new long[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    jArr[i] = ((Number) it.next()).intValue();
                    i++;
                }
                return jArr;
            }
        };
        MAPPER_LONG = new ArraysMapper<Long[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.10
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Long[] convert(Object obj) {
                List list = (List) obj;
                Long[] lArr = new Long[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Float) {
                            lArr[i] = (Long) obj2;
                        } else {
                            lArr[i] = Long.valueOf(((Number) obj2).longValue());
                        }
                        i++;
                    }
                }
                return lArr;
            }
        };
        MAPPER_PRIM_FLOAT = new ArraysMapper<float[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.11
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public float[] convert(Object obj) {
                List list = (List) obj;
                float[] fArr = new float[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    fArr[i] = ((Number) it.next()).floatValue();
                    i++;
                }
                return fArr;
            }
        };
        MAPPER_FLOAT = new ArraysMapper<Float[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.12
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Float[] convert(Object obj) {
                List list = (List) obj;
                Float[] fArr = new Float[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Float) {
                            fArr[i] = (Float) obj2;
                        } else {
                            fArr[i] = Float.valueOf(((Number) obj2).floatValue());
                        }
                        i++;
                    }
                }
                return fArr;
            }
        };
        MAPPER_PRIM_DOUBLE = new ArraysMapper<double[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.13
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public double[] convert(Object obj) {
                List list = (List) obj;
                double[] dArr = new double[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    dArr[i] = ((Number) it.next()).doubleValue();
                    i++;
                }
                return dArr;
            }
        };
        MAPPER_DOUBLE = new ArraysMapper<Double[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.14
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Double[] convert(Object obj) {
                List list = (List) obj;
                Double[] dArr = new Double[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Double) {
                            dArr[i] = (Double) obj2;
                        } else {
                            dArr[i] = Double.valueOf(((Number) obj2).doubleValue());
                        }
                        i++;
                    }
                }
                return dArr;
            }
        };
        MAPPER_PRIM_BOOL = new ArraysMapper<boolean[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.15
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public boolean[] convert(Object obj) {
                List list = (List) obj;
                boolean[] zArr = new boolean[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    zArr[i] = ((Boolean) it.next()).booleanValue();
                    i++;
                }
                return zArr;
            }
        };
        MAPPER_BOOL = new ArraysMapper<Boolean[]>(jsonReader) { // from class: com.nimbusds.jose.shaded.json.writer.ArraysMapper.16
            @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
            public Boolean[] convert(Object obj) {
                List list = (List) obj;
                Boolean[] boolArr = new Boolean[list.size()];
                int i = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        if (obj2 instanceof Boolean) {
                            boolArr[i] = (Boolean) obj2;
                        } else {
                            if (!(obj2 instanceof Number)) {
                                throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                            }
                            boolArr[i] = Boolean.valueOf(((Number) obj2).intValue() != 0);
                        }
                        i++;
                    }
                }
                return boolArr;
            }
        };
    }
}
