package com.robinhood.android.crypto.p094ui.detail.position;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPositionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPositionComposable4 implements Function2<Composer, Integer, Unit> {
    public static final CryptoPositionComposable4 INSTANCE = new CryptoPositionComposable4();

    CryptoPositionComposable4() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1482921757, i, -1, "com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt.lambda$-1482921757.<anonymous> (CryptoPositionComposable.kt:398)");
        }
        CryptoPositionState cryptoPositionStateCreatePositionForPreview = CryptoPositionComposable6.createPositionForPreview(false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$1$lambda$0((GenericAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$3$lambda$2((GenericAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function0 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$7$lambda$6((CryptoPositionLabelType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function1 function13 = (Function1) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$9$lambda$8((CryptoPositionState.PositionBannerType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function14 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$11$lambda$10((CryptoPositionState.PositionBannerType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        Function1 function15 = (Function1) objRememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$13$lambda$12((CryptoPositionRowState.TooltipType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function16 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.ComposableSingletons$CryptoPositionComposableKt$lambda$-1482921757$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoPositionComposable4.invoke$lambda$15$lambda$14((CryptoPositionRowState.TooltipType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        CryptoPositionComposable6.CryptoPositionComposable(cryptoPositionStateCreatePositionForPreview, function1, function12, function0, function13, function14, function15, function16, (Function1) objRememberedValue8, null, composer, 115043760, 512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(GenericAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(GenericAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(CryptoPositionLabelType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(CryptoPositionState.PositionBannerType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(CryptoPositionState.PositionBannerType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(CryptoPositionRowState.TooltipType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(CryptoPositionRowState.TooltipType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
