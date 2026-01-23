package kotlin.jdk7;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: AutoCloseableJVM.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: kotlin.jdk7.AutoCloseableKt$AutoCloseable$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class AutoCloseableJVM2 implements AutoCloseable {
    final /* synthetic */ Function0<Unit> $closeAction;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.$closeAction.invoke();
    }
}
