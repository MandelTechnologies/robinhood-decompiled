package com.robinhood.android.libdesignsystem.serverui.experimental.action.dto;

import com.robinhood.idl.Dto3;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: DtoActionHandler.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0010J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "T", "", "convertAlertToAction", "alert", "Lrh_server_driven_ui/v1/AlertDto;", "(Lrh_server_driven_ui/v1/AlertDto;)Ljava/lang/Object;", "handle", "", "action", "alertType", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "handle-RsTtcXE", "(Ljava/lang/Object;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;I)Z", "NotImplemented", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DtoActionHandler<T> {

    /* compiled from: DtoActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T> T convertAlertToAction(DtoActionHandler<T> dtoActionHandler, AlertDto alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return null;
        }
    }

    T convertAlertToAction(AlertDto alert);

    /* renamed from: handle-RsTtcXE */
    boolean mo10782handleRsTtcXE(T action, GenericAlertMobilePresentationStyle alertType, int textAlign);

    /* compiled from: DtoActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler$NotImplemented;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "Lcom/robinhood/idl/MessageDto;", "<init>", "()V", "handle", "", "action", "alertType", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "handle-RsTtcXE", "(Lcom/robinhood/idl/MessageDto;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;I)Ljava/lang/Void;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NotImplemented implements DtoActionHandler<Dto3<?>> {
        public static final int $stable = 0;
        public static final NotImplemented INSTANCE = new NotImplemented();

        private NotImplemented() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
        public Dto3<?> convertAlertToAction(AlertDto alertDto) {
            return (Dto3) DefaultImpls.convertAlertToAction(this, alertDto);
        }

        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
        /* renamed from: handle-RsTtcXE */
        public /* bridge */ /* synthetic */ boolean mo10782handleRsTtcXE(Dto3<?> dto3, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i) {
            return ((Boolean) m15936handleRsTtcXE(dto3, genericAlertMobilePresentationStyle, i)).booleanValue();
        }

        /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name */
        public Void m15936handleRsTtcXE(Dto3<?> action, GenericAlertMobilePresentationStyle alertType, int textAlign) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(alertType, "alertType");
            throw new IllegalStateException(("Action handler did not handle " + action).toString());
        }
    }
}
