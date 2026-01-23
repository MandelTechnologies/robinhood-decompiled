package com.robinhood.android.educationtour.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: LocalEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\u001a1\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\" \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"", "Lcom/robinhood/android/educationtour/ComposeEducationTourScreen;", "screens", "Lkotlin/Function0;", "", "content", "ProvideEducationTourScreens", "([Lcom/robinhood/android/educationtour/ComposeEducationTourScreen;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalEducationTourScreen", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalEducationTourScreen", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrentEducationTourScreen", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "getCurrentEducationTourScreen$annotations", "()V", "CurrentEducationTourScreen", "lib-education-tour_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.educationtour.compose.LocalEducationTourScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LocalEducationTourScreen {
    private static final CompositionLocal6<List<ComposeEducationTourScreen>> LocalEducationTourScreen = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.educationtour.compose.LocalEducationTourScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalEducationTourScreen.LocalEducationTourScreen$lambda$0();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideEducationTourScreens$lambda$7(ComposeEducationTourScreen[] composeEducationTourScreenArr, Function2 function2, int i, Composer composer, int i2) {
        ProvideEducationTourScreens(composeEducationTourScreenArr, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCurrentEducationTourScreen$annotations() {
    }

    public static final CompositionLocal6<List<ComposeEducationTourScreen>> getLocalEducationTourScreen() {
        return LocalEducationTourScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List LocalEducationTourScreen$lambda$0() {
        return CollectionsKt.listOf(new ComposeEducationTourScreen(EducationTourScreenNames.UNSPECIFIED_SCREEN, null, 2, null));
    }

    @JvmName
    public static final List<ComposeEducationTourScreen> getCurrentEducationTourScreen(Composer composer, int i) {
        composer.startReplaceGroup(1566543280);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1566543280, i, -1, "com.robinhood.android.educationtour.compose.<get-CurrentEducationTourScreen> (LocalEducationTourScreen.kt:18)");
        }
        List<ComposeEducationTourScreen> list = (List) composer.consume(LocalEducationTourScreen);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return list;
    }

    public static final void ProvideEducationTourScreens(final ComposeEducationTourScreen[] screens, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(864790321);
        int i2 = (i & 48) == 0 ? (composerStartRestartGroup.changedInstance(content) ? 32 : 16) | i : i;
        composerStartRestartGroup.startMovableGroup(2134811963, Integer.valueOf(screens.length));
        int i3 = i2 | (composerStartRestartGroup.changed(screens.length) ? 4 : 0);
        for (ComposeEducationTourScreen composeEducationTourScreen : screens) {
            i3 |= composerStartRestartGroup.changed(composeEducationTourScreen) ? 4 : 0;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(864790321, i3, -1, "com.robinhood.android.educationtour.compose.ProvideEducationTourScreens (LocalEducationTourScreen.kt:24)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(screens);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.educationtour.compose.LocalEducationTourScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LocalEducationTourScreen.ProvideEducationTourScreens$lambda$6$lambda$5(screens, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect((Object) screens, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i3 & 14);
            CompositionLocal3.CompositionLocalProvider(LocalEducationTourScreen.provides(CollectionsKt.listOf(Arrays.copyOf(screens, screens.length))), content, composerStartRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.educationtour.compose.LocalEducationTourScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LocalEducationTourScreen.ProvideEducationTourScreens$lambda$7(screens, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ProvideEducationTourScreens$lambda$6$lambda$5(ComposeEducationTourScreen[] composeEducationTourScreenArr, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(composeEducationTourScreenArr.length), 16));
        for (ComposeEducationTourScreen composeEducationTourScreen : composeEducationTourScreenArr) {
            linkedHashMap.put(UUID.randomUUID(), composeEducationTourScreen);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            UUID uuid = (UUID) entry.getKey();
            ComposeEducationTourScreen composeEducationTourScreen2 = (ComposeEducationTourScreen) entry.getValue();
            ComposeEducationTourManager composeEducationTourManager = ComposeEducationTourManager.INSTANCE;
            Intrinsics.checkNotNull(uuid);
            composeEducationTourManager.registerScreen$lib_education_tour_externalDebug(uuid, composeEducationTourScreen2);
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.educationtour.compose.LocalEducationTourScreenKt$ProvideEducationTourScreens$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    UUID uuid2 = (UUID) ((Map.Entry) it.next()).getKey();
                    ComposeEducationTourManager composeEducationTourManager2 = ComposeEducationTourManager.INSTANCE;
                    Intrinsics.checkNotNull(uuid2);
                    composeEducationTourManager2.unregisterScreen$lib_education_tour_externalDebug(uuid2);
                }
            }
        };
    }
}
