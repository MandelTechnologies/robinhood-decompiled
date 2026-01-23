package com.stripe.android.core.networking;

import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeRequest;", "", "<init>", "()V", "Ljava/io/OutputStream;", "outputStream", "", "writePostBody", "(Ljava/io/OutputStream;)V", "", "", "postHeaders", "Ljava/util/Map;", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "", "shouldCache", "Z", "getShouldCache", "()Z", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "method", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "retryResponseCodes", "getUrl", "()Ljava/lang/String;", "url", "getHeaders", "headers", "Method", "MimeType", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class StripeRequest {
    private Map<String, String> postHeaders;
    private final boolean shouldCache;

    public abstract Map<String, String> getHeaders();

    public abstract Method getMethod();

    public abstract Iterable<Integer> getRetryResponseCodes();

    public abstract String getUrl();

    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
    }

    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public boolean getShouldCache() {
        return this.shouldCache;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeRequest$Method;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "GET", "POST", "DELETE", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Method {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        private final String code;
        public static final Method GET = new Method("GET", 0, "GET");
        public static final Method POST = new Method("POST", 1, "POST");
        public static final Method DELETE = new Method("DELETE", 2, "DELETE");

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{GET, POST, DELETE};
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }

        private Method(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(methodArr$values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Form", "MultipartForm", "Json", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class MimeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MimeType[] $VALUES;
        private final String code;
        public static final MimeType Form = new MimeType("Form", 0, "application/x-www-form-urlencoded");
        public static final MimeType MultipartForm = new MimeType("MultipartForm", 1, "multipart/form-data");
        public static final MimeType Json = new MimeType("Json", 2, "application/json");

        private static final /* synthetic */ MimeType[] $values() {
            return new MimeType[]{Form, MultipartForm, Json};
        }

        public static EnumEntries<MimeType> getEntries() {
            return $ENTRIES;
        }

        public static MimeType valueOf(String str) {
            return (MimeType) Enum.valueOf(MimeType.class, str);
        }

        public static MimeType[] values() {
            return (MimeType[]) $VALUES.clone();
        }

        private MimeType(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            MimeType[] mimeTypeArr$values = $values();
            $VALUES = mimeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mimeTypeArr$values);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }
}
