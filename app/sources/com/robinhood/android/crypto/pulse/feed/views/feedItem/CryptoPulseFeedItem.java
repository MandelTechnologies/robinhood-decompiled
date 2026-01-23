package com.robinhood.android.crypto.pulse.feed.views.feedItem;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
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
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.crypto.pulse.C12924R;
import com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: CryptoPulseFeedItem.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001a\u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0019\"\u0016\u0010\u001c\u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0019\"\u0016\u0010\u001e\u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0019\"\u0016\u0010 \u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0019\"\u000e\u0010\"\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, m3636d2 = {"CryptoPulseFeedItem", "", "state", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;", "onExpandTradeButton", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onCollapseTradeButton", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemDuxo;", "(Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemDuxo;Landroidx/compose/runtime/Composer;II)V", "Header", "viewState", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemViewState;", "currencyPairId", "Ljava/util/UUID;", "headerState", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;", "(Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemViewState;Ljava/util/UUID;Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemState$HeaderState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_PULSE_FEED_POSITION_DETAILS_HEADER_TEST_TAG", "", "getCRYPTO_PULSE_FEED_POSITION_DETAILS_HEADER_TEST_TAG$annotations", "()V", "CRYPTO_PULSE_FEED_CONDENSED_HEADER_TEST_TAG", "getCRYPTO_PULSE_FEED_CONDENSED_HEADER_TEST_TAG$annotations", "CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_TRADE_BUTTON_TEST_TAG", "getCRYPTO_PULSE_FEED_ITEM_EXPANDABLE_TRADE_BUTTON_TEST_TAG$annotations", "CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_LEARN_MORE_TEST_TAG", "getCRYPTO_PULSE_FEED_ITEM_EXPANDABLE_LEARN_MORE_TEST_TAG$annotations", "CRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG", "getCRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG$annotations", "CRYPTO_PULSE_FEED_ITEM_DIGEST_PREVIEW_MAX_LINES", "", "feature-crypto-pulse_externalDebug", "expandableButtonCoordinates"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseFeedItem {
    public static final String CRYPTO_PULSE_FEED_CONDENSED_HEADER_TEST_TAG = "crypto_pulse_feed_condensed_header_test_tag";
    public static final String CRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG = "crypto_pulse_feed_digest_preview_test_tag";
    private static final int CRYPTO_PULSE_FEED_ITEM_DIGEST_PREVIEW_MAX_LINES = 4;
    public static final String CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_LEARN_MORE_TEST_TAG = "crypto_pulse_feed_item_expandable_learn_more_test_tag";
    public static final String CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_TRADE_BUTTON_TEST_TAG = "crypto_pulse_feed_item_expandable_trade_button_test_tag";
    public static final String CRYPTO_PULSE_FEED_POSITION_DETAILS_HEADER_TEST_TAG = "crypto_pulse_feed_position_details_header_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$33(CryptoPulseFeedItemState cryptoPulseFeedItemState, Function2 function2, Function0 function0, Modifier modifier, CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPulseFeedItem(cryptoPulseFeedItemState, function2, function0, modifier, cryptoPulseFeedItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$45(CryptoPulseFeedItemViewState cryptoPulseFeedItemViewState, UUID uuid, CryptoPulseFeedItemState.HeaderState headerState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Header(cryptoPulseFeedItemViewState, uuid, headerState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_PULSE_FEED_CONDENSED_HEADER_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG$annotations() {
    }

    /* renamed from: getCRYPTO_PULSE_FEED_ITEM_EXPANDABLE_LEARN_MORE_TEST_TAG$annotations */
    public static /* synthetic */ void m1894x295df50a() {
    }

    /* renamed from: getCRYPTO_PULSE_FEED_ITEM_EXPANDABLE_TRADE_BUTTON_TEST_TAG$annotations */
    public static /* synthetic */ void m1895xedf6c3ad() {
    }

    /* renamed from: getCRYPTO_PULSE_FEED_POSITION_DETAILS_HEADER_TEST_TAG$annotations */
    public static /* synthetic */ void m1896x86d81a1f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$7$lambda$6$lambda$5(long j, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), drawBehind.mo5016toPx0680j_4(f), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPulseFeedItem(final CryptoPulseFeedItemState state, final Function2<? super LayoutCoordinates, ? super CryptoPulseFeedItemState, Unit> onExpandTradeButton, final Function0<Unit> onCollapseTradeButton, Modifier modifier, CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo3;
        int i6;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        Modifier modifierM5146paddingqDBjuR0$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        CryptoPulseFeedItemState.HeaderState headerState;
        float fM21590getDefaultD9Ej5fM;
        final AssetDigestFragmentKey assetDigestFragmentKey;
        float fM21592getMediumD9Ej5fM;
        int i7;
        final CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onExpandTradeButton, "onExpandTradeButton");
        Intrinsics.checkNotNullParameter(onCollapseTradeButton, "onCollapseTradeButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1569856065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExpandTradeButton) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCollapseTradeButton) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoPulseFeedItemDuxo2 = cryptoPulseFeedItemDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(cryptoPulseFeedItemDuxo2) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    cryptoPulseFeedItemDuxo2 = cryptoPulseFeedItemDuxo;
                }
                i3 |= i9;
            } else {
                cryptoPulseFeedItemDuxo2 = cryptoPulseFeedItemDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        String string2 = state.getCurrencyPairId().toString();
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        int i10 = i3;
                        i5 = 0;
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoPulseFeedItemDuxo.class), current, string2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$CryptoPulseFeedItem$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$CryptoPulseFeedItem$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoPulseFeedItemDuxo3 = (CryptoPulseFeedItemDuxo) baseDuxo;
                        i6 = i10 & (-57345);
                    } else {
                        int i11 = i3;
                        i4 = -1633490746;
                        i5 = 0;
                        cryptoPulseFeedItemDuxo3 = cryptoPulseFeedItemDuxo2;
                        i6 = i11;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    cryptoPulseFeedItemDuxo3 = cryptoPulseFeedItemDuxo2;
                    i4 = -1633490746;
                    i6 = i3;
                    i5 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1569856065, i6, -1, "com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItem (CryptoPulseFeedItem.kt:75)");
                }
                UUID currencyPairId = state.getCurrencyPairId();
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoPulseFeedItemDuxo3) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoPulseFeedItem2(cryptoPulseFeedItemDuxo3, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i5);
                CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo5 = cryptoPulseFeedItemDuxo3;
                int i12 = i6;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseFeedItemDuxo5.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(3);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                final long jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21373getBg30d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1098118470);
                composerStartRestartGroup.startReplaceGroup(-1098132653);
                if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                    modifierM5146paddingqDBjuR0$default = modifier3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$7$lambda$6$lambda$5(jM21373getBg30d7_KjU, fM7995constructorimpl, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM5146paddingqDBjuR0$default = DrawModifierKt.drawBehind(modifier3, (Function1) objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, C2002Dp.m7995constructorimpl(fM7995constructorimpl + bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM()), C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 12, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier5 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Header(CryptoPulseFeedItem$lambda$1(snapshotState4CollectAsStateWithLifecycle), state.getCurrencyPairId(), state.getHeaderState(), null, composerStartRestartGroup, 0, 8);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                headerState = state.getHeaderState();
                if (!(headerState instanceof CryptoPulseFeedItemState.HeaderState.CondensedData)) {
                    composerStartRestartGroup.startReplaceGroup(-1367587493);
                    fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21595getXsmallD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(headerState instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData)) {
                        composerStartRestartGroup.startReplaceGroup(-1367590545);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1367584708);
                    fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, fM21590getDefaultD9Ej5fM), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1367577607);
                Modifier modifierTestTag = TestTag3.testTag(companion4, CRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG);
                assetDigestFragmentKey = state.getAssetDigestFragmentKey();
                if (assetDigestFragmentKey == null) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(assetDigestFragmentKey);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$32$lambda$12$lambda$11$lambda$10(navigator, context, assetDigestFragmentKey);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                    if (modifierM4891clickableO2vRcR0$default == null) {
                        modifierM4891clickableO2vRcR0$default = modifierTestTag;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(state.getPreviewText(), modifierM4891clickableO2vRcR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i13).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i13).getTextM(), composer2, 817889280, 0, 7544);
                    CryptoPulseFeedItemState.HeaderState headerState2 = state.getHeaderState();
                    composer2.startReplaceGroup(-1367545894);
                    if (headerState2 instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                        fM21592getMediumD9Ej5fM = C2002Dp.m7995constructorimpl(20);
                    } else {
                        if (!(headerState2 instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer2, i13).m21592getMediumD9Ej5fM();
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, fM21592getMediumD9Ej5fM), composer2, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion4);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierTestTag2 = TestTag3.testTag(companion4, CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_TRADE_BUTTON_TEST_TAG);
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData) {
                        modifierTestTag2 = Row5.weight$default(row6, modifierTestTag2, 1.0f, false, 2, null);
                    }
                    Modifier modifierM5174width3ABfNKs = modifierTestTag2;
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                        modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM5174width3ABfNKs, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                    }
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$32$lambda$31$lambda$16$lambda$15(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5174width3ABfNKs, (Function1) objRememberedValue7);
                    ExpandableButtonTrayState<Unit> expandableButtonTrayState = state.getExpandableButtonTrayState();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$32$lambda$31$lambda$19$lambda$18(navigator, context, (ExpandableButtonTrayState.ActionButton) obj, (GenericAction) obj2));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    Function2 function2 = (Function2) objRememberedValue8;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$32$lambda$31$lambda$21$lambda$20((ExpandableButtonTrayState.ActionButton) obj, (Unit) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    Function2 function22 = (Function2) objRememberedValue9;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance5 = ((i12 & 112) == 32) | composer2.changedInstance(state);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$32$lambda$31$lambda$24$lambda$23(snapshotState, onExpandTradeButton, state);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceGroup();
                    CryptoExpandableButtonTrayComposable.CryptoExpandableButtonTrayComposable(expandableButtonTrayState, false, function2, function22, (Function0) objRememberedValue10, onCollapseTradeButton, modifierOnGloballyPositioned, null, true, true, null, composer2, 905972784 | ExpandableButtonTrayState.$stable | ((i12 << 9) & 458752), 0, 1152);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.startReplaceGroup(-1760764694);
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                        i7 = 0;
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    } else {
                        i7 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1760747499);
                    Modifier modifierTestTag3 = TestTag3.testTag(companion4, CRYPTO_PULSE_FEED_ITEM_EXPANDABLE_LEARN_MORE_TEST_TAG);
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData) {
                        modifierTestTag3 = Row5.weight$default(row6, modifierTestTag3, 1.0f, false, 2, null);
                    }
                    Modifier modifierM5174width3ABfNKs2 = modifierTestTag3;
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                        modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(modifierM5174width3ABfNKs2, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                    }
                    Modifier modifier6 = modifierM5174width3ABfNKs2;
                    final AssetDigestFragmentKey assetDigestFragmentKey2 = state.getAssetDigestFragmentKey();
                    if (assetDigestFragmentKey2 != null) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue11;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(assetDigestFragmentKey2);
                        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue12 == companion.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoPulseFeedItem.m1893xd1d1230d(navigator, context, assetDigestFragmentKey2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier6, interactionSource32, null, false, null, null, (Function0) objRememberedValue12, 28, null);
                        Modifier modifier7 = modifierM4891clickableO2vRcR0$default2 == null ? modifier6 : modifierM4891clickableO2vRcR0$default2;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(StringResources_androidKt.stringResource(C12924R.string.crypto_pulse_feed_item_learn_more, composerStartRestartGroup, i7), new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_RIGHT_16), null, bentoTheme.getColors(composerStartRestartGroup, i13).m21425getFg0d7_KjU(), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, false, C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i13).m21595getXsmallD9Ej5fM()), null, false, 229040, null), modifier7, null, null, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 12);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoPulseFeedItemDuxo4 = cryptoPulseFeedItemDuxo5;
                        modifier4 = modifier5;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoPulseFeedItemDuxo4 = cryptoPulseFeedItemDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPulseFeedItem.CryptoPulseFeedItem$lambda$33(state, onExpandTradeButton, onCollapseTradeButton, modifier4, cryptoPulseFeedItemDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                UUID currencyPairId2 = state.getCurrencyPairId();
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoPulseFeedItemDuxo3) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new CryptoPulseFeedItem2(cryptoPulseFeedItemDuxo3, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(currencyPairId2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i5);
                    CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo52 = cryptoPulseFeedItemDuxo3;
                    int i122 = i6;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseFeedItemDuxo52.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    final float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(3);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i132 = BentoTheme.$stable;
                    final long jM21373getBg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21373getBg30d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1098118470);
                    composerStartRestartGroup.startReplaceGroup(-1098132653);
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (state.getHeaderState() instanceof CryptoPulseFeedItemState.HeaderState.CondensedData) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Modifier modifier52 = modifier3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Header(CryptoPulseFeedItem$lambda$1(snapshotState4CollectAsStateWithLifecycle2), state.getCurrencyPairId(), state.getHeaderState(), null, composerStartRestartGroup, 0, 8);
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        headerState = state.getHeaderState();
                        if (!(headerState instanceof CryptoPulseFeedItemState.HeaderState.CondensedData)) {
                        }
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, fM21590getDefaultD9Ej5fM), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1367577607);
                        Modifier modifierTestTag4 = TestTag3.testTag(companion42, CRYPTO_PULSE_FEED_DIGEST_PREVIEW_TEST_TAG);
                        assetDigestFragmentKey = state.getAssetDigestFragmentKey();
                        if (assetDigestFragmentKey == null) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoPulseFeedItemViewState CryptoPulseFeedItem$lambda$1(SnapshotState4<CryptoPulseFeedItemViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LayoutCoordinates CryptoPulseFeedItem$lambda$3(SnapshotState<LayoutCoordinates> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$32$lambda$12$lambda$11$lambda$10(Navigator navigator, Context context, AssetDigestFragmentKey assetDigestFragmentKey) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, assetDigestFragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$32$lambda$31$lambda$16$lambda$15(SnapshotState snapshotState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$32$lambda$31$lambda$21$lambda$20(ExpandableButtonTrayState.ActionButton actionButton, Unit unit) {
        Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoPulseFeedItem$lambda$32$lambda$31$lambda$19$lambda$18(Navigator navigator, Context context, ExpandableButtonTrayState.ActionButton actionButton, GenericAction action) {
        Intrinsics.checkNotNullParameter(actionButton, "<unused var>");
        Intrinsics.checkNotNullParameter(action, "action");
        DeepLinkAction deeplink = action.getDeeplink();
        if (deeplink == null) {
            return true;
        }
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink.getUrl()), null, null, false, NavigationType.PRESENT, 28, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedItem$lambda$32$lambda$31$lambda$24$lambda$23(SnapshotState snapshotState, Function2 function2, CryptoPulseFeedItemState cryptoPulseFeedItemState) {
        LayoutCoordinates layoutCoordinatesCryptoPulseFeedItem$lambda$3 = CryptoPulseFeedItem$lambda$3(snapshotState);
        if (layoutCoordinatesCryptoPulseFeedItem$lambda$3 != null) {
            function2.invoke(layoutCoordinatesCryptoPulseFeedItem$lambda$3, cryptoPulseFeedItemState);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoPulseFeedItem$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28 */
    public static final Unit m1893xd1d1230d(Navigator navigator, Context context, AssetDigestFragmentKey assetDigestFragmentKey) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, assetDigestFragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(final CryptoPulseFeedItemViewState viewState, UUID uuid, final CryptoPulseFeedItemState.HeaderState headerState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        long jM21456getPositive0d7_KjU;
        final Modifier modifier4;
        long jM21452getNegative0d7_KjU;
        long jM21452getNegative0d7_KjU2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final UUID currencyPairId = uuid;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(612501242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currencyPairId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(headerState) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(612501242, i3, -1, "com.robinhood.android.crypto.pulse.feed.views.feedItem.Header (CryptoPulseFeedItem.kt:228)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (headerState instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData) {
                    Modifier modifier6 = modifier5;
                    if (!(headerState instanceof CryptoPulseFeedItemState.HeaderState.CondensedData)) {
                        composerStartRestartGroup.startReplaceGroup(203189306);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(203327436);
                    Modifier modifierTestTag = TestTag3.testTag(modifier6, CRYPTO_PULSE_FEED_CONDENSED_HEADER_TEST_TAG);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(currencyPairId);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPulseFeedItem.Header$lambda$43$lambda$42(navigator, context, currencyPairId);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    FontWeight.Companion companion3 = FontWeight.INSTANCE;
                    CryptoPulseFeedItemState.HeaderState.CondensedData condensedData = (CryptoPulseFeedItemState.HeaderState.CondensedData) headerState;
                    modifier3 = modifier6;
                    BentoText2.m20747BentoText38GnDrw(condensedData.getAssetCurrencyCode(), null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                    BentoText2.m20747BentoText38GnDrw("  ·  ", null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 6, 0, 8186);
                    BentoText2.m20747BentoText38GnDrw(condensedData.getFormattedQuote(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    if (BigDecimals7.isNegative(condensedData.getPriceMovementRatio())) {
                        composerStartRestartGroup.startReplaceGroup(-891431001);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-891429113);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(FormatsLocalized.getSignedPercentFormat().format(condensedData.getPriceMovementRatio()), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2003903672);
                    Modifier modifier7 = modifier5;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier5, CRYPTO_PULSE_FEED_POSITION_DETAILS_HEADER_TEST_TAG), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(currencyPairId);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion4.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPulseFeedItem.Header$lambda$36$lambda$35(navigator, context, currencyPairId);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, interactionSource32, null, false, null, null, (Function0) objRememberedValue4, 28, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion5.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row62, companion7, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    CryptoPulseFeedItemState.HeaderState.PositionDetailData positionDetailData = (CryptoPulseFeedItemState.HeaderState.PositionDetailData) headerState;
                    String assetCurrencyCode = positionDetailData.getAssetCurrencyCode();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(assetCurrencyCode, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    LocalShowPlaceholder.Loadable(viewState.getUiCurrencyPair() == null, null, null, ComposableLambda3.rememberComposableLambda(-2072709284, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$Header$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            String currency$default;
                            Currency assetCurrencyForDisplay;
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2072709284, i7, -1, "com.robinhood.android.crypto.pulse.feed.views.feedItem.Header.<anonymous>.<anonymous>.<anonymous> (CryptoPulseFeedItem.kt:260)");
                            }
                            UiCurrencyPair uiCurrencyPair = viewState.getUiCurrencyPair();
                            if (uiCurrencyPair == null || (assetCurrencyForDisplay = uiCurrencyPair.getAssetCurrencyForDisplay()) == null || (currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrencyForDisplay, ((CryptoPulseFeedItemState.HeaderState.PositionDetailData) headerState).getQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null)) == null) {
                                currency$default = "-----";
                            }
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(currency$default, null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.endNode();
                    OneDayMiniChart.OneDayMiniChart(new OneDayMiniChartDetails(uuid, InstrumentType.CRYPTO), SizeKt.m5171sizeVpY3zN4(PaddingKt.m5144paddingVpY3zN4$default(companion7, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), C2002Dp.m7995constructorimpl(90), C2002Dp.m7995constructorimpl(44)), null, null, false, composerStartRestartGroup, OneDayMiniChartDetails.$stable, 28);
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion7, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getEnd(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                    currencyPairId = uuid;
                    BentoText2.m20747BentoText38GnDrw(positionDetailData.getFormattedQuote(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    Composer composer2 = composerStartRestartGroup;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), companion5.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, companion7);
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion6.getSetModifier());
                    composer2.startReplaceGroup(692163042);
                    if (!BigDecimals7.isZero(positionDetailData.getPriceMovementRatio())) {
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(BigDecimals7.isPositive(positionDetailData.getPriceMovementRatio()) ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                        if (BigDecimals7.isPositive(positionDetailData.getPriceMovementRatio())) {
                            composer2.startReplaceGroup(692183247);
                            jM21452getNegative0d7_KjU2 = bentoTheme2.getColors(composer2, i6).m21456getPositive0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(692185519);
                            jM21452getNegative0d7_KjU2 = bentoTheme2.getColors(composer2, i6).m21452getNegative0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21452getNegative0d7_KjU2, null, null, false, composer2, BentoIcon4.Size12.$stable | 48, 56);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    String str = Formats.getNoSignPercentFormat().format(positionDetailData.getPriceMovementRatio());
                    if (BigDecimals7.isZero(positionDetailData.getPriceMovementRatio())) {
                        composer2.startReplaceGroup(-16766554);
                        jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU();
                        composer2.endReplaceGroup();
                    } else if (BigDecimals7.isPositive(positionDetailData.getPriceMovementRatio())) {
                        composer2.startReplaceGroup(-16627519);
                        jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer2, i6).m21456getPositive0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-16532287);
                        jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer2, i6).m21452getNegative0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    Composer composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i6).getTextS(), composer3, 24576, 0, 8170);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPulseFeedItem.Header$lambda$45(viewState, currencyPairId, headerState, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (headerState instanceof CryptoPulseFeedItemState.HeaderState.PositionDetailData) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$36$lambda$35(Navigator navigator, Context context, UUID uuid) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(uuid, null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$43$lambda$42(Navigator navigator, Context context, UUID uuid) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(uuid, null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
