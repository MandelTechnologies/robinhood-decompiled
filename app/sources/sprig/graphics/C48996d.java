package sprig.graphics;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m3636d2 = {"Lsprig/c/d;", "", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)I", "other", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@JvmInline
/* renamed from: sprig.c.d */
/* loaded from: classes28.dex */
public final class C48996d {

    /* renamed from: a, reason: from kotlin metadata */
    private final String name;

    private /* synthetic */ C48996d(String str) {
        this.name = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C48996d m4041a(String str) {
        return new C48996d(str);
    }

    /* renamed from: a */
    public static boolean m4042a(String str, Object obj) {
        return (obj instanceof C48996d) && Intrinsics.areEqual(str, ((C48996d) obj).getName());
    }

    /* renamed from: b */
    public static String m4043b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return name;
    }

    /* renamed from: c */
    public static int m4044c(String str) {
        return str.hashCode();
    }

    /* renamed from: d */
    public static String m4045d(String str) {
        return "FragmentName(name=" + str + ')';
    }

    /* renamed from: a, reason: from getter */
    public final /* synthetic */ String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        return m4042a(this.name, obj);
    }

    public int hashCode() {
        return m4044c(this.name);
    }

    public String toString() {
        return m4045d(this.name);
    }
}
