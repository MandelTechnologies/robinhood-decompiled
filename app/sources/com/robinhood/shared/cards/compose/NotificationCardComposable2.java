package com.robinhood.shared.cards.compose;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.text.AutoSizeText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.theme.style.NotificationCardStyle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.shared.cards.compose.utils.CardUtils;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: NotificationCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposable$3, reason: use source file name */
/* loaded from: classes26.dex */
final class NotificationCardComposable2 implements Function3<Column5, Composer, Integer, Unit> {
    final /* synthetic */ Uri $clickUri;
    final /* synthetic */ float $contentStartSpacingWithSideImage;
    final /* synthetic */ long $contentTintColor;
    final /* synthetic */ Context $context;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isTopCard;
    final /* synthetic */ NotificationCardStyle $notificationCardStyle;
    final /* synthetic */ Function1<Uri, Unit> $onCardClick;
    final /* synthetic */ Function0<Unit> $onDismissClicked;
    final /* synthetic */ NotificationCardComposable4.Regular $state;

    /* JADX WARN: Multi-variable type inference failed */
    NotificationCardComposable2(NotificationCardComposable4.Regular regular, float f, NotificationCardStyle notificationCardStyle, Context context, Uri uri, long j, boolean z, EventLogger eventLogger, Function0<Unit> function0, Function1<? super Uri, Unit> function1) {
        this.$state = regular;
        this.$contentStartSpacingWithSideImage = f;
        this.$notificationCardStyle = notificationCardStyle;
        this.$context = context;
        this.$clickUri = uri;
        this.$contentTintColor = j;
        this.$isTopCard = z;
        this.$eventLogger = eventLogger;
        this.$onDismissClicked = function0;
        this.$onCardClick = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Column5 MaterialCard, Composer composer, int i) throws Resources.NotFoundException {
        Context context;
        Uri uri;
        long j;
        NotificationCardComposable4.Regular regular;
        NotificationCardStyle notificationCardStyle;
        Row6 row6;
        float f;
        Object obj;
        int i2;
        Composer composer2;
        final NotificationCardComposable4.Regular regular2;
        Modifier.Companion companion;
        NotificationCardComposable4.Regular regular3;
        Composer composer3;
        String callToAction;
        Intrinsics.checkNotNullParameter(MaterialCard, "$this$MaterialCard");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1653682837, i, -1, "com.robinhood.shared.cards.compose.NotificationCardComposable.<anonymous> (NotificationCardComposable.kt:131)");
        }
        float fM21847getDefaultContentStartSpacingD9Ej5fM = this.$state.getCard().getSideImageIos() != null ? this.$contentStartSpacingWithSideImage : this.$notificationCardStyle.getSpacing().m21847getDefaultContentStartSpacingD9Ej5fM();
        float fM21844getContentBottomSpacingD9Ej5fM = this.$notificationCardStyle.getSpacing().m21844getContentBottomSpacingD9Ej5fM();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Vertical bottom = companion3.getBottom();
        NotificationCardComposable4.Regular regular4 = this.$state;
        NotificationCardStyle notificationCardStyle2 = this.$notificationCardStyle;
        Context context2 = this.$context;
        Uri uri2 = this.$clickUri;
        long j2 = this.$contentTintColor;
        final boolean z = this.$isTopCard;
        final EventLogger eventLogger = this.$eventLogger;
        final Function0<Unit> function0 = this.$onDismissClicked;
        final Function1<Uri, Unit> function1 = this.$onCardClick;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), bottom, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Row6 row62 = Row6.INSTANCE;
        Card.SideImage sideImageIos = regular4.getCard().getSideImageIos();
        composer.startReplaceGroup(-420520733);
        if (sideImageIos == null) {
            context = context2;
            uri = uri2;
            j = j2;
            regular = regular4;
            notificationCardStyle = notificationCardStyle2;
            row6 = row62;
            f = fM21844getContentBottomSpacingD9Ej5fM;
            obj = null;
            i2 = 0;
            composer2 = composer;
        } else {
            if (((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                context = context2;
                uri = uri2;
                j = j2;
                regular = regular4;
                notificationCardStyle = notificationCardStyle2;
                row6 = row62;
                f = fM21844getContentBottomSpacingD9Ej5fM;
                obj = null;
                i2 = 0;
                composer2 = composer;
                composer2.startReplaceGroup(2048434284);
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(sideImageIos.getWidth())), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_3d_item_height_tall, composer2, 0)), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null), composer2, 0);
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2047723671);
                j = j2;
                context = context2;
                uri = uri2;
                row6 = row62;
                notificationCardStyle = notificationCardStyle2;
                regular = regular4;
                obj = null;
                f = fM21844getContentBottomSpacingD9Ej5fM;
                i2 = 0;
                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(sideImageIos.getUrl(ContextsUiExtensions.getDensitySpec(context2), regular4.getTint()), CoilUtils2.rememberImageLoader(0.0d, null, composer, 0, 3), null, null, null, 0, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5176widthInVpY3zN4$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(sideImageIos.getWidth()), 1, null), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_3d_item_height_tall, composer, 0)), companion3.getCenter(), ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer, 27696, 96);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        Row6 row63 = row6;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Row5.weight$default(row63, companion2, 1.0f, false, 2, null), 0.0f, 1, obj), fM21847getDefaultContentStartSpacingD9Ej5fM, 0.0f, notificationCardStyle.getSpacing().m21845getContentEndSpacingD9Ej5fM(), f, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, i2);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i2);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        float f2 = 12;
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj), ScrollKt.rememberScrollState(i2, composer2, i2, 1), false, null, false, 14, null), 0.0f, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, i2);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i2);
        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default2);
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor3);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
        Modifier modifierHeight = Intrinsic3.height(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, notificationCardStyle.getSpacing().m21850getHeaderTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), Intrinsic4.Min);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer2, 54);
        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, i2);
        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierHeight);
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor4);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
        long j3 = j;
        ImageKt.Image(PainterResources_androidKt.painterResource(CardUtils.INSTANCE.getIconId(regular.getCard().getIcon()), composer2, i2), (String) null, SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(14)), 0.0f, 1, obj), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j3, 0, 2, null), composer, 432, 56);
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, notificationCardStyle.getSpacing().m21849getHeaderHorizontalSpacingD9Ej5fM()), composer, i2);
        TextStyle title = notificationCardStyle.getTypography().getTitle();
        FontWeight bold = FontWeight.INSTANCE.getBold();
        String title2 = regular.getCard().getTitle();
        TextAlign.Companion companion5 = TextAlign.INSTANCE;
        int iM7924getStarte0LSkKk = companion5.m7924getStarte0LSkKk();
        TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
        int iM7959getEllipsisgIe3tQ8 = companion6.m7959getEllipsisgIe3tQ8();
        LineHeightStyle.Trim.Companion companion7 = LineHeightStyle.Trim.INSTANCE;
        boolean z2 = i2;
        BentoText2.m20747BentoText38GnDrw(title2, null, Color.m6701boximpl(j3), null, bold, null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), iM7959getEllipsisgIe3tQ8, false, 1, 0, null, companion7.m7910getLastLineBottomEVpEnUU(), title, composer, 817913856, 0, 3370);
        Composer composer4 = composer;
        Instant time = regular.getCard().getTime();
        composer4.startReplaceGroup(951539184);
        if (time != null) {
            Duration durationSince = Durations.since(time);
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String narrow = DurationFormatter.formatNarrow(resources, durationSince, z2);
            Spacer2.Spacer(PaddingKt.m5146paddingqDBjuR0$default(companion2, notificationCardStyle.getSpacing().m21849getHeaderHorizontalSpacingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), composer4, z2 ? 1 : 0);
            BentoText2.m20747BentoText38GnDrw(narrow, null, Color.m6701boximpl(j3), null, null, null, TextAlign.m7912boximpl(companion5.m7924getStarte0LSkKk()), companion6.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, companion7.m7910getLastLineBottomEVpEnUU(), notificationCardStyle.getTypography().getTimeTextStyle(), composer, 817889280, 0, 3386);
            composer4 = composer;
            Unit unit2 = Unit.INSTANCE;
        }
        composer4.endReplaceGroup();
        composer4.endNode();
        Spacer2.Spacer(Row5.weight$default(row63, companion2, 1.0f, false, 2, null), composer4, z2 ? 1 : 0);
        composer4.startReplaceGroup(1216293183);
        if (regular.getCard().getFixed()) {
            regular2 = regular;
        } else {
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOSE_16);
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5142padding3ABfNKs(companion2, notificationCardStyle.getSpacing().m21843getCloseButtonPaddingD9Ej5fM()), NotificationCardComposable.dismissButtonTestTag(regular.getId()));
            composer4.startReplaceGroup(-1224400529);
            boolean zChanged = composer4.changed(z) | composer4.changedInstance(eventLogger);
            regular2 = regular;
            boolean zChangedInstance = zChanged | composer4.changedInstance(regular2) | composer4.changed(function0);
            Object objRememberedValue = composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationCardComposable2.invoke$lambda$11$lambda$10$lambda$5$lambda$4$lambda$3(z, eventLogger, regular2, function0);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue);
            }
            composer4.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size16, null, j3, modifierTestTag, (Function0) objRememberedValue, false, composer4, BentoIcon4.Size16.$stable | 48, 32);
        }
        composer4.endReplaceGroup();
        composer4.endNode();
        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), ScrollKt.rememberScrollState(z2 ? 1 : 0, composer4, z2 ? 1 : 0, 1), false, null, false, 14, null), 0.0f, 0.0f, notificationCardStyle.getSpacing().m21851getMessageEndPaddingD9Ej5fM(), 0.0f, 11, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer4, z2 ? 1 : 0);
        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, z2 ? 1 : 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default3);
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        if (composer4.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer4.startReusableNode();
        if (composer4.getInserting()) {
            composer4.createNode(constructor5);
        } else {
            composer4.useNode();
        }
        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
        if (((Boolean) composer4.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            composer4.startReplaceGroup(1280873428);
            regular3 = regular2;
            companion = companion2;
            BentoText2.m20747BentoText38GnDrw(regular2.getCard().getMessage(), null, Color.m6701boximpl(notificationCardStyle.getColors().m21829getMessageColor0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion5.m7924getStarte0LSkKk()), 0, false, 4, 0, null, 0, regular2.getCard().shouldUseLargeFont() ? notificationCardStyle.getTypography().getMessageLargeFont() : notificationCardStyle.getTypography().getMessageFont(), composer, 805306368, 0, 7610);
            composer3 = composer;
            composer3.endReplaceGroup();
        } else {
            companion = companion2;
            regular3 = regular2;
            composer4.startReplaceGroup(1281493242);
            AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, regular3.getCard().getMessage(), Color.m6701boximpl(notificationCardStyle.getColors().m21829getMessageColor0d7_KjU()), (FontStyle) null, (FontWeight) null, (TextDecoration) null, TextAlign.m7912boximpl(companion5.m7924getStarte0LSkKk()), 4, (Function1<? super TextLayoutResult, Unit>) null, regular3.getCard().shouldUseLargeFont() ? notificationCardStyle.getTypography().getMessageLargeFont() : notificationCardStyle.getTypography().getMessageFont(), 0.9f, 0.0f, composer, 12582912, 6, 2361);
            composer3 = composer;
            composer3.endReplaceGroup();
        }
        composer3.endNode();
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, notificationCardStyle.getSpacing().m21846getCtaTopSpacingD9Ej5fM()), composer3, 0);
        final Uri uri3 = uri;
        boolean z3 = (uri3 == null || (callToAction = regular3.getCard().getCallToAction()) == null || callToAction.length() == 0) ? false : true;
        Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f2), z3 ? notificationCardStyle.getSpacing().m21848getFooterBottomExtraPaddingD9Ej5fM() : C2002Dp.m7995constructorimpl(0), 3, null);
        MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getBottom(), composer3, 54);
        int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default4);
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        if (composer3.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor6);
        } else {
            composer3.useNode();
        }
        Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
        Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion4.getSetModifier());
        composer3.startReplaceGroup(-704610476);
        if (z3) {
            String callToAction2 = regular3.getCard().getCallToAction();
            if (callToAction2 == null) {
                callToAction2 = "";
            }
            long jM21827getCtaBtnColorOverride0d7_KjU = notificationCardStyle.getColors().m21827getCtaBtnColorOverride0d7_KjU();
            BentoTextButton3.Size size = BentoTextButton3.Size.f5147M;
            composer3.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer3.changed(function1) | composer3.changedInstance(uri3);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationCardComposable2.invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(function1, uri3);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue2);
            }
            composer3.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, callToAction2, null, null, size, false, Color.m6701boximpl(jM21827getCtaBtnColorOverride0d7_KjU), composer3, 24576, 44);
        }
        composer3.endReplaceGroup();
        Spacer2.Spacer(Row5.weight$default(row63, companion, 1.0f, false, 2, null), composer3, 0);
        BentoText2.m20747BentoText38GnDrw(regular3.getCountText(), null, Color.m6701boximpl(j3), null, null, null, TextAlign.m7912boximpl(companion5.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, notificationCardStyle.getTypography().getCountTextStyle(), composer, 0, 0, 8122);
        composer.endNode();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(column5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$5$lambda$4$lambda$3(boolean z, EventLogger eventLogger, NotificationCardComposable4.Regular regular, Function0 function0) {
        if (z) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.HOME, null, null, null, 14, null), new Component(Component.ComponentType.CLOSE_BUTTON, null, null, 6, null), null, regular.getEventContext(), false, 41, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(Function1 function1, Uri uri) {
        function1.invoke(uri);
        return Unit.INSTANCE;
    }
}
