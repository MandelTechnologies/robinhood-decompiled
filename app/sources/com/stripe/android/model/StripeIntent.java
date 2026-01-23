package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.utils.StripeUrlUtils;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeIntent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002 !¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/core/model/StripeModel;", "", "requiresAction", "()Z", "", "getId", "()Ljava/lang/String;", "id", "isLiveMode", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "getClientSecret", "clientSecret", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "status", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionData", "NextActionData", "NextActionType", "Status", "Usage", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/SetupIntent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface StripeIntent extends StripeModel {
    String getClientSecret();

    String getId();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    Status getStatus();

    /* renamed from: isLiveMode */
    boolean getIsLiveMode();

    boolean requiresAction();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "UpiAwaitNotification", "CashAppRedirect", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "SwishRedirect", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class NextActionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NextActionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final NextActionType RedirectToUrl = new NextActionType("RedirectToUrl", 0, "redirect_to_url");
        public static final NextActionType UseStripeSdk = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");
        public static final NextActionType DisplayOxxoDetails = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");
        public static final NextActionType AlipayRedirect = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");
        public static final NextActionType BlikAuthorize = new NextActionType("BlikAuthorize", 4, "blik_authorize");
        public static final NextActionType WeChatPayRedirect = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");
        public static final NextActionType VerifyWithMicrodeposits = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");
        public static final NextActionType UpiAwaitNotification = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");
        public static final NextActionType CashAppRedirect = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");
        public static final NextActionType DisplayBoletoDetails = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");
        public static final NextActionType DisplayKonbiniDetails = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");
        public static final NextActionType DisplayMultibancoDetails = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");
        public static final NextActionType SwishRedirect = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        private static final /* synthetic */ NextActionType[] $values() {
            return new NextActionType[]{RedirectToUrl, UseStripeSdk, DisplayOxxoDetails, AlipayRedirect, BlikAuthorize, WeChatPayRedirect, VerifyWithMicrodeposits, UpiAwaitNotification, CashAppRedirect, DisplayBoletoDetails, DisplayKonbiniDetails, DisplayMultibancoDetails, SwishRedirect};
        }

        public static EnumEntries<NextActionType> getEntries() {
            return $ENTRIES;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) $VALUES.clone();
        }

        private NextActionType(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            NextActionType[] nextActionTypeArr$values = $values();
            $VALUES = nextActionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nextActionTypeArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NextActionType fromCode$payments_core_release(String code) {
                NextActionType next;
                Iterator<NextActionType> it = NextActionType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Status Canceled = new Status("Canceled", 0, "canceled");
        public static final Status Processing = new Status("Processing", 1, "processing");
        public static final Status RequiresAction = new Status("RequiresAction", 2, "requires_action");
        public static final Status RequiresConfirmation = new Status("RequiresConfirmation", 3, "requires_confirmation");
        public static final Status RequiresPaymentMethod = new Status("RequiresPaymentMethod", 4, "requires_payment_method");
        public static final Status Succeeded = new Status("Succeeded", 5, "succeeded");
        public static final Status RequiresCapture = new Status("RequiresCapture", 6, "requires_capture");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Canceled, Processing, RequiresAction, RequiresConfirmation, RequiresPaymentMethod, Succeeded, RequiresCapture};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        private Status(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Status;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Status fromCode$payments_core_release(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeIntent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "OnSession", "OffSession", "OneTime", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Usage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Usage[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Usage OnSession = new Usage("OnSession", 0, "on_session");
        public static final Usage OffSession = new Usage("OffSession", 1, "off_session");
        public static final Usage OneTime = new Usage("OneTime", 2, "one_time");

        private static final /* synthetic */ Usage[] $values() {
            return new Usage[]{OnSession, OffSession, OneTime};
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) $VALUES.clone();
        }

        private Usage(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Usage[] usageArr$values = $values();
            $VALUES = usageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(usageArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Usage;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Usage fromCode$payments_core_release(String code) {
                Usage next;
                Iterator<Usage> it = Usage.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }
    }

    /* compiled from: StripeIntent.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/core/model/StripeModel;", "()V", "AlipayRedirect", "BlikAuthorize", "CashAppRedirect", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "DisplayOxxoDetails", "DisplayVoucherDetails", "RedirectToUrl", "SdkData", "SwishRedirect", "UpiAwaitNotification", "VerifyWithMicrodeposits", "WeChatPayRedirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayBoletoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayKonbiniDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayMultibancoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class NextActionData implements StripeModel {

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "hostedVoucherUrl", "", "getHostedVoucherUrl", "()Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public interface DisplayVoucherDetails {
            String getHostedVoucherUrl();
        }

        public /* synthetic */ NextActionData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NextActionData() {
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "expiresAfter", "", InquiryField.FloatField.TYPE2, "hostedVoucherUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getExpiresAfter", "Ljava/lang/String;", "getNumber", "getHostedVoucherUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DisplayOxxoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new Creator();
            private final int expiresAfter;
            private final String hostedVoucherUrl;
            private final String number;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayOxxoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails[] newArray(int i) {
                    return new DisplayOxxoDetails[i];
                }
            }

            public DisplayOxxoDetails() {
                this(0, null, null, 7, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayOxxoDetails)) {
                    return false;
                }
                DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) other;
                return this.expiresAfter == displayOxxoDetails.expiresAfter && Intrinsics.areEqual(this.number, displayOxxoDetails.number) && Intrinsics.areEqual(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.expiresAfter + ", number=" + this.number + ", hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(this.expiresAfter);
                parcel.writeString(this.number);
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayOxxoDetails(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayOxxoDetails(int i, String str, String str2) {
                super(null);
                this.expiresAfter = i;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayBoletoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHostedVoucherUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DisplayBoletoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayBoletoDetails> CREATOR = new Creator();
            private final String hostedVoucherUrl;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayBoletoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayBoletoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayBoletoDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayBoletoDetails[] newArray(int i) {
                    return new DisplayBoletoDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayBoletoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayBoletoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayBoletoDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayBoletoDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayBoletoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayKonbiniDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHostedVoucherUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DisplayKonbiniDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayKonbiniDetails> CREATOR = new Creator();
            private final String hostedVoucherUrl;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayKonbiniDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayKonbiniDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayKonbiniDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayKonbiniDetails[] newArray(int i) {
                    return new DisplayKonbiniDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayKonbiniDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayKonbiniDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayKonbiniDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayKonbiniDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayKonbiniDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayMultibancoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "", "hostedVoucherUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHostedVoucherUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DisplayMultibancoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayMultibancoDetails> CREATOR = new Creator();
            private final String hostedVoucherUrl;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DisplayMultibancoDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayMultibancoDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DisplayMultibancoDetails(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayMultibancoDetails[] newArray(int i) {
                    return new DisplayMultibancoDetails[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DisplayMultibancoDetails() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayMultibancoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayMultibancoDetails) other).hostedVoucherUrl);
            }

            public int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.hostedVoucherUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.hostedVoucherUrl);
            }

            public /* synthetic */ DisplayMultibancoDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public DisplayMultibancoDetails(String str) {
                super(null);
                this.hostedVoucherUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Landroid/net/Uri;", "url", "", "returnUrl", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "Ljava/lang/String;", "getReturnUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class RedirectToUrl extends NextActionData {
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new Creator();
            private final String returnUrl;
            private final Uri url;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RedirectToUrl> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl[] newArray(int i) {
                    return new RedirectToUrl[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RedirectToUrl)) {
                    return false;
                }
                RedirectToUrl redirectToUrl = (RedirectToUrl) other;
                return Intrinsics.areEqual(this.url, redirectToUrl.url) && Intrinsics.areEqual(this.returnUrl, redirectToUrl.returnUrl);
            }

            public int hashCode() {
                int iHashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.url + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeParcelable(this.url, flags);
                parcel.writeString(this.returnUrl);
            }

            public final Uri getUrl() {
                return this.url;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri url, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.returnUrl = str;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", WebsocketGatewayConstants.DATA_KEY, "authCompleteUrl", "Landroid/net/Uri;", "webViewUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getData", "getAuthCompleteUrl", "Landroid/net/Uri;", "getWebViewUrl", "()Landroid/net/Uri;", "getReturnUrl", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class AlipayRedirect extends NextActionData {
            private final String authCompleteUrl;
            private final String data;
            private final String returnUrl;
            private final Uri webViewUrl;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new Creator();

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AlipayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect[] newArray(int i) {
                    return new AlipayRedirect[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AlipayRedirect)) {
                    return false;
                }
                AlipayRedirect alipayRedirect = (AlipayRedirect) other;
                return Intrinsics.areEqual(this.data, alipayRedirect.data) && Intrinsics.areEqual(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && Intrinsics.areEqual(this.webViewUrl, alipayRedirect.webViewUrl) && Intrinsics.areEqual(this.returnUrl, alipayRedirect.returnUrl);
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.webViewUrl.hashCode()) * 31;
                String str2 = this.returnUrl;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.data + ", authCompleteUrl=" + this.authCompleteUrl + ", webViewUrl=" + this.webViewUrl + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.data);
                parcel.writeString(this.authCompleteUrl);
                parcel.writeParcelable(this.webViewUrl, flags);
                parcel.writeString(this.returnUrl);
            }

            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                this.data = data;
                this.authCompleteUrl = str;
                this.webViewUrl = webViewUrl;
                this.returnUrl = str2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AlipayRedirect(String data, String webViewUrl, String str) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(webViewUrl, "webViewUrl");
                String strExtractReturnUrl = Companion.extractReturnUrl(data);
                Uri uri = Uri.parse(webViewUrl);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                this(data, strExtractReturnUrl, uri, str);
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect$Companion;", "", "()V", "extractReturnUrl", "", WebsocketGatewayConstants.DATA_KEY, "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String extractReturnUrl(String data) {
                    Object objM28550constructorimpl;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        String queryParameter = Uri.parse("alipay://url?" + data).getQueryParameter("return_url");
                        if (queryParameter != null) {
                            StripeUrlUtils stripeUrlUtils = StripeUrlUtils.INSTANCE;
                            Intrinsics.checkNotNull(queryParameter);
                            if (!stripeUrlUtils.isStripeUrl$payments_core_release(queryParameter)) {
                                queryParameter = null;
                            }
                            objM28550constructorimpl = Result.m28550constructorimpl(queryParameter);
                        }
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    return (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
                }
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "Use3DS1", "Use3DS2", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static abstract class SdkData extends NextActionData {
            public /* synthetic */ SdkData(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SdkData() {
                super(null);
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class Use3DS1 extends SdkData {
                public static final Parcelable.Creator<Use3DS1> CREATOR = new Creator();
                private final String url;

                /* compiled from: StripeIntent.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Use3DS1> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS1(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1[] newArray(int i) {
                        return new Use3DS1[i];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Use3DS1) && Intrinsics.areEqual(this.url, ((Use3DS1) other).url);
                }

                public int hashCode() {
                    return this.url.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.url + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.url);
                }

                public final String getUrl() {
                    return this.url;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS1(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                }
            }

            /* compiled from: StripeIntent.kt */
            @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "", "source", "serverName", "transactionId", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "serverEncryption", "threeDS2IntentId", "publishableKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "getServerName", "getTransactionId", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getServerEncryption", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getThreeDS2IntentId", "getPublishableKey", "DirectoryServerEncryption", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class Use3DS2 extends SdkData {
                public static final Parcelable.Creator<Use3DS2> CREATOR = new Creator();
                private final String publishableKey;
                private final DirectoryServerEncryption serverEncryption;
                private final String serverName;
                private final String source;
                private final String threeDS2IntentId;
                private final String transactionId;

                /* compiled from: StripeIntent.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Use3DS2> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2[] newArray(int i) {
                        return new Use3DS2[i];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Use3DS2)) {
                        return false;
                    }
                    Use3DS2 use3DS2 = (Use3DS2) other;
                    return Intrinsics.areEqual(this.source, use3DS2.source) && Intrinsics.areEqual(this.serverName, use3DS2.serverName) && Intrinsics.areEqual(this.transactionId, use3DS2.transactionId) && Intrinsics.areEqual(this.serverEncryption, use3DS2.serverEncryption) && Intrinsics.areEqual(this.threeDS2IntentId, use3DS2.threeDS2IntentId) && Intrinsics.areEqual(this.publishableKey, use3DS2.publishableKey);
                }

                public int hashCode() {
                    int iHashCode = ((((((this.source.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.serverEncryption.hashCode()) * 31;
                    String str = this.threeDS2IntentId;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.publishableKey;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Use3DS2(source=" + this.source + ", serverName=" + this.serverName + ", transactionId=" + this.transactionId + ", serverEncryption=" + this.serverEncryption + ", threeDS2IntentId=" + this.threeDS2IntentId + ", publishableKey=" + this.publishableKey + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.source);
                    parcel.writeString(this.serverName);
                    parcel.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(parcel, flags);
                    parcel.writeString(this.threeDS2IntentId);
                    parcel.writeString(this.publishableKey);
                }

                public final String getSource() {
                    return this.source;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getTransactionId() {
                    return this.transactionId;
                }

                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                public final String getThreeDS2IntentId() {
                    return this.threeDS2IntentId;
                }

                public final String getPublishableKey() {
                    return this.publishableKey;
                }

                /* compiled from: StripeIntent.kt */
                @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "", "directoryServerId", "dsCertificateData", "", "rootCertsData", "keyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDirectoryServerId", "getDsCertificateData", "Ljava/util/List;", "getRootCertsData", "()Ljava/util/List;", "getKeyId", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
                public static final /* data */ class DirectoryServerEncryption implements Parcelable {
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
                    private final String directoryServerId;
                    private final String dsCertificateData;
                    private final String keyId;
                    private final List<String> rootCertsData;

                    /* compiled from: StripeIntent.kt */
                    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption[] newArray(int i) {
                            return new DirectoryServerEncryption[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof DirectoryServerEncryption)) {
                            return false;
                        }
                        DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
                        return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && Intrinsics.areEqual(this.rootCertsData, directoryServerEncryption.rootCertsData) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
                    }

                    public int hashCode() {
                        int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.dsCertificateData.hashCode()) * 31) + this.rootCertsData.hashCode()) * 31;
                        String str = this.keyId;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", dsCertificateData=" + this.dsCertificateData + ", rootCertsData=" + this.rootCertsData + ", keyId=" + this.keyId + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        Intrinsics.checkNotNullParameter(parcel, "out");
                        parcel.writeString(this.directoryServerId);
                        parcel.writeString(this.dsCertificateData);
                        parcel.writeStringList(this.rootCertsData);
                        parcel.writeString(this.keyId);
                    }

                    public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
                        Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
                        Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
                        this.directoryServerId = directoryServerId;
                        this.dsCertificateData = dsCertificateData;
                        this.rootCertsData = rootCertsData;
                        this.keyId = str;
                    }

                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final List<String> getRootCertsData() {
                        return this.rootCertsData;
                    }

                    public final String getKeyId() {
                        return this.keyId;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS2(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption, String str, String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(serverName, "serverName");
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(serverEncryption, "serverEncryption");
                    this.source = source;
                    this.serverName = serverName;
                    this.transactionId = transactionId;
                    this.serverEncryption = serverEncryption;
                    this.threeDS2IntentId = str;
                    this.publishableKey = str2;
                }
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class BlikAuthorize extends NextActionData {
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new Creator();

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<BlikAuthorize> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BlikAuthorize.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize[] newArray(int i) {
                    return new BlikAuthorize[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BlikAuthorize);
            }

            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }

            private BlikAuthorize() {
                super(null);
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/WeChat;", "weChat", "<init>", "(Lcom/stripe/android/model/WeChat;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/WeChat;", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class WeChatPayRedirect extends NextActionData {
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Creator();
            private final WeChat weChat;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<WeChatPayRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect[] newArray(int i) {
                    return new WeChatPayRedirect[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WeChatPayRedirect) && Intrinsics.areEqual(this.weChat, ((WeChatPayRedirect) other).weChat);
            }

            public int hashCode() {
                return this.weChat.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.weChat + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                this.weChat.writeToParcel(parcel, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat) {
                super(null);
                Intrinsics.checkNotNullParameter(weChat, "weChat");
                this.weChat = weChat;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "arrivalDate", "", "hostedVerificationUrl", "Lcom/stripe/android/model/MicrodepositType;", "microdepositType", "<init>", "(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getArrivalDate", "()J", "Ljava/lang/String;", "getHostedVerificationUrl", "Lcom/stripe/android/model/MicrodepositType;", "getMicrodepositType", "()Lcom/stripe/android/model/MicrodepositType;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class VerifyWithMicrodeposits extends NextActionData {
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new Creator();
            private final long arrivalDate;
            private final String hostedVerificationUrl;
            private final MicrodepositType microdepositType;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<VerifyWithMicrodeposits> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), MicrodepositType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits[] newArray(int i) {
                    return new VerifyWithMicrodeposits[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerifyWithMicrodeposits)) {
                    return false;
                }
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) other;
                return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && Intrinsics.areEqual(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
            }

            public int hashCode() {
                return (((Long.hashCode(this.arrivalDate) * 31) + this.hostedVerificationUrl.hashCode()) * 31) + this.microdepositType.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.arrivalDate + ", hostedVerificationUrl=" + this.hostedVerificationUrl + ", microdepositType=" + this.microdepositType + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeLong(this.arrivalDate);
                parcel.writeString(this.hostedVerificationUrl);
                parcel.writeString(this.microdepositType.name());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyWithMicrodeposits(long j, String hostedVerificationUrl, MicrodepositType microdepositType) {
                super(null);
                Intrinsics.checkNotNullParameter(hostedVerificationUrl, "hostedVerificationUrl");
                Intrinsics.checkNotNullParameter(microdepositType, "microdepositType");
                this.arrivalDate = j;
                this.hostedVerificationUrl = hostedVerificationUrl;
                this.microdepositType = microdepositType;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class UpiAwaitNotification extends NextActionData {
            public static final UpiAwaitNotification INSTANCE = new UpiAwaitNotification();
            public static final Parcelable.Creator<UpiAwaitNotification> CREATOR = new Creator();

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<UpiAwaitNotification> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpiAwaitNotification.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpiAwaitNotification[] newArray(int i) {
                    return new UpiAwaitNotification[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UpiAwaitNotification);
            }

            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }

            private UpiAwaitNotification() {
                super(null);
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "mobileAuthUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMobileAuthUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class CashAppRedirect extends NextActionData {
            public static final Parcelable.Creator<CashAppRedirect> CREATOR = new Creator();
            private final String mobileAuthUrl;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CashAppRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CashAppRedirect(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CashAppRedirect[] newArray(int i) {
                    return new CashAppRedirect[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CashAppRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((CashAppRedirect) other).mobileAuthUrl);
            }

            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.mobileAuthUrl);
            }

            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashAppRedirect(String mobileAuthUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }
        }

        /* compiled from: StripeIntent.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "mobileAuthUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMobileAuthUrl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class SwishRedirect extends NextActionData {
            public static final Parcelable.Creator<SwishRedirect> CREATOR = new Creator();
            private final String mobileAuthUrl;

            /* compiled from: StripeIntent.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SwishRedirect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SwishRedirect createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SwishRedirect(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SwishRedirect[] newArray(int i) {
                    return new SwishRedirect[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SwishRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((SwishRedirect) other).mobileAuthUrl);
            }

            public int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.mobileAuthUrl + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.mobileAuthUrl);
            }

            public final String getMobileAuthUrl() {
                return this.mobileAuthUrl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SwishRedirect(String mobileAuthUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(mobileAuthUrl, "mobileAuthUrl");
                this.mobileAuthUrl = mobileAuthUrl;
            }
        }
    }
}
