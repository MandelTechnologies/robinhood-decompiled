package microgram.android.internal.guest;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GuestRuntimeTunnel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$run$2$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class GuestRuntimeTunnel4 extends FunctionReferenceImpl implements Function1<RuntimeMessage, Unit> {
    GuestRuntimeTunnel4(Object obj) {
        super(1, obj, GuestRuntimeTunnel.class, "onGuestEvent", "onGuestEvent(Lmicrogram/android/internal/guest/RuntimeMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RuntimeMessage runtimeMessage) {
        invoke2(runtimeMessage);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RuntimeMessage p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GuestRuntimeTunnel) this.receiver).onGuestEvent(p0);
    }
}
