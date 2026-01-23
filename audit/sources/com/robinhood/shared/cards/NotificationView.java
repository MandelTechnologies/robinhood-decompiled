package com.robinhood.shared.cards;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.TemporaryServerToBentoColorMapper2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.cards.C31879R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.compose.utils.CardUtils;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: NotificationView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 92\u00020\u0001:\u00019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020/H\u0002J\b\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020/H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u00107\u001a\u000208H\u0002R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001c\u0010\u0016R\u001b\u0010\u001e\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u0016R\u001b\u0010!\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b\"\u0010\u0011R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b*\u0010'R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "cardView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon$delegate", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "messageTxt", "getMessageTxt", "messageTxt$delegate", "timeTxt", "getTimeTxt", "timeTxt$delegate", "actionBtn", "getActionBtn", "actionBtn$delegate", "dismissBtn", "getDismissBtn", "dismissBtn$delegate", "textSize", "", "getTextSize", "()F", "textSize$delegate", "textSizeLarge", "getTextSizeLarge", "textSizeLarge$delegate", "useLargeFont", "", "bind", "", "notificationCard", "Lcom/robinhood/shared/cards/ServerCard;", "callbacks", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "applyRhdMarginStyle", "applyGoldStyle", "applySlipStyle", "card", "Lcom/robinhood/models/card/db/Card;", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public class NotificationView extends FrameLayout {

    /* renamed from: actionBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 actionBtn;

    /* renamed from: cardView$delegate, reason: from kotlin metadata */
    private final Interfaces2 cardView;

    /* renamed from: dismissBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 dismissBtn;

    /* renamed from: icon$delegate, reason: from kotlin metadata */
    private final Interfaces2 icon;

    /* renamed from: messageTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageTxt;

    /* renamed from: textSize$delegate, reason: from kotlin metadata */
    private final Interfaces2 textSize;

    /* renamed from: textSizeLarge$delegate, reason: from kotlin metadata */
    private final Interfaces2 textSizeLarge;

    /* renamed from: timeTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 timeTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    private boolean useLargeFont;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationView.class, "cardView", "getCardView()Landroidx/cardview/widget/CardView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "icon", "getIcon()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "messageTxt", "getMessageTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "timeTxt", "getTimeTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "actionBtn", "getActionBtn()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "dismissBtn", "getDismissBtn()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "textSize", "getTextSize()F", 0)), Reflection.property1(new PropertyReference1Impl(NotificationView.class, "textSizeLarge", "getTextSizeLarge()F", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.cardView = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_card, null, 2, null);
        this.icon = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_icon, null, 2, null);
        this.titleTxt = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_title_txt, null, 2, null);
        this.messageTxt = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_message_txt, null, 2, null);
        this.timeTxt = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_time_txt, null, 2, null);
        this.actionBtn = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_action_btn, null, 2, null);
        this.dismissBtn = BindViewDelegate2.bindView$default(this, C31879R.id.notificationview_dismiss_btn, null, 2, null);
        this.textSize = BindResourcesKt.bindDimen(this, C31879R.dimen.card_text_size);
        this.textSizeLarge = BindResourcesKt.bindDimen(this, C31879R.dimen.card_text_size_large);
        setClipChildren(false);
        setClipToPadding(false);
    }

    protected final CardView getCardView() {
        return (CardView) this.cardView.getValue(this, $$delegatedProperties[0]);
    }

    protected final ImageView getIcon() {
        return (ImageView) this.icon.getValue(this, $$delegatedProperties[1]);
    }

    protected final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[2]);
    }

    protected final TextView getMessageTxt() {
        return (TextView) this.messageTxt.getValue(this, $$delegatedProperties[3]);
    }

    protected final TextView getTimeTxt() {
        return (TextView) this.timeTxt.getValue(this, $$delegatedProperties[4]);
    }

    protected final TextView getActionBtn() {
        return (TextView) this.actionBtn.getValue(this, $$delegatedProperties[5]);
    }

    protected final ImageView getDismissBtn() {
        return (ImageView) this.dismissBtn.getValue(this, $$delegatedProperties[6]);
    }

    private final float getTextSize() {
        return ((Number) this.textSize.getValue(this, $$delegatedProperties[7])).floatValue();
    }

    private final float getTextSizeLarge() {
        return ((Number) this.textSizeLarge.getValue(this, $$delegatedProperties[8])).floatValue();
    }

    public void bind(final ServerCard notificationCard, final NotificationCard.Callbacks callbacks) {
        String callToAction;
        Intrinsics.checkNotNullParameter(notificationCard, "notificationCard");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Card card = notificationCard.getCard();
        if (card.isGoldSplash()) {
            applyGoldStyle();
        }
        getTitleTxt().setText(card.getTitle());
        if (card.getTime() != null) {
            Instant time = card.getTime();
            Intrinsics.checkNotNull(time);
            Duration durationSince = Durations.since(time);
            TextView timeTxt = getTimeTxt();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            timeTxt.setText(DurationFormatter.formatNarrow(resources, durationSince, false));
        }
        final TextView actionBtn = getActionBtn();
        if (notificationCard.isClickable() && (callToAction = card.getCallToAction()) != null && callToAction.length() != 0) {
            actionBtn.setText(card.getCallToAction());
            actionBtn.setVisibility(0);
            actionBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.cards.NotificationView$bind$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ServerCard serverCard = notificationCard;
                    Context context = actionBtn.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    serverCard.onClicked(context);
                }
            });
        } else {
            actionBtn.setVisibility(8);
        }
        getMessageTxt().setText(card.getMessage());
        getMessageTxt().setTextSize(0, getTextSize(card));
        getIcon().setImageResource(CardUtils.INSTANCE.getIconId(card.getIcon()));
        this.useLargeFont = card.shouldUseLargeFont();
        getMessageTxt().setMaxLines(this.useLargeFont ? 2 : 3);
        getDismissBtn().setVisibility(notificationCard.getShowDismissBtn() ? 0 : 8);
        OnClickListeners.onClick(getDismissBtn(), new Function0() { // from class: com.robinhood.shared.cards.NotificationView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationView.bind$lambda$1(callbacks, notificationCard);
            }
        });
        if (card.isSlip5k()) {
            applySlipStyle();
        } else if (card.isRhdMargin()) {
            applyRhdMarginStyle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(NotificationCard.Callbacks callbacks, ServerCard serverCard) {
        callbacks.onDismissSelf();
        callbacks.onDismissButtonTap(serverCard);
        return Unit.INSTANCE;
    }

    private final void applyRhdMarginStyle() {
        CardView cardView = getCardView();
        SelectorResource.Companion companion = SelectorResource.INSTANCE;
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(cardView, R.attr.backgroundTint, TemporaryServerToBentoColorMapper2.dayNightColorSelector(companion, new ThemedResourceReference(color, C13997R.attr.paletteColorJoule), new ThemedResourceReference(color, C13997R.attr.paletteColorJoule)));
        int i = C20690R.color.mobius_nova;
        ScarletManager2.overrideAttribute(getTitleTxt(), R.attr.textColor, new ResourceValue(color, Integer.valueOf(getContext().getColor(i))));
        ScarletManager2.overrideAttribute(getMessageTxt(), R.attr.textColor, new ResourceValue(color, Integer.valueOf(getContext().getColor(i))));
        ScarletManager2.overrideAttribute(getActionBtn(), R.attr.textColor, new ResourceValue(color, Integer.valueOf(getContext().getColor(i))));
        getIcon().setColorFilter(getContext().getColor(i));
    }

    private final void applyGoldStyle() {
        CardView cardView = getCardView();
        SelectorResource.Companion companion = SelectorResource.INSTANCE;
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(cardView, R.attr.backgroundTint, TemporaryServerToBentoColorMapper2.dayNightColorSelector(companion, new ThemedResourceReference(color, C13997R.attr.paletteColorSolLight), new ThemedResourceReference(color, C20690R.attr.colorBackground1)));
    }

    private final void applySlipStyle() throws Resources.NotFoundException {
        int i;
        int i2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zIsDay = DayNightChanges.isDay(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context)));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (zIsDay) {
            i = C13997R.attr.paletteColorBiome;
        } else {
            i = C13997R.attr.paletteColorPrime;
        }
        int themeColor = ThemeColors.getThemeColor(context2, i);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        if (zIsDay) {
            i2 = C13997R.attr.paletteColorPrime;
        } else {
            i2 = C13997R.attr.paletteColorXRayLight;
        }
        int themeColor2 = ThemeColors.getThemeColor(context3, i2);
        getTitleTxt().measure(0, 0);
        getTitleTxt().getPaint().setShader(new LinearGradient(0.0f, 0.0f, getTitleTxt().getMeasuredWidth() / 2, 0.0f, themeColor, themeColor2, Shader.TileMode.MIRROR));
        getIcon().setColorFilter(themeColor);
    }

    private final float getTextSize(Card card) {
        return card.shouldUseLargeFont() ? getTextSizeLarge() : getTextSize();
    }

    /* compiled from: NotificationView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/cards/NotificationView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/cards/NotificationView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Companion implements Inflater<NotificationView> {
        private final /* synthetic */ Inflater<NotificationView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C31879R.layout.include_notification_view);
        }
    }
}
