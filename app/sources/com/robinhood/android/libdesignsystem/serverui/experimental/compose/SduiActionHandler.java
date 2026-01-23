package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0001\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "ActionT", "", "handle", "", "action", "(Ljava/lang/Object;)Z", "NotImplemented", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, reason: use source file name */
/* loaded from: classes17.dex */
public interface SduiActionHandler<ActionT> {
    /* renamed from: handle */
    boolean mo15941handle(ActionT action);

    /* compiled from: SduiActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler$NotImplemented;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "", "<init>", "()V", "handle", "", "action", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler$NotImplemented */
    public static final class NotImplemented implements SduiActionHandler<Object> {
        public static final int $stable = 0;
        public static final NotImplemented INSTANCE = new NotImplemented();

        private NotImplemented() {
        }

        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ boolean mo15941handle(Object obj) {
            return ((Boolean) handle(obj)).booleanValue();
        }

        public Void handle(Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            throw new IllegalStateException(("Action handler did not handle " + action).toString());
        }
    }
}
