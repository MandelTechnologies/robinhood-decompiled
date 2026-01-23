package com.robinhood.android.mcw.mcwquickconversion;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionViewState;
import com.robinhood.android.mcw.mcwquickconversion.models.SecondaryCtaAction;
import com.robinhood.android.mcw.mcwquickconversion.models.UiEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"QuickConversionComposable", "", "arg", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "onEvent", "Lkotlin/Function1;", "Lcom/robinhood/android/mcw/mcwquickconversion/models/UiEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionDuxo;", "(Lcom/robinhood/android/mcw/contracts/QuickConversionKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-lib-mcw-quick-conversion_externalDebug", "viewState", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class QuickConversionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionComposable$lambda$11(QuickConversionKey quickConversionKey, Function1 function1, Modifier modifier, QuickConversionDuxo quickConversionDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        QuickConversionComposable(quickConversionKey, function1, modifier, quickConversionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionViewState$Loaded] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionViewState$Loaded] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickConversionComposable(final QuickConversionKey arg, final Function1<? super UiEvent, Unit> onEvent, Modifier modifier, QuickConversionDuxo quickConversionDuxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        QuickConversionDuxo quickConversionDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        QuickConversionDuxo quickConversionDuxo3;
        Composer composer2;
        int i6;
        final EventLogger current;
        final Screen screen;
        int i7;
        Object objRememberedValue;
        final QuickConversionViewState.Loaded loaded;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final QuickConversionDuxo quickConversionDuxo4;
        StringResource stringResource;
        Composer composer3;
        float f;
        int i8;
        ?? r14;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        final QuickConversionDuxo quickConversionDuxo5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1842837182);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(arg) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEvent) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    quickConversionDuxo2 = quickConversionDuxo;
                    int i10 = composerStartRestartGroup.changedInstance(quickConversionDuxo2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    quickConversionDuxo2 = quickConversionDuxo;
                }
                i3 |= i10;
            } else {
                quickConversionDuxo2 = quickConversionDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(QuickConversionDuxo.class), current2, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i3 & (-7169);
                        quickConversionDuxo3 = (QuickConversionDuxo) baseDuxo;
                    } else {
                        i4 = 0;
                        i5 = i3;
                        quickConversionDuxo3 = quickConversionDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    quickConversionDuxo3 = quickConversionDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1842837182, i5, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposable (QuickConversionComposable.kt:57)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(quickConversionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                QuickConversionViewState quickConversionViewStateQuickConversionComposable$lambda$0 = QuickConversionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                QuickConversionViewState.Loaded loaded2 = !(quickConversionViewStateQuickConversionComposable$lambda$0 instanceof QuickConversionViewState.Loaded) ? (QuickConversionViewState.Loaded) quickConversionViewStateQuickConversionComposable$lambda$0 : null;
                String amountFrom = loaded2 == null ? loaded2.getAmountFrom() : null;
                String availableBalance = loaded2 == null ? loaded2.getAvailableBalance() : null;
                String afterConverting = loaded2 == null ? loaded2.getAfterConverting() : null;
                int i11 = (loaded2 == null && loaded2.getConversionInProgress()) ? 1 : i4;
                i6 = (loaded2 == null && loaded2.getFxRateText() == null) ? 1 : i4;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                screen = new Screen(null, null, "mcw_quick_conversion_sheet", null, 11, null);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(-1633490746);
                int i12 = i5 & 112;
                i7 = (composer2.changedInstance(quickConversionDuxo3) ? 1 : 0) | (i12 != 32 ? 1 : i4);
                objRememberedValue = composer2.rememberedValue();
                if (i7 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new QuickConversionComposable2(quickConversionDuxo3, onEvent, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer2, i13).m21592getMediumD9Ej5fM();
                loaded = loaded2;
                Modifier modifier5 = modifier3;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifier5, 0.0f, fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 13, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, 45, null)), true, true, false, false, false, null, 120, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i4);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer2, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                final Row6 row6 = Row6.INSTANCE;
                LocalShowPlaceholder.Loadable(amountFrom != null || StringsKt.isBlank(amountFrom), Row5.weight$default(row6, companion3, 1.0f, false, 2, null), null, ComposableLambda3.rememberComposableLambda(87379756, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$2$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i14) {
                        if ((i14 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87379756, i14, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposable.<anonymous>.<anonymous>.<anonymous> (QuickConversionComposable.kt:106)");
                        }
                        QuickConversionViewState.Loaded loaded3 = loaded;
                        String title = loaded3 != null ? loaded3.getTitle() : null;
                        if (title == null) {
                            title = "";
                        }
                        BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getDisplayCapsuleSmall(), composer4, 0, 0, 8188);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 3072, 4);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM()), composer2, 0);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer2, 0);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i13).m21425getFg0d7_KjU();
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = composer2.changedInstance(current) | composer2.changedInstance(screen) | (i12 != 32);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$4$lambda$3$lambda$2(current, screen, onEvent);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                quickConversionDuxo4 = quickConversionDuxo3;
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, null, (Function0) objRememberedValue2, false, composer2, BentoIcon4.Size24.$stable, 40);
                Composer composer4 = composer2;
                composer4.endNode();
                composer4.startReplaceGroup(-467979720);
                if ((loaded == null ? loaded.getMessage() : null) == null) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i13).m21595getXsmallD9Ej5fM()), composer4, 0);
                    stringResource = null;
                    BentoText2.m20747BentoText38GnDrw(loaded.getMessage(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16380);
                    composer4 = composer4;
                } else {
                    stringResource = null;
                }
                composer4.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer4, i13).m21590getDefaultD9Ej5fM()), composer4, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C21790R.string.available_balance_label, composer4, 0);
                BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(availableBalance != null ? "" : availableBalance);
                boolean z = availableBalance != null;
                int i14 = BentoBaseRowState.Meta.SingleLine.$stable;
                Composer composer5 = composer4;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, singleLine, null, false, false, z, 0L, null, composer5, i14 << 15, 0, 3547);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C21790R.string.after_converting_label, composer5, 0), null, null, new BentoBaseRowState.Meta.SingleLine(afterConverting != null ? "" : afterConverting), null, false, false, afterConverting != null, 0L, null, composer5, i14 << 15, 0, 3547);
                composer3 = composer5;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i13).m21594getXlargeD9Ej5fM()), composer3, 0);
                if (i6 == 0) {
                    composer3.startReplaceGroup(-1621576444);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21790R.string.fx_rate_error, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer3, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer3, i13).m21452getNegative0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i13).getTextS(), composer3, 0, 0, 8120);
                    composer3 = composer3;
                    composer3.endReplaceGroup();
                    f = 0.0f;
                    i8 = 6;
                    r14 = 1;
                } else {
                    composer3.startReplaceGroup(-1621193160);
                    QuickConversionViewState quickConversionViewStateQuickConversionComposable$lambda$02 = QuickConversionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    ?? r9 = quickConversionViewStateQuickConversionComposable$lambda$02 instanceof QuickConversionViewState.Loaded ? (QuickConversionViewState.Loaded) quickConversionViewStateQuickConversionComposable$lambda$02 : stringResource;
                    ?? fxRateText = r9 != 0 ? r9.getFxRateText() : stringResource;
                    QuickConversionViewState quickConversionViewStateQuickConversionComposable$lambda$03 = QuickConversionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    ?? r1 = quickConversionViewStateQuickConversionComposable$lambda$03 instanceof QuickConversionViewState.Loaded ? (QuickConversionViewState.Loaded) quickConversionViewStateQuickConversionComposable$lambda$03 : stringResource;
                    f = 0.0f;
                    i8 = 6;
                    r14 = 1;
                    LocalShowPlaceholder.Loadable(fxRateText == 0, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer3, 6, 1), null, ComposableLambda3.rememberComposableLambda(-1138581405, true, new QuickConversionComposable4(fxRateText, current, onEvent, r1 != 0 ? r1.getFxRateFeeText() : stringResource), composer3, 54), composer3, 3072, 4);
                    composer3.endReplaceGroup();
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, f, composer3, i8, r14);
                composer3.startReplaceGroup(-1746271574);
                zChangedInstance2 = composer3.changedInstance(current) | composer3.changedInstance(screen) | composer3.changedInstance(quickConversionDuxo4);
                objRememberedValue3 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$6$lambda$5(current, screen, quickConversionDuxo4);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer3.endReplaceGroup();
                String strStringResource3 = StringResources_androidKt.stringResource(C21790R.string.convert_currency_cta, new Object[]{amountFrom != null ? "" : amountFrom}, composer3, 0);
                boolean z2 = (amountFrom == null && !StringsKt.isBlank(amountFrom) && i11 == 0) ? false : r14;
                composer3.startReplaceGroup(-1224400529);
                zChangedInstance3 = composer3.changedInstance(loaded) | composer3.changedInstance(current) | composer3.changedInstance(screen) | (i12 != 32 ? r14 : false);
                objRememberedValue4 = composer3.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$9$lambda$8(loaded, current, screen, onEvent);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer3.endReplaceGroup();
                StringResource secondaryCtaText = loaded == null ? loaded.getSecondaryCtaText() : stringResource;
                composer3.startReplaceGroup(-467806167);
                Object textAsString = secondaryCtaText != null ? stringResource : StringResources6.getTextAsString(secondaryCtaText, composer3, StringResource.$stable);
                composer3.endReplaceGroup();
                Composer composer6 = composer3;
                BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, false, null, null, function0, strStringResource3, z2, null, false, function02, textAsString != null ? "" : textAsString, (amountFrom == null && !StringsKt.isBlank(amountFrom) && i11 == 0) ? false : r14, null, false, composer6, 0, 0, 50750);
                composerStartRestartGroup = composer6;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                quickConversionDuxo5 = quickConversionDuxo4;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                quickConversionDuxo5 = quickConversionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuickConversionComposable.QuickConversionComposable$lambda$11(arg, onEvent, modifier4, quickConversionDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(quickConversionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                QuickConversionViewState quickConversionViewStateQuickConversionComposable$lambda$04 = QuickConversionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (!(quickConversionViewStateQuickConversionComposable$lambda$04 instanceof QuickConversionViewState.Loaded)) {
                }
                if (loaded2 == null) {
                }
                if (loaded2 == null) {
                }
                if (loaded2 == null) {
                }
                if (loaded2 == null) {
                    if (loaded2 == null) {
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        screen = new Screen(null, null, "mcw_quick_conversion_sheet", null, 11, null);
                        Unit unit2 = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        int i122 = i5 & 112;
                        i7 = (composer2.changedInstance(quickConversionDuxo3) ? 1 : 0) | (i122 != 32 ? 1 : i4);
                        objRememberedValue = composer2.rememberedValue();
                        if (i7 == 0) {
                            objRememberedValue = new QuickConversionComposable2(quickConversionDuxo3, onEvent, null);
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i132 = BentoTheme.$stable;
                            float fM21592getMediumD9Ej5fM2 = bentoTheme2.getSpacing(composer2, i132).m21592getMediumD9Ej5fM();
                            loaded = loaded2;
                            Modifier modifier52 = modifier3;
                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifier52, 0.0f, fM21592getMediumD9Ej5fM2, 0.0f, 0.0f, 13, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, 45, null)), true, true, false, false, false, null, 120, null);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer2, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i4);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composer2, 6, 1);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composer2, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ3);
                                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                    final Row5 row62 = Row6.INSTANCE;
                                    if (amountFrom != null) {
                                        LocalShowPlaceholder.Loadable(amountFrom != null || StringsKt.isBlank(amountFrom), Row5.weight$default(row62, companion32, 1.0f, false, 2, null), null, ComposableLambda3.rememberComposableLambda(87379756, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$2$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer42, Integer num) {
                                                invoke(composer42, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer42, int i142) {
                                                if ((i142 & 3) == 2 && composer42.getSkipping()) {
                                                    composer42.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(87379756, i142, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposable.<anonymous>.<anonymous>.<anonymous> (QuickConversionComposable.kt:106)");
                                                }
                                                QuickConversionViewState.Loaded loaded3 = loaded;
                                                String title = loaded3 != null ? loaded3.getTitle() : null;
                                                if (title == null) {
                                                    title = "";
                                                }
                                                BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer42, BentoTheme.$stable).getDisplayCapsuleSmall(), composer42, 0, 0, 8188);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, 3072, 4);
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composer2, i132).m21590getDefaultD9Ej5fM()), composer2, 0);
                                        BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24);
                                        String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer2, 0);
                                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i132).m21425getFg0d7_KjU();
                                        composer2.startReplaceGroup(-1746271574);
                                        zChangedInstance = composer2.changedInstance(current) | composer2.changedInstance(screen) | (i122 != 32);
                                        objRememberedValue2 = composer2.rememberedValue();
                                        if (!zChangedInstance) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$4$lambda$3$lambda$2(current, screen, onEvent);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                            composer2.endReplaceGroup();
                                            quickConversionDuxo4 = quickConversionDuxo3;
                                            BentoIcon2.m20644BentoIconFU0evQE(size242, strStringResource4, jM21425getFg0d7_KjU2, null, (Function0) objRememberedValue2, false, composer2, BentoIcon4.Size24.$stable, 40);
                                            Composer composer42 = composer2;
                                            composer42.endNode();
                                            composer42.startReplaceGroup(-467979720);
                                            if ((loaded == null ? loaded.getMessage() : null) == null) {
                                            }
                                            composer42.endReplaceGroup();
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer42, i132).m21590getDefaultD9Ej5fM()), composer42, 0);
                                            String strStringResource22 = StringResources_androidKt.stringResource(C21790R.string.available_balance_label, composer42, 0);
                                            BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(availableBalance != null ? "" : availableBalance);
                                            if (availableBalance != null) {
                                            }
                                            int i142 = BentoBaseRowState.Meta.SingleLine.$stable;
                                            Composer composer52 = composer42;
                                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource22, null, null, singleLine2, null, false, false, z, 0L, null, composer52, i142 << 15, 0, 3547);
                                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C21790R.string.after_converting_label, composer52, 0), null, null, new BentoBaseRowState.Meta.SingleLine(afterConverting != null ? "" : afterConverting), null, false, false, afterConverting != null, 0L, null, composer52, i142 << 15, 0, 3547);
                                            composer3 = composer52;
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer3, i132).m21594getXlargeD9Ej5fM()), composer3, 0);
                                            if (i6 == 0) {
                                            }
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ22 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, f, composer3, i8, r14);
                                            composer3.startReplaceGroup(-1746271574);
                                            zChangedInstance2 = composer3.changedInstance(current) | composer3.changedInstance(screen) | composer3.changedInstance(quickConversionDuxo4);
                                            objRememberedValue3 = composer3.rememberedValue();
                                            if (!zChangedInstance2) {
                                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$6$lambda$5(current, screen, quickConversionDuxo4);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                                Function0 function03 = (Function0) objRememberedValue3;
                                                composer3.endReplaceGroup();
                                                String strStringResource32 = StringResources_androidKt.stringResource(C21790R.string.convert_currency_cta, new Object[]{amountFrom != null ? "" : amountFrom}, composer3, 0);
                                                if (amountFrom == null) {
                                                    composer3.startReplaceGroup(-1224400529);
                                                    zChangedInstance3 = composer3.changedInstance(loaded) | composer3.changedInstance(current) | composer3.changedInstance(screen) | (i122 != 32 ? r14 : false);
                                                    objRememberedValue4 = composer3.rememberedValue();
                                                    if (!zChangedInstance3) {
                                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return QuickConversionComposable.QuickConversionComposable$lambda$10$lambda$9$lambda$8(loaded, current, screen, onEvent);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue4);
                                                        Function0 function022 = (Function0) objRememberedValue4;
                                                        composer3.endReplaceGroup();
                                                        if (loaded == null) {
                                                        }
                                                        composer3.startReplaceGroup(-467806167);
                                                        if (secondaryCtaText != null) {
                                                        }
                                                        composer3.endReplaceGroup();
                                                        if (amountFrom == null) {
                                                            Composer composer62 = composer3;
                                                            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ22, null, null, false, null, null, function03, strStringResource32, z2, null, false, function022, textAsString != null ? "" : textAsString, (amountFrom == null && !StringsKt.isBlank(amountFrom) && i11 == 0) ? false : r14, null, false, composer62, 0, 0, 50750);
                                                            composerStartRestartGroup = composer62;
                                                            composerStartRestartGroup.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            quickConversionDuxo5 = quickConversionDuxo4;
                                                            modifier4 = modifier52;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final QuickConversionViewState QuickConversionComposable$lambda$0(SnapshotState4<? extends QuickConversionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionComposable$lambda$10$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Function1 function1) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.CLOSE_BUTTON, "quick_conversion_close_button", null, 4, null), null, null, false, 57, null);
        function1.invoke(UiEvent.Close.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionComposable$lambda$10$lambda$6$lambda$5(EventLogger eventLogger, Screen screen, QuickConversionDuxo quickConversionDuxo) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "quick_conversion_convert", null, 4, null), null, null, false, 57, null);
        quickConversionDuxo.convertCurrency();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionComposable$lambda$10$lambda$9$lambda$8(QuickConversionViewState.Loaded loaded, EventLogger eventLogger, Screen screen, Function1 function1) {
        SecondaryCtaAction secondaryCtaOnClick;
        if (loaded != null && (secondaryCtaOnClick = loaded.getSecondaryCtaOnClick()) != null) {
            if (Intrinsics.areEqual(secondaryCtaOnClick, SecondaryCtaAction.EditAmount.INSTANCE)) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "quick_conversion_secondary_action_edit_amount", null, 4, null), null, null, false, 57, null);
                function1.invoke(UiEvent.EditAmount.INSTANCE);
            } else {
                if (!(secondaryCtaOnClick instanceof SecondaryCtaAction.OrderCheck)) {
                    throw new NoWhenBranchMatchedException();
                }
                SecondaryCtaAction.OrderCheck orderCheck = (SecondaryCtaAction.OrderCheck) secondaryCtaOnClick;
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "quick_conversion_secondary_action_custom_" + orderCheck.getAction().getClass().getSimpleName(), null, 4, null), null, null, false, 57, null);
                function1.invoke(new UiEvent.OrderCheckAction(orderCheck.getAction()));
            }
        }
        return Unit.INSTANCE;
    }
}
