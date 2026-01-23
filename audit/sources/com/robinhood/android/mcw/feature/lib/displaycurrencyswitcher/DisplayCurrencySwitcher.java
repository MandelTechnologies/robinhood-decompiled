package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DisplayCurrencySwitcher.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {DisplayCurrencySwitcher.CurrencySwitcherDropdownTestTag, "", "DisplayCurrencySwitcher", "", "accountNumber", "location", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo;", "isExpanded", "", "isDropdownFocusable", "performClickOnUnselectedCurrency", "onShowFtux", "Lkotlin/Function0;", "onDropdownDismissed", "(Ljava/lang/String;Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-display-currency-switcher_externalDebug", "state", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "alertDialogEvent", "expanded", "performClick"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class DisplayCurrencySwitcher {
    public static final String CurrencySwitcherDropdownTestTag = "CurrencySwitcherDropdownTestTag";

    /* compiled from: DisplayCurrencySwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayCurrencySwitcherLocation.values().length];
            try {
                iArr[DisplayCurrencySwitcherLocation.HOME_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayCurrencySwitcherLocation.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayCurrencySwitcherLocation.ACCOUNT_TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayCurrencySwitcher$lambda$17(String str, DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, Modifier modifier, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        DisplayCurrencySwitcher(str, displayCurrencySwitcherLocation, modifier, displayCurrencySwitcherDuxo, z, z2, z3, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplayCurrencySwitcher(final String accountNumber, final DisplayCurrencySwitcherLocation location, Modifier modifier, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        final Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier3;
        boolean z9;
        Object objRememberedValue;
        Composer.Companion companion;
        Event<DisplayCurrencySwitcherEvent> event;
        Object objRememberedValue2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objRememberedValue3;
        Object objRememberedValue4;
        SnapshotState4 snapshotState4;
        final Event<DisplayCurrencySwitcherEvent> eventDisplayCurrencySwitcher$lambda$5;
        int i9;
        int i10;
        Screen.Name name;
        boolean zChangedInstance;
        Object objRememberedValue5;
        final boolean z10;
        final DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo3;
        final boolean z11;
        EventConsumer<DisplayCurrencySwitcherEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(81797413);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(location.ordinal()) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    displayCurrencySwitcherDuxo2 = displayCurrencySwitcherDuxo;
                    int i12 = composerStartRestartGroup.changedInstance(displayCurrencySwitcherDuxo2) ? 2048 : 1024;
                    i3 |= i12;
                } else {
                    displayCurrencySwitcherDuxo2 = displayCurrencySwitcherDuxo;
                }
                i3 |= i12;
            } else {
                displayCurrencySwitcherDuxo2 = displayCurrencySwitcherDuxo;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            z6 = z3;
                            i3 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function03 = function0;
                            function04 = function02;
                            displayCurrencySwitcherDuxo3 = displayCurrencySwitcherDuxo2;
                            z11 = z5;
                            z10 = z6;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 8) == 0) {
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    z7 = true;
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DisplayCurrencySwitcherDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    i3 &= -7169;
                                    displayCurrencySwitcherDuxo2 = (DisplayCurrencySwitcherDuxo) baseDuxo;
                                } else {
                                    z7 = true;
                                }
                                boolean z12 = i4 == 0 ? false : z;
                                boolean z13 = i5 == 0 ? z7 : z2;
                                z8 = i6 == 0 ? false : z3;
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    function03 = (Function0) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function03 = function0;
                                }
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    function04 = (Function0) objRememberedValue8;
                                } else {
                                    function04 = function02;
                                }
                                modifier3 = modifier2;
                                z9 = z13;
                                z4 = z12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                z9 = z2;
                                function03 = function0;
                                function04 = function02;
                                modifier3 = modifier2;
                                z8 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(81797413, i3, -1, "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher (DisplayCurrencySwitcher.kt:72)");
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(displayCurrencySwitcherDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            final StateFlow<Event<DisplayCurrencySwitcherEvent>> eventFlow = displayCurrencySwitcherDuxo2.getEventFlow();
                            composerStartRestartGroup.startReplaceGroup(-523522313);
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DisplayCurrencySwitcher.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        Object L$1;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector) {
                                        this.$this_unsafeFlow = flowCollector;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            Event event = (Event) obj;
                                            if ((event != null ? event.getData() : null) instanceof DisplayCurrencySwitcherEvent) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            Event<DisplayCurrencySwitcherEvent> value = eventFlow.getValue();
                            event = value;
                            if (!((event == null ? event.getData() : null) instanceof DisplayCurrencySwitcherEvent)) {
                                value = null;
                            }
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                                snapshotMutationPolicy = null;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                snapshotMutationPolicy = null;
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 != companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z4), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 != companion.getEmpty()) {
                                snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            }
                            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            DisplayCurrencySwitcher$lambda$14(snapshotState3, z8);
                            eventDisplayCurrencySwitcher$lambda$5 = DisplayCurrencySwitcher$lambda$5(snapshotState4);
                            if (eventDisplayCurrencySwitcher$lambda$5 == null) {
                                if (!(eventDisplayCurrencySwitcher$lambda$5.getData() instanceof DisplayCurrencySwitcherEvent) || (eventConsumerInvoke = eventDisplayCurrencySwitcher$lambda$5.getGetEventConsumer().invoke()) == null) {
                                    i9 = i3;
                                } else {
                                    i9 = i3;
                                    eventConsumerInvoke.consume(eventDisplayCurrencySwitcher$lambda$5, new Function1() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$consumeIfType$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            m16508invoke(obj);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m16508invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            DisplayCurrencySwitcherEvent displayCurrencySwitcherEvent = (DisplayCurrencySwitcherEvent) eventDisplayCurrencySwitcher$lambda$5.getData();
                                            if (displayCurrencySwitcherEvent instanceof DisplayCurrencySwitcherEvent.ShowFtux) {
                                                function03.invoke();
                                                return;
                                            }
                                            if (displayCurrencySwitcherEvent instanceof DisplayCurrencySwitcherEvent.ExpandFxRates) {
                                                DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$11(snapshotState2, true);
                                            } else {
                                                if ((displayCurrencySwitcherEvent instanceof DisplayCurrencySwitcherEvent.ShowNoFxRatesDialog) || (displayCurrencySwitcherEvent instanceof DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog)) {
                                                    DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$8(snapshotState, displayCurrencySwitcherEvent);
                                                    return;
                                                }
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    });
                                }
                                Unit unit = Unit.INSTANCE;
                            } else {
                                i9 = i3;
                            }
                            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            i10 = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
                            if (i10 != 1) {
                                name = Screen.Name.HOME;
                            } else if (i10 == 2) {
                                name = Screen.Name.BUYING_POWER_HUB;
                            } else {
                                if (i10 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                name = Screen.Name.ACCOUNT_CENTER;
                            }
                            Screen screen = new Screen(name, null, "fx_switcher_" + DisplayCurrencySwitcher$lambda$4(snapshotState4CollectAsStateWithLifecycle).getSelectedCurrency(), null, 10, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i13 = i9 & 14;
                            zChangedInstance = composerStartRestartGroup.changedInstance(displayCurrencySwitcherDuxo2) | (i13 != 4) | ((i9 & 112) != 32);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new DisplayCurrencySwitcher2(displayCurrencySwitcherDuxo2, accountNumber, location, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i13);
                            DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo4 = displayCurrencySwitcherDuxo2;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.FX_SWITCHER, null, null, 6, null), null, 45, null), ComposableLambda3.rememberComposableLambda(-1561066534, true, new C217355(modifier3, snapshotState4CollectAsStateWithLifecycle, current2, coroutineScope, displayCurrencySwitcherDuxo4, z9, function04, snapshotState2, snapshotState3, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z10 = z8;
                            modifier2 = modifier3;
                            displayCurrencySwitcherDuxo3 = displayCurrencySwitcherDuxo4;
                            z11 = z9;
                        }
                        final boolean z14 = z4;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            final Function0<Unit> function05 = function04;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$17(accountNumber, location, modifier4, displayCurrencySwitcherDuxo3, z14, z11, z10, function03, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    z6 = z3;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if ((i2 & 8) == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            modifier3 = modifier2;
                            z9 = z13;
                            z4 = z12;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(displayCurrencySwitcherDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            final Flow eventFlow2 = displayCurrencySwitcherDuxo2.getEventFlow();
                            composerStartRestartGroup.startReplaceGroup(-523522313);
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            Lifecycle.State state2 = Lifecycle.State.STARTED;
                            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DisplayCurrencySwitcher.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        Object L$1;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector) {
                                        this.$this_unsafeFlow = flowCollector;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            Event event = (Event) obj;
                                            if ((event != null ? event.getData() : null) instanceof DisplayCurrencySwitcherEvent) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            Event<DisplayCurrencySwitcherEvent> value2 = eventFlow2.getValue();
                            event = value2;
                            if (!((event == null ? event.getData() : null) instanceof DisplayCurrencySwitcherEvent)) {
                            }
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                            }
                            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 != companion.getEmpty()) {
                            }
                            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 != companion.getEmpty()) {
                            }
                            SnapshotState snapshotState32 = (SnapshotState) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            DisplayCurrencySwitcher$lambda$14(snapshotState32, z8);
                            eventDisplayCurrencySwitcher$lambda$5 = DisplayCurrencySwitcher$lambda$5(snapshotState4);
                            if (eventDisplayCurrencySwitcher$lambda$5 == null) {
                            }
                            EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            i10 = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
                            if (i10 != 1) {
                            }
                            Screen screen2 = new Screen(name, null, "fx_switcher_" + DisplayCurrencySwitcher$lambda$4(snapshotState4CollectAsStateWithLifecycle3).getSelectedCurrency(), null, 10, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i132 = i9 & 14;
                            zChangedInstance = composerStartRestartGroup.changedInstance(displayCurrencySwitcherDuxo2) | (i132 != 4) | ((i9 & 112) != 32);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue5 = new DisplayCurrencySwitcher2(displayCurrencySwitcherDuxo2, accountNumber, location, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i132);
                                DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo42 = displayCurrencySwitcherDuxo2;
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, null, new Component(Component.ComponentType.FX_SWITCHER, null, null, 6, null), null, 45, null), ComposableLambda3.rememberComposableLambda(-1561066534, true, new C217355(modifier3, snapshotState4CollectAsStateWithLifecycle3, current22, coroutineScope2, displayCurrencySwitcherDuxo42, z9, function04, snapshotState22, snapshotState32, snapshotState5), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z10 = z8;
                                modifier2 = modifier3;
                                displayCurrencySwitcherDuxo3 = displayCurrencySwitcherDuxo42;
                                z11 = z9;
                            }
                        }
                    }
                    final boolean z142 = z4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                z6 = z3;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                final boolean z1422 = z4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z5 = z2;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            z6 = z3;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final boolean z14222 = z4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z5 = z2;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        z6 = z3;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final boolean z142222 = z4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: DisplayCurrencySwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5 */
    static final class C217355 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<DisplayCurrencySwitcherEvent> $alertDialogEvent$delegate;
        final /* synthetic */ DisplayCurrencySwitcherDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
        final /* synthetic */ boolean $isDropdownFocusable;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDropdownDismissed;
        final /* synthetic */ SnapshotState<Boolean> $performClick$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnapshotState4<DisplayCurrencySwitcherViewState> $state$delegate;

        C217355(Modifier modifier, SnapshotState4<DisplayCurrencySwitcherViewState> snapshotState4, EventLogger eventLogger, CoroutineScope coroutineScope, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, boolean z, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<DisplayCurrencySwitcherEvent> snapshotState3) {
            this.$modifier = modifier;
            this.$state$delegate = snapshotState4;
            this.$eventLogger = eventLogger;
            this.$scope = coroutineScope;
            this.$duxo = displayCurrencySwitcherDuxo;
            this.$isDropdownFocusable = z;
            this.$onDropdownDismissed = function0;
            this.$expanded$delegate = snapshotState;
            this.$performClick$delegate = snapshotState2;
            this.$alertDialogEvent$delegate = snapshotState3;
        }

        public final void invoke(Composer composer, int i) {
            SnapshotState<Boolean> snapshotState;
            SnapshotState<DisplayCurrencySwitcherEvent> snapshotState2;
            UserInteractionEventDescriptor userInteractionEventDescriptor;
            EventLogger eventLogger;
            SnapshotState4<DisplayCurrencySwitcherViewState> snapshotState4;
            DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo;
            SnapshotState<DisplayCurrencySwitcherEvent> snapshotState3;
            boolean z;
            Function0<Unit> function0;
            SnapshotState<Boolean> snapshotState5;
            Composer composer2;
            final SnapshotState<Boolean> snapshotState6;
            final SnapshotState<DisplayCurrencySwitcherEvent> snapshotState7;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561066534, i, -1, "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher.<anonymous> (DisplayCurrencySwitcher.kt:121)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            final SnapshotState4<DisplayCurrencySwitcherViewState> snapshotState42 = this.$state$delegate;
            final EventLogger eventLogger2 = this.$eventLogger;
            final CoroutineScope coroutineScope = this.$scope;
            final DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo2 = this.$duxo;
            boolean z2 = this.$isDropdownFocusable;
            Function0<Unit> function02 = this.$onDropdownDismissed;
            SnapshotState<Boolean> snapshotState8 = this.$expanded$delegate;
            SnapshotState<Boolean> snapshotState9 = this.$performClick$delegate;
            SnapshotState<DisplayCurrencySwitcherEvent> snapshotState10 = this.$alertDialogEvent$delegate;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(snapshotState42) | composer.changedInstance(userInteractionEventDescriptor2) | composer.changedInstance(eventLogger2) | composer.changedInstance(coroutineScope) | composer.changedInstance(displayCurrencySwitcherDuxo2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                snapshotState = snapshotState9;
                snapshotState2 = snapshotState10;
                Function0 function03 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DisplayCurrencySwitcher.C217355.invoke$lambda$10$lambda$1$lambda$0(userInteractionEventDescriptor2, eventLogger2, coroutineScope, snapshotState42, displayCurrencySwitcherDuxo2);
                    }
                };
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                eventLogger = eventLogger2;
                snapshotState4 = snapshotState42;
                displayCurrencySwitcherDuxo = displayCurrencySwitcherDuxo2;
                composer.updateRememberedValue(function03);
                objRememberedValue = function03;
            } else {
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                snapshotState = snapshotState9;
                snapshotState2 = snapshotState10;
                snapshotState4 = snapshotState42;
                displayCurrencySwitcherDuxo = displayCurrencySwitcherDuxo2;
                eventLogger = eventLogger2;
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Currency selectedCurrency = DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$4(snapshotState4).getSelectedCurrency();
            composer.startReplaceGroup(-64881509);
            if (selectedCurrency == null) {
                snapshotState5 = snapshotState;
                snapshotState3 = snapshotState2;
                z = z2;
                function0 = function02;
                composer2 = composer;
            } else {
                snapshotState3 = snapshotState2;
                z = z2;
                function0 = function02;
                snapshotState5 = snapshotState;
                BentoText2.m20747BentoText38GnDrw(selectedCurrency.name(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getCurrencySwitcher(), composer, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size12.$stable | 48, 56);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            List<FormattedDisplayCurrency> formattedDisplayCurrencies = DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$4(snapshotState4).getFormattedDisplayCurrencies();
            composer2.startReplaceGroup(-56804911);
            if (formattedDisplayCurrencies == null) {
                snapshotState6 = snapshotState8;
            } else {
                boolean z3 = z;
                snapshotState6 = snapshotState8;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1581165713, true, new DisplayCurrencySwitcher4(z3, userInteractionEventDescriptor, eventLogger, function0, snapshotState8, formattedDisplayCurrencies, displayCurrencySwitcherDuxo, snapshotState5), composer2, 54), composer2, 6);
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            DisplayCurrencySwitcherEvent displayCurrencySwitcherEventDisplayCurrencySwitcher$lambda$7 = DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$7(snapshotState3);
            composer2.startReplaceGroup(-56583572);
            if (displayCurrencySwitcherEventDisplayCurrencySwitcher$lambda$7 != null) {
                final boolean z4 = displayCurrencySwitcherEventDisplayCurrencySwitcher$lambda$7 instanceof DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog;
                composer2.startReplaceGroup(-1746271574);
                boolean zChanged2 = composer2.changed(z4);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    snapshotState7 = snapshotState3;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DisplayCurrencySwitcher.C217355.invoke$lambda$10$lambda$9$lambda$6$lambda$5(z4, snapshotState7, snapshotState6);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState7 = snapshotState3;
                }
                Function0 function04 = (Function0) objRememberedValue2;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DisplayCurrencySwitcher.C217355.invoke$lambda$10$lambda$9$lambda$8$lambda$7(snapshotState7);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                DisplayCurrencySwitcherAlertDialog.DisplayCurrencySwitcherAlertDialog(displayCurrencySwitcherEventDisplayCurrencySwitcher$lambda$7, function04, (Function0) objRememberedValue3, null, composer2, 384, 8);
                Unit unit3 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
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
        public static final Unit invoke$lambda$10$lambda$1$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, CoroutineScope coroutineScope, SnapshotState4 snapshotState4, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo) {
            if (DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$4(snapshotState4).getCanShowFxSwitcherDropdown()) {
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SHOW_DROPDOWN, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getDefault(), null, new DisplayCurrencySwitcher3(displayCurrencySwitcherDuxo, null), 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$6$lambda$5(boolean z, SnapshotState snapshotState, SnapshotState snapshotState2) {
            DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$8(snapshotState, null);
            if (z) {
                DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$11(snapshotState2, true);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState) {
            DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$8(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplayCurrencySwitcher$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void DisplayCurrencySwitcher$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DisplayCurrencySwitcher$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DisplayCurrencySwitcher$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCurrencySwitcherViewState DisplayCurrencySwitcher$lambda$4(SnapshotState4<DisplayCurrencySwitcherViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<DisplayCurrencySwitcherEvent> DisplayCurrencySwitcher$lambda$5(SnapshotState4<Event<DisplayCurrencySwitcherEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCurrencySwitcherEvent DisplayCurrencySwitcher$lambda$7(SnapshotState<DisplayCurrencySwitcherEvent> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplayCurrencySwitcher$lambda$8(SnapshotState<DisplayCurrencySwitcherEvent> snapshotState, DisplayCurrencySwitcherEvent displayCurrencySwitcherEvent) {
        snapshotState.setValue(displayCurrencySwitcherEvent);
    }
}
