package sprig.p546d;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u0010"}, m3636d2 = {"Lsprig/d/b;", "", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "Lkotlin/Function1;", "", "", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "errorReporter", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.d.b */
/* loaded from: classes28.dex */
public final class C49004b {

    /* renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function1<Throwable, Unit> errorReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public C49004b(String name, Function1<? super Throwable, Unit> errorReporter) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.name = name;
        this.errorReporter = errorReporter;
    }

    /* renamed from: a */
    public final Function1<Throwable, Unit> m4142a() {
        return this.errorReporter;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
