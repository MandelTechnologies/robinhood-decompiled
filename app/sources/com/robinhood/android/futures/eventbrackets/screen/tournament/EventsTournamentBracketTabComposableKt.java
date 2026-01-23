package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ContentColor3;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.trade.orderform.OrderFormComponents;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconAnimation;
import com.robinhood.android.eventcontracts.sharedeventui.scrolls.CollapsingHeaderNestedScrollLayout;
import com.robinhood.android.futures.eventbrackets.C17135R;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo2;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo3;
import com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildTournamentBracket;
import com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigator;
import com.robinhood.android.futures.eventbrackets.screen.tournament.switcher.EventsTournamentSwitcher;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.util.Money;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventsTournamentBracketTabComposable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\r\u001aÊ\u0001\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001a2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0004\b&\u0010'\u001aA\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010-\u001a\u0017\u0010.\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010/\u001aw\u00100\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010\u00172!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0004\b2\u00103\u001a\r\u00104\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00105\"\u000e\u00106\u001a\u000207X\u0082T¢\u0006\u0002\n\u0000¨\u00068²\u0006\n\u0010\b\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u00109\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"EventsTournamentBracketTabComposable", "", "eventsTournamentBracketScreenCallbacks", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketScreenCallbacks;", "eventsTournamentBracketDuxo", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "(Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketScreenCallbacks;Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;Landroidx/compose/runtime/Composer;II)V", "EventTournamentBracketAppBar", "viewState", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "onBackClicked", "Lkotlin/Function0;", "onTopicSelectorClicked", "(Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EventTournamentBracketCollapsingHeaderContent", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;", "navigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "showTopicsSwitcher", "", "contentBottomPadding", "Landroidx/compose/ui/unit/Dp;", "onTabSelected", "Lkotlin/Function1;", "", "onTopicSelected", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "topicId", "bracketId", "onCardClick", "cardId", "onTradeButtonClick", "onDismissSwitcher", "modifier", "Landroidx/compose/ui/Modifier;", "EventTournamentBracketCollapsingHeaderContent-7vwJh_E", "(Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TabsSection", "selectedTabIndex", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/TabData;", "(ILkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VerticalGradientShadow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InTabContent", "tabIndex", "InTabContent-osbwsH8", "(Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewAppBar", "(Landroidx/compose/runtime/Composer;I)V", "SHORT_PLACE_HOLDER", "", "feature-event-brackets_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent;", "floatingPillHeightPx"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventsTournamentBracketTabComposableKt {
    private static final String SHORT_PLACE_HOLDER = "       ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTournamentBracketAppBar$lambda$13(AppBarData appBarData, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        EventTournamentBracketAppBar(appBarData, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTournamentBracketCollapsingHeaderContent_7vwJh_E$lambda$14(EventsTournamentBracketViewState eventsTournamentBracketViewState, BracketNavigationInfo3 bracketNavigationInfo3, boolean z, float f, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14604EventTournamentBracketCollapsingHeaderContent7vwJh_E(eventsTournamentBracketViewState, bracketNavigationInfo3, z, f, function1, function2, function12, function13, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketTabComposable$lambda$12(EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, int i, int i2, Composer composer, int i3) {
        EventsTournamentBracketTabComposable(eventsTournamentBracketScreenCallbacks, eventsTournamentBracketDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventsTournamentBracketTabComposable$lambda$3(EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, int i, int i2, Composer composer, int i3) {
        EventsTournamentBracketTabComposable(eventsTournamentBracketScreenCallbacks, eventsTournamentBracketDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InTabContent_osbwsH8$lambda$18(EventsTournamentBracketViewState eventsTournamentBracketViewState, BracketNavigationInfo3 bracketNavigationInfo3, float f, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14605InTabContentosbwsH8(eventsTournamentBracketViewState, bracketNavigationInfo3, f, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAppBar$lambda$19(int i, Composer composer, int i2) {
        PreviewAppBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabsSection$lambda$15(int i, ImmutableList immutableList, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        TabsSection(i, immutableList, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalGradientShadow$lambda$16(Modifier modifier, int i, int i2, Composer composer, int i3) {
        VerticalGradientShadow(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventsTournamentBracketTabComposable(final EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Composer composer, final int i, final int i2) {
        int i3;
        EventsTournamentBracketDuxo eventsTournamentBracketDuxo2;
        int i4;
        int i5;
        final EventsTournamentBracketDuxo eventsTournamentBracketDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Intrinsics.checkNotNullParameter(eventsTournamentBracketScreenCallbacks, "eventsTournamentBracketScreenCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-677802456);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(eventsTournamentBracketScreenCallbacks) : composerStartRestartGroup.changedInstance(eventsTournamentBracketScreenCallbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                eventsTournamentBracketDuxo2 = eventsTournamentBracketDuxo;
                int i6 = composerStartRestartGroup.changedInstance(eventsTournamentBracketDuxo2) ? 32 : 16;
                i3 |= i6;
            } else {
                eventsTournamentBracketDuxo2 = eventsTournamentBracketDuxo;
            }
            i3 |= i6;
        } else {
            eventsTournamentBracketDuxo2 = eventsTournamentBracketDuxo;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            eventsTournamentBracketDuxo3 = eventsTournamentBracketDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    i4 = 0;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EventsTournamentBracketDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventsTournamentBracketDuxo2 = (EventsTournamentBracketDuxo) baseDuxo;
                    i3 &= -113;
                }
                EventsTournamentBracketDuxo eventsTournamentBracketDuxo4 = eventsTournamentBracketDuxo2;
                i5 = i3;
                eventsTournamentBracketDuxo3 = eventsTournamentBracketDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-677802456, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposable (EventsTournamentBracketTabComposable.kt:72)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventsTournamentBracketScreenCallbacks.handleEvent(EventsTournamentBracketTabComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
                composerStartRestartGroup.startReplaceGroup(1466883947);
                if (EventsTournamentBracketTabComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowScreenLoading()) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i7 = ((i5 & 14) == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(eventsTournamentBracketScreenCallbacks))) ? 1 : i4;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C17170xd94a4b15(eventsTournamentBracketScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LoadingScaffold4.LoadingScaffold((Function0) ((KFunction) objRememberedValue2), null, composerStartRestartGroup, i4, 2);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$3(eventsTournamentBracketScreenCallbacks, eventsTournamentBracketDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$5$lambda$4();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                BracketNavigationInfo3 bracketNavigationInfo3RememberBracketNavigationState = BracketNavigationInfo2.rememberBracketNavigationState(EventsTournamentBracketTabComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNavigationInfo(), composerStartRestartGroup, i4);
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$9$lambda$8();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 3072, 6);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Composer composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(69342188, true, new C171713(eventsTournamentBracketScreenCallbacks, snapshotState, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(598326959, true, new C171734(bracketNavigationInfo3RememberBracketNavigationState, snapshotIntState2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), FabPosition.INSTANCE.m5856getCenterERTFSPs(), bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-2036767369, true, new C171745(eventsTournamentBracketDuxo3, eventsTournamentBracketScreenCallbacks, bracketNavigationInfo3RememberBracketNavigationState, snapshotState, snapshotState4CollectAsStateWithLifecycle, snapshotIntState2), composerStartRestartGroup, 54), composer2, 805330998, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    EventsTournamentBracketDuxo eventsTournamentBracketDuxo5 = eventsTournamentBracketDuxo2;
                    i5 = i3 & (-113);
                    eventsTournamentBracketDuxo3 = eventsTournamentBracketDuxo5;
                    i4 = 0;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    eventsTournamentBracketScreenCallbacks.handleEvent(EventsTournamentBracketTabComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
                    composerStartRestartGroup.startReplaceGroup(1466883947);
                    if (EventsTournamentBracketTabComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowScreenLoading()) {
                    }
                }
            }
            i4 = 0;
            EventsTournamentBracketDuxo eventsTournamentBracketDuxo42 = eventsTournamentBracketDuxo2;
            i5 = i3;
            eventsTournamentBracketDuxo3 = eventsTournamentBracketDuxo42;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            eventsTournamentBracketScreenCallbacks.handleEvent(EventsTournamentBracketTabComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(eventsTournamentBracketDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
            composerStartRestartGroup.startReplaceGroup(1466883947);
            if (EventsTournamentBracketTabComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowScreenLoading()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$12(eventsTournamentBracketScreenCallbacks, eventsTournamentBracketDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EventsTournamentBracketTabComposable$lambda$10(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventsTournamentBracketViewState EventsTournamentBracketTabComposable$lambda$0(SnapshotState4<EventsTournamentBracketViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EventsTournamentBracketEvent> EventsTournamentBracketTabComposable$lambda$1(SnapshotState4<Event<EventsTournamentBracketEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EventsTournamentBracketTabComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState EventsTournamentBracketTabComposable$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventsTournamentBracketTabComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 EventsTournamentBracketTabComposable$lambda$9$lambda$8() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* compiled from: EventsTournamentBracketTabComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$4 */
    static final class C171734 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotIntState2 $floatingPillHeightPx$delegate;
        final /* synthetic */ BracketNavigationInfo3 $navigationState;
        final /* synthetic */ SnapshotState4<EventsTournamentBracketViewState> $viewState$delegate;

        C171734(BracketNavigationInfo3 bracketNavigationInfo3, SnapshotIntState2 snapshotIntState2, SnapshotState4<EventsTournamentBracketViewState> snapshotState4) {
            this.$navigationState = bracketNavigationInfo3;
            this.$floatingPillHeightPx$delegate = snapshotIntState2;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(598326959, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposable.<anonymous> (EventsTournamentBracketTabComposable.kt:96)");
            }
            if (EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$0(this.$viewState$delegate).getShowNavigator()) {
                BracketNavigationInfo3 bracketNavigationInfo3 = this.$navigationState;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$floatingPillHeightPx$delegate);
                final SnapshotIntState2 snapshotIntState2 = this.$floatingPillHeightPx$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventsTournamentBracketTabComposableKt.C171734.invoke$lambda$1$lambda$0(snapshotIntState2, (IntSize) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EventsTournamentBracketNavigator.EventsTournamentBracketNavigator(bracketNavigationInfo3, OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
            EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$11(snapshotIntState2, (int) (intSize.getPackedValue() & 4294967295L));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EventsTournamentBracketTabComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$3 */
    static final class C171713 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventsTournamentBracketScreenCallbacks $eventsTournamentBracketScreenCallbacks;
        final /* synthetic */ SnapshotState<Boolean> $showTopicsSwitcher$delegate;
        final /* synthetic */ SnapshotState4<EventsTournamentBracketViewState> $viewState$delegate;

        C171713(EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks, SnapshotState<Boolean> snapshotState, SnapshotState4<EventsTournamentBracketViewState> snapshotState4) {
            this.$eventsTournamentBracketScreenCallbacks = eventsTournamentBracketScreenCallbacks;
            this.$showTopicsSwitcher$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(69342188, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposable.<anonymous> (EventsTournamentBracketTabComposable.kt:104)");
            }
            AppBarData appBarData = EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$0(this.$viewState$delegate).getAppBarData();
            EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks = this.$eventsTournamentBracketScreenCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(eventsTournamentBracketScreenCallbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C17172xb0000d64(eventsTournamentBracketScreenCallbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$showTopicsSwitcher$delegate);
            final SnapshotState<Boolean> snapshotState = this.$showTopicsSwitcher$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventsTournamentBracketTabComposableKt.C171713.invoke$lambda$2$lambda$1(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EventsTournamentBracketTabComposableKt.EventTournamentBracketAppBar(appBarData, function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState) {
            EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$7(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventsTournamentBracketTabComposable$lambda$11(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* compiled from: EventsTournamentBracketTabComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$5 */
    static final class C171745 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventsTournamentBracketDuxo $eventsTournamentBracketDuxo;
        final /* synthetic */ EventsTournamentBracketScreenCallbacks $eventsTournamentBracketScreenCallbacks;
        final /* synthetic */ SnapshotIntState2 $floatingPillHeightPx$delegate;
        final /* synthetic */ BracketNavigationInfo3 $navigationState;
        final /* synthetic */ SnapshotState<Boolean> $showTopicsSwitcher$delegate;
        final /* synthetic */ SnapshotState4<EventsTournamentBracketViewState> $viewState$delegate;

        C171745(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks, BracketNavigationInfo3 bracketNavigationInfo3, SnapshotState<Boolean> snapshotState, SnapshotState4<EventsTournamentBracketViewState> snapshotState4, SnapshotIntState2 snapshotIntState2) {
            this.$eventsTournamentBracketDuxo = eventsTournamentBracketDuxo;
            this.$eventsTournamentBracketScreenCallbacks = eventsTournamentBracketScreenCallbacks;
            this.$navigationState = bracketNavigationInfo3;
            this.$showTopicsSwitcher$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
            this.$floatingPillHeightPx$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2036767369, i2, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposable.<anonymous> (EventsTournamentBracketTabComposable.kt:111)");
            }
            EventsTournamentBracketViewState eventsTournamentBracketViewStateEventsTournamentBracketTabComposable$lambda$0 = EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$0(this.$viewState$delegate);
            float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$10(this.$floatingPillHeightPx$delegate));
            boolean zEventsTournamentBracketTabComposable$lambda$6 = EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$6(this.$showTopicsSwitcher$delegate);
            EventsTournamentBracketDuxo eventsTournamentBracketDuxo = this.$eventsTournamentBracketDuxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(eventsTournamentBracketDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C17175xb01c4027(eventsTournamentBracketDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            EventsTournamentBracketDuxo eventsTournamentBracketDuxo2 = this.$eventsTournamentBracketDuxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(eventsTournamentBracketDuxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C17176xb01c43e8(eventsTournamentBracketDuxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks = this.$eventsTournamentBracketScreenCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(eventsTournamentBracketScreenCallbacks);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C17177xb01c47a9(eventsTournamentBracketScreenCallbacks);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            EventsTournamentBracketScreenCallbacks eventsTournamentBracketScreenCallbacks2 = this.$eventsTournamentBracketScreenCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(eventsTournamentBracketScreenCallbacks2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new C17178xb01c4b6a(eventsTournamentBracketScreenCallbacks2);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            BracketNavigationInfo3 bracketNavigationInfo3 = this.$navigationState;
            Function1 function1 = (Function1) kFunction;
            Function2 function2 = (Function2) kFunction2;
            Function1 function12 = (Function1) kFunction3;
            Function1 function13 = (Function1) ((KFunction) objRememberedValue4);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$showTopicsSwitcher$delegate);
            final SnapshotState<Boolean> snapshotState = this.$showTopicsSwitcher$delegate;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventsTournamentBracketTabComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventsTournamentBracketTabComposableKt.C171745.invoke$lambda$6$lambda$5(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            EventsTournamentBracketTabComposableKt.m14604EventTournamentBracketCollapsingHeaderContent7vwJh_E(eventsTournamentBracketViewStateEventsTournamentBracketTabComposable$lambda$0, bracketNavigationInfo3, zEventsTournamentBracketTabComposable$lambda$6, fMo5013toDpu2uoSUM, function1, function2, function12, function13, (Function0) objRememberedValue5, modifierPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
            EventsTournamentBracketTabComposableKt.EventsTournamentBracketTabComposable$lambda$7(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventTournamentBracketAppBar(final AppBarData appBarData, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2006454781);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(appBarData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2006454781, i2, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketAppBar (EventsTournamentBracketTabComposable.kt:135)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-877086096, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt.EventTournamentBracketAppBar.1
                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-877086096, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketAppBar.<anonymous> (EventsTournamentBracketTabComposable.kt:138)");
                    }
                    boolean z = appBarData.getAppBarTitle() == null;
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Function0<Unit> function03 = function02;
                    final AppBarData appBarData2 = appBarData;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion2, !z, null, null, function03, 6, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion.getCenterVertically(), composer3, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM4893clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-199987770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketAppBar$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            String string2;
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-199987770, i4, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketAppBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:155)");
                            }
                            StringResource appBarTitle = appBarData2.getAppBarTitle();
                            composer4.startReplaceGroup(1085284399);
                            CharSequence text = appBarTitle == null ? null : StringResources6.getText(appBarTitle, composer4, StringResource.$stable);
                            composer4.endReplaceGroup();
                            if (text == null || (string2 = text.toString()) == null) {
                                string2 = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
                            }
                            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3072, 6);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i4).m21595getXsmallD9Ej5fM()), composer3, 0);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size12.$stable | 48, 56);
                    composer3.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getCenter(), companion.getCenterVertically(), composer3, 54);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17135R.string.bracket_app_bar_pnl_label, composer3, 0), companion2, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer3, 48, 0, 8184);
                    LocalShowPlaceholder.Loadable(appBarData2.getRealizedPnlValue() == null, null, null, ComposableLambda3.rememberComposableLambda(-1219003473, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketAppBar$1$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i5) {
                            String strCurrencyDeltaFormat;
                            long jM21425getFg0d7_KjU;
                            if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219003473, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketAppBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:183)");
                            }
                            Money realizedPnlValue = appBarData2.getRealizedPnlValue();
                            if (realizedPnlValue == null || (strCurrencyDeltaFormat = BuildTournamentBracket.currencyDeltaFormat(realizedPnlValue)) == null) {
                                strCurrencyDeltaFormat = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme2.getTypography(composer4, i6).getTextS();
                            Money realizedPnlValue2 = appBarData2.getRealizedPnlValue();
                            if (realizedPnlValue2 == null || !realizedPnlValue2.isPositive()) {
                                Money realizedPnlValue3 = appBarData2.getRealizedPnlValue();
                                if (realizedPnlValue3 == null || !realizedPnlValue3.isNegative()) {
                                    composer4.startReplaceGroup(-1383337985);
                                    jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i6).m21425getFg0d7_KjU();
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(-1383433031);
                                    jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i6).m21452getNegative0d7_KjU();
                                    composer4.endReplaceGroup();
                                }
                            } else {
                                composer4.startReplaceGroup(-1383581831);
                                jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i6).m21456getPositive0d7_KjU();
                                composer4.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(strCurrencyDeltaFormat, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer4, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3072, 6);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-216015932, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt.EventTournamentBracketAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-216015932, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketAppBar.<anonymous> (EventsTournamentBracketTabComposable.kt:200)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1914);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventsTournamentBracketTabComposableKt.EventTournamentBracketAppBar$lambda$13(appBarData, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ec  */
    /* renamed from: EventTournamentBracketCollapsingHeaderContent-7vwJh_E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14604EventTournamentBracketCollapsingHeaderContent7vwJh_E(final EventsTournamentBracketViewState eventsTournamentBracketViewState, final BracketNavigationInfo3 bracketNavigationInfo3, final boolean z, final float f, final Function1<? super Integer, Unit> function1, final Function2<? super UUID, ? super UUID, Unit> function2, final Function1<? super UUID, Unit> function12, final Function1<? super UUID, Unit> function13, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        Function1<? super Integer, Unit> function14;
        Function2<? super UUID, ? super UUID, Unit> function22;
        Function1<? super UUID, Unit> function15;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-370089868);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventsTournamentBracketViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(bracketNavigationInfo3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function14 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            function22 = function2;
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else {
                            if ((i & 1572864) == 0) {
                                function15 = function12;
                                i3 |= composerStartRestartGroup.changedInstance(function15) ? 1048576 : 524288;
                            }
                            if ((i2 & 128) == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
                            }
                            if ((i2 & 256) == 0) {
                                i3 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                                }
                                i4 = i2 & 512;
                                if (i4 == 0) {
                                    if ((805306368 & i) == 0) {
                                        modifier2 = modifier;
                                        i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-370089868, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketCollapsingHeaderContent (EventsTournamentBracketTabComposable.kt:217)");
                                        }
                                        final float f3 = f2;
                                        final Function1<? super Integer, Unit> function16 = function14;
                                        final Function1<? super UUID, Unit> function17 = function15;
                                        int i5 = i3;
                                        int i6 = i5 >> 21;
                                        composer2 = composerStartRestartGroup;
                                        CollapsingHeaderNestedScrollLayout.CollapsingHeaderNestedScrollLayout(ComposableLambda3.rememberComposableLambda(1071669158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketCollapsingHeaderContent$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i7) {
                                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1071669158, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketCollapsingHeaderContent.<anonymous> (EventsTournamentBracketTabComposable.kt:221)");
                                                }
                                                EventTournamentBracketHeader2.EventTournamentBracketHeader(eventsTournamentBracketViewState.getHeader(), function13, null, composer3, 0, 4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1704180482, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketCollapsingHeaderContent$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                                invoke(boxScope, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope CollapsingHeaderNestedScrollLayout, Composer composer3, int i7) {
                                                Intrinsics.checkNotNullParameter(CollapsingHeaderNestedScrollLayout, "$this$CollapsingHeaderNestedScrollLayout");
                                                if ((i7 & 6) == 0) {
                                                    i7 |= composer3.changed(CollapsingHeaderNestedScrollLayout) ? 4 : 2;
                                                }
                                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1704180482, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketCollapsingHeaderContent.<anonymous> (EventsTournamentBracketTabComposable.kt:227)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                EventsTournamentBracketTabComposableKt.m14605InTabContentosbwsH8(eventsTournamentBracketViewState, bracketNavigationInfo3, f3, function16, function17, companion, composer3, 196608, 0);
                                                EventsTournamentBracketTabComposableKt.VerticalGradientShadow(CollapsingHeaderNestedScrollLayout.align(companion, Alignment.INSTANCE.getBottomCenter()), composer3, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), modifier2, null, composer2, (i6 & 896) | 54, 8);
                                        Modifier modifier4 = modifier2;
                                        if (z) {
                                            EventsTournamentSwitcher.EventsTournamentSwitcher(eventsTournamentBracketViewState.getEventsTournamentSwitcherData(), function0, function22, null, composer2, (i6 & 112) | ((i5 >> 9) & 896), 8);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        composer2 = composerStartRestartGroup;
                                        modifier3 = modifier2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return EventsTournamentBracketTabComposableKt.EventTournamentBracketCollapsingHeaderContent_7vwJh_E$lambda$14(eventsTournamentBracketViewState, bracketNavigationInfo3, z, f, function1, function2, function12, function13, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 805306368;
                                modifier2 = modifier;
                                if ((i3 & 306783379) == 306783378) {
                                    if (i4 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final float f32 = f2;
                                    final Function1<? super Integer, Unit> function162 = function14;
                                    final Function1<? super UUID, Unit> function172 = function15;
                                    int i52 = i3;
                                    int i62 = i52 >> 21;
                                    composer2 = composerStartRestartGroup;
                                    CollapsingHeaderNestedScrollLayout.CollapsingHeaderNestedScrollLayout(ComposableLambda3.rememberComposableLambda(1071669158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketCollapsingHeaderContent$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i7) {
                                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1071669158, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketCollapsingHeaderContent.<anonymous> (EventsTournamentBracketTabComposable.kt:221)");
                                            }
                                            EventTournamentBracketHeader2.EventTournamentBracketHeader(eventsTournamentBracketViewState.getHeader(), function13, null, composer3, 0, 4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1704180482, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$EventTournamentBracketCollapsingHeaderContent$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                            invoke(boxScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope CollapsingHeaderNestedScrollLayout, Composer composer3, int i7) {
                                            Intrinsics.checkNotNullParameter(CollapsingHeaderNestedScrollLayout, "$this$CollapsingHeaderNestedScrollLayout");
                                            if ((i7 & 6) == 0) {
                                                i7 |= composer3.changed(CollapsingHeaderNestedScrollLayout) ? 4 : 2;
                                            }
                                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1704180482, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketCollapsingHeaderContent.<anonymous> (EventsTournamentBracketTabComposable.kt:227)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            EventsTournamentBracketTabComposableKt.m14605InTabContentosbwsH8(eventsTournamentBracketViewState, bracketNavigationInfo3, f32, function162, function172, companion, composer3, 196608, 0);
                                            EventsTournamentBracketTabComposableKt.VerticalGradientShadow(CollapsingHeaderNestedScrollLayout.align(companion, Alignment.INSTANCE.getBottomCenter()), composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), modifier2, null, composer2, (i62 & 896) | 54, 8);
                                    Modifier modifier42 = modifier2;
                                    if (z) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier42;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i4 = i2 & 512;
                            if (i4 == 0) {
                            }
                            modifier2 = modifier;
                            if ((i3 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        function15 = function12;
                        if ((i2 & 128) == 0) {
                        }
                        if ((i2 & 256) == 0) {
                        }
                        i4 = i2 & 512;
                        if (i4 == 0) {
                        }
                        modifier2 = modifier;
                        if ((i3 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function22 = function2;
                    if ((i2 & 64) != 0) {
                    }
                    function15 = function12;
                    if ((i2 & 128) == 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i4 = i2 & 512;
                    if (i4 == 0) {
                    }
                    modifier2 = modifier;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function14 = function1;
                if ((i2 & 32) == 0) {
                }
                function22 = function2;
                if ((i2 & 64) != 0) {
                }
                function15 = function12;
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i4 = i2 & 512;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            if ((i2 & 16) != 0) {
            }
            function14 = function1;
            if ((i2 & 32) == 0) {
            }
            function22 = function2;
            if ((i2 & 64) != 0) {
            }
            function15 = function12;
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        f2 = f;
        if ((i2 & 16) != 0) {
        }
        function14 = function1;
        if ((i2 & 32) == 0) {
        }
        function22 = function2;
        if ((i2 & 64) != 0) {
        }
        function15 = function12;
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TabsSection(final int i, final ImmutableList<TabData> immutableList, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1811982578);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1811982578, i4, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.TabsSection (EventsTournamentBracketTabComposable.kt:254)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TabRowKt.m5993TabRowpAZo6Ak(i, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(890305654, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt.TabsSection.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                        invoke((List<TabPosition>) list, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(890305654, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.TabsSection.<anonymous> (EventsTournamentBracketTabComposable.kt:260)");
                        }
                        if (i < tabPositions.size()) {
                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                            tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, (TabRowDefaults.$stable << 9) | 48, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1306298998, true, new C171812(immutableList, i, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 1597440, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventsTournamentBracketTabComposableKt.TabsSection$lambda$15(i, immutableList, function1, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            TabRowKt.m5993TabRowpAZo6Ak(i, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(890305654, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt.TabsSection.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                    invoke((List<TabPosition>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(890305654, i7, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.TabsSection.<anonymous> (EventsTournamentBracketTabComposable.kt:260)");
                    }
                    if (i < tabPositions.size()) {
                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                        tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, (TabRowDefaults.$stable << 9) | 48, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1306298998, true, new C171812(immutableList, i, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 1597440, 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EventsTournamentBracketTabComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$TabsSection$2 */
    static final class C171812 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ ImmutableList<TabData> $tabs;

        /* JADX WARN: Multi-variable type inference failed */
        C171812(ImmutableList<TabData> immutableList, int i, Function1<? super Integer, Unit> function1) {
            this.$tabs = immutableList;
            this.$selectedTabIndex = i;
            this.$onTabSelected = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, int i) {
            function1.invoke(Integer.valueOf(i));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306298998, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.TabsSection.<anonymous> (EventsTournamentBracketTabComposable.kt:270)");
            }
            ImmutableList<TabData> immutableList = this.$tabs;
            int i2 = this.$selectedTabIndex;
            final Function1<Integer, Unit> function1 = this.$onTabSelected;
            final int i3 = 0;
            for (TabData tabData : immutableList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final TabData tabData2 = tabData;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i5).m21427getFg30d7_KjU();
                boolean z = i3 == i2;
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(function1) | composer2.changed(i3);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$TabsSection$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventsTournamentBracketTabComposableKt.C171812.invoke$lambda$2$lambda$1$lambda$0(function1, i3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                TabKt.m5982TabwqdebIU(z, (Function0) objRememberedValue, null, false, ComposableLambda3.rememberComposableLambda(961936660, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$TabsSection$2$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(961936660, i6, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.TabsSection.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:273)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(tabData2.getTitle(), composer3, StringResource.$stable).toString(), null, (Color) composer3.consume(ContentColor3.getLocalContentColor()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, jM21425getFg0d7_KjU, jM21427getFg30d7_KjU, null, composer2, 24576, 300);
                composer2 = composer;
                i3 = i4;
                function1 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalGradientShadow(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92509065);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92509065, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.VerticalGradientShadow (EventsTournamentBracketTabComposable.kt:288)");
            }
            Spacer2.Spacer(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), C2002Dp.m7995constructorimpl(70)), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventsTournamentBracketTabComposableKt.VerticalGradientShadow$lambda$16(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: InTabContent-osbwsH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14605InTabContentosbwsH8(final EventsTournamentBracketViewState eventsTournamentBracketViewState, final BracketNavigationInfo3 bracketNavigationInfo3, final float f, final Function1<? super Integer, Unit> function1, final Function1<? super UUID, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Integer, Unit> function13;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1973081273);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventsTournamentBracketViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bracketNavigationInfo3) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function13 = function1;
        } else {
            function13 = function1;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1973081273, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent (EventsTournamentBracketTabComposable.kt:310)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                TabsSection(eventsTournamentBracketViewState.getSelectedTabIndex(), eventsTournamentBracketViewState.getTabs(), function13, null, composerStartRestartGroup, (StringResource.$stable << 3) | ((i3 >> 3) & 896), 8);
                CollapsingHeaderNestedScrollLayout.CollapsingHeaderNestedScrollLayout(ComposableLambda3.rememberComposableLambda(692191263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(692191263, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:320)");
                        }
                        float f2 = 0;
                        InfoBannerComponent.InfoBannerComponent(eventsTournamentBracketViewState.getIndividualAccountNumber(), IacInfoBannerLocation.INFO_BANNER_EVENT_CONTRACT_BRACKET_TOP_LEVEL, null, eventsTournamentBracketViewState.getBracketId(), null, null, null, null, null, null, null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2)), null, composer2, 48, 48, 6132);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-411031097, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope CollapsingHeaderNestedScrollLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(CollapsingHeaderNestedScrollLayout, "$this$CollapsingHeaderNestedScrollLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-411031097, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:328)");
                        }
                        ProvidedValue<LiveStatusIconAnimation> providedValueProvides = LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composer2, 0));
                        final BracketNavigationInfo3 bracketNavigationInfo32 = bracketNavigationInfo3;
                        final EventsTournamentBracketViewState eventsTournamentBracketViewState2 = eventsTournamentBracketViewState;
                        final float f2 = f;
                        final Function1<UUID, Unit> function14 = function12;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(2064891527, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2064891527, i6, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:331)");
                                }
                                EventTournamentBracketTabContent3.m14600EventTournamentBracketTabContentTN_CM5M(bracketNavigationInfo32, eventsTournamentBracketViewState2, f2, function14, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 24576, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, composerStartRestartGroup, 54, 12);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventsTournamentBracketTabComposableKt.InTabContent_osbwsH8$lambda$18(eventsTournamentBracketViewState, bracketNavigationInfo3, f, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                TabsSection(eventsTournamentBracketViewState.getSelectedTabIndex(), eventsTournamentBracketViewState.getTabs(), function13, null, composerStartRestartGroup, (StringResource.$stable << 3) | ((i3 >> 3) & 896), 8);
                CollapsingHeaderNestedScrollLayout.CollapsingHeaderNestedScrollLayout(ComposableLambda3.rememberComposableLambda(692191263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(692191263, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:320)");
                        }
                        float f2 = 0;
                        InfoBannerComponent.InfoBannerComponent(eventsTournamentBracketViewState.getIndividualAccountNumber(), IacInfoBannerLocation.INFO_BANNER_EVENT_CONTRACT_BRACKET_TOP_LEVEL, null, eventsTournamentBracketViewState.getBracketId(), null, null, null, null, null, null, null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2)), null, composer2, 48, 48, 6132);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-411031097, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope CollapsingHeaderNestedScrollLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(CollapsingHeaderNestedScrollLayout, "$this$CollapsingHeaderNestedScrollLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-411031097, i5, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:328)");
                        }
                        ProvidedValue<LiveStatusIconAnimation> providedValueProvides = LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composer2, 0));
                        final BracketNavigationInfo3 bracketNavigationInfo32 = bracketNavigationInfo3;
                        final EventsTournamentBracketViewState eventsTournamentBracketViewState2 = eventsTournamentBracketViewState;
                        final float f2 = f;
                        final Function1<? super UUID, Unit> function14 = function12;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(2064891527, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$InTabContent$1$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2064891527, i6, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.InTabContent.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketTabComposable.kt:331)");
                                }
                                EventTournamentBracketTabContent3.m14600EventTournamentBracketTabContentTN_CM5M(bracketNavigationInfo32, eventsTournamentBracketViewState2, f2, function14, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 24576, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, composerStartRestartGroup, 54, 12);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewAppBar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-135612536);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135612536, i, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.PreviewAppBar (EventsTournamentBracketTabComposable.kt:346)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$EventsTournamentBracketTabComposableKt.INSTANCE.getLambda$905688784$feature_event_brackets_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketTabComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventsTournamentBracketTabComposableKt.PreviewAppBar$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
