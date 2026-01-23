package com.robinhood.android.pathfinder.corepages.supportlanding;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.DialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingAccountTab;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SupportLandingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1, reason: use source file name */
/* loaded from: classes11.dex */
final class SupportLandingComposable2 implements Function2<Composer, Integer, Unit> {
    public static final SupportLandingComposable2 INSTANCE = new SupportLandingComposable2();

    SupportLandingComposable2() {
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
            ComposerKt.traceEventStart(-611670323, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt.lambda$-611670323.<anonymous> (SupportLandingComposable.kt:166)");
        }
        Color color = Color.BIOME;
        ThemedColor themedColor = new ThemedColor(color, color);
        Color color2 = Color.RESIN_LIGHT;
        SupportLandingViewState supportLandingViewState = new SupportLandingViewState("This is a heading", extensions2.persistentListOf(new SupportLandingAccountTab(themedColor, new ThemedColor(color2, color2), "A Tab", ServerToBentoAssetMapper3.PERSON, "")), "", MapsKt.emptyMap(), true);
        Markwon markwonCreate = Markwon.create((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Intrinsics.checkNotNullExpressionValue(markwonCreate, "create(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1<androidx.compose.p011ui.graphics.Color, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$2$1
                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final void m17548invoke8_81llA(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.p011ui.graphics.Color color3) {
                    m17548invoke8_81llA(color3.getValue());
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$4$lambda$3((PathfinderAction.Deeplink) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function13 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$6$lambda$5((PathfinderAction.UpdateBackend) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function1 function14 = (Function1) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable2.invoke$lambda$8$lambda$7((PathfinderAction.SubmitForm) obj, (Map) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function2 function2 = (Function2) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$10$lambda$9((PathfinderAction.Dismiss) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        Function1 function15 = (Function1) objRememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$12$lambda$11((RhBottomSheetDialogFragmentHost.SheetListener) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function16 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$14$lambda$13((List) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        Function1 function17 = (Function1) objRememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportLandingComposable2.invoke$lambda$16$lambda$15((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue9);
        }
        Function1 function18 = (Function1) objRememberedValue9;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$-611670323$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingComposable2.invoke$lambda$18$lambda$17((DialogFragment) obj, (String) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceGroup();
        SupportLandingComposable5.SupportLandingScreen(supportLandingViewState, markwonCreate, function1, function12, function13, function14, function2, function15, function16, function17, function18, (Function2) objRememberedValue10, composer, 920350080, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(PathfinderAction.Deeplink it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(PathfinderAction.UpdateBackend it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(PathfinderAction.SubmitForm submitForm, Map map) {
        Intrinsics.checkNotNullParameter(submitForm, "<unused var>");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(PathfinderAction.Dismiss it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(RhBottomSheetDialogFragmentHost.SheetListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(DialogFragment dialogFragment, String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<unused var>");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
