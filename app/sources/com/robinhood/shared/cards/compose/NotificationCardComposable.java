package com.robinhood.shared.cards.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.NotificationCardStyle;
import com.robinhood.models.card.api.ApiCard;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.card.p311db.CardAsset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.cards.compose.NotificationCardComposable;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationCardComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"NotificationCardComposable", "", "state", "Lcom/robinhood/shared/cards/compose/NotificationCardState$Regular;", "isTopCard", "", "onDismissClicked", "Lkotlin/Function0;", "onCardClick", "Lkotlin/Function1;", "Landroid/net/Uri;", "modifier", "Landroidx/compose/ui/Modifier;", "contentStartSpacingWithSideImage", "Landroidx/compose/ui/unit/Dp;", "NotificationCardComposable-HYR8e34", "(Lcom/robinhood/shared/cards/compose/NotificationCardState$Regular;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "NotificationCardComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "dismissButtonTestTag", "", "id", "lib-cards-compose_externalDebug", "bgColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.NotificationCardComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class NotificationCardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCardComposablePreview$lambda$7(int i, Composer composer, int i2) {
        NotificationCardComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCardComposable_HYR8e34$lambda$6(NotificationCardComposable4.Regular regular, boolean z, Function0 function0, Function1 function1, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m24779NotificationCardComposableHYR8e34(regular, z, function0, function1, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final long NotificationCardComposable_HYR8e34$lambda$1(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
    /* renamed from: NotificationCardComposable-HYR8e34, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24779NotificationCardComposableHYR8e34(final NotificationCardComposable4.Regular state, boolean z, final Function0<Unit> onDismissClicked, final Function1<? super Uri, Unit> onCardClick, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        Color composeColor;
        final boolean z2;
        final float f3;
        final Modifier modifier3;
        Uri uri;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1204058147);
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
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z2 = z;
                    f3 = f2;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(12) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1204058147, i3, -1, "com.robinhood.shared.cards.compose.NotificationCardComposable (NotificationCardComposable.kt:88)");
                    }
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    NotificationCardStyle notificationCardStyle = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCardStackStyle(composerStartRestartGroup, 0).getNotificationCardStyle(composerStartRestartGroup, 0);
                    String strNullIfEmpty = StringsKt.nullIfEmpty(state.getCard().getDeeplinkUri());
                    final Uri uri2 = (strNullIfEmpty == null && (uri = Uri.parse(strNullIfEmpty)) != null && navigator.isDeepLinkSupported(uri)) ? uri : null;
                    long jM21826getContentTintColor0d7_KjU = notificationCardStyle.getColors().m21826getContentTintColor0d7_KjU();
                    composeColor = SduiColors2.toComposeColor(!z ? state.getCardColorOnTop() : state.getCardColorWhenHidden(), composerStartRestartGroup, 0);
                    if (composeColor != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(composeColor.getValue(), null, "cardBgColorAnimationLabel", null, composerStartRestartGroup, 384, 10);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, 0.0f, notificationCardStyle.getColors().m21828getIndicationColor0d7_KjU(), 3, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    Modifier modifier4 = modifier2;
                    boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(uri2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NotificationCardComposable.NotificationCardComposable_HYR8e34$lambda$4$lambda$3(current, state, onCardClick, uri2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Uri uri3 = uri2;
                    int i6 = i3;
                    Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4891clickableO2vRcR0$default(modifier4, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, z, null, null, (Function0) objRememberedValue2, 24, null), state.getId());
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    long jNotificationCardComposable_HYR8e34$lambda$1 = NotificationCardComposable_HYR8e34$lambda$1(snapshotState4M4805animateColorAsStateeuL9pac);
                    int i7 = CardDefaults.$stable;
                    CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jNotificationCardComposable_HYR8e34$lambda$1, 0L, 0L, 0L, composerStartRestartGroup, i7 << 12, 14);
                    BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl((float) 0.5d), notificationCardStyle.getColors().m21825getBorderColor0d7_KjU());
                    CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i7 << 18) | 6, 62);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(notificationCardStyle.getSpacing().m21842getCardRadiusD9Ej5fM());
                    float f4 = fM7995constructorimpl;
                    NotificationCardComposable2 notificationCardComposable2 = new NotificationCardComposable2(state, f4, notificationCardStyle, context, uri3, jM21826getContentTintColor0d7_KjU, z, current, onDismissClicked, onCardClick);
                    z2 = z;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1653682837, true, notificationCardComposable2, composerStartRestartGroup, 54);
                    composerStartRestartGroup = composerStartRestartGroup;
                    CardKt.Card(modifierTestTag, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, borderStrokeM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda, composerStartRestartGroup, 196608, 0);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = ((i6 & 112) == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(state);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new NotificationCardComposable3(z2, current, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i6 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = f4;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NotificationCardComposable.NotificationCardComposable_HYR8e34$lambda$6(state, z2, onDismissClicked, onCardClick, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            f2 = f;
            if ((74899 & i3) == 74898) {
                if (i5 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                NotificationCardStyle notificationCardStyle2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCardStackStyle(composerStartRestartGroup, 0).getNotificationCardStyle(composerStartRestartGroup, 0);
                String strNullIfEmpty2 = StringsKt.nullIfEmpty(state.getCard().getDeeplinkUri());
                if (strNullIfEmpty2 == null) {
                    long jM21826getContentTintColor0d7_KjU2 = notificationCardStyle2.getColors().m21826getContentTintColor0d7_KjU();
                    composeColor = SduiColors2.toComposeColor(!z ? state.getCardColorOnTop() : state.getCardColorWhenHidden(), composerStartRestartGroup, 0);
                    if (composeColor != null) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        f2 = f;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationCardComposable_HYR8e34$lambda$4$lambda$3(EventLogger eventLogger, NotificationCardComposable4.Regular regular, Function1 function1, Uri uri) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.NOTIFICATION_CARD, regular.getCard().getType(), null, 4, null), null, regular.getEventContext(), false, 43, null);
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    @SuppressLint({"NowWithoutClock"})
    private static final void NotificationCardComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1544601985);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1544601985, i, -1, "com.robinhood.shared.cards.compose.NotificationCardComposablePreview (NotificationCardComposable.kt:328)");
            }
            final NotificationCardComposable4.Regular regular = new NotificationCardComposable4.Regular(new Card("6c1b4b8f44a96f58eade548f28c107f4", "70c8abf1-b12d-48ad-9fde-49016e4c7c08", "Learn more", "robinhood-global://referral_landing", false, "normal", Card.Icon.STAR, "6c1b4b8f44a96f58eade548f28c107f4", "This message is meant to be a very long piece of text to simulate multiple lines. After a certain point this is supposed to start scrolling as well. Especially if accessibility settings have been changed.", false, null, new Card.SideImage("", 110), null, "Card title", "crypto_eu_referral_refer_one_get_five_promo", ApiCard.CardCategory.NO_CATEGORY), CardAsset.Tint.GREEN, "1 of 3", new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null), com.robinhood.models.serverdriven.experimental.api.Color.f5843BG, com.robinhood.models.serverdriven.experimental.api.Color.BG2);
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-1418062271, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt.NotificationCardComposablePreview.1

                /* compiled from: NotificationCardComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposablePreview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ NotificationCardComposable4.Regular $regularCard;

                    AnonymousClass1(NotificationCardComposable4.Regular regular) {
                        this.$regularCard = regular;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1674242041, i, -1, "com.robinhood.shared.cards.compose.NotificationCardComposablePreview.<anonymous>.<anonymous> (NotificationCardComposable.kt:365)");
                        }
                        NotificationCardComposable4.Regular regular = this.$regularCard;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue == companion3.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposablePreview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion3.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$NotificationCardComposablePreview$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NotificationCardComposable.C373691.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2((Uri) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        NotificationCardComposable.m24779NotificationCardComposableHYR8e34(regular, true, function0, (Function1) objRememberedValue2, SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_3d_item_height_tall, composer, 0)), 0.0f, composer, 3504, 32);
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
                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Uri uri) {
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-1418062271, i2, -1, "com.robinhood.shared.cards.compose.NotificationCardComposablePreview.<anonymous> (NotificationCardComposable.kt:364)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1674242041, true, new AnonymousClass1(regular), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.compose.NotificationCardComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationCardComposable.NotificationCardComposablePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String dismissButtonTestTag(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return "dismissButtonTestTag" + id;
    }
}
