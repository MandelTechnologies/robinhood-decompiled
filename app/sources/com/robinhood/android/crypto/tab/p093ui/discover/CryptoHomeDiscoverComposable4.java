package com.robinhood.android.crypto.tab.p093ui.discover;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposable;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverComposable4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeDiscoverComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¨\u0006\u0010"}, m3636d2 = {"cryptoHomeDiscoverComposable", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "onDisplayTypeSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "onTradableToggled", "", "viewState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeDiscoverComposable4 {
    public static final void cryptoHomeDiscoverComposable(LazyListScope lazyListScope, final Context context, final Navigator navigator, final EventLogger eventLogger, final Function1<? super InstrumentDisplayType, Unit> onDisplayTypeSelected, final Function1<? super Boolean, Unit> onTradableToggled, final CryptoHomeDiscoverViewState viewState) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(onDisplayTypeSelected, "onDisplayTypeSelected");
        Intrinsics.checkNotNullParameter(onTradableToggled, "onTradableToggled");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        CryptoHomeDiscoverComposable cryptoHomeDiscoverComposable = CryptoHomeDiscoverComposable.INSTANCE;
        LazyListScope.item$default(lazyListScope, null, null, cryptoHomeDiscoverComposable.getLambda$1345278523$feature_crypto_tab_externalDebug(), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, cryptoHomeDiscoverComposable.m12999getLambda$1024995214$feature_crypto_tab_externalDebug(), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(241075571, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt.cryptoHomeDiscoverComposable.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(241075571, i, -1, "com.robinhood.android.crypto.tab.ui.discover.cryptoHomeDiscoverComposable.<anonymous> (CryptoHomeDiscoverComposable.kt:68)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(664913195, true, new AnonymousClass1(viewState, onTradableToggled, eventLogger), composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: CryptoHomeDiscoverComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ EventLogger $eventLogger;
                final /* synthetic */ Function1<Boolean, Unit> $onTradableToggled;
                final /* synthetic */ CryptoHomeDiscoverViewState $viewState;

                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, Function1<? super Boolean, Unit> function1, EventLogger eventLogger) {
                    this.$viewState = cryptoHomeDiscoverViewState;
                    this.$onTradableToggled = function1;
                    this.$eventLogger = eventLogger;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$1$lambda$0(CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, Function1 function1, EventLogger eventLogger) {
                    if (!cryptoHomeDiscoverViewState.isTradableButtonSelected()) {
                        function1.invoke(Boolean.TRUE);
                        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.TOGGLE_COIN_EXPLORE, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "tradable", null, 4, null), null, null, false, 56, null);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3$lambda$2(CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, Function1 function1, EventLogger eventLogger) {
                    if (!cryptoHomeDiscoverViewState.isNonTradableButtonSelected()) {
                        function1.invoke(Boolean.FALSE);
                        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.TOGGLE_COIN_EXPLORE, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "non_tradable", null, 4, null), null, null, false, 56, null);
                    }
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(664913195, i, -1, "com.robinhood.android.crypto.tab.ui.discover.cryptoHomeDiscoverComposable.<anonymous>.<anonymous> (CryptoHomeDiscoverComposable.kt:71)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), 0.0f, composer, 0, 1), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                    final CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState = this.$viewState;
                    final Function1<Boolean, Unit> function1 = this.$onTradableToggled;
                    final EventLogger eventLogger = this.$eventLogger;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5092spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierHorizontalScroll$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_discover_tradable, composer, 0);
                    boolean zIsTradableButtonSelected = cryptoHomeDiscoverViewState.isTradableButtonSelected();
                    boolean chipsEnabled = cryptoHomeDiscoverViewState.getChipsEnabled();
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(cryptoHomeDiscoverViewState) | composer.changed(function1) | composer.changedInstance(eventLogger);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeDiscoverComposable4.C130811.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(cryptoHomeDiscoverViewState, function1, eventLogger);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoChip.BentoSelectionChip((Function0) objRememberedValue, null, chipsEnabled, zIsTradableButtonSelected, null, strStringResource, composer, 0, 18);
                    String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_discover_non_tradable, composer, 0);
                    boolean zIsNonTradableButtonSelected = cryptoHomeDiscoverViewState.isNonTradableButtonSelected();
                    boolean chipsEnabled2 = cryptoHomeDiscoverViewState.getChipsEnabled();
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composer.changedInstance(cryptoHomeDiscoverViewState) | composer.changed(function1) | composer.changedInstance(eventLogger);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeDiscoverComposable4.C130811.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(cryptoHomeDiscoverViewState, function1, eventLogger);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    BentoChip.BentoSelectionChip((Function0) objRememberedValue2, null, chipsEnabled2, zIsNonTradableButtonSelected, null, strStringResource2, composer, 0, 18);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), 3, null);
        if (viewState.isLoading()) {
            InstrumentListItemComposable.loadingLazyInstruments(lazyListScope, TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "TEST_TAG_DISCOVER_ITEM_LOADING"), 4);
        } else {
            InstrumentListItemComposable.lazyInstruments(lazyListScope, viewState.getActiveInstrumentDisplayType(), viewState.getInstruments(), new Function3() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CryptoHomeDiscoverComposable4.cryptoHomeDiscoverComposable$lambda$1(navigator, context, eventLogger, (InstrumentListItem) obj, (List) obj2, (GenericAction) obj3);
                }
            }, new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoHomeDiscoverComposable4.cryptoHomeDiscoverComposable$lambda$2(context, viewState, onDisplayTypeSelected);
                }
            }, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), null, null, new Component(Component.ComponentType.CARD, null, null, 6, null), null, 45, null), TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "TEST_TAG_DISCOVER_ITEM_LOADED"));
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1971794721, true, new C130824(viewState, navigator, context, eventLogger)), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeDiscoverComposable$lambda$1(Navigator navigator, Context context, EventLogger eventLogger, InstrumentListItem instrument, List allInstrumentIds, GenericAction genericAction) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(allInstrumentIds, "allInstrumentIds");
        Intrinsics.checkNotNullParameter(genericAction, "<unused var>");
        UUID uuidFromString = UUID.fromString(instrument.getInstrument_id());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        List list = allInstrumentIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UUID.fromString((String) it.next()));
        }
        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(uuidFromString, arrayList, false, null, null, null, 60, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), new Component(Component.ComponentType.EXPLORE_ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(instrument.getInstrument_id(), Asset.AssetType.CURRENCY_PAIR, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeDiscoverComposable$lambda$2(Context context, CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, final Function1 function1) {
        FragmentManager supportFragmentManager;
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext == null || (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) == null) {
            return Unit.INSTANCE;
        }
        List<Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        supportFragmentManager.setFragmentResultListener(InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, (LifecycleOwner) CollectionsKt.last((List) fragments), new FragmentResultListener() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$3$1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                Object serializable;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                if (Build.VERSION.SDK_INT >= 34) {
                    serializable = bundle.getSerializable(InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, InstrumentDisplayType.class);
                } else {
                    Object serializable2 = bundle.getSerializable(InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY);
                    if (!(serializable2 instanceof InstrumentDisplayType)) {
                        serializable2 = null;
                    }
                    serializable = (InstrumentDisplayType) serializable2;
                }
                InstrumentDisplayType instrumentDisplayType = (InstrumentDisplayType) serializable;
                if (instrumentDisplayType != null) {
                    function1.invoke(instrumentDisplayType);
                }
            }
        });
        ((InstrumentDisplayTypeBottomSheetFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(InstrumentDisplayTypeBottomSheetFragment.INSTANCE, new InstrumentDisplayTypeBottomSheetFragment.Args(cryptoHomeDiscoverViewState.getActiveInstrumentDisplayType()), 0, 2, null)).show(supportFragmentManager, (String) null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHomeDiscoverComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$4 */
    static final class C130824 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ CryptoHomeDiscoverViewState $viewState;

        C130824(CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, Navigator navigator, Context context, EventLogger eventLogger) {
            this.$viewState = cryptoHomeDiscoverViewState;
            this.$navigator = navigator;
            this.$context = context;
            this.$eventLogger = eventLogger;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1971794721, i, -1, "com.robinhood.android.crypto.tab.ui.discover.cryptoHomeDiscoverComposable.<anonymous> (CryptoHomeDiscoverComposable.kt:178)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0);
            boolean showAllEnabled = this.$viewState.getShowAllEnabled();
            String strStringResource = StringResources_androidKt.stringResource(C13013R.string.explore_cta_show_all, composer, 0);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$viewState) | composer.changedInstance(this.$eventLogger);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState = this.$viewState;
            final EventLogger eventLogger = this.$eventLogger;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverComposableKt$cryptoHomeDiscoverComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeDiscoverComposable4.C130824.invoke$lambda$1$lambda$0(navigator, context, cryptoHomeDiscoverViewState, eventLogger);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, showAllEnabled, null, composer, 0, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, EventLogger eventLogger) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, cryptoHomeDiscoverViewState.getListKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_CRYPTO_LIST_PAGE, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
            return Unit.INSTANCE;
        }
    }
}
