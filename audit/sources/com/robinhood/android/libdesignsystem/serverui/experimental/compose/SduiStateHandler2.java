package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.models.serverdriven.experimental.api.TextValidationType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiStateHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\r\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\t\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"toValidationType", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ValidationType;", "Lcom/robinhood/models/serverdriven/experimental/api/TextValidationType;", "LocalStateHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "getLocalStateHandler", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberStateHandler", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandlerKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiStateHandler2 {
    private static final CompositionLocal6<SduiStateHandler3> LocalStateHandler = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandlerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SduiStateHandler2.LocalStateHandler$lambda$0();
        }
    });

    /* compiled from: SduiStateHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandlerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextValidationType.values().length];
            try {
                iArr[TextValidationType.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextValidationType.DELAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextValidationType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SduiStateHandler4 toValidationType(TextValidationType textValidationType) {
        Intrinsics.checkNotNullParameter(textValidationType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[textValidationType.ordinal()];
        if (i == 1) {
            return SduiStateHandler4.Immediate;
        }
        if (i == 2) {
            return SduiStateHandler4.Delayed;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SduiStateHandler4.Unknown;
    }

    public static final CompositionLocal6<SduiStateHandler3> getLocalStateHandler() {
        return LocalStateHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SduiStateHandler3 LocalStateHandler$lambda$0() {
        throw new IllegalStateException("No StateHandler provided");
    }

    public static final SduiStateHandler3 rememberStateHandler(Composer composer, int i) {
        composer.startReplaceGroup(-881092474);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-881092474, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.rememberStateHandler (SduiStateHandler.kt:248)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SduiStateHandler3(null, 1, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SduiStateHandler3 sduiStateHandler3 = (SduiStateHandler3) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sduiStateHandler3;
    }
}
