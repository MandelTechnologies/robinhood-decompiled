package com.robinhood.shared.discover.section;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MovableContent2;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon7;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable2;
import com.robinhood.shared.crypto.movers.CryptoCardsComposable;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import com.robinhood.shared.discover.C38721R;
import com.robinhood.shared.discover.section.DiscoverRow;
import com.robinhood.shared.discover.section.DiscoverSectionDuxo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoverSectionComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u001am\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u001aI\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aK\u0010)\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b'\u0010(\u001a+\u0010*\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b*\u0010+\u001a7\u0010-\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b-\u0010.¨\u00060²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;", "type", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", RhGcmListenerService.EXTRA_CATEGORY, "", "showHeader", "", "previewCount", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "tabForCdpDeepLink", "Lkotlin/Function0;", "", "onViewAllClick", "Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;", "duxo", "DiscoverSectionComposable", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;ZLjava/lang/Integer;Lcom/robinhood/android/navigation/keys/FragmentTab;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;", "viewState", "ChipsSection", "(Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;Landroidx/compose/runtime/Composer;I)V", "CardsSection", "", "categoryIdentifier", "ListRowSection", "(Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;ZLjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ListRowBody", "(Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isLoading", "title", "description", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Landroidx/compose/ui/unit/Dp;", "paddingUnderTitle", "content", "SectionWithHeaderDisclosure-WH-ejsw", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SectionWithHeaderDisclosure", "Header", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onGotIt", "DiscoverSectionBottomSheet", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "openBottomSheet", "lib-discover_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discover.section.DiscoverSectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DiscoverSectionComposable {

    /* compiled from: DiscoverSectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTradingOptions3.values().length];
            try {
                iArr[ApiCryptoTradingOptions3.ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTradingOptions3.COMPACT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTradingOptions3.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCryptoTradingOptions3.CHIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCryptoTradingOptions3.LIST_ROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardsSection$lambda$7(DiscoverSectionViewState discoverSectionViewState, int i, Composer composer, int i2) {
        CardsSection(discoverSectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipsSection$lambda$6(DiscoverSectionViewState discoverSectionViewState, int i, Composer composer, int i2) {
        ChipsSection(discoverSectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverSectionBottomSheet$lambda$34(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiscoverSectionBottomSheet(str, str2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverSectionComposable$lambda$5(CryptoExploreState3 cryptoExploreState3, CryptoExploreState4 cryptoExploreState4, Modifier modifier, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, boolean z, Integer num, FragmentTab fragmentTab, Function0 function0, DiscoverSectionDuxo discoverSectionDuxo, int i, int i2, Composer composer, int i3) {
        DiscoverSectionComposable(cryptoExploreState3, cryptoExploreState4, modifier, cryptoTradingOptionsCategory, z, num, fragmentTab, function0, discoverSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$30(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Header(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListRowBody$lambda$19(DiscoverSectionViewState discoverSectionViewState, Integer num, String str, Function0 function0, int i, int i2, Composer composer, int i3) {
        ListRowBody(discoverSectionViewState, num, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListRowSection$lambda$10(DiscoverSectionViewState discoverSectionViewState, boolean z, Integer num, String str, Function0 function0, int i, int i2, Composer composer, int i3) {
        ListRowSection(discoverSectionViewState, z, num, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionWithHeaderDisclosure_WH_ejsw$lambda$20(boolean z, String str, String str2, String str3, float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        m25304SectionWithHeaderDisclosureWHejsw(z, str, str2, str3, f, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverSectionBottomSheet$lambda$33$lambda$32$lambda$31(Navigator navigator, Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri uri = Uri.parse(it);
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, Boolean.FALSE, null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiscoverSectionComposable(final CryptoExploreState3 assetType, final CryptoExploreState4 type2, Modifier modifier, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, boolean z, Integer num, FragmentTab fragmentTab, Function0<Unit> function0, DiscoverSectionDuxo discoverSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTradingOptionsCategory cryptoTradingOptionsCategory2;
        int i4;
        boolean z2;
        int i5;
        Integer num2;
        int i6;
        int i7;
        DiscoverSectionDuxo discoverSectionDuxo2;
        FragmentTab fragmentTab2;
        Function0<Unit> function02;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer3;
        int i8;
        final Modifier modifier3;
        final FragmentTab fragmentTab3;
        final Function0<Unit> function03;
        final CryptoTradingOptionsCategory cryptoTradingOptionsCategory3;
        final DiscoverSectionDuxo discoverSectionDuxo3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(type2, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733338092);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoTradingOptionsCategory2 = cryptoTradingOptionsCategory;
                    int i10 = composerStartRestartGroup.changedInstance(cryptoTradingOptionsCategory2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    cryptoTradingOptionsCategory2 = cryptoTradingOptionsCategory;
                }
                i3 |= i10;
            } else {
                cryptoTradingOptionsCategory2 = cryptoTradingOptionsCategory;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        num2 = num;
                        i3 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(fragmentTab == null ? -1 : fragmentTab.ordinal()) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) != 0) {
                        if ((i2 & 256) == 0) {
                            discoverSectionDuxo2 = discoverSectionDuxo;
                            int i11 = composerStartRestartGroup.changedInstance(discoverSectionDuxo2) ? 67108864 : 33554432;
                            i3 |= i11;
                        } else {
                            discoverSectionDuxo2 = discoverSectionDuxo;
                        }
                        i3 |= i11;
                    } else {
                        discoverSectionDuxo2 = discoverSectionDuxo;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                cryptoTradingOptionsCategory2 = CryptoTradingOptionsCategory.INSTANCE.getDEFAULT();
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                num2 = null;
                            }
                            fragmentTab2 = i6 == 0 ? FragmentTab.SEARCH : fragmentTab;
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function02 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function02 = function0;
                            }
                            if ((i2 & 256) == 0) {
                                DiscoverSectionDuxo.InitArgs initArgs = new DiscoverSectionDuxo.InitArgs(assetType, type2, cryptoTradingOptionsCategory2, fragmentTab2, num2);
                                String str = type2.getServerValue() + "_" + assetType.getServerValue() + "_" + cryptoTradingOptionsCategory2.getServerName();
                                composerStartRestartGroup.startReplaceGroup(2050738472);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                                creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DiscoverSectionDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$DiscoverSectionComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$DiscoverSectionComposable$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                                composer2.endReplaceGroup();
                                i3 &= -234881025;
                                discoverSectionDuxo2 = (DiscoverSectionDuxo) baseDuxo;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1733338092, i3, -1, "com.robinhood.shared.discover.section.DiscoverSectionComposable (DiscoverSectionComposable.kt:78)");
                            }
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier2);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            FragmentTab fragmentTab4 = fragmentTab2;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Composer composer4 = composer2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(discoverSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                            composer3 = composer4;
                            i8 = WhenMappings.$EnumSwitchMapping$0[DiscoverSectionComposable$lambda$4$lambda$2(snapshotState4CollectAsStateWithLifecycle).getStyle().ordinal()];
                            if (i8 != 1 || i8 == 2) {
                                composer3.startReplaceGroup(786411173);
                                composer3.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                            } else if (i8 == 3) {
                                composer3.startReplaceGroup(-1360102715);
                                CardsSection(DiscoverSectionComposable$lambda$4$lambda$2(snapshotState4CollectAsStateWithLifecycle), composer3, CryptoChipsComposable.$stable | InstrumentPreviewCard4.$stable);
                                composer3.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                            } else if (i8 == 4) {
                                composer3.startReplaceGroup(-1360099963);
                                ChipsSection(DiscoverSectionComposable$lambda$4$lambda$2(snapshotState4CollectAsStateWithLifecycle), composer3, CryptoChipsComposable.$stable | InstrumentPreviewCard4.$stable);
                                composer3.endReplaceGroup();
                                Unit unit3 = Unit.INSTANCE;
                            } else {
                                if (i8 != 5) {
                                    composer3.startReplaceGroup(-1360108833);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-1360096722);
                                DiscoverSectionViewState discoverSectionViewStateDiscoverSectionComposable$lambda$4$lambda$2 = DiscoverSectionComposable$lambda$4$lambda$2(snapshotState4CollectAsStateWithLifecycle);
                                CryptoTradingOptionsCategory cryptoTradingOptionsCategory4 = !Intrinsics.areEqual(cryptoTradingOptionsCategory2, CryptoTradingOptionsCategory.INSTANCE.getDEFAULT()) ? cryptoTradingOptionsCategory2 : null;
                                int i12 = i3 >> 9;
                                ListRowSection(discoverSectionViewStateDiscoverSectionComposable$lambda$4$lambda$2, z2, num2, cryptoTradingOptionsCategory4 != null ? cryptoTradingOptionsCategory4.getServerName() : null, function02, composer3, CryptoChipsComposable.$stable | InstrumentPreviewCard4.$stable | (i12 & 112) | (i12 & 896) | (i12 & 57344), 0);
                                composer3.endReplaceGroup();
                                Unit unit4 = Unit.INSTANCE;
                            }
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            fragmentTab3 = fragmentTab4;
                            function03 = function02;
                            cryptoTradingOptionsCategory3 = cryptoTradingOptionsCategory2;
                            discoverSectionDuxo3 = discoverSectionDuxo2;
                            z3 = z2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            fragmentTab2 = fragmentTab;
                            function02 = function0;
                        }
                        composer2 = composerStartRestartGroup;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        FragmentTab fragmentTab42 = fragmentTab2;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Composer composer42 = composer2;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(discoverSectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                            composer3 = composer42;
                            i8 = WhenMappings.$EnumSwitchMapping$0[DiscoverSectionComposable$lambda$4$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getStyle().ordinal()];
                            if (i8 != 1) {
                                composer3.startReplaceGroup(786411173);
                                composer3.endReplaceGroup();
                                Unit unit5 = Unit.INSTANCE;
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier2;
                                fragmentTab3 = fragmentTab42;
                                function03 = function02;
                                cryptoTradingOptionsCategory3 = cryptoTradingOptionsCategory2;
                                discoverSectionDuxo3 = discoverSectionDuxo2;
                                z3 = z2;
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        fragmentTab3 = fragmentTab;
                        composer3 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function03 = function0;
                        cryptoTradingOptionsCategory3 = cryptoTradingOptionsCategory2;
                        z3 = z2;
                        discoverSectionDuxo3 = discoverSectionDuxo2;
                    }
                    final Integer num3 = num2;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DiscoverSectionComposable.DiscoverSectionComposable$lambda$5(assetType, type2, modifier3, cryptoTradingOptionsCategory3, z3, num3, fragmentTab3, function03, discoverSectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                num2 = num;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 256) == 0) {
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifier2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        FragmentTab fragmentTab422 = fragmentTab2;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Composer composer422 = composer2;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                        }
                    }
                }
                final Integer num32 = num2;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            num2 = num;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final Integer num322 = num2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final Integer num3222 = num2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final DiscoverSectionViewState DiscoverSectionComposable$lambda$4$lambda$2(SnapshotState4<DiscoverSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean Header$lambda$23(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void ChipsSection(final DiscoverSectionViewState discoverSectionViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(520999253);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(discoverSectionViewState) : composerStartRestartGroup.changedInstance(discoverSectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(520999253, i2, -1, "com.robinhood.shared.discover.section.ChipsSection (DiscoverSectionComposable.kt:107)");
            }
            boolean zIsLoading = discoverSectionViewState.isLoading();
            String title = discoverSectionViewState.getTitle();
            if (title != null) {
                m25304SectionWithHeaderDisclosureWHejsw(zIsLoading, title, discoverSectionViewState.getDescription(), discoverSectionViewState.getDisclosure(), 0.0f, ComposableLambda3.rememberComposableLambda(293619968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.ChipsSection.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(293619968, i3, -1, "com.robinhood.shared.discover.section.ChipsSection.<anonymous> (DiscoverSectionComposable.kt:114)");
                        }
                        composer2.startReplaceGroup(-1299048044);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        if (!discoverSectionViewState.isLoading()) {
                            modifierFillMaxWidth$default = modifierFillMaxWidth$default.then(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.CHIP_GRID, "discover-chips-section", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
                        }
                        Modifier modifier = modifierFillMaxWidth$default;
                        composer2.endReplaceGroup();
                        ImmutableList<CryptoChipsComposable> chips = discoverSectionViewState.getChips();
                        if (chips == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CryptoChipsComposable2.CryptoChipsComposable(chips, modifier, null, null, composer2, CryptoChipsComposable.$stable, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverSectionComposable.ChipsSection$lambda$6(discoverSectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CardsSection(final DiscoverSectionViewState discoverSectionViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2067455769);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(discoverSectionViewState) : composerStartRestartGroup.changedInstance(discoverSectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067455769, i2, -1, "com.robinhood.shared.discover.section.CardsSection (DiscoverSectionComposable.kt:136)");
            }
            boolean zIsLoading = discoverSectionViewState.isLoading();
            String title = discoverSectionViewState.getTitle();
            if (title != null) {
                m25304SectionWithHeaderDisclosureWHejsw(zIsLoading, title, discoverSectionViewState.getDescription(), discoverSectionViewState.getDisclosure(), 0.0f, ComposableLambda3.rememberComposableLambda(1840076484, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.CardsSection.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1840076484, i3, -1, "com.robinhood.shared.discover.section.CardsSection.<anonymous> (DiscoverSectionComposable.kt:143)");
                        }
                        CryptoTradingOptionsLocation cryptoTradingOptionsLocation = CryptoTradingOptionsLocation.DAILY_MOVERS;
                        composer2.startReplaceGroup(-1213018560);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        if (!discoverSectionViewState.isLoading()) {
                            modifierFillMaxWidth$default = modifierFillMaxWidth$default.then(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, "discover-cards-section", null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
                        }
                        Modifier modifier = modifierFillMaxWidth$default;
                        composer2.endReplaceGroup();
                        ImmutableList<InstrumentPreviewCard4> cards = discoverSectionViewState.getCards();
                        if (cards == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CryptoCardsComposable.CryptoCardsComposable(cryptoTradingOptionsLocation, cards, modifier, composer2, (InstrumentPreviewCard4.$stable << 3) | 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverSectionComposable.CardsSection$lambda$7(discoverSectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ListRowSection(final DiscoverSectionViewState discoverSectionViewState, boolean z, Integer num, String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Integer num2;
        int i5;
        String str2;
        int i6;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        Function0<Unit> function04;
        final Function0<Unit> function05;
        final boolean z3;
        final String str3;
        final Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-97442472);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(discoverSectionViewState) : composerStartRestartGroup.changedInstance(discoverSectionViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    num2 = num;
                    i3 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            if (i7 != 0) {
                                z2 = true;
                            }
                            final Integer num4 = i4 == 0 ? null : num2;
                            final String str4 = i5 == 0 ? str2 : null;
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function03 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function03 = function02;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-97442472, i3, -1, "com.robinhood.shared.discover.section.ListRowSection (DiscoverSectionComposable.kt:171)");
                            }
                            final Function2<Composer, Integer, Unit> function2MovableContentOf = MovableContent2.movableContentOf(ComposableLambda3.rememberComposableLambda(94827912, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$ListRowSection$rowBody$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
                                    invoke(composer2, num5.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(94827912, i8, -1, "com.robinhood.shared.discover.section.ListRowSection.<anonymous> (DiscoverSectionComposable.kt:173)");
                                    }
                                    DiscoverSectionComposable.ListRowBody(discoverSectionViewState, num4, str4, function03, composer2, CryptoChipsComposable.$stable | InstrumentPreviewCard4.$stable, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54));
                            if (!z2) {
                                composerStartRestartGroup.startReplaceGroup(489708342);
                                Function0<Unit> function06 = function03;
                                boolean zIsLoading = discoverSectionViewState.isLoading();
                                String title = discoverSectionViewState.getTitle();
                                if (title != null) {
                                    function04 = function06;
                                    m25304SectionWithHeaderDisclosureWHejsw(zIsLoading, title, discoverSectionViewState.getDescription(), discoverSectionViewState.getDisclosure(), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), ComposableLambda3.rememberComposableLambda(-1709188888, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.ListRowSection.2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
                                            invoke(composer2, num5.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i8) {
                                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1709188888, i8, -1, "com.robinhood.shared.discover.section.ListRowSection.<anonymous> (DiscoverSectionComposable.kt:188)");
                                            }
                                            function2MovableContentOf.invoke(composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                function04 = function03;
                                composerStartRestartGroup.startReplaceGroup(490041809);
                                function2MovableContentOf.invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Integer num5 = num4;
                            function05 = function04;
                            z3 = z2;
                            str3 = str4;
                            num3 = num5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z3 = z2;
                            num3 = num2;
                            str3 = str2;
                            function05 = function02;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DiscoverSectionComposable.ListRowSection$lambda$10(discoverSectionViewState, z3, num3, str3, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function02 = function0;
                    if ((i3 & 9363) != 9362) {
                        if (i7 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function2MovableContentOf2 = MovableContent2.movableContentOf(ComposableLambda3.rememberComposableLambda(94827912, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$ListRowSection$rowBody$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num52) {
                                invoke(composer2, num52.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(94827912, i8, -1, "com.robinhood.shared.discover.section.ListRowSection.<anonymous> (DiscoverSectionComposable.kt:173)");
                                }
                                DiscoverSectionComposable.ListRowBody(discoverSectionViewState, num4, str4, function03, composer2, CryptoChipsComposable.$stable | InstrumentPreviewCard4.$stable, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54));
                        if (!z2) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Integer num52 = num4;
                        function05 = function04;
                        z3 = z2;
                        str3 = str4;
                        num3 = num52;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function02 = function0;
                if ((i3 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num2 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num2 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListRowBody(final DiscoverSectionViewState discoverSectionViewState, final Integer num, String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterable rowList;
        String str3;
        Function0<Unit> function04;
        final String str4;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-467089853);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(discoverSectionViewState) : composerStartRestartGroup.changedInstance(discoverSectionViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    str4 = str2;
                    function05 = function02;
                } else {
                    String str5 = i5 == 0 ? null : str2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-467089853, i3, -1, "com.robinhood.shared.discover.section.ListRowBody (DiscoverSectionComposable.kt:201)");
                    }
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    String str6 = str5 == null ? "-" + str5 : "";
                    composerStartRestartGroup.startReplaceGroup(2098232838);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    if (!discoverSectionViewState.isLoading()) {
                        modifierFillMaxWidth$default = modifierFillMaxWidth$default.then(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, "discover-row-list-section" + str6, null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    rowList = discoverSectionViewState.getRowList();
                    if (rowList != null) {
                        rowList = null;
                    } else if (num != null) {
                        rowList = CollectionsKt.take(rowList, num.intValue());
                    }
                    composerStartRestartGroup.startReplaceGroup(-790173800);
                    if (rowList != null) {
                        Iterable<DiscoverRow> iterable = rowList;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (final DiscoverRow discoverRow : iterable) {
                            if (discoverRow instanceof DiscoverRow.Loading) {
                                composerStartRestartGroup.startReplaceGroup(287569868);
                                str3 = str6;
                                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(1565654616, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$ListRowBody$3$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i6) {
                                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1565654616, i6, -1, "com.robinhood.shared.discover.section.ListRowBody.<anonymous>.<anonymous>.<anonymous> (DiscoverSectionComposable.kt:237)");
                                        }
                                        DiscoverRow2.DiscoverRowComposable(((DiscoverRow.Loading) discoverRow).getDefaultLoadingState(), null, composer2, 0, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                str3 = str6;
                                if (!(discoverRow instanceof DiscoverRow.Loaded)) {
                                    composerStartRestartGroup.startReplaceGroup(287568943);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(287576524);
                                DiscoverRow.Loaded loaded = (DiscoverRow.Loaded) discoverRow;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                boolean zChanged = composerStartRestartGroup.changed(discoverRow) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return DiscoverSectionComposable.ListRowBody$lambda$18$lambda$17$lambda$16$lambda$15(discoverRow, navigator, context);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                DiscoverRow2.DiscoverRowComposable(loaded, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, "discover-row-list-section-" + loaded.getPrimaryText() + str3, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            arrayList.add(Unit.INSTANCE);
                            str6 = str3;
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-790124202);
                    if (num == null) {
                        String strStringResource = StringResources_androidKt.stringResource(C38721R.string.explore_view_all, composerStartRestartGroup, 0);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        function04 = function03;
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function04, strStringResource, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), null, null, false, null, composerStartRestartGroup, (i3 >> 9) & 14, 120);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    } else {
                        function04 = function03;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    function05 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DiscoverSectionComposable.ListRowBody$lambda$19(discoverSectionViewState, num, str4, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                if (str5 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(2098232838);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                if (!discoverSectionViewState.isLoading()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    rowList = discoverSectionViewState.getRowList();
                    if (rowList != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-790173800);
                    if (rowList != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-790124202);
                    if (num == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str4 = str5;
                    function05 = function04;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListRowBody$lambda$18$lambda$17$lambda$16$lambda$15(DiscoverRow discoverRow, Navigator navigator, Context context) {
        DiscoverRow.Loaded loaded = (DiscoverRow.Loaded) discoverRow;
        Uri uri = Uri.parse(loaded.getDeeplink());
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, loaded.getShouldClearTopOnDeeplinkHandling(), null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: SectionWithHeaderDisclosure-WH-ejsw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m25304SectionWithHeaderDisclosureWHejsw(final boolean z, final String str, final String str2, final String str3, float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        String str4;
        String str5;
        String str6;
        float fM21592getMediumD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(360387696);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    str5 = str2;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                    }
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        fM21592getMediumD9Ej5fM = f;
                        int i4 = composerStartRestartGroup.changed(fM21592getMediumD9Ej5fM) ? 16384 : 8192;
                        i3 |= i4;
                    } else {
                        fM21592getMediumD9Ej5fM = f;
                    }
                    i3 |= i4;
                } else {
                    fM21592getMediumD9Ej5fM = f;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    }
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        float f3 = fM21592getMediumD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LocalShowPlaceholder.Loadable(z2, null, null, ComposableLambda3.rememberComposableLambda(1615535328, true, new DiscoverSectionComposable5(str6, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), str4, str5, f3, function22), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f2 = f3;
                    } else {
                        if ((i2 & 16) != 0) {
                            fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                            i3 &= -57345;
                        }
                        float f32 = fM21592getMediumD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(360387696, i3, -1, "com.robinhood.shared.discover.section.SectionWithHeaderDisclosure (DiscoverSectionComposable.kt:287)");
                        }
                        LocalShowPlaceholder.Loadable(z2, null, null, ComposableLambda3.rememberComposableLambda(1615535328, true, new DiscoverSectionComposable5(str6, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), str4, str5, f32, function22), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f32;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f2 = fM21592getMediumD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DiscoverSectionComposable.SectionWithHeaderDisclosure_WH_ejsw$lambda$20(z, str, str2, str3, f2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            str5 = str2;
            if ((i2 & 8) != 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if ((i2 & 16) != 0) {
                    }
                    float f322 = fM21592getMediumD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LocalShowPlaceholder.Loadable(z2, null, null, ComposableLambda3.rememberComposableLambda(1615535328, true, new DiscoverSectionComposable5(str6, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), str4, str5, f322, function22), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f2 = f322;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str;
        if ((i2 & 4) != 0) {
        }
        str5 = str2;
        if ((i2 & 8) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        int i5;
        final SnapshotState snapshotState;
        final Modifier modifier4;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String str3 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-46764259);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-46764259, i4, -1, "com.robinhood.shared.discover.section.Header (DiscoverSectionComposable.kt:333)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoverSectionComposable.Header$lambda$22$lambda$21();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (str2 != null) {
                    composerStartRestartGroup.startReplaceGroup(1432178969);
                    modifier3 = modifier5;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composerStartRestartGroup, i4 & 14, 0, 8190);
                    composerStartRestartGroup.endReplaceGroup();
                    str3 = str;
                    composerStartRestartGroup = composerStartRestartGroup;
                    snapshotState = snapshotState2;
                    i5 = 5004770;
                } else {
                    modifier3 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(1432342463);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                    str3 = str;
                    BentoTextWithTrailingIconState bentoTextWithTrailingIconState = new BentoTextWithTrailingIconState(str3, new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), null, bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), null, null, null, null, null, 0, false, 0, 0, displayCapsuleMedium, false, null, BentoTextWithTrailingIcon7.CENTER_COORDINATE, false, 188400, null);
                    composerStartRestartGroup = composerStartRestartGroup;
                    i5 = 5004770;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    snapshotState = snapshotState2;
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DiscoverSectionComposable.Header$lambda$27$lambda$26$lambda$25(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIconState, null, null, (Function0) objRememberedValue3, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (Header$lambda$23(snapshotState) && str2 != null) {
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DiscoverSectionComposable.Header$lambda$29$lambda$28(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(1514825321, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.Header.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                            invoke(rhModalBottomSheet5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i8 & 6) == 0) {
                                i9 = ((i8 & 8) == 0 ? composer3.changed(RhModalBottomSheet) : composer3.changedInstance(RhModalBottomSheet) ? 4 : 2) | i8;
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1514825321, i9, -1, "com.robinhood.shared.discover.section.Header.<anonymous> (DiscoverSectionComposable.kt:364)");
                            }
                            Boolean bool = Boolean.TRUE;
                            final String str4 = str3;
                            final String str5 = str2;
                            BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(1560966065, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.Header.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1560966065, i10, -1, "com.robinhood.shared.discover.section.Header.<anonymous>.<anonymous> (DiscoverSectionComposable.kt:367)");
                                    }
                                    String str6 = str4;
                                    String str7 = str5;
                                    RhModalBottomSheet5 rhModalBottomSheet5 = RhModalBottomSheet;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer4.changedInstance(rhModalBottomSheet5);
                                    Object objRememberedValue4 = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new DiscoverSectionComposable2(rhModalBottomSheet5);
                                        composer4.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer4.endReplaceGroup();
                                    DiscoverSectionComposable.DiscoverSectionBottomSheet(str6, str7, (Function0) objRememberedValue4, null, composer4, 0, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 1572864, 54);
                    composerStartRestartGroup = composer2;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoverSectionComposable.Header$lambda$30(str3, str2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (str2 != null) {
                }
                composerStartRestartGroup.endNode();
                if (Header$lambda$23(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DiscoverSectionComposable.Header$lambda$29$lambda$28(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer22 = composerStartRestartGroup;
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(1514825321, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.Header.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                                invoke(rhModalBottomSheet5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i8 & 6) == 0) {
                                    i9 = ((i8 & 8) == 0 ? composer3.changed(RhModalBottomSheet) : composer3.changedInstance(RhModalBottomSheet) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1514825321, i9, -1, "com.robinhood.shared.discover.section.Header.<anonymous> (DiscoverSectionComposable.kt:364)");
                                }
                                Boolean bool = Boolean.TRUE;
                                final String str4 = str3;
                                final String str5 = str2;
                                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(1560966065, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt.Header.3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i10) {
                                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1560966065, i10, -1, "com.robinhood.shared.discover.section.Header.<anonymous>.<anonymous> (DiscoverSectionComposable.kt:367)");
                                        }
                                        String str6 = str4;
                                        String str7 = str5;
                                        RhModalBottomSheet5 rhModalBottomSheet5 = RhModalBottomSheet;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer4.changedInstance(rhModalBottomSheet5);
                                        Object objRememberedValue4 = composer4.rememberedValue();
                                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new DiscoverSectionComposable2(rhModalBottomSheet5);
                                            composer4.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer4.endReplaceGroup();
                                        DiscoverSectionComposable.DiscoverSectionBottomSheet(str6, str7, (Function0) objRememberedValue4, null, composer4, 0, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer22, 1572864, 54);
                        composerStartRestartGroup = composer22;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState Header$lambda$22$lambda$21() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void Header$lambda$24(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$27$lambda$26$lambda$25(SnapshotState snapshotState) {
        Header$lambda$24(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$29$lambda$28(SnapshotState snapshotState) {
        Header$lambda$24(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiscoverSectionBottomSheet(final String title, final String description, final Function0<Unit> onGotIt, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        final Navigator navigator;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onGotIt, "onGotIt");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1097238220);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(description) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGotIt) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1097238220, i3, -1, "com.robinhood.shared.discover.section.DiscoverSectionBottomSheet (DiscoverSectionComposable.kt:384)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                Modifier modifier5 = modifier4;
                int i6 = i3;
                BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, (i3 & 14) | 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierAlign = column6.align(companion3, companion.getCenterHorizontally());
                MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable), null, null, null, null, null, null, new MarkdownStyle.Link(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), false, false, 6, null), 0L, null, companion4.m7919getCentere0LSkKk(), null, 1471, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DiscoverSectionComposable.DiscoverSectionBottomSheet$lambda$33$lambda$32$lambda$31(navigator, context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(description, modifierAlign, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, ((i6 >> 3) & 14) | (MarkdownStyle.$stable << 6), 8);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtonBar2.BentoButtonBar(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, false, null, null, onGotIt, StringResources_androidKt.stringResource(C38721R.string.search_discover_section_description_sheet_cta, composerStartRestartGroup, 0), false, null, false, null, null, false, null, false, composerStartRestartGroup, ((i6 << 12) & 3670016) | 6, 0, 65342);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoverSectionComposable.DiscoverSectionBottomSheet$lambda$34(title, description, onGotIt, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN42);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                TextAlign.Companion companion42 = TextAlign.INSTANCE;
                Modifier modifier52 = modifier4;
                int i62 = i3;
                BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, (i3 & 14) | 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierAlign2 = column62.align(companion32, companion5.getCenterHorizontally());
                MarkdownStyle markdownStyleM16260copyR0sFphs$default2 = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable), null, null, null, null, null, null, new MarkdownStyle.Link(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), false, false, 6, null), 0L, null, companion42.m7919getCentere0LSkKk(), null, 1471, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DiscoverSectionComposable.DiscoverSectionBottomSheet$lambda$33$lambda$32$lambda$31(navigator, context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(description, modifierAlign2, markdownStyleM16260copyR0sFphs$default2, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, ((i62 >> 3) & 14) | (MarkdownStyle.$stable << 6), 8);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonBar2.BentoButtonBar(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), null, null, false, null, null, onGotIt, StringResources_androidKt.stringResource(C38721R.string.search_discover_section_description_sheet_cta, composerStartRestartGroup, 0), false, null, false, null, null, false, null, false, composerStartRestartGroup, ((i62 << 12) & 3670016) | 6, 0, 65342);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
