package com.robinhood.shared.iac.herocards.p383ui;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil.compose.SingletonAsyncImage;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.iac.herocards.analytics.HeroCardLogging;
import com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IacHeroCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a½\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00122#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00122#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00122#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001aI\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\f*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010!\u001a!\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010'\u001a-\u0010(\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010*\u001a?\u0010+\u001a\u00020\f*\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020-2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101\u001a\u001a\u00102\u001a\u00020\f*\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010\r\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u00066²\u0006\n\u0010/\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002"}, m3636d2 = {"IAC_HERO_CARD_DESCRIPTION_TAG", "", "IAC_HERO_CARD_PARENT_TAG", "IAC_HERO_CARD_CTA_TAG", "IAC_HERO_CARD_IMAGE_TAG", "IAC_HERO_CARD_CLOSE_TAG", "SPECIFICATION_DESCRIPTION_WIDTH", "Landroidx/compose/ui/unit/Dp;", "getSPECIFICATION_DESCRIPTION_WIDTH", "()F", "F", "IacHeroCardComposable", "", "card", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "modifier", "Landroidx/compose/ui/Modifier;", "onCardSeen", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCardClicked", "onCtaClicked", "onCardDismissed", "duxo", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo;", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo;Landroidx/compose/runtime/Composer;II)V", "CardContent", "Lkotlin/Function0;", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CloseButton", "Landroidx/compose/foundation/layout/BoxScope;", "onDismiss", "(Landroidx/compose/foundation/layout/BoxScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VerticalDivider", "width", "VerticalDivider--orJrPs", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DescriptionSection", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CtaSection", "onClick", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ImageSection", "imageBoxWidthInPx", "", "cardHeightInDp", "cardHeightInPx", "ImageSection-jIwJxvA", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/models/db/herocard/IacHeroCard;IFILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "handleIacHeroDeeplink", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "lib-iac-hero-cards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IacHeroCardComposable {
    public static final String IAC_HERO_CARD_CLOSE_TAG = "iacHeroCardClose";
    public static final String IAC_HERO_CARD_CTA_TAG = "iacHeroCardCta";
    public static final String IAC_HERO_CARD_DESCRIPTION_TAG = "iacHeroCardDescription";
    public static final String IAC_HERO_CARD_IMAGE_TAG = "iacHeroCardImage";
    public static final String IAC_HERO_CARD_PARENT_TAG = "iacHeroCardParent";
    private static final float SPECIFICATION_DESCRIPTION_WIDTH = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardContent$lambda$29(IacHeroCard iacHeroCard, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CardContent(iacHeroCard, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloseButton$lambda$30(BoxScope boxScope, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CloseButton(boxScope, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CtaSection$lambda$34(IacHeroCard iacHeroCard, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CtaSection(iacHeroCard, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DescriptionSection$lambda$32(IacHeroCard iacHeroCard, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DescriptionSection(iacHeroCard, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardComposable$lambda$9(IacHeroCard iacHeroCard, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, IacHeroCardDuxo iacHeroCardDuxo, int i, int i2, Composer composer, int i3) {
        IacHeroCardComposable(iacHeroCard, modifier, function1, function12, function13, function14, iacHeroCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageSection_jIwJxvA$lambda$35(BoxScope boxScope, IacHeroCard iacHeroCard, int i, float f, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m25457ImageSectionjIwJxvA(boxScope, iacHeroCard, i, f, i2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageSection_jIwJxvA$lambda$36(BoxScope boxScope, IacHeroCard iacHeroCard, int i, float f, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m25457ImageSectionjIwJxvA(boxScope, iacHeroCard, i, f, i2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageSection_jIwJxvA$lambda$37(BoxScope boxScope, IacHeroCard iacHeroCard, int i, float f, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m25457ImageSectionjIwJxvA(boxScope, iacHeroCard, i, f, i2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalDivider__orJrPs$lambda$31(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25458VerticalDividerorJrPs(f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final float getSPECIFICATION_DESCRIPTION_WIDTH() {
        return SPECIFICATION_DESCRIPTION_WIDTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardComposable$lambda$1$lambda$0(IacHeroCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardComposable$lambda$3$lambda$2(IacHeroCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardComposable$lambda$5$lambda$4(IacHeroCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final float CardContent$lambda$28$lambda$16(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardComposable$lambda$7$lambda$6(IacHeroCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IacHeroCardComposable(final IacHeroCard card, Modifier modifier, Function1<? super IacHeroCard, Unit> function1, Function1<? super IacHeroCard, Unit> function12, Function1<? super IacHeroCard, Unit> function13, Function1<? super IacHeroCard, Unit> function14, IacHeroCardDuxo iacHeroCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super IacHeroCard, Unit> function15;
        int i5;
        Function1<? super IacHeroCard, Unit> function16;
        int i6;
        Function1<? super IacHeroCard, Unit> function17;
        int i7;
        Function1<? super IacHeroCard, Unit> function18;
        IacHeroCardDuxo iacHeroCardDuxo2;
        int i8;
        Function1<? super IacHeroCard, Unit> function19;
        Function1<? super IacHeroCard, Unit> function110;
        Composer composer2;
        IacHeroCardDuxo iacHeroCardDuxo3;
        Function1<? super IacHeroCard, Unit> function111;
        Function1<? super IacHeroCard, Unit> function112;
        Function1<? super IacHeroCard, Unit> function113;
        Modifier modifier3;
        int i9;
        EventLogger current;
        Screen screen;
        boolean zChangedInstance;
        Object objRememberedValue;
        EventLogger eventLogger;
        Screen screen2;
        IacHeroCard iacHeroCard;
        Function1<? super IacHeroCard, Unit> function114;
        IacHeroCardDuxo iacHeroCardDuxo4;
        Composer composer3;
        final Modifier modifier4;
        final Function1<? super IacHeroCard, Unit> function115;
        final Function1<? super IacHeroCard, Unit> function116;
        final Function1<? super IacHeroCard, Unit> function117;
        final IacHeroCardDuxo iacHeroCardDuxo5;
        final Function1<? super IacHeroCard, Unit> function118;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1481833219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function15 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function15) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function16 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function16) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function17 = function13;
                            i3 |= composerStartRestartGroup.changedInstance(function17) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                function18 = function14;
                                i3 |= composerStartRestartGroup.changedInstance(function18) ? 131072 : 65536;
                            }
                            if ((i & 1572864) != 0) {
                                iacHeroCardDuxo2 = iacHeroCardDuxo;
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(iacHeroCardDuxo2)) ? 1048576 : 524288;
                            } else {
                                iacHeroCardDuxo2 = iacHeroCardDuxo;
                            }
                            i8 = i3;
                            if ((i8 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return IacHeroCardComposable.IacHeroCardComposable$lambda$1$lambda$0((IacHeroCard) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function19 = (Function1) objRememberedValue2;
                                    } else {
                                        function19 = function15;
                                    }
                                    if (i5 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return IacHeroCardComposable.IacHeroCardComposable$lambda$3$lambda$2((IacHeroCard) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function110 = (Function1) objRememberedValue3;
                                    } else {
                                        function110 = function16;
                                    }
                                    if (i6 != 0) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return IacHeroCardComposable.IacHeroCardComposable$lambda$5$lambda$4((IacHeroCard) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function17 = (Function1) objRememberedValue4;
                                    }
                                    if (i7 != 0) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return IacHeroCardComposable.IacHeroCardComposable$lambda$7$lambda$6((IacHeroCard) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function18 = (Function1) objRememberedValue5;
                                    }
                                    if ((i2 & 64) == 0) {
                                        composerStartRestartGroup.startReplaceGroup(-747520797);
                                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                        if (current2 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IacHeroCardDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                        composer2 = composerStartRestartGroup;
                                        composer2.endReplaceableGroup();
                                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$$inlined$duxo$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                    lifecycle.addObserver(duxoLifecycleObserver);
                                                    final Lifecycle lifecycle2 = lifecycle;
                                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$$inlined$duxo$1.1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                                        }
                                                    };
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer2.endReplaceGroup();
                                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 0);
                                        composer2.endReplaceGroup();
                                        iacHeroCardDuxo3 = (IacHeroCardDuxo) baseDuxo;
                                        modifier3 = modifier5;
                                        function111 = function17;
                                        function112 = function18;
                                        i9 = i8 & (-3670017);
                                        function15 = function19;
                                        function113 = function110;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        iacHeroCardDuxo3 = iacHeroCardDuxo2;
                                        function111 = function17;
                                        function112 = function18;
                                        function15 = function19;
                                        function113 = function110;
                                        modifier3 = modifier5;
                                        i9 = i8;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i8 &= -3670017;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function113 = function16;
                                    iacHeroCardDuxo3 = iacHeroCardDuxo2;
                                    function111 = function17;
                                    function112 = function18;
                                    i9 = i8;
                                    modifier3 = modifier2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1481833219, i9, -1, "com.robinhood.shared.iac.herocards.ui.IacHeroCardComposable (IacHeroCardComposable.kt:86)");
                                }
                                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                                Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                Unit unit = Unit.INSTANCE;
                                composer2.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i9 & 896) != 256) | composer2.changedInstance(current) | composer2.changedInstance(screen) | composer2.changedInstance(card) | composer2.changedInstance(iacHeroCardDuxo3);
                                objRememberedValue = composer2.rememberedValue();
                                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    IacHeroCardDuxo iacHeroCardDuxo6 = iacHeroCardDuxo3;
                                    Function1<? super IacHeroCard, Unit> function119 = function15;
                                    objRememberedValue = new IacHeroCardComposable2(current, screen, card, function119, iacHeroCardDuxo6, null);
                                    eventLogger = current;
                                    screen2 = screen;
                                    iacHeroCard = card;
                                    function114 = function119;
                                    iacHeroCardDuxo4 = iacHeroCardDuxo6;
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    iacHeroCard = card;
                                    function114 = function15;
                                    iacHeroCardDuxo4 = iacHeroCardDuxo3;
                                    eventLogger = current;
                                    screen2 = screen;
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i11).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i11).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 2, null), IAC_HERO_CARD_PARENT_TAG), null, false, 3, null);
                                long jBackgroundColor = BackendColorSupport.backgroundColor(iacHeroCard, composer2, i9 & 14);
                                composer3 = composer2;
                                Modifier modifier6 = modifier3;
                                CardKt.m5548CardFjzlyU(modifierWrapContentHeight$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM()), jBackgroundColor, 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(1221160608, true, new C390506(iacHeroCard, eventLogger, screen2, navigator, context, iacHeroCardDuxo4, function113, function111, function112), composer2, 54), composer3, 1572864, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier6;
                                function115 = function113;
                                function116 = function111;
                                function117 = function114;
                                iacHeroCardDuxo5 = iacHeroCardDuxo4;
                                function118 = function112;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                function117 = function15;
                                composer3 = composerStartRestartGroup;
                                function115 = function16;
                                iacHeroCardDuxo5 = iacHeroCardDuxo2;
                                function116 = function17;
                                function118 = function18;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return IacHeroCardComposable.IacHeroCardComposable$lambda$9(card, modifier4, function117, function115, function116, function118, iacHeroCardDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        function18 = function14;
                        if ((i & 1572864) != 0) {
                        }
                        i8 = i3;
                        if ((i8 & 599187) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 == 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                                Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                                Unit unit2 = Unit.INSTANCE;
                                composer2.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i9 & 896) != 256) | composer2.changedInstance(current) | composer2.changedInstance(screen) | composer2.changedInstance(card) | composer2.changedInstance(iacHeroCardDuxo3);
                                objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance) {
                                    IacHeroCardDuxo iacHeroCardDuxo62 = iacHeroCardDuxo3;
                                    Function1<? super IacHeroCard, Unit> function1192 = function15;
                                    objRememberedValue = new IacHeroCardComposable2(current, screen, card, function1192, iacHeroCardDuxo62, null);
                                    eventLogger = current;
                                    screen2 = screen;
                                    iacHeroCard = card;
                                    function114 = function1192;
                                    iacHeroCardDuxo4 = iacHeroCardDuxo62;
                                    composer2.updateRememberedValue(objRememberedValue);
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i112 = BentoTheme.$stable;
                                    Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composer2, i112).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i112).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i112).m21593getSmallD9Ej5fM(), 2, null), IAC_HERO_CARD_PARENT_TAG), null, false, 3, null);
                                    long jBackgroundColor2 = BackendColorSupport.backgroundColor(iacHeroCard, composer2, i9 & 14);
                                    composer3 = composer2;
                                    Modifier modifier62 = modifier3;
                                    CardKt.m5548CardFjzlyU(modifierWrapContentHeight$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composer2, i112).m21593getSmallD9Ej5fM()), jBackgroundColor2, 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(1221160608, true, new C390506(iacHeroCard, eventLogger, screen2, navigator2, context2, iacHeroCardDuxo4, function113, function111, function112), composer2, 54), composer3, 1572864, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier62;
                                    function115 = function113;
                                    function116 = function111;
                                    function117 = function114;
                                    iacHeroCardDuxo5 = iacHeroCardDuxo4;
                                    function118 = function112;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function17 = function13;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    function18 = function14;
                    if ((i & 1572864) != 0) {
                    }
                    i8 = i3;
                    if ((i8 & 599187) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function16 = function12;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function17 = function13;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function18 = function14;
                if ((i & 1572864) != 0) {
                }
                i8 = i3;
                if ((i8 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function15 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function16 = function12;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function17 = function13;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function18 = function14;
            if ((i & 1572864) != 0) {
            }
            i8 = i3;
            if ((i8 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function15 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function16 = function12;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function17 = function13;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        function18 = function14;
        if ((i & 1572864) != 0) {
        }
        i8 = i3;
        if ((i8 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IacHeroCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$6 */
    static final class C390506 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ IacHeroCard $card;
        final /* synthetic */ Context $context;
        final /* synthetic */ IacHeroCardDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Screen $eventScreen;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<IacHeroCard, Unit> $onCardClicked;
        final /* synthetic */ Function1<IacHeroCard, Unit> $onCardDismissed;
        final /* synthetic */ Function1<IacHeroCard, Unit> $onCtaClicked;

        /* JADX WARN: Multi-variable type inference failed */
        C390506(IacHeroCard iacHeroCard, EventLogger eventLogger, Screen screen, Navigator navigator, Context context, IacHeroCardDuxo iacHeroCardDuxo, Function1<? super IacHeroCard, Unit> function1, Function1<? super IacHeroCard, Unit> function12, Function1<? super IacHeroCard, Unit> function13) {
            this.$card = iacHeroCard;
            this.$eventLogger = eventLogger;
            this.$eventScreen = screen;
            this.$navigator = navigator;
            this.$context = context;
            this.$duxo = iacHeroCardDuxo;
            this.$onCardClicked = function1;
            this.$onCtaClicked = function12;
            this.$onCardDismissed = function13;
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
                ComposerKt.traceEventStart(1221160608, i, -1, "com.robinhood.shared.iac.herocards.ui.IacHeroCardComposable.<anonymous> (IacHeroCardComposable.kt:117)");
            }
            IacHeroCard iacHeroCard = this.$card;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$card) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$duxo) | composer.changed(this.$onCardClicked);
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$eventScreen;
            final IacHeroCard iacHeroCard2 = this.$card;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final IacHeroCardDuxo iacHeroCardDuxo = this.$duxo;
            final Function1<IacHeroCard, Unit> function1 = this.$onCardClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacHeroCardComposable.C390506.invoke$lambda$1$lambda$0(eventLogger, screen, iacHeroCard2, navigator, context, iacHeroCardDuxo, function1);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue = function0;
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$card) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$duxo) | composer.changed(this.$onCtaClicked);
            final EventLogger eventLogger2 = this.$eventLogger;
            final Screen screen2 = this.$eventScreen;
            final IacHeroCard iacHeroCard3 = this.$card;
            final Navigator navigator2 = this.$navigator;
            final Context context2 = this.$context;
            final IacHeroCardDuxo iacHeroCardDuxo2 = this.$duxo;
            final Function1<IacHeroCard, Unit> function12 = this.$onCtaClicked;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function0 function03 = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$6$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacHeroCardComposable.C390506.invoke$lambda$3$lambda$2(eventLogger2, screen2, iacHeroCard3, navigator2, context2, iacHeroCardDuxo2, function12);
                    }
                };
                composer.updateRememberedValue(function03);
                objRememberedValue2 = function03;
            }
            Function0 function04 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$card) | composer.changedInstance(this.$duxo) | composer.changed(this.$onCardDismissed);
            final EventLogger eventLogger3 = this.$eventLogger;
            final Screen screen3 = this.$eventScreen;
            final IacHeroCard iacHeroCard4 = this.$card;
            final IacHeroCardDuxo iacHeroCardDuxo3 = this.$duxo;
            final Function1<IacHeroCard, Unit> function13 = this.$onCardDismissed;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Function0 function05 = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$6$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacHeroCardComposable.C390506.invoke$lambda$5$lambda$4(eventLogger3, screen3, iacHeroCard4, iacHeroCardDuxo3, function13);
                    }
                };
                composer.updateRememberedValue(function05);
                objRememberedValue3 = function05;
            }
            composer.endReplaceGroup();
            IacHeroCardComposable.CardContent(iacHeroCard, function02, function04, (Function0) objRememberedValue3, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, IacHeroCard iacHeroCard, Navigator navigator, Context context, IacHeroCardDuxo iacHeroCardDuxo, Function1 function1) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, HeroCardLogging.heroCardEventData(screen, iacHeroCard, UserInteractionEventData.EventType.TAP, HeroCardLogging.getLoggingCard(iacHeroCard)), false, false, 6, null);
            IacHeroCardComposable.handleIacHeroDeeplink(navigator, context, iacHeroCard);
            iacHeroCardDuxo.onHeroCardTapped(iacHeroCard);
            function1.invoke(iacHeroCard);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, IacHeroCard iacHeroCard, Navigator navigator, Context context, IacHeroCardDuxo iacHeroCardDuxo, Function1 function1) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, HeroCardLogging.heroCardEventData(screen, iacHeroCard, UserInteractionEventData.EventType.TAP, HeroCardLogging.getLoggingCtaBtn(iacHeroCard)), false, false, 6, null);
            IacHeroCardComposable.handleIacHeroDeeplink(navigator, context, iacHeroCard);
            iacHeroCardDuxo.onHeroCardTapped(iacHeroCard);
            function1.invoke(iacHeroCard);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, Screen screen, IacHeroCard iacHeroCard, IacHeroCardDuxo iacHeroCardDuxo, Function1 function1) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, HeroCardLogging.heroCardEventData(screen, iacHeroCard, UserInteractionEventData.EventType.TAP, HeroCardLogging.getLoggingDismissBtn(iacHeroCard)), false, false, 6, null);
            iacHeroCardDuxo.onHeroCardDismissed(iacHeroCard);
            function1.invoke(iacHeroCard);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardContent(final IacHeroCard card, final Function0<Unit> onCardClicked, final Function0<Unit> onCtaClicked, final Function0<Unit> onCardDismissed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        Object objRememberedValue4;
        boolean zChanged;
        Arrangement arrangement;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue5;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(onCardClicked, "onCardClicked");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Intrinsics.checkNotNullParameter(onCardDismissed, "onCardDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(312701805);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardDismissed) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(312701805, i4, -1, "com.robinhood.shared.iac.herocards.ui.CardContent (IacHeroCardComposable.kt:153)");
                }
                int i6 = i4 & 14;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BackendColorSupport.backgroundColor(card, composerStartRestartGroup, i6), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IacHeroCardComposable.CardContent$lambda$11$lambda$10(onCardClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement2.getStart();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(density);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    arrangement = arrangement2;
                    if (objRememberedValue6 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    DescriptionSection(card, null, composerStartRestartGroup, i6, 2);
                    CtaSection(card, onCtaClicked, null, composerStartRestartGroup, i6 | ((i4 >> 3) & 112), 4);
                    composerStartRestartGroup.endNode();
                    m25458VerticalDividerorJrPs(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), null, composerStartRestartGroup, 0, 2);
                    Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return IacHeroCardComposable.CardContent$lambda$28$lambda$26$lambda$25(snapshotIntState22, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierWeight$default, (Function1) objRememberedValue5);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    m25457ImageSectionjIwJxvA(boxScopeInstance, card, snapshotIntState22.getIntValue(), CardContent$lambda$28$lambda$16(snapshotState), snapshotIntState2.getIntValue(), null, composerStartRestartGroup, 6 | ((i4 << 3) & 112), 16);
                    composer2 = composerStartRestartGroup;
                    CloseButton(boxScopeInstance, onCardDismissed, null, composer2, 6 | ((i4 >> 6) & 112), 2);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    arrangement = arrangement2;
                }
                objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IacHeroCardComposable.CardContent$lambda$28$lambda$23$lambda$22(density, snapshotIntState2, snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue6);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned3);
                Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    DescriptionSection(card, null, composerStartRestartGroup, i6, 2);
                    CtaSection(card, onCtaClicked, null, composerStartRestartGroup, i6 | ((i4 >> 3) & 112), 4);
                    composerStartRestartGroup.endNode();
                    m25458VerticalDividerorJrPs(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), null, composerStartRestartGroup, 0, 2);
                    Modifier modifierWeight$default2 = Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned22 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierWeight$default2, (Function1) objRememberedValue5);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned22);
                    Function0<ComposeUiNode> constructor32 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        m25457ImageSectionjIwJxvA(boxScopeInstance2, card, snapshotIntState22.getIntValue(), CardContent$lambda$28$lambda$16(snapshotState), snapshotIntState2.getIntValue(), null, composerStartRestartGroup, 6 | ((i4 << 3) & 112), 16);
                        composer2 = composerStartRestartGroup;
                        CloseButton(boxScopeInstance2, onCardDismissed, null, composer2, 6 | ((i4 >> 6) & 112), 2);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacHeroCardComposable.CardContent$lambda$29(card, onCardClicked, onCtaClicked, onCardDismissed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = i4 & 14;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BackendColorSupport.backgroundColor(card, composerStartRestartGroup, i62), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacHeroCardComposable.CardContent$lambda$11$lambda$10(onCardClicked);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue, 7, null);
                Arrangement arrangement22 = Arrangement.INSTANCE;
                Arrangement.Horizontal start2 = arrangement22.getStart();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion22.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(density2);
                    Object objRememberedValue62 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                    objRememberedValue62 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IacHeroCardComposable.CardContent$lambda$28$lambda$23$lambda$22(density2, snapshotIntState23, snapshotState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue62);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned32 = OnGloballyPositionedModifier3.onGloballyPositioned(companion42, (Function1) objRememberedValue62);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier222 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned32);
                    Function0<ComposeUiNode> constructor222 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap222, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardContent$lambda$11$lambda$10(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void CardContent$lambda$28$lambda$17(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardContent$lambda$28$lambda$23$lambda$22(Density density, SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L));
        CardContent$lambda$28$lambda$17(snapshotState, density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardContent$lambda$28$lambda$26$lambda$25(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloseButton(final BoxScope boxScope, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-846221852);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-846221852, i3, -1, "com.robinhood.shared.iac.herocards.ui.CloseButton (IacHeroCardComposable.kt:199)");
                }
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), PaddingKt.m5146paddingqDBjuR0$default(boxScope.align(SizeKt.m5169size3ABfNKs(TestTag3.testTag(modifier4, IAC_HERO_CARD_CLOSE_TAG), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), Alignment.INSTANCE.getTopEnd()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 9, null), onDismiss, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | ((i3 << 9) & 57344), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacHeroCardComposable.CloseButton$lambda$30(boxScope, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size242, strStringResource2, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), PaddingKt.m5146paddingqDBjuR0$default(boxScope.align(SizeKt.m5169size3ABfNKs(TestTag3.testTag(modifier4, IAC_HERO_CARD_CLOSE_TAG), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), Alignment.INSTANCE.getTopEnd()), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 9, null), onDismiss, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | ((i3 << 9) & 57344), 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: VerticalDivider--orJrPs, reason: not valid java name */
    public static final void m25458VerticalDividerorJrPs(final float f, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278358208);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278358208, i3, -1, "com.robinhood.shared.iac.herocards.ui.VerticalDivider (IacHeroCardComposable.kt:217)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IacHeroCardComposable.VerticalDivider__orJrPs$lambda$31(f, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DescriptionSection(final IacHeroCard card, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(-773873819);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-773873819, i4, -1, "com.robinhood.shared.iac.herocards.ui.DescriptionSection (IacHeroCardComposable.kt:229)");
                }
                AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(card.getDescription(), 0L, composerStartRestartGroup, 0, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                long jTextColor = BackendColorSupport.textColor(card, composerStartRestartGroup, i4 & 14);
                int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                Modifier modifierTestTag = TestTag3.testTag(modifier4, IAC_HERO_CARD_DESCRIPTION_TAG);
                float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM();
                float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo, SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), fM21590getDefaultD9Ej5fM, 0.0f, fM21593getSmallD9Ej5fM, 4, null), SPECIFICATION_DESCRIPTION_WIDTH), Color.m6701boximpl(jTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 4, 0, null, null, textM, composer2, 817889280, 0, 7544);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacHeroCardComposable.DescriptionSection$lambda$32(card, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo2 = RichTexts2.m15956toAnnotatedStringiJQMabo(card.getDescription(), 0L, composerStartRestartGroup, 0, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
            long jTextColor2 = BackendColorSupport.textColor(card, composerStartRestartGroup, i4 & 14);
            int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, IAC_HERO_CARD_DESCRIPTION_TAG);
            float fM21590getDefaultD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM();
            float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo2, SizeKt.m5174width3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), fM21590getDefaultD9Ej5fM2, 0.0f, fM21593getSmallD9Ej5fM2, 4, null), SPECIFICATION_DESCRIPTION_WIDTH), Color.m6701boximpl(jTextColor2), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 4, 0, null, null, textM2, composer2, 817889280, 0, 7544);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CtaSection(final IacHeroCard card, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1215553885);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1215553885, i3, -1, "com.robinhood.shared.iac.herocards.ui.CtaSection (IacHeroCardComposable.kt:252)");
                }
                String ctaText = card.getCtaText();
                long jCtaTextColor = BackendColorSupport.ctaTextColor(card, composerStartRestartGroup, i3 & 14);
                BentoTextButton3.Size size = BentoTextButton3.Size.f5147M;
                ServerToBentoAssetMapper2 ctaTrailingIcon = card.getStyle().getCtaTrailingIcon();
                BentoTextButton3.Icon.Size12 size12 = ctaTrailingIcon == null ? new BentoTextButton3.Icon.Size12(ctaTrailingIcon, BentoTextButton3.Icon.Position.Trailing) : null;
                Modifier modifierTestTag = TestTag3.testTag(modifier4, IAC_HERO_CARD_CTA_TAG);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoTextButton2.m20715BentoTextButtonPIknLig(onClick, ctaText, PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 6, null), size12, size, false, Color.m6701boximpl(jCtaTextColor), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576 | (BentoTextButton3.Icon.Size12.$stable << 9), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacHeroCardComposable.CtaSection$lambda$34(card, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            String ctaText2 = card.getCtaText();
            long jCtaTextColor2 = BackendColorSupport.ctaTextColor(card, composerStartRestartGroup, i3 & 14);
            BentoTextButton3.Size size2 = BentoTextButton3.Size.f5147M;
            ServerToBentoAssetMapper2 ctaTrailingIcon2 = card.getStyle().getCtaTrailingIcon();
            BentoTextButton3.Icon.Size12 size122 = ctaTrailingIcon2 == null ? new BentoTextButton3.Icon.Size12(ctaTrailingIcon2, BentoTextButton3.Icon.Position.Trailing) : null;
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, IAC_HERO_CARD_CTA_TAG);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            BentoTextButton2.m20715BentoTextButtonPIknLig(onClick, ctaText2, PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 6, null), size122, size2, false, Color.m6701boximpl(jCtaTextColor2), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576 | (BentoTextButton3.Icon.Size12.$stable << 9), 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* renamed from: ImageSection-jIwJxvA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25457ImageSectionjIwJxvA(final BoxScope ImageSection, final IacHeroCard card, final int i, final float f, final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        IacHeroCard.IacHeroCardImage image;
        IacHeroCard.UrlOptions secondaryUrls;
        String svg;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ImageSection, "$this$ImageSection");
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229463093);
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(ImageSection) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 1) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(card) ? 32 : 16;
        }
        if ((i4 & 2) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 4) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i4 & 8) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        int i6 = i4 & 16;
        if (i6 == 0) {
            if ((196608 & i3) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1229463093, i5, -1, "com.robinhood.shared.iac.herocards.ui.ImageSection (IacHeroCardComposable.kt:280)");
                }
                image = card.getImage();
                if (image != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IacHeroCardComposable.ImageSection_jIwJxvA$lambda$35(ImageSection, card, i, f, i2, modifier5, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Modifier modifier6 = modifier4;
                boolean z = false;
                if (C2002Dp.m7997equalsimpl0(f, C2002Dp.m7995constructorimpl(0)) || i == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup3 != null) {
                        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IacHeroCardComposable.ImageSection_jIwJxvA$lambda$36(ImageSection, card, i, f, i2, modifier6, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() || (secondaryUrls = image.getSecondaryUrls()) == null || (svg = secondaryUrls.getSvg()) == null) {
                    svg = image.getPrimaryUrls().getSvg();
                }
                ImageRequest imageRequestBuild = builder.data(svg).decoderFactory(new SvgDecoder.Factory(z, 1, null)).size(i, i2).build();
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Alignment.Companion companion = Alignment.INSTANCE;
                SingletonAsyncImage.m9119AsyncImagegl8XCv8(imageRequestBuild, "Side image", SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(ImageSection.align(TestTag3.testTag(modifier6, IAC_HERO_CARD_IMAGE_TAG), companion.getCenterEnd()), C2002Dp.m7995constructorimpl(image.getWidth())), f), null, null, companion.getTopCenter(), crop, 0.0f, null, 0, false, null, composerStartRestartGroup, 1769520, 0, 3992);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacHeroCardComposable.ImageSection_jIwJxvA$lambda$37(ImageSection, card, i, f, i2, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 196608;
        modifier2 = modifier;
        if ((74899 & i5) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            image = card.getImage();
            if (image != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void handleIacHeroDeeplink(Navigator navigator, Context context, IacHeroCard card) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Uri uriSupportedDeeplink = card.supportedDeeplink();
        if (uriSupportedDeeplink != null) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uriSupportedDeeplink, null, null, false, card.getLaunchAsModalNavigation() ? NavigationType.PRESENT : null, 28, null);
        }
    }
}
