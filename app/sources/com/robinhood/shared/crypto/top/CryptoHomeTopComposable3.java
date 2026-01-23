package com.robinhood.shared.crypto.top;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
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

/* compiled from: CryptoHomeTopComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"cryptoHomeTopComposable", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "onDisplayTypeSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "viewState", "Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "lib-top-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoHomeTopComposable3 {
    public static final void cryptoHomeTopComposable(LazyListScope lazyListScope, final Context context, final Navigator navigator, final EventLogger eventLogger, final Function1<? super InstrumentDisplayType, Unit> onDisplayTypeSelected, final CryptoHomeTopViewState viewState) {
        LazyListScope lazyListScope2;
        final TextButton<GenericAction> cta;
        final String title;
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(onDisplayTypeSelected, "onDisplayTypeSelected");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        LazyListScope.item$default(lazyListScope, null, null, CryptoHomeTopComposable.INSTANCE.m24985getLambda$553982989$lib_top_crypto_externalDebug(), 3, null);
        CryptoTopCrypto topCrypto = viewState.getTopCrypto();
        if (topCrypto == null || (title = topCrypto.getTitle()) == null) {
            lazyListScope2 = lazyListScope;
        } else {
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(-1649824045, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$cryptoHomeTopComposable$1$1
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
                        ComposerKt.traceEventStart(-1649824045, i, -1, "com.robinhood.shared.crypto.top.cryptoHomeTopComposable.<anonymous>.<anonymous> (CryptoHomeTopComposable.kt:49)");
                    }
                    CryptoTopTitleComposable.CryptoTopTitleComposable(title, null, composer, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            lazyListScope2 = lazyListScope;
            LazyListScope.item$default(lazyListScope2, null, null, composableLambdaComposableLambdaInstance, 3, null);
        }
        if (viewState.isLoading()) {
            InstrumentListItemComposable.loadingLazyInstruments(lazyListScope2, TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), CryptoHomeTopComposable7.TEST_TAG_TOP_ITEM_LOADING), 4);
        } else {
            CryptoTopCrypto topCrypto2 = viewState.getTopCrypto();
            if (topCrypto2 == null) {
                return;
            } else {
                InstrumentListItemComposable.lazyInstruments(lazyListScope2, topCrypto2.getDisplayType(), topCrypto2.getResults(), new Function3() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CryptoHomeTopComposable3.cryptoHomeTopComposable$lambda$2(navigator, context, eventLogger, (InstrumentListItem) obj, (List) obj2, (GenericAction) obj3);
                    }
                }, new Function0() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeTopComposable3.cryptoHomeTopComposable$lambda$3(context, viewState, onDisplayTypeSelected);
                    }
                }, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), null, null, new Component(Component.ComponentType.EXPLORE_ROW, null, null, 6, null), null, 45, null), TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), CryptoHomeTopComposable7.TEST_TAG_TOP_ITEM_LOADED));
            }
        }
        CryptoTopCrypto topCrypto3 = viewState.getTopCrypto();
        if (topCrypto3 == null || (cta = topCrypto3.getCta()) == null) {
            return;
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-561324936, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$cryptoHomeTopComposable$4$1
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
                    ComposerKt.traceEventStart(-561324936, i, -1, "com.robinhood.shared.crypto.top.cryptoHomeTopComposable.<anonymous>.<anonymous> (CryptoHomeTopComposable.kt:118)");
                }
                Boolean bool = Boolean.TRUE;
                final TextButton<GenericAction> textButton = cta;
                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1870966336, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$cryptoHomeTopComposable$4$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1870966336, i2, -1, "com.robinhood.shared.crypto.top.cryptoHomeTopComposable.<anonymous>.<anonymous>.<anonymous> (CryptoHomeTopComposable.kt:121)");
                        }
                        SduiTextButton2.SduiTextButton(textButton, ModifiersKt.autoLogEvents$default(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), null, true, false, false, true, false, null, 109, null), composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeTopComposable$lambda$2(Navigator navigator, Context context, EventLogger eventLogger, InstrumentListItem instrument, List allInstrumentIds, GenericAction genericAction) {
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
        Screen screen = new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.EXPLORE_ROW;
        String logging_identifier = instrument.getLogging_identifier();
        if (logging_identifier == null) {
            logging_identifier = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE, screen, new Component(componentType, logging_identifier, null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(instrument.getInstrument_id(), Asset.AssetType.CURRENCY_PAIR, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeTopComposable$lambda$3(Context context, CryptoHomeTopViewState cryptoHomeTopViewState, final Function1 function1) {
        FragmentManager supportFragmentManager;
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext == null || (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) == null) {
            return Unit.INSTANCE;
        }
        List<Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        supportFragmentManager.setFragmentResultListener(InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, (LifecycleOwner) CollectionsKt.last((List) fragments), new FragmentResultListener() { // from class: com.robinhood.shared.crypto.top.CryptoHomeTopComposableKt$cryptoHomeTopComposable$3$1
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
        ((InstrumentDisplayTypeBottomSheetFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(InstrumentDisplayTypeBottomSheetFragment.INSTANCE, new InstrumentDisplayTypeBottomSheetFragment.Args(cryptoHomeTopViewState.getActiveInstrumentDisplayType()), 0, 2, null)).show(supportFragmentManager, (String) null);
        return Unit.INSTANCE;
    }
}
