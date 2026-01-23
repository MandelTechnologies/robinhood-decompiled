package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Data {
    Map<String, Object> mValues;
    private static final String TAG = Logger.tagWithPrefix("Data");
    public static final Data EMPTY = new Builder().build();

    Data() {
    }

    public Data(Data other) {
        this.mValues = new HashMap(other.mValues);
    }

    public Data(Map<String, ?> values) {
        this.mValues = new HashMap(values);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        Object obj = this.mValues.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    public String getString(String key) {
        Object obj = this.mValues.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.mValues);
    }

    public int size() {
        return this.mValues.size();
    }

    public static byte[] toByteArrayInternal(Data data) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(data.size());
            for (Map.Entry<String, Object> entry : data.mValues.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(TAG, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(TAG, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(TAG, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(TAG, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(TAG, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    Log.e(TAG, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                Log.e(TAG, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:4|(7:58|5|61|6|(2:8|9)|52|16)|56|20|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        android.util.Log.e(androidx.work.Data.TAG, "Error in Data#fromByteArray: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Data fromByteArray(byte[] bytes) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e;
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        Log.e(TAG, "Error in Data#fromByteArray: ", e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    Log.e(TAG, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                            Log.e(TAG, "Error in Data#fromByteArray: ", e4);
                        }
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    Log.e(TAG, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e6) {
                        Log.e(TAG, "Error in Data#fromByteArray: ", e6);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e7) {
                    Log.e(TAG, "Error in Data#fromByteArray: ", e7);
                    throw th;
                }
            }
        } catch (IOException e8) {
            e = e8;
            Throwable th3 = e;
            objectInputStream = null;
            e = th3;
            Log.e(TAG, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new Data(map);
        } catch (ClassNotFoundException e9) {
            e = e9;
            Throwable th32 = e;
            objectInputStream = null;
            e = th32;
            Log.e(TAG, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new Data(map);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        byteArrayInputStream.close();
        return new Data(map);
    }

    public boolean equals(Object o) {
        boolean zEquals;
        if (this == o) {
            return true;
        }
        if (o == null || Data.class != o.getClass()) {
            return false;
        }
        Data data = (Data) o;
        Set<String> setKeySet = this.mValues.keySet();
        if (!setKeySet.equals(data.mValues.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.mValues.get(str);
            Object obj2 = data.mValues.get(str);
            if (obj == null || obj2 == null) {
                zEquals = obj == obj2;
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                zEquals = Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
            } else {
                zEquals = obj.equals(obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.mValues.isEmpty()) {
            for (String str : this.mValues.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.mValues.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static Boolean[] convertPrimitiveBooleanArray(boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i = 0; i < value.length; i++) {
            boolArr[i] = Boolean.valueOf(value[i]);
        }
        return boolArr;
    }

    public static Byte[] convertPrimitiveByteArray(byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i = 0; i < value.length; i++) {
            bArr[i] = Byte.valueOf(value[i]);
        }
        return bArr;
    }

    public static Integer[] convertPrimitiveIntArray(int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i = 0; i < value.length; i++) {
            numArr[i] = Integer.valueOf(value[i]);
        }
        return numArr;
    }

    public static Long[] convertPrimitiveLongArray(long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i = 0; i < value.length; i++) {
            lArr[i] = Long.valueOf(value[i]);
        }
        return lArr;
    }

    public static Float[] convertPrimitiveFloatArray(float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i = 0; i < value.length; i++) {
            fArr[i] = Float.valueOf(value[i]);
        }
        return fArr;
    }

    public static Double[] convertPrimitiveDoubleArray(double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            dArr[i] = Double.valueOf(value[i]);
        }
        return dArr;
    }

    public static boolean[] convertToPrimitiveArray(Boolean[] array2) {
        boolean[] zArr = new boolean[array2.length];
        for (int i = 0; i < array2.length; i++) {
            zArr[i] = array2[i].booleanValue();
        }
        return zArr;
    }

    public static byte[] convertToPrimitiveArray(Byte[] array2) {
        byte[] bArr = new byte[array2.length];
        for (int i = 0; i < array2.length; i++) {
            bArr[i] = array2[i].byteValue();
        }
        return bArr;
    }

    public static int[] convertToPrimitiveArray(Integer[] array2) {
        int[] iArr = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            iArr[i] = array2[i].intValue();
        }
        return iArr;
    }

    public static long[] convertToPrimitiveArray(Long[] array2) {
        long[] jArr = new long[array2.length];
        for (int i = 0; i < array2.length; i++) {
            jArr[i] = array2[i].longValue();
        }
        return jArr;
    }

    public static float[] convertToPrimitiveArray(Float[] array2) {
        float[] fArr = new float[array2.length];
        for (int i = 0; i < array2.length; i++) {
            fArr[i] = array2[i].floatValue();
        }
        return fArr;
    }

    public static double[] convertToPrimitiveArray(Double[] array2) {
        double[] dArr = new double[array2.length];
        for (int i = 0; i < array2.length; i++) {
            dArr[i] = array2[i].doubleValue();
        }
        return dArr;
    }

    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        public Builder putString(String key, String value) {
            this.mValues.put(key, value);
            return this;
        }

        public Builder putAll(Data data) {
            putAll(data.mValues);
            return this;
        }

        public Builder putAll(Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder put(String key, Object value) {
            if (value == null) {
                this.mValues.put(key, null);
                return this;
            }
            Class<?> cls = value.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.mValues.put(key, value);
                return this;
            }
            if (cls == boolean[].class) {
                this.mValues.put(key, Data.convertPrimitiveBooleanArray((boolean[]) value));
                return this;
            }
            if (cls == byte[].class) {
                this.mValues.put(key, Data.convertPrimitiveByteArray((byte[]) value));
                return this;
            }
            if (cls == int[].class) {
                this.mValues.put(key, Data.convertPrimitiveIntArray((int[]) value));
                return this;
            }
            if (cls == long[].class) {
                this.mValues.put(key, Data.convertPrimitiveLongArray((long[]) value));
                return this;
            }
            if (cls == float[].class) {
                this.mValues.put(key, Data.convertPrimitiveFloatArray((float[]) value));
                return this;
            }
            if (cls == double[].class) {
                this.mValues.put(key, Data.convertPrimitiveDoubleArray((double[]) value));
                return this;
            }
            throw new IllegalArgumentException("Key " + key + " has invalid type " + cls);
        }

        public Data build() throws Throwable {
            Data data = new Data((Map<String, ?>) this.mValues);
            Data.toByteArrayInternal(data);
            return data;
        }
    }
}
