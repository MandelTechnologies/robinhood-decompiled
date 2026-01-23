package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SecurityChecker.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecks", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "(Ljava/util/List;)V", "getWarnings", "Lcom/stripe/android/stripe3ds2/init/Warning;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.stripe3ds2.init.DefaultSecurityChecker, reason: use source file name */
/* loaded from: classes26.dex */
public final class SecurityChecker2 implements SecurityChecker {
    private static final Companion Companion = new Companion(null);
    private static final List<SecurityCheck> DEFAULT_CHECKS = CollectionsKt.listOf((Object[]) new SecurityCheck[]{new SecurityCheck.RootedCheck(), new SecurityCheck.Tampered(), new SecurityCheck.Emulator(), new SecurityCheck.DebuggerAttached(false, 1, null), new SecurityCheck.UnsupportedOS()});
    private final List<SecurityCheck> securityChecks;

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityChecker2(List<? extends SecurityCheck> securityChecks) {
        Intrinsics.checkNotNullParameter(securityChecks, "securityChecks");
        this.securityChecks = securityChecks;
    }

    public /* synthetic */ SecurityChecker2(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_CHECKS : list);
    }

    @Override // com.stripe.android.stripe3ds2.init.SecurityChecker
    public List<Warning> getWarnings() {
        List<SecurityCheck> list = this.securityChecks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SecurityCheck) obj).getIsDebuggerConnected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SecurityCheck) it.next()).getWarning());
        }
        return arrayList2;
    }

    /* compiled from: SecurityChecker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;", "", "<init>", "()V", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultSecurityChecker$Companion */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
