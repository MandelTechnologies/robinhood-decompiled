package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.about.p124v2.AboutV2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AboutV2.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0001¢\u0006\u0002\u0010\u000e\u001am\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0001¢\u0006\u0002\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010(\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010)\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010'\u001a\r\u0010*\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010'\u001aJ\u0010+\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0001\u001a\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, m3636d2 = {"DEFAULT_MAX_LINES", "", "AboutV2", "", "instrumentUuid", "Ljava/util/UUID;", "duxo", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo;", "(Ljava/util/UUID;Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo;Landroidx/compose/runtime/Composer;II)V", "state", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ViewState;", "onAboutTextOverflow", "Lkotlin/Function0;", "onShowMoreOrLessClicked", "(Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "aboutText", "", "infoList", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", "expandBtnColor", "Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;", "doesAboutTextOverflow", "", "isExpanded", "isLoading", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;ZZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AboutV2FlowRow", "(Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AboutV2InfoItem", AnnotatedPrivateKey.LABEL, "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getResourceStrings", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "PreviewAboutV2NotExpanded", "(Landroidx/compose/runtime/Composer;I)V", "PreviewAboutV2NotExpandedNoOverflow", "PreviewAboutV2Expanded", "PreviewAboutV2Loading", "buildTestViewState", "buildTestAboutV2InfoList", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AboutV2 {
    public static final int DEFAULT_MAX_LINES = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AboutV2$lambda$10(AboutV2ViewState aboutV2ViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AboutV2(aboutV2ViewState, (Function0<Unit>) function0, (Function0<Unit>) function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AboutV2$lambda$15(String str, ImmutableList3 immutableList3, AboutV2ViewState2 aboutV2ViewState2, boolean z, boolean z2, boolean z3, Modifier modifier, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        AboutV2(str, immutableList3, aboutV2ViewState2, z, z2, z3, modifier, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AboutV2$lambda$6(UUID uuid, AboutV2Duxo aboutV2Duxo, int i, int i2, Composer composer, int i3) {
        AboutV2(uuid, aboutV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AboutV2FlowRow$lambda$16(ImmutableList3 immutableList3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AboutV2FlowRow(immutableList3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AboutV2InfoItem$lambda$18(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AboutV2InfoItem(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAboutV2Expanded$lambda$21(int i, Composer composer, int i2) {
        PreviewAboutV2Expanded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAboutV2Loading$lambda$22(int i, Composer composer, int i2) {
        PreviewAboutV2Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAboutV2NotExpanded$lambda$19(int i, Composer composer, int i2) {
        PreviewAboutV2NotExpanded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAboutV2NotExpandedNoOverflow$lambda$20(int i, Composer composer, int i2) {
        PreviewAboutV2NotExpandedNoOverflow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutV2(final UUID instrumentUuid, final AboutV2Duxo aboutV2Duxo, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final AboutV2ResourceStrings resourceStrings;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1973592237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentUuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(aboutV2Duxo)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    String str = instrumentUuid + "_AboutV2";
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AboutV2Duxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 0);
                    composer2.endReplaceGroup();
                    aboutV2Duxo = (AboutV2Duxo) baseDuxo;
                    i3 &= -113;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1973592237, i3, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2 (AboutV2.kt:48)");
                }
                resourceStrings = getResourceStrings(composer2, 0);
                Unit unit = Unit.INSTANCE;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = composer2.changedInstance(aboutV2Duxo) | composer2.changedInstance(instrumentUuid) | composer2.changed(resourceStrings);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AboutV2.AboutV2$lambda$2$lambda$1(aboutV2Duxo, instrumentUuid, resourceStrings, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(unit, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer4, 6, 0);
                composer3 = composer4;
                AboutV2ViewState aboutV2ViewStateAboutV2$lambda$3 = AboutV2$lambda$3(FlowExtKt.collectAsStateWithLifecycle(aboutV2Duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance2 = composer3.changedInstance(aboutV2Duxo);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AboutV22(aboutV2Duxo);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                composer3.startReplaceGroup(5004770);
                zChangedInstance3 = composer3.changedInstance(aboutV2Duxo);
                objRememberedValue3 = composer3.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AboutV23(aboutV2Duxo);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                AboutV2(aboutV2ViewStateAboutV2$lambda$3, (Function0<Unit>) function0, (Function0<Unit>) ((KFunction) objRememberedValue3), composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            composer2 = composerStartRestartGroup;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            resourceStrings = getResourceStrings(composer2, 0);
            Unit unit2 = Unit.INSTANCE;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composer2.startReplaceGroup(-1746271574);
            zChangedInstance = composer2.changedInstance(aboutV2Duxo) | composer2.changedInstance(instrumentUuid) | composer2.changed(resourceStrings);
            objRememberedValue = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AboutV2.AboutV2$lambda$2$lambda$1(aboutV2Duxo, instrumentUuid, resourceStrings, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                composer2.endReplaceGroup();
                Composer composer42 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(unit2, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer42, 6, 0);
                composer3 = composer42;
                AboutV2ViewState aboutV2ViewStateAboutV2$lambda$32 = AboutV2$lambda$3(FlowExtKt.collectAsStateWithLifecycle(aboutV2Duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance2 = composer3.changedInstance(aboutV2Duxo);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new AboutV22(aboutV2Duxo);
                    composer3.updateRememberedValue(objRememberedValue2);
                    composer3.endReplaceGroup();
                    Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                    composer3.startReplaceGroup(5004770);
                    zChangedInstance3 = composer3.changedInstance(aboutV2Duxo);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new AboutV23(aboutV2Duxo);
                        composer3.updateRememberedValue(objRememberedValue3);
                        composer3.endReplaceGroup();
                        AboutV2(aboutV2ViewStateAboutV2$lambda$32, (Function0<Unit>) function02, (Function0<Unit>) ((KFunction) objRememberedValue3), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.AboutV2$lambda$6(instrumentUuid, aboutV2Duxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult AboutV2$lambda$2$lambda$1(AboutV2Duxo aboutV2Duxo, UUID uuid, AboutV2ResourceStrings aboutV2ResourceStrings, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind$feature_equity_detail_externalDebug = aboutV2Duxo.bind$feature_equity_detail_externalDebug(uuid, aboutV2ResourceStrings);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind$feature_equity_detail_externalDebug, null, 1, null);
            }
        };
    }

    public static final void AboutV2(final AboutV2ViewState state, final Function0<Unit> onAboutTextOverflow, final Function0<Unit> onShowMoreOrLessClicked, Composer composer, final int i) {
        int i2;
        String aboutText;
        ImmutableList3<AboutV2Info> infoList;
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAboutTextOverflow, "onAboutTextOverflow");
        Intrinsics.checkNotNullParameter(onShowMoreOrLessClicked, "onShowMoreOrLessClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1760782002);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAboutTextOverflow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowMoreOrLessClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1760782002, i2, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2 (AboutV2.kt:71)");
            }
            composerStartRestartGroup.startReplaceGroup(105616552);
            boolean z2 = false;
            if (state.isLoading()) {
                PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 9);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AboutV2.AboutV2$lambda$8$lambda$7(((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                aboutText = CollectionsKt.joinToString$default(primitiveRanges2Until, PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, (Function1) objRememberedValue, 30, null);
            } else {
                aboutText = state.getAboutText();
                if (aboutText == null) {
                    aboutText = "";
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            if (state.isLoading()) {
                PrimitiveRanges2 primitiveRanges2Until2 = RangesKt.until(0, 4);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until2, 10));
                Iterator<Integer> it = primitiveRanges2Until2.iterator();
                while (it.hasNext()) {
                    ((PrimitiveIterators6) it).nextInt();
                    arrayList.add(new AboutV2Info("--------", "----", null, 4, null));
                }
                infoList = extensions2.toPersistentList(arrayList);
            } else {
                infoList = state.getInfoList();
            }
            AboutV2ViewState2 expandBtnColor = state.getExpandBtnColor();
            if (state.isLoading() || !state.getDoesAboutTextOverflow()) {
                z = false;
            } else {
                z = false;
                z2 = true;
            }
            if (!state.isLoading() && state.isExpanded()) {
                z = true;
            }
            AboutV2(aboutText, infoList, expandBtnColor, z2, z, state.isLoading(), null, onAboutTextOverflow, onShowMoreOrLessClicked, composerStartRestartGroup, 264241152 & (i2 << 18), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.AboutV2$lambda$10(state, onAboutTextOverflow, onShowMoreOrLessClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence AboutV2$lambda$8$lambda$7(int i) {
        return "----- ----- ----------";
    }

    private static final AboutV2ViewState AboutV2$lambda$3(SnapshotState4<AboutV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AboutV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$10 */
    static final class C1540110 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $aboutText;
        final /* synthetic */ boolean $doesAboutTextOverflow;
        final /* synthetic */ AboutV2ViewState2 $expandBtnColor;
        final /* synthetic */ ImmutableList3<AboutV2Info> $infoList;
        final /* synthetic */ boolean $isExpanded;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onAboutTextOverflow;
        final /* synthetic */ Function0<Unit> $onShowMoreOrLessClicked;

        /* compiled from: AboutV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$10$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AboutV2ViewState2.values().length];
                try {
                    iArr[AboutV2ViewState2.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AboutV2ViewState2.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AboutV2ViewState2.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C1540110(Modifier modifier, boolean z, String str, Function0<Unit> function0, boolean z2, AboutV2ViewState2 aboutV2ViewState2, Function0<Unit> function02, ImmutableList3<AboutV2Info> immutableList3) {
            this.$modifier = modifier;
            this.$isExpanded = z;
            this.$aboutText = str;
            this.$onAboutTextOverflow = function0;
            this.$doesAboutTextOverflow = z2;
            this.$expandBtnColor = aboutV2ViewState2;
            this.$onShowMoreOrLessClicked = function02;
            this.$infoList = immutableList3;
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            int i3;
            BentoTheme bentoTheme;
            int i4;
            long jM21456getPositive0d7_KjU;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236605485, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2.<anonymous> (AboutV2.kt:112)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(this.$modifier, 0.0f, composer, 0, 1), null, false, 3, null), 0.0f, 1, null);
            boolean z = this.$isExpanded;
            String str = this.$aboutText;
            final Function0<Unit> function0 = this.$onAboutTextOverflow;
            boolean z2 = this.$doesAboutTextOverflow;
            AboutV2ViewState2 aboutV2ViewState2 = this.$expandBtnColor;
            final Function0<Unit> function02 = this.$onShowMoreOrLessClicked;
            ImmutableList3<AboutV2Info> immutableList3 = this.$infoList;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(-293013881);
            Modifier modifierAutoLogEvents$default = Modifier.INSTANCE;
            Modifier modifierEducationTourId$default = ((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue() ? modifierAutoLogEvents$default : ModifiersKt.educationTourId$default(modifierAutoLogEvents$default, EducationTourElementIds.ABOUT_DESCRIPTION_ELEMENT_ID, null, null, false, false, 30, null);
            composer.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierEducationTourId$default, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 7, null);
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer, i5).getTextM(), 0L, TextUnit2.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            int i6 = z ? Integer.MAX_VALUE : 5;
            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$10$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AboutV2.C1540110.invoke$lambda$6$lambda$2$lambda$1(function0, (TextLayoutResult) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, i6, 0, (Function1) objRememberedValue, 0, textStyleM7655copyp1EtxEg$default, composer, 12582912, 0, 5500);
            composer.startReplaceGroup(-292985328);
            if (z2) {
                int i7 = WhenMappings.$EnumSwitchMapping$0[aboutV2ViewState2.ordinal()];
                if (i7 != 1) {
                    i2 = 2;
                    if (i7 == 2) {
                        bentoTheme = bentoTheme2;
                        i4 = i5;
                        composer.startReplaceGroup(-292979919);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i4).m21452getNegative0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            composer.startReplaceGroup(-292984890);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-292977685);
                        bentoTheme = bentoTheme2;
                        i4 = i5;
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
                        composer.endReplaceGroup();
                    }
                } else {
                    bentoTheme = bentoTheme2;
                    i4 = i5;
                    i2 = 2;
                    composer.startReplaceGroup(-292982287);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i4).m21456getPositive0d7_KjU();
                    composer.endReplaceGroup();
                }
                i3 = 0;
                String strStringResource = StringResources_androidKt.stringResource(z ? C15314R.string.instrument_detail_about_less_action : C15314R.string.instrument_detail_about_more_action, composer, 0);
                composer.startReplaceGroup(-292958273);
                composer.startReplaceGroup(-292956873);
                if (!((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(modifierAutoLogEvents$default, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.LEARN_MORE, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                }
                Modifier modifier = modifierAutoLogEvents$default;
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 7, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(function02);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$10$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AboutV2.C1540110.invoke$lambda$6$lambda$5$lambda$4(function02);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, Color.m6701boximpl(jM21456getPositive0d7_KjU), composer, 0, 56);
            } else {
                i2 = 2;
                i3 = 0;
            }
            composer.endReplaceGroup();
            AboutV2.AboutV2FlowRow(immutableList3, null, composer, i3, i2);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$2$lambda$1(Function0 function0, TextLayoutResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getHasVisualOverflow()) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutV2(final String aboutText, final ImmutableList3<AboutV2Info> infoList, final AboutV2ViewState2 expandBtnColor, final boolean z, final boolean z2, final boolean z3, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        final Modifier modifier2;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        Composer composer2;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(aboutText, "aboutText");
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        Intrinsics.checkNotNullParameter(expandBtnColor, "expandBtnColor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1418694589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(aboutText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(infoList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(expandBtnColor.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
            }
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                }
                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    }
                    if (i5 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function04 = (Function0) objRememberedValue2;
                    } else {
                        function04 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1418694589, i3, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2 (AboutV2.kt:110)");
                    }
                    Modifier modifier4 = modifier3;
                    Function0<Unit> function06 = function04;
                    composer2 = composerStartRestartGroup;
                    LocalShowPlaceholder.Loadable(z6, null, null, ComposableLambda3.rememberComposableLambda(-1236605485, true, new C1540110(modifier3, z5, aboutText, function03, z4, expandBtnColor, function04, infoList), composerStartRestartGroup, 54), composer2, ((i3 >> 15) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    function05 = function06;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    function05 = function02;
                }
                final Function0<Unit> function07 = function03;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AboutV2.AboutV2$lambda$15(aboutText, infoList, expandBtnColor, z, z2, z3, modifier2, function07, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            function03 = function0;
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = modifier3;
                Function0<Unit> function062 = function04;
                composer2 = composerStartRestartGroup;
                LocalShowPlaceholder.Loadable(z6, null, null, ComposableLambda3.rememberComposableLambda(-1236605485, true, new C1540110(modifier3, z5, aboutText, function03, z4, expandBtnColor, function04, infoList), composerStartRestartGroup, 54), composer2, ((i3 >> 15) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                function05 = function062;
            }
            final Function0 function072 = function03;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        function03 = function0;
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        final Function0 function0722 = function03;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutV2FlowRow(final ImmutableList3<AboutV2Info> immutableList3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-391396739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(immutableList3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-391396739, i3, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2FlowRow (AboutV2.kt:187)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                float fM21591getLargeD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM();
                Alignment.Companion companion = Alignment.INSTANCE;
                FlowLayoutKt.FlowRow(modifierM5146paddingqDBjuR0$default, arrangement.m5090spacedByD5KLDUw(fM21591getLargeD9Ej5fM, companion.getStart()), arrangement.m5091spacedByD5KLDUw(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), companion.getTop()), null, 2, 0, ComposableLambda3.rememberComposableLambda(-1464402888, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt.AboutV2FlowRow.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                        invoke(flowRowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(FlowRowScope FlowRow, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                        if ((i6 & 6) == 0) {
                            i6 |= composer2.changed(FlowRow) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1464402888, i6, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2FlowRow.<anonymous> (AboutV2.kt:202)");
                        }
                        for (AboutV2Info aboutV2Info : immutableList3) {
                            String label = aboutV2Info.getLabel();
                            String value = aboutV2Info.getValue();
                            Modifier modifierEducationTourId$default = Modifier.INSTANCE;
                            String educationTourId = aboutV2Info.getEducationTourId();
                            if (educationTourId != null && educationTourId.length() != 0) {
                                modifierEducationTourId$default = ModifiersKt.educationTourId$default(modifierEducationTourId$default, aboutV2Info.getEducationTourId(), null, null, false, false, 30, null);
                            }
                            AboutV2.AboutV2InfoItem(label, value, FlowRow.weight(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierEducationTourId$default, 0.0f, C2002Dp.m7995constructorimpl(48), 1, null), 0.5f, true), composer2, 0, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 40);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AboutV2.AboutV2FlowRow$lambda$16(immutableList3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            float fM21591getLargeD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            FlowLayoutKt.FlowRow(modifierM5146paddingqDBjuR0$default2, arrangement2.m5090spacedByD5KLDUw(fM21591getLargeD9Ej5fM2, companion2.getStart()), arrangement2.m5091spacedByD5KLDUw(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), companion2.getTop()), null, 2, 0, ComposableLambda3.rememberComposableLambda(-1464402888, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt.AboutV2FlowRow.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                    invoke(flowRowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(FlowRowScope FlowRow, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                    if ((i6 & 6) == 0) {
                        i6 |= composer2.changed(FlowRow) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1464402888, i6, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2FlowRow.<anonymous> (AboutV2.kt:202)");
                    }
                    for (AboutV2Info aboutV2Info : immutableList3) {
                        String label = aboutV2Info.getLabel();
                        String value = aboutV2Info.getValue();
                        Modifier modifierEducationTourId$default = Modifier.INSTANCE;
                        String educationTourId = aboutV2Info.getEducationTourId();
                        if (educationTourId != null && educationTourId.length() != 0) {
                            modifierEducationTourId$default = ModifiersKt.educationTourId$default(modifierEducationTourId$default, aboutV2Info.getEducationTourId(), null, null, false, false, 30, null);
                        }
                        AboutV2.AboutV2InfoItem(label, value, FlowRow.weight(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierEducationTourId$default, 0.0f, C2002Dp.m7995constructorimpl(48), 1, null), 0.5f, true), composer2, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutV2InfoItem(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1745245641);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1745245641, i3, -1, "com.robinhood.android.equitydetail.ui.about.v2.AboutV2InfoItem (AboutV2.kt:231)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                    TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM, composer2, (i3 & 14) | 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, ((i3 >> 3) & 14) | 817889280, 0, 7550);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AboutV2.AboutV2InfoItem$lambda$18(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU();
                    TextOverflow.Companion companion22 = TextOverflow.INSTANCE;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM2, composer2, (i3 & 14) | 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer2, ((i3 >> 3) & 14) | 817889280, 0, 7550);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final AboutV2ResourceStrings getResourceStrings(Composer composer, int i) {
        composer.startReplaceGroup(1025319227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1025319227, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.getResourceStrings (AboutV2.kt:255)");
        }
        AboutV2ResourceStrings aboutV2ResourceStrings = new AboutV2ResourceStrings(StringResources_androidKt.stringResource(C15314R.string.instrument_detail_about_with_suffix, composer, 0), StringResources_androidKt.stringResource(C15314R.string.instrument_detail_about_ceo_label, composer, 0), StringResources_androidKt.stringResource(C15314R.string.instrument_detail_about_founded_label, composer, 0), StringResources_androidKt.stringResource(C15314R.string.instrument_detail_about_employees_label, composer, 0), StringResources_androidKt.stringResource(C15314R.string.instrument_detail_hq_format, composer, 0), StringResources_androidKt.stringResource(C15314R.string.instrument_detail_about_hq_label, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_index_tracked_title, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_actively_managed_title, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_actively_managed_description, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_category_title, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_total_holdings_title, composer, 0), StringResources_androidKt.stringResource(C15314R.string.about_etp_details_inception_date_title, composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return aboutV2ResourceStrings;
    }

    @DayNightPreview
    private static final void PreviewAboutV2NotExpanded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-129227311);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-129227311, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.PreviewAboutV2NotExpanded (AboutV2.kt:276)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, AboutV24.INSTANCE.getLambda$837567769$feature_equity_detail_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.PreviewAboutV2NotExpanded$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewAboutV2NotExpandedNoOverflow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-360017810);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-360017810, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.PreviewAboutV2NotExpandedNoOverflow (AboutV2.kt:288)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, AboutV24.INSTANCE.getLambda$773993910$feature_equity_detail_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.PreviewAboutV2NotExpandedNoOverflow$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewAboutV2Expanded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614297818);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614297818, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.PreviewAboutV2Expanded (AboutV2.kt:303)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, AboutV24.INSTANCE.getLambda$121973470$feature_equity_detail_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.PreviewAboutV2Expanded$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void PreviewAboutV2Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-561553727);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-561553727, i, -1, "com.robinhood.android.equitydetail.ui.about.v2.PreviewAboutV2Loading (AboutV2.kt:319)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, AboutV24.INSTANCE.getLambda$325739017$feature_equity_detail_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutV2.PreviewAboutV2Loading$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ AboutV2ViewState buildTestViewState$default(String str, ImmutableList3 immutableList3, AboutV2ViewState2 aboutV2ViewState2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = AboutV29.ABOUT_TEXT;
        }
        if ((i & 2) != 0) {
            immutableList3 = buildTestAboutV2InfoList();
        }
        if ((i & 4) != 0) {
            aboutV2ViewState2 = AboutV2ViewState2.NONE;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = (i & 32) != 0 ? false : z3;
        boolean z5 = z2;
        return buildTestViewState(str, immutableList3, aboutV2ViewState2, z, z5, z4);
    }

    public static final AboutV2ViewState buildTestViewState(String aboutText, ImmutableList3<AboutV2Info> infoList, AboutV2ViewState2 expandBtnColor, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aboutText, "aboutText");
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        Intrinsics.checkNotNullParameter(expandBtnColor, "expandBtnColor");
        return new AboutV2ViewState(aboutText, infoList, expandBtnColor, z, z2, z3);
    }

    public static final ImmutableList3<AboutV2Info> buildTestAboutV2InfoList() {
        return extensions2.persistentListOf(new AboutV2Info("Founded", "1889", null, 4, null), new AboutV2Info("Employees", "7,724", null, 4, null), new AboutV2Info("Headquarters", "Kyoto, Kyoto", null, 4, null), new AboutV2Info("Some random label with a lot of text to show the maximum number of lines", "Some random value with a lot of text to show the maximum number of lines", null, 4, null));
    }
}
