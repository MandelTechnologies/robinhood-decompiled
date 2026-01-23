package com.robinhood.android.libdesignsystem.serverui.experimental.action.dto;

import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: DtoActionHandler.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002H\u0007¢\u0006\u0002\u0010\u0017\"\u001b\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"show", "", "T", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "alert", "Lrh_server_driven_ui/v1/AlertDto;", "alertType", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "show-1Vfn_Dk", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Lrh_server_driven_ui/v1/AlertDto;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;I)Z", "handling", "Lkotlin/Function0;", "", "action", "handling-1Vfn_Dk", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Ljava/lang/Object;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;I)Lkotlin/jvm/functions/Function0;", "LocalDtoActionHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalDtoActionHandler", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "currentDtoActionHandler", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandlerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class DtoActionHandler2 {
    private static final CompositionLocal6<DtoActionHandler<?>> LocalDtoActionHandler = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandlerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DtoActionHandler.NotImplemented.INSTANCE;
        }
    });

    /* renamed from: show-1Vfn_Dk$default, reason: not valid java name */
    public static /* synthetic */ boolean m15940show1Vfn_Dk$default(DtoActionHandler dtoActionHandler, AlertDto alertDto, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        }
        return m15939show1Vfn_Dk(dtoActionHandler, alertDto, genericAlertMobilePresentationStyle, i);
    }

    /* renamed from: show-1Vfn_Dk, reason: not valid java name */
    public static final <T> boolean m15939show1Vfn_Dk(DtoActionHandler<T> show, AlertDto alert, GenericAlertMobilePresentationStyle alertType, int i) {
        Intrinsics.checkNotNullParameter(show, "$this$show");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        T tConvertAlertToAction = show.convertAlertToAction(alert);
        if (tConvertAlertToAction == null) {
            return false;
        }
        return show.mo10782handleRsTtcXE(tConvertAlertToAction, alertType, i);
    }

    /* renamed from: handling-1Vfn_Dk$default, reason: not valid java name */
    public static /* synthetic */ Function0 m15938handling1Vfn_Dk$default(DtoActionHandler dtoActionHandler, Object obj, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            genericAlertMobilePresentationStyle = GenericAlertMobilePresentationStyle.BOTTOM_SHEET;
        }
        if ((i2 & 4) != 0) {
            i = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        }
        return m15937handling1Vfn_Dk(dtoActionHandler, obj, genericAlertMobilePresentationStyle, i);
    }

    /* renamed from: handling-1Vfn_Dk, reason: not valid java name */
    public static final <T> Function0<Unit> m15937handling1Vfn_Dk(final DtoActionHandler<T> handling, final T t, final GenericAlertMobilePresentationStyle alertType, final int i) {
        Intrinsics.checkNotNullParameter(handling, "$this$handling");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        return new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandlerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DtoActionHandler2.handling_1Vfn_Dk$lambda$0(t, handling, alertType, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handling_1Vfn_Dk$lambda$0(Object obj, DtoActionHandler dtoActionHandler, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i) {
        if (obj != null) {
            dtoActionHandler.mo10782handleRsTtcXE(obj, genericAlertMobilePresentationStyle, i);
        }
        return Unit.INSTANCE;
    }

    public static final CompositionLocal6<DtoActionHandler<?>> getLocalDtoActionHandler() {
        return LocalDtoActionHandler;
    }

    public static final <T> DtoActionHandler<T> currentDtoActionHandler(Composer composer, int i) {
        composer.startReplaceGroup(-1320360960);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1320360960, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.currentDtoActionHandler (DtoActionHandler.kt:77)");
        }
        CompositionLocal6<DtoActionHandler<?>> compositionLocal6 = LocalDtoActionHandler;
        Object objConsume = composer.consume(compositionLocal6);
        DtoActionHandler<T> dtoActionHandler = objConsume instanceof DtoActionHandler ? (DtoActionHandler) objConsume : null;
        if (dtoActionHandler != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return dtoActionHandler;
        }
        throw new IllegalStateException(("No DtoActionHandler found for the given type. Found: " + Reflection.getOrCreateKotlinClass(composer.consume(compositionLocal6).getClass()).getQualifiedName()).toString());
    }
}
