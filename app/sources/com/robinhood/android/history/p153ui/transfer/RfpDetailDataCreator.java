package com.robinhood.android.history.p153ui.transfer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.RfpError;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.text.Spans;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: RfpDetailDataCreator.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0002J=\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\fJR\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010#0!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/RfpDetailDataCreator;", "", "<init>", "()V", "STUBBED_TEXT_APPEARENCE", "", "getPaymentInstrumentSubTitleDisplay", "", "Lcom/robinhood/models/db/AchRelationship;", "resources", "Landroid/content/res/Resources;", "pending", "", "getDisplayData", "Lcom/robinhood/android/history/ui/transfer/RfpTimelineInstantTransferDetailComponentDisplayData;", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "paymentInstrument", "positiveColor", "Landroidx/compose/ui/graphics/Color;", "incompleteColor", "warningColor", "getDisplayData-15-ZiRo", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/models/db/AchRelationship;Landroid/content/res/Resources;JJJ)Lcom/robinhood/android/history/ui/transfer/RfpTimelineInstantTransferDetailComponentDisplayData;", "getNonReadyPendingStateDisplayData", "Lcom/robinhood/android/history/ui/transfer/RfpInstantTransferNonReadyPendingPageData;", "context", "Landroid/content/Context;", "onDisclosureClicked", "Lkotlin/Function0;", "", "testing", "getDisclosureText", "Lkotlin/Pair;", "Landroid/text/SpannedString;", "Lcom/robinhood/models/util/Money;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiInstantBankTransfer;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class RfpDetailDataCreator {
    public static final int $stable = 0;
    public static final RfpDetailDataCreator INSTANCE = new RfpDetailDataCreator();
    private static final int STUBBED_TEXT_APPEARENCE = 1;

    /* compiled from: RfpDetailDataCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RfpError.values().length];
            try {
                iArr2[RfpError.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RfpError.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private RfpDetailDataCreator() {
    }

    static /* synthetic */ String getPaymentInstrumentSubTitleDisplay$default(RfpDetailDataCreator rfpDetailDataCreator, AchRelationship achRelationship, Resources resources, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return rfpDetailDataCreator.getPaymentInstrumentSubTitleDisplay(achRelationship, resources, z);
    }

    private final String getPaymentInstrumentSubTitleDisplay(AchRelationship achRelationship, Resources resources, boolean z) throws Resources.NotFoundException {
        CharSequence text;
        if (z) {
            text = AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship).getText(resources);
        } else {
            text = AchRelationships.getDisplayTitleResource(achRelationship).getText(resources);
        }
        return text.toString();
    }

    /* renamed from: getDisplayData-15-ZiRo, reason: not valid java name */
    public final RfpTimelineInstantTransferDetailComponentDisplayData m15251getDisplayData15ZiRo(PaymentTransfer transfer, AchRelationship paymentInstrument, Resources resources, long positiveColor, long incompleteColor, long warningColor) throws Resources.NotFoundException {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        Intrinsics.checkNotNullParameter(paymentInstrument, "paymentInstrument");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean zContains = CollectionsKt.listOf((Object[]) new TransferState[]{TransferState.NEW, TransferState.READY}).contains(transfer.getState());
        ArrayList arrayList = new ArrayList();
        if (zContains) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C18359R.string.rfp_sending_payment_request), Timeline.Status.ONGOING);
        } else {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C18359R.string.rfp_payment_request_sent), Timeline.Status.COMPLETE);
        }
        int iIntValue = ((Number) tuples2M3642to.component1()).intValue();
        Timeline.Status status = (Timeline.Status) tuples2M3642to.component2();
        Timeline.Position position = Timeline.Position.TOP;
        String string2 = resources.getString(iIntValue);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new RfpTimelineRowDisplayItem(status, position, string2, InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) transfer.getCreatedAt()), new Timeline.ColorOverrides(null, Color.m6701boximpl(positiveColor), null, null, Color.m6701boximpl(positiveColor), 13, null)));
        if (zContains) {
            Timeline.Status status2 = Timeline.Status.INCOMPLETE;
            Timeline.Position position2 = Timeline.Position.BETWEEN;
            String string3 = resources.getString(C18359R.string.rfp_complete_transfer_at_bank);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = resources.getString(C18359R.string.rfp_complete_transfer_at_bank_metadata);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new RfpTimelineRowDisplayItem(status2, position2, string3, string4, new Timeline.ColorOverrides(Color.m6701boximpl(incompleteColor), null, null, null, null, 30, null)));
        } else {
            Timeline.Status status3 = Timeline.Status.WARNING;
            Timeline.Position position3 = Timeline.Position.BETWEEN;
            String string5 = resources.getString(C18359R.string.rfp_complete_transfer_at_bank);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = resources.getString(C18359R.string.rfp_complete_transfer_at_bank_metadata);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            arrayList.add(new RfpTimelineRowDisplayItem(status3, position3, string5, string6, new Timeline.ColorOverrides(null, null, null, Color.m6701boximpl(warningColor), null, 23, null)));
        }
        Timeline.Status status4 = Timeline.Status.INCOMPLETE;
        Timeline.Position position4 = Timeline.Position.BOTTOM;
        String string7 = resources.getString(C18359R.string.rfp_deposit_completed);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = resources.getString(C18359R.string.rfp_deposit_completed_metadata);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new RfpTimelineRowDisplayItem(status4, position4, string7, string8, new Timeline.ColorOverrides(Color.m6701boximpl(incompleteColor), null, null, null, null, 30, null)));
        String string9 = resources.getString(C18359R.string.rfp_title_pending, Money.format$default(Money3.toMoney(transfer.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String paymentInstrumentSubTitleDisplay = getPaymentInstrumentSubTitleDisplay(paymentInstrument, resources, true);
        String string10 = resources.getString(C18359R.string.rfp_disclaimer_text);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        return new RfpTimelineInstantTransferDetailComponentDisplayData(string9, paymentInstrumentSubTitleDisplay, arrayList, string10);
    }

    public static /* synthetic */ RfpInstantTransferNonReadyPendingPageData getNonReadyPendingStateDisplayData$default(RfpDetailDataCreator rfpDetailDataCreator, Context context, PaymentTransfer paymentTransfer, AchRelationship achRelationship, Resources resources, Function0 function0, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return rfpDetailDataCreator.getNonReadyPendingStateDisplayData(context, paymentTransfer, achRelationship, resources, function0, z);
    }

    public final RfpInstantTransferNonReadyPendingPageData getNonReadyPendingStateDisplayData(Context context, PaymentTransfer transfer, AchRelationship paymentInstrument, Resources resources, Function0<Unit> onDisclosureClicked, boolean testing) throws Resources.NotFoundException {
        int i;
        String str;
        String str2;
        String string2;
        ApiPaymentTransferDetails.ApiInstantBankTransfer apiInstantBankTransfer;
        RfpDetailDataCreator rfpDetailDataCreator;
        Resources resources2;
        Context context2;
        PaymentTransfer paymentTransfer;
        Function0<Unit> function0;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        String str3;
        String accountNameTitle;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        Intrinsics.checkNotNullParameter(paymentInstrument, "paymentInstrument");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(onDisclosureClicked, "onDisclosureClicked");
        int i2 = WhenMappings.$EnumSwitchMapping$0[transfer.getAdjustment().getDirection().ordinal()];
        if (i2 == 1) {
            i = C18359R.string.instant_transfer_debit_subtitle;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C18359R.string.instant_transfer_credit_subtitle;
        }
        String string3 = resources.getString(i, Money.format$default(Money3.toMoney(transfer.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String paymentInstrumentSubTitleDisplay$default = getPaymentInstrumentSubTitleDisplay$default(this, paymentInstrument, resources, false, 2, null);
        PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = transfer.getOriginatingTransferAccountInfo();
        String str4 = "";
        if (originatingTransferAccountInfo == null || (accountNameTitle = originatingTransferAccountInfo.getAccountNameTitle()) == null) {
            str = string3;
            str2 = "";
        } else {
            str = string3;
            str2 = accountNameTitle;
        }
        GoldDepositBoostTransferDetail dbModel = null;
        if (CollectionsKt.listOf((Object[]) new TransferState[]{TransferState.FAILED, TransferState.PAUSED}).contains(transfer.getState())) {
            ApiPaymentTransferDetails details = transfer.getDetails();
            ApiPaymentTransferDetails.ApiInstantBankTransfer apiInstantBankTransfer2 = details instanceof ApiPaymentTransferDetails.ApiInstantBankTransfer ? (ApiPaymentTransferDetails.ApiInstantBankTransfer) details : null;
            if (apiInstantBankTransfer2 == null || (string2 = apiInstantBankTransfer2.getError_details()) == null) {
                string2 = resources.getString(UtilsKt.getLabelResId(transfer.getState()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        } else {
            string2 = resources.getString(UtilsKt.getLabelResId(transfer.getState()));
            Intrinsics.checkNotNull(string2);
        }
        String str5 = string2;
        ApiPaymentTransferDetails details2 = transfer.getDetails();
        if (details2 instanceof ApiPaymentTransferDetails.ApiInstantBankTransfer) {
            apiInstantBankTransfer = (ApiPaymentTransferDetails.ApiInstantBankTransfer) details2;
            resources2 = resources;
            context2 = context;
            paymentTransfer = transfer;
            function0 = onDisclosureClicked;
            rfpDetailDataCreator = this;
        } else {
            apiInstantBankTransfer = null;
            rfpDetailDataCreator = this;
            resources2 = resources;
            context2 = context;
            paymentTransfer = transfer;
            function0 = onDisclosureClicked;
        }
        Tuples2<SpannedString, Money> disclosureText = rfpDetailDataCreator.getDisclosureText(context2, paymentTransfer, apiInstantBankTransfer, resources2, function0, testing);
        SpannedString spannedStringComponent1 = disclosureText.component1();
        Money moneyComponent2 = disclosureText.component2();
        String string4 = resources2.getString(C18359R.string.rfp_sub_header_details, paymentInstrumentSubTitleDisplay$default);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        Instant initiatedAt = transfer.getInitiatedAt();
        InstantFormatter instantFormatter = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE;
        String str6 = instantFormatter.format((InstantFormatter) initiatedAt);
        Instant updatedAt = transfer.getUpdatedAt();
        if (updatedAt != null && (str3 = instantFormatter.format((InstantFormatter) updatedAt)) != null) {
            str4 = str3;
        }
        ApiPaymentTransferDetails details3 = transfer.getDetails();
        ApiPaymentTransferDetails.ApiInstantBankTransfer apiInstantBankTransfer3 = details3 instanceof ApiPaymentTransferDetails.ApiInstantBankTransfer ? (ApiPaymentTransferDetails.ApiInstantBankTransfer) details3 : null;
        if (apiInstantBankTransfer3 != null && (gold_deposit_boost = apiInstantBankTransfer3.getGold_deposit_boost()) != null) {
            dbModel = GoldDepositBoostTransferDetail2.toDbModel(gold_deposit_boost);
        }
        return new RfpInstantTransferNonReadyPendingPageData(str, string4, str5, paymentInstrumentSubTitleDisplay$default, str2, str6, str4, moneyComponent2, spannedStringComponent1, dbModel);
    }

    static /* synthetic */ Tuples2 getDisclosureText$default(RfpDetailDataCreator rfpDetailDataCreator, Context context, PaymentTransfer paymentTransfer, ApiPaymentTransferDetails.ApiInstantBankTransfer apiInstantBankTransfer, Resources resources, Function0 function0, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return rfpDetailDataCreator.getDisclosureText(context, paymentTransfer, apiInstantBankTransfer, resources, function0, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.text.SpannedString] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, android.text.SpannedString] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, android.text.SpannedString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Tuples2<SpannedString, Money> getDisclosureText(Context context, PaymentTransfer transfer, ApiPaymentTransferDetails.ApiInstantBankTransfer details, Resources resources, final Function0<Unit> onDisclosureClicked, boolean testing) throws Resources.NotFoundException {
        int iIntValue;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Money money = null;
        if (details != null) {
            BigDecimal requested_amount = details.getRequested_amount();
            if (requested_amount != null && !Intrinsics.areEqual(requested_amount, transfer.getAmount())) {
                money = new Money(Currencies.USD, requested_amount);
            }
            RfpError rfp_error_state = details.getRfp_error_state();
            int i = rfp_error_state == null ? -1 : WhenMappings.$EnumSwitchMapping$1[rfp_error_state.ordinal()];
            final boolean z = true;
            if (i == -1) {
                BigDecimal requested_amount2 = details.getRequested_amount();
                if (Intrinsics.areEqual(details.getSource_transfer_id(), transfer.getId().toString())) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (testing) {
                        iIntValue = 1;
                    } else {
                        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, C20690R.attr.textAppearanceRegularMedium);
                        if (themeAttribute == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        iIntValue = themeAttribute.intValue();
                    }
                    TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, iIntValue);
                    Object[] objArr = {textAppearanceSpan, new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2())};
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) resources.getString(C18359R.string.rfp_multiple_acceptances_disclosure));
                    for (int i2 = 0; i2 < 2; i2++) {
                        spannableStringBuilder.setSpan(objArr[i2], length, spannableStringBuilder.length(), 17);
                    }
                    Object[] objArr2 = {textAppearanceSpan, new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1())};
                    int length2 = spannableStringBuilder.length();
                    String string2 = resources.getString(C18359R.string.rfp_multiple_acceptances_view_transfer_clickable);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans = Spans.INSTANCE;
                    ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.history.ui.transfer.RfpDetailDataCreator$getDisclosureText$lambda$8$lambda$5$lambda$4$$inlined$appendClickableSpan$default$1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                            textPaint.setColor(textPaint.linkColor);
                            textPaint.setUnderlineText(z);
                            if (z) {
                                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                            }
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            onDisclosureClicked.invoke();
                        }
                    };
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) string2);
                    spannableStringBuilder.setSpan(clickableSpan, length3, spannableStringBuilder.length(), 17);
                    for (int i3 = 0; i3 < 2; i3++) {
                        spannableStringBuilder.setSpan(objArr2[i3], length2, spannableStringBuilder.length(), 17);
                    }
                    objectRef.element = new SpannedString(spannableStringBuilder);
                } else if (requested_amount2 != null && !Intrinsics.areEqual(requested_amount2, transfer.getAmount())) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2());
                    int length4 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) resources.getString(C18359R.string.rfp_requested_amount_disclosure, Money.format$default(Money3.toMoney(requested_amount2, transfer.getCurrency().getMoneyCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(Money3.toMoney(transfer.getAmount(), transfer.getCurrency().getMoneyCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
                    spannableStringBuilder2.setSpan(themableColorSpans3, length4, spannableStringBuilder2.length(), 17);
                    objectRef.element = new SpannedString(spannableStringBuilder2);
                }
            } else if (i == 1) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                ThemableColorSpans3 themableColorSpans32 = new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2());
                int length5 = spannableStringBuilder3.length();
                spannableStringBuilder3.append((CharSequence) resources.getString(C18359R.string.rfp_expired_disclosure));
                spannableStringBuilder3.setSpan(themableColorSpans32, length5, spannableStringBuilder3.length(), 17);
                objectRef.element = new SpannedString(spannableStringBuilder3);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal requested_amount22 = details.getRequested_amount();
                if (Intrinsics.areEqual(details.getSource_transfer_id(), transfer.getId().toString())) {
                }
            }
        }
        return Tuples4.m3642to(objectRef.element, money);
    }
}
