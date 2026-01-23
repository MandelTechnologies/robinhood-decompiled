package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.stripe.android.model.PaymentMethod;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PaymentMethodCreateParams.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b2\b\u0087\b\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u000eijklhmnopqrstuB\u0091\u0002\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&¢\u0006\u0004\b,\u0010-B\u0085\u0002\b\u0010\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&¢\u0006\u0004\b,\u00100B;\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00101B;\b\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00102B;\b\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00103J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0&H\u0016¢\u0006\u0004\b4\u00105J\u009c\u0002\u00106\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020:HÖ\u0001¢\u0006\u0004\b@\u0010<J \u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020:HÖ\u0001¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u00109R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010PR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010QR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010RR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010TR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010UR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010VR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010WR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010XR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ZR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010^R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010_R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010`R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u00105R\u0011\u0010d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bc\u00109R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030(8G¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006v"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "", "requiresMandate", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "card", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "ideal", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "fpx", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "sofort", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "upi", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "netbanking", "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "link", "Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "cashAppPay", "Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;", "swish", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "allowRedisplay", "", "metadata", "", "productUsage", "", "overrideParamMap", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "(Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "toParamMap", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode$payments_core_release", "Z", "getRequiresMandate$payments_core_release", "()Z", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "Ljava/util/Map;", "Ljava/util/Set;", "getTypeParams", "typeParams", "getTypeCode", "typeCode", "getAttribution", "()Ljava/util/Set;", "attribution", "Companion", "AuBecsDebit", "BacsDebit", "Card", "CashAppPay", "Fpx", "Ideal", "Link", "Netbanking", "SepaDebit", "Sofort", "Swish", "USBankAccount", "Upi", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class PaymentMethodCreateParams implements StripeParamsModel, Parcelable {
    private final PaymentMethod.AllowRedisplay allowRedisplay;
    private final AuBecsDebit auBecsDebit;
    private final BacsDebit bacsDebit;
    private final PaymentMethod.BillingDetails billingDetails;
    private final Card card;
    private final CashAppPay cashAppPay;
    private final String code;
    private final Fpx fpx;
    private final Ideal ideal;
    private final Link link;
    private final Map<String, String> metadata;
    private final Netbanking netbanking;
    private final Map<String, Object> overrideParamMap;
    private final Set<String> productUsage;
    private final boolean requiresMandate;
    private final SepaDebit sepaDebit;
    private final Sofort sofort;
    private final Swish swish;
    private final Upi upi;
    private final USBankAccount usBankAccount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new Creator();

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class CashAppPay implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<CashAppPay> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CashAppPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAppPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new CashAppPay();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAppPay[] newArray(int i) {
                return new CashAppPay[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodCreateParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams createFromParcel(Parcel parcel) {
            Card card;
            PaymentMethod.BillingDetails billingDetailsCreateFromParcel;
            PaymentMethod.BillingDetails billingDetails;
            PaymentMethod.AllowRedisplay allowRedisplayCreateFromParcel;
            PaymentMethod.AllowRedisplay allowRedisplay;
            CashAppPay cashAppPay;
            LinkedHashMap linkedHashMap;
            String str;
            LinkedHashMap linkedHashMap2;
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Card cardCreateFromParcel = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            Ideal idealCreateFromParcel = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            Fpx fpxCreateFromParcel = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            SepaDebit sepaDebitCreateFromParcel = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit auBecsDebitCreateFromParcel = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit bacsDebitCreateFromParcel = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            Sofort sofortCreateFromParcel = parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel);
            Upi upiCreateFromParcel = parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel);
            Netbanking netbankingCreateFromParcel = parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel);
            USBankAccount uSBankAccountCreateFromParcel = parcel.readInt() == 0 ? null : USBankAccount.CREATOR.createFromParcel(parcel);
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            CashAppPay cashAppPayCreateFromParcel = parcel.readInt() == 0 ? null : CashAppPay.CREATOR.createFromParcel(parcel);
            Swish swishCreateFromParcel = parcel.readInt() == 0 ? null : Swish.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                card = cardCreateFromParcel;
                billingDetailsCreateFromParcel = null;
            } else {
                card = cardCreateFromParcel;
                billingDetailsCreateFromParcel = PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
            }
            PaymentMethod.BillingDetails billingDetails2 = billingDetailsCreateFromParcel;
            if (parcel.readInt() == 0) {
                billingDetails = billingDetails2;
                allowRedisplayCreateFromParcel = null;
            } else {
                billingDetails = billingDetails2;
                allowRedisplayCreateFromParcel = PaymentMethod.AllowRedisplay.CREATOR.createFromParcel(parcel);
            }
            PaymentMethod.AllowRedisplay allowRedisplay2 = allowRedisplayCreateFromParcel;
            if (parcel.readInt() == 0) {
                allowRedisplay = allowRedisplay2;
                cashAppPay = cashAppPayCreateFromParcel;
                str = string2;
                linkedHashMap = null;
            } else {
                allowRedisplay = allowRedisplay2;
                int i = parcel.readInt();
                cashAppPay = cashAppPayCreateFromParcel;
                linkedHashMap = new LinkedHashMap(i);
                str = string2;
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                }
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            int i4 = 0;
            while (i4 != i3) {
                linkedHashSet2.add(parcel.readString());
                i4++;
                i3 = i3;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i5);
                linkedHashSet = linkedHashSet2;
                int i6 = 0;
                while (i6 != i5) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.class.getClassLoader()));
                    i6++;
                    i5 = i5;
                }
            }
            return new PaymentMethodCreateParams(str, z, card, idealCreateFromParcel, fpxCreateFromParcel, sepaDebitCreateFromParcel, auBecsDebitCreateFromParcel, bacsDebitCreateFromParcel, sofortCreateFromParcel, upiCreateFromParcel, netbankingCreateFromParcel, uSBankAccountCreateFromParcel, linkCreateFromParcel, cashAppPay, swishCreateFromParcel, billingDetails, allowRedisplay, linkedHashMap3, linkedHashSet, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams[] newArray(int i) {
            return new PaymentMethodCreateParams[i];
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Swish implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Swish> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Swish> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Swish createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new Swish();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Swish[] newArray(int i) {
                return new Swish[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(Card card, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(card, allowRedisplay, billingDetails, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Fpx fpx, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(fpx, allowRedisplay, billingDetails, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(netbanking, allowRedisplay, billingDetails, (Map<String, String>) map);
    }

    public static /* synthetic */ PaymentMethodCreateParams copy$default(PaymentMethodCreateParams paymentMethodCreateParams, String str, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, Swish swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Map map, Set set, Map map2, int i, Object obj) {
        Map map3;
        Set set2;
        String str2 = (i & 1) != 0 ? paymentMethodCreateParams.code : str;
        boolean z2 = (i & 2) != 0 ? paymentMethodCreateParams.requiresMandate : z;
        Card card2 = (i & 4) != 0 ? paymentMethodCreateParams.card : card;
        Ideal ideal2 = (i & 8) != 0 ? paymentMethodCreateParams.ideal : ideal;
        Fpx fpx2 = (i & 16) != 0 ? paymentMethodCreateParams.fpx : fpx;
        SepaDebit sepaDebit2 = (i & 32) != 0 ? paymentMethodCreateParams.sepaDebit : sepaDebit;
        AuBecsDebit auBecsDebit2 = (i & 64) != 0 ? paymentMethodCreateParams.auBecsDebit : auBecsDebit;
        BacsDebit bacsDebit2 = (i & 128) != 0 ? paymentMethodCreateParams.bacsDebit : bacsDebit;
        Sofort sofort2 = (i & 256) != 0 ? paymentMethodCreateParams.sofort : sofort;
        Upi upi2 = (i & 512) != 0 ? paymentMethodCreateParams.upi : upi;
        Netbanking netbanking2 = (i & 1024) != 0 ? paymentMethodCreateParams.netbanking : netbanking;
        USBankAccount uSBankAccount2 = (i & 2048) != 0 ? paymentMethodCreateParams.usBankAccount : uSBankAccount;
        Link link2 = (i & 4096) != 0 ? paymentMethodCreateParams.link : link;
        CashAppPay cashAppPay2 = (i & 8192) != 0 ? paymentMethodCreateParams.cashAppPay : cashAppPay;
        String str3 = str2;
        Swish swish2 = (i & 16384) != 0 ? paymentMethodCreateParams.swish : swish;
        PaymentMethod.BillingDetails billingDetails2 = (i & 32768) != 0 ? paymentMethodCreateParams.billingDetails : billingDetails;
        PaymentMethod.AllowRedisplay allowRedisplay2 = (i & 65536) != 0 ? paymentMethodCreateParams.allowRedisplay : allowRedisplay;
        Map map4 = (i & 131072) != 0 ? paymentMethodCreateParams.metadata : map;
        Set set3 = (i & 262144) != 0 ? paymentMethodCreateParams.productUsage : set;
        if ((i & 524288) != 0) {
            set2 = set3;
            map3 = paymentMethodCreateParams.overrideParamMap;
        } else {
            map3 = map2;
            set2 = set3;
        }
        return paymentMethodCreateParams.copy(str3, z2, card2, ideal2, fpx2, sepaDebit2, auBecsDebit2, bacsDebit2, sofort2, upi2, netbanking2, uSBankAccount2, link2, cashAppPay2, swish2, billingDetails2, allowRedisplay2, map4, set2, map3);
    }

    public final PaymentMethodCreateParams copy(String code, boolean requiresMandate, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount usBankAccount, Link link, CashAppPay cashAppPay, Swish swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Map<String, String> metadata, Set<String> productUsage, Map<String, ? extends Object> overrideParamMap) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        return new PaymentMethodCreateParams(code, requiresMandate, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, usBankAccount, link, cashAppPay, swish, billingDetails, allowRedisplay, metadata, productUsage, overrideParamMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodCreateParams)) {
            return false;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) other;
        return Intrinsics.areEqual(this.code, paymentMethodCreateParams.code) && this.requiresMandate == paymentMethodCreateParams.requiresMandate && Intrinsics.areEqual(this.card, paymentMethodCreateParams.card) && Intrinsics.areEqual(this.ideal, paymentMethodCreateParams.ideal) && Intrinsics.areEqual(this.fpx, paymentMethodCreateParams.fpx) && Intrinsics.areEqual(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && Intrinsics.areEqual(this.sofort, paymentMethodCreateParams.sofort) && Intrinsics.areEqual(this.upi, paymentMethodCreateParams.upi) && Intrinsics.areEqual(this.netbanking, paymentMethodCreateParams.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethodCreateParams.usBankAccount) && Intrinsics.areEqual(this.link, paymentMethodCreateParams.link) && Intrinsics.areEqual(this.cashAppPay, paymentMethodCreateParams.cashAppPay) && Intrinsics.areEqual(this.swish, paymentMethodCreateParams.swish) && Intrinsics.areEqual(this.billingDetails, paymentMethodCreateParams.billingDetails) && this.allowRedisplay == paymentMethodCreateParams.allowRedisplay && Intrinsics.areEqual(this.metadata, paymentMethodCreateParams.metadata) && Intrinsics.areEqual(this.productUsage, paymentMethodCreateParams.productUsage) && Intrinsics.areEqual(this.overrideParamMap, paymentMethodCreateParams.overrideParamMap);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + Boolean.hashCode(this.requiresMandate)) * 31;
        Card card = this.card;
        int iHashCode2 = (iHashCode + (card == null ? 0 : card.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int iHashCode3 = (iHashCode2 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int iHashCode4 = (iHashCode3 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int iHashCode5 = (iHashCode4 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int iHashCode6 = (iHashCode5 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int iHashCode7 = (iHashCode6 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int iHashCode8 = (iHashCode7 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int iHashCode9 = (iHashCode8 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int iHashCode10 = (iHashCode9 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int iHashCode11 = (iHashCode10 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        Link link = this.link;
        int iHashCode12 = (iHashCode11 + (link == null ? 0 : link.hashCode())) * 31;
        CashAppPay cashAppPay = this.cashAppPay;
        int iHashCode13 = (iHashCode12 + (cashAppPay == null ? 0 : cashAppPay.hashCode())) * 31;
        Swish swish = this.swish;
        int iHashCode14 = (iHashCode13 + (swish == null ? 0 : swish.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        int iHashCode15 = (iHashCode14 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        int iHashCode16 = (iHashCode15 + (allowRedisplay == null ? 0 : allowRedisplay.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode17 = (((iHashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.productUsage.hashCode()) * 31;
        Map<String, Object> map2 = this.overrideParamMap;
        return iHashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.code + ", requiresMandate=" + this.requiresMandate + ", card=" + this.card + ", ideal=" + this.ideal + ", fpx=" + this.fpx + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", link=" + this.link + ", cashAppPay=" + this.cashAppPay + ", swish=" + this.swish + ", billingDetails=" + this.billingDetails + ", allowRedisplay=" + this.allowRedisplay + ", metadata=" + this.metadata + ", productUsage=" + this.productUsage + ", overrideParamMap=" + this.overrideParamMap + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.code);
        parcel.writeInt(this.requiresMandate ? 1 : 0);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, flags);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ideal.writeToParcel(parcel, flags);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpx.writeToParcel(parcel, flags);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sepaDebit.writeToParcel(parcel, flags);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, flags);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, flags);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sofort.writeToParcel(parcel, flags);
        }
        Upi upi = this.upi;
        if (upi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upi.writeToParcel(parcel, flags);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            netbanking.writeToParcel(parcel, flags);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, flags);
        }
        Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, flags);
        }
        CashAppPay cashAppPay = this.cashAppPay;
        if (cashAppPay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cashAppPay.writeToParcel(parcel, flags);
        }
        Swish swish = this.swish;
        if (swish == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            swish.writeToParcel(parcel, flags);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, flags);
        }
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allowRedisplay.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Set<String> set = this.productUsage;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Map<String, Object> map2 = this.overrideParamMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }

    public PaymentMethodCreateParams(String code, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, Swish swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.code = code;
        this.requiresMandate = z;
        this.card = card;
        this.ideal = ideal;
        this.fpx = fpx;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.link = link;
        this.cashAppPay = cashAppPay;
        this.swish = swish;
        this.billingDetails = billingDetails;
        this.allowRedisplay = allowRedisplay;
        this.metadata = map;
        this.productUsage = productUsage;
        this.overrideParamMap = map2;
    }

    /* renamed from: getCode$payments_core_release, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: getRequiresMandate$payments_core_release, reason: from getter */
    public final boolean getRequiresMandate() {
        return this.requiresMandate;
    }

    public /* synthetic */ PaymentMethodCreateParams(PaymentMethod.Type type2, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, Swish swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Map map, Set set, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, (i & 2) != 0 ? null : card, (i & 4) != 0 ? null : ideal, (i & 8) != 0 ? null : fpx, (i & 16) != 0 ? null : sepaDebit, (i & 32) != 0 ? null : auBecsDebit, (i & 64) != 0 ? null : bacsDebit, (i & 128) != 0 ? null : sofort, (i & 256) != 0 ? null : upi, (i & 512) != 0 ? null : netbanking, (i & 1024) != 0 ? null : uSBankAccount, (i & 2048) != 0 ? null : link, (i & 4096) != 0 ? null : cashAppPay, (i & 8192) != 0 ? null : swish, (i & 16384) != 0 ? null : billingDetails, (i & 32768) != 0 ? null : allowRedisplay, (i & 65536) != 0 ? null : map, (i & 131072) != 0 ? SetsKt.emptySet() : set, (i & 262144) != 0 ? null : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodCreateParams(PaymentMethod.Type type2, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, Swish swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        this(type2.code, type2.requiresMandate, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount, link, cashAppPay, swish, billingDetails, allowRedisplay, map, productUsage, map2);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
    }

    public final String getTypeCode() {
        return this.code;
    }

    public final /* synthetic */ Set getAttribution() {
        Set<String> setEmptySet;
        if (!Intrinsics.areEqual(this.code, PaymentMethod.Type.Card.code)) {
            return this.productUsage;
        }
        Card card = this.card;
        if (card == null || (setEmptySet = card.getAttribution$payments_core_release()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        return SetsKt.plus((Set) setEmptySet, (Iterable) this.productUsage);
    }

    private PaymentMethodCreateParams(Card card, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Card, card, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, map, null, null, 409596, null);
    }

    private PaymentMethodCreateParams(Fpx fpx, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Fpx, null, null, fpx, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, map, null, null, 409590, null);
    }

    private PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.AllowRedisplay allowRedisplay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Netbanking, null, null, null, null, null, null, null, null, netbanking, null, null, null, null, billingDetails, allowRedisplay, map, null, null, 409086, null);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> mapPlus = this.overrideParamMap;
        if (mapPlus == null) {
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("type", this.code));
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            Map mapMapOf2 = billingDetails != null ? MapsKt.mapOf(Tuples4.m3642to("billing_details", billingDetails.toParamMap())) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(MapsKt.plus(mapMapOf, mapMapOf2), getTypeParams());
            Map<String, String> map = this.metadata;
            Map mapMapOf3 = map != null ? MapsKt.mapOf(Tuples4.m3642to("metadata", map)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            mapPlus = MapsKt.plus(mapPlus2, mapMapOf3);
        }
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        Map mapMapOf4 = allowRedisplay != null ? MapsKt.mapOf(Tuples4.m3642to("allow_redisplay", allowRedisplay.getValue())) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus, mapMapOf4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, Object> getTypeParams() {
        Link link;
        Map<String, Object> paramMap;
        String str = this.code;
        if (Intrinsics.areEqual(str, PaymentMethod.Type.Card.code)) {
            Card card = this.card;
            paramMap = card != null ? card.toParamMap() : null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Ideal.code)) {
            Ideal ideal = this.ideal;
            if (ideal != null) {
                paramMap = ideal.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Fpx.code)) {
            Fpx fpx = this.fpx;
            if (fpx != null) {
                paramMap = fpx.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.SepaDebit.code)) {
            SepaDebit sepaDebit = this.sepaDebit;
            if (sepaDebit != null) {
                paramMap = sepaDebit.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.AuBecsDebit.code)) {
            AuBecsDebit auBecsDebit = this.auBecsDebit;
            if (auBecsDebit != null) {
                paramMap = auBecsDebit.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.BacsDebit.code)) {
            BacsDebit bacsDebit = this.bacsDebit;
            if (bacsDebit != null) {
                paramMap = bacsDebit.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Sofort.code)) {
            Sofort sofort = this.sofort;
            if (sofort != null) {
                paramMap = sofort.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Upi.code)) {
            Upi upi = this.upi;
            if (upi != null) {
                paramMap = upi.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Netbanking.code)) {
            Netbanking netbanking = this.netbanking;
            if (netbanking != null) {
                paramMap = netbanking.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.USBankAccount.code)) {
            USBankAccount uSBankAccount = this.usBankAccount;
            if (uSBankAccount != null) {
                paramMap = uSBankAccount.toParamMap();
            }
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Link.code) && (link = this.link) != null) {
            paramMap = link.toParamMap();
        }
        if (paramMap == null || paramMap.isEmpty()) {
            paramMap = null;
        }
        Map<String, Object> mapMapOf = paramMap != null ? MapsKt.mapOf(Tuples4.m3642to(this.code, paramMap)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000201Bc\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", InquiryField.FloatField.TYPE2, "", "expiryMonth", "expiryYear", "cvc", "token", "", "attribution", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "networks", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNumber$payments_core_release", "Ljava/lang/Integer;", "getExpiryMonth$payments_core_release", "()Ljava/lang/Integer;", "getExpiryYear$payments_core_release", "getCvc$payments_core_release", "Ljava/util/Set;", "getAttribution$payments_core_release", "()Ljava/util/Set;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "getNetworks$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "Companion", "Networks", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Card implements StripeParamsModel, Parcelable {
        private final Set<String> attribution;
        private final String cvc;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final Networks networks;
        private final String number;
        private final String token;
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new Card(string2, numValueOf, numValueOf2, string3, string4, linkedHashSet, parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.cvc, card.cvc) && Intrinsics.areEqual(this.token, card.token) && Intrinsics.areEqual(this.attribution, card.attribution) && Intrinsics.areEqual(this.networks, card.networks);
        }

        public int hashCode() {
            String str = this.number;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.expiryMonth;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.cvc;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set<String> set = this.attribution;
            int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            Networks networks = this.networks;
            return iHashCode6 + (networks != null ? networks.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.number + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", cvc=" + this.cvc + ", token=" + this.token + ", attribution=" + this.attribution + ", networks=" + this.networks + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.cvc);
            parcel.writeString(this.token);
            Set<String> set = this.attribution;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
            Networks networks = this.networks;
            if (networks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                networks.writeToParcel(parcel, flags);
            }
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set<String> set, Networks networks) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
            this.networks = networks;
        }

        public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, String str3, Set set, Networks networks, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : set, (i & 64) != 0 ? null : networks);
        }

        public final Set<String> getAttribution$payments_core_release() {
            return this.attribution;
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "preferred", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPreferred", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Networks implements StripeParamsModel, Parcelable {
            private final String preferred;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();

            /* compiled from: PaymentMethodCreateParams.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Networks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Networks(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Networks() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.preferred);
            }

            public Networks(String str) {
                this.preferred = str;
            }

            public /* synthetic */ Networks(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.stripe.android.model.StripeParamsModel
            public Map<String, Object> toParamMap() {
                String str = this.preferred;
                if (str != null) {
                    return MapsKt.mapOf(Tuples4.m3642to("preferred", str));
                }
                return MapsKt.emptyMap();
            }

            public boolean equals(Object other) {
                return (other instanceof Networks) && Intrinsics.areEqual(((Networks) other).preferred, this.preferred);
            }

            public int hashCode() {
                return Objects.hash(this.preferred);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.preferred + ")";
            }

            /* compiled from: PaymentMethodCreateParams.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks$Companion;", "", "()V", "PARAM_PREFERRED", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Tuples2 tuples2M3642to = Tuples4.m3642to(InquiryField.FloatField.TYPE2, this.number);
            Tuples2 tuples2M3642to2 = Tuples4.m3642to("exp_month", this.expiryMonth);
            Tuples2 tuples2M3642to3 = Tuples4.m3642to("exp_year", this.expiryYear);
            Tuples2 tuples2M3642to4 = Tuples4.m3642to("cvc", this.cvc);
            Tuples2 tuples2M3642to5 = Tuples4.m3642to("token", this.token);
            Networks networks = this.networks;
            List<Tuples2> listListOf = CollectionsKt.listOf((Object[]) new Tuples2[]{tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, Tuples4.m3642to("networks", networks != null ? networks.toParamMap() : null)});
            ArrayList arrayList = new ArrayList();
            for (Tuples2 tuples2 : listListOf) {
                Object second = tuples2.getSecond();
                Tuples2 tuples2M3642to6 = second != null ? Tuples4.m3642to(tuples2.getFirst(), second) : null;
                if (tuples2M3642to6 != null) {
                    arrayList.add(tuples2M3642to6);
                }
            }
            return MapsKt.toMap(arrayList);
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "bank", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank", "setBank", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Ideal implements StripeParamsModel, Parcelable {
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Ideal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ideal(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i) {
                return new Ideal[i];
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
            return (other instanceof Ideal) && Intrinsics.areEqual(this.bank, ((Ideal) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
        }

        public Ideal(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String str = this.bank;
            Map<String, Object> mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("bank", str)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "bank", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank", "setBank", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Fpx implements StripeParamsModel, Parcelable {
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Fpx> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fpx(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i) {
                return new Fpx[i];
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
            return (other instanceof Fpx) && Intrinsics.areEqual(this.bank, ((Fpx) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
        }

        public Fpx(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String str = this.bank;
            Map<String, Object> mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("bank", str)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "vpa", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Upi implements StripeParamsModel, Parcelable {
        private final String vpa;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Upi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i) {
                return new Upi[i];
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
            return (other instanceof Upi) && Intrinsics.areEqual(this.vpa, ((Upi) other).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.vpa + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.vpa);
        }

        public Upi(String str) {
            this.vpa = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String str = this.vpa;
            Map<String, Object> mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("vpa", str)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi$Companion;", "", "()V", "PARAM_VPA", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "iban", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIban", "setIban", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SepaDebit implements StripeParamsModel, Parcelable {
        private String iban;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
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
            return (other instanceof SepaDebit) && Intrinsics.areEqual(this.iban, ((SepaDebit) other).iban);
        }

        public int hashCode() {
            String str = this.iban;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.iban + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.iban);
        }

        public SepaDebit(String str) {
            this.iban = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String str = this.iban;
            Map<String, Object> mapMapOf = str != null ? MapsKt.mapOf(Tuples4.m3642to("iban", str)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Companion;", "", "()V", "PARAM_IBAN", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "bsbNumber", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBsbNumber", "setBsbNumber", "(Ljava/lang/String;)V", "getAccountNumber", "setAccountNumber", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuBecsDebit implements StripeParamsModel, Parcelable {
        private String accountNumber;
        private String bsbNumber;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
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
            if (!(other instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) other;
            return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.accountNumber, auBecsDebit.accountNumber);
        }

        public int hashCode() {
            return (this.bsbNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.accountNumber);
        }

        public AuBecsDebit(String bsbNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(bsbNumber, "bsbNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.bsbNumber = bsbNumber;
            this.accountNumber = accountNumber;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            return MapsKt.mapOf(Tuples4.m3642to("bsb_number", this.bsbNumber), Tuples4.m3642to("account_number", this.accountNumber));
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit$Companion;", "", "()V", "PARAM_ACCOUNT_NUMBER", "", "PARAM_BSB_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "accountNumber", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAccountNumber", "setAccountNumber", "(Ljava/lang/String;)V", "getSortCode", "setSortCode", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BacsDebit implements StripeParamsModel, Parcelable {
        private String accountNumber;
        private String sortCode;
        public static final int $stable = 8;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
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
            if (!(other instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) other;
            return Intrinsics.areEqual(this.accountNumber, bacsDebit.accountNumber) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.sortCode.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.accountNumber + ", sortCode=" + this.sortCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.sortCode);
        }

        public BacsDebit(String accountNumber, String sortCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            this.accountNumber = accountNumber;
            this.sortCode = sortCode;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            return MapsKt.mapOf(Tuples4.m3642to("account_number", this.accountNumber), Tuples4.m3642to("sort_code", this.sortCode));
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountry$payments_core_release", "setCountry$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Sofort implements StripeParamsModel, Parcelable {
        private String country;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Sofort> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i) {
                return new Sofort[i];
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
            return (other instanceof Sofort) && Intrinsics.areEqual(this.country, ((Sofort) other).country);
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.country);
        }

        public Sofort(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String upperCase = this.country.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return MapsKt.mapOf(Tuples4.m3642to(PlaceTypes.COUNTRY, upperCase));
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort$Companion;", "", "()V", "PARAM_COUNTRY", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "bank", "<init>", "(Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank$payments_core_release", "setBank$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Netbanking implements StripeParamsModel, Parcelable {
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
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
            return (other instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) other).bank);
        }

        public int hashCode() {
            return this.bank.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
        }

        public Netbanking(String bank) {
            Intrinsics.checkNotNullParameter(bank, "bank");
            this.bank = bank;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String lowerCase = this.bank.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return MapsKt.mapOf(Tuples4.m3642to("bank", lowerCase));
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013BE\b\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "linkAccountSessionId", "accountNumber", "routingNumber", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "accountType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "accountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLinkAccountSessionId$payments_core_release", "setLinkAccountSessionId$payments_core_release", "(Ljava/lang/String;)V", "getAccountNumber$payments_core_release", "setAccountNumber$payments_core_release", "getRoutingNumber$payments_core_release", "setRoutingNumber$payments_core_release", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "getAccountType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "setAccountType$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;)V", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "getAccountHolderType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "setAccountHolderType$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class USBankAccount implements StripeParamsModel, Parcelable {
        private PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType;
        private String accountNumber;
        private PaymentMethod.USBankAccount.USBankAccountType accountType;
        private String linkAccountSessionId;
        private String routingNumber;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.USBankAccount.USBankAccountHolderType.CREATOR.createFromParcel(parcel) : null, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        public /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, uSBankAccountType, uSBankAccountHolderType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return Intrinsics.areEqual(this.linkAccountSessionId, uSBankAccount.linkAccountSessionId) && Intrinsics.areEqual(this.accountNumber, uSBankAccount.accountNumber) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber) && this.accountType == uSBankAccount.accountType && this.accountHolderType == uSBankAccount.accountHolderType;
        }

        public int hashCode() {
            String str = this.linkAccountSessionId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.routingNumber;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            int iHashCode4 = (iHashCode3 + (uSBankAccountType == null ? 0 : uSBankAccountType.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            return iHashCode4 + (uSBankAccountHolderType != null ? uSBankAccountHolderType.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.linkAccountSessionId + ", accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", accountType=" + this.accountType + ", accountHolderType=" + this.accountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.linkAccountSessionId);
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.routingNumber);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            if (uSBankAccountType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankAccountType.writeToParcel(parcel, flags);
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            if (uSBankAccountHolderType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankAccountHolderType.writeToParcel(parcel, flags);
            }
        }

        private USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            this.linkAccountSessionId = str;
            this.accountNumber = str2;
            this.routingNumber = str3;
            this.accountType = uSBankAccountType;
            this.accountHolderType = uSBankAccountHolderType;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            String str = this.linkAccountSessionId;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                return MapsKt.mapOf(Tuples4.m3642to("link_account_session", str));
            }
            String str2 = this.accountNumber;
            Intrinsics.checkNotNull(str2);
            Tuples2 tuples2M3642to = Tuples4.m3642to("account_number", str2);
            String str3 = this.routingNumber;
            Intrinsics.checkNotNull(str3);
            Tuples2 tuples2M3642to2 = Tuples4.m3642to("routing_number", str3);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            Intrinsics.checkNotNull(uSBankAccountType);
            Tuples2 tuples2M3642to3 = Tuples4.m3642to(InstantCashConstants.ACCOUNT_TYPE_KEY, uSBankAccountType.getValue());
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            Intrinsics.checkNotNull(uSBankAccountHolderType);
            return MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, Tuples4.m3642to("account_holder_type", uSBankAccountHolderType.getValue()));
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;", "", "()V", "PARAM_ACCOUNT_HOLDER_TYPE", "", "PARAM_ACCOUNT_NUMBER", "PARAM_ACCOUNT_TYPE", "PARAM_LINKED_ACCOUNT_SESSION_ID", "PARAM_ROUTING_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010 R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "paymentDetailsId", "consumerSessionClientSecret", "", "", "extraParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentDetailsId$payments_core_release", "setPaymentDetailsId$payments_core_release", "(Ljava/lang/String;)V", "getConsumerSessionClientSecret$payments_core_release", "setConsumerSessionClientSecret$payments_core_release", "Ljava/util/Map;", "getExtraParams$payments_core_release", "setExtraParams$payments_core_release", "(Ljava/util/Map;)V", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Link implements StripeParamsModel, Parcelable {
        private String consumerSessionClientSecret;
        private Map<String, ? extends Object> extraParams;
        private String paymentDetailsId;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Link> CREATOR = new Creator();

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(Link.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Link(string2, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
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
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Intrinsics.areEqual(this.paymentDetailsId, link.paymentDetailsId) && Intrinsics.areEqual(this.consumerSessionClientSecret, link.consumerSessionClientSecret) && Intrinsics.areEqual(this.extraParams, link.extraParams);
        }

        public int hashCode() {
            int iHashCode = ((this.paymentDetailsId.hashCode() * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            Map<String, ? extends Object> map = this.extraParams;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.paymentDetailsId + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", extraParams=" + this.extraParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.paymentDetailsId);
            parcel.writeString(this.consumerSessionClientSecret);
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }

        public Link(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.paymentDetailsId = paymentDetailsId;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.extraParams = map;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("payment_details_id", this.paymentDetailsId), Tuples4.m3642to("credentials", MapsKt.mapOf(Tuples4.m3642to("consumer_session_client_secret", this.consumerSessionClientSecret))));
            Map<String, ? extends Object> mapEmptyMap = this.extraParams;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapMapOf, mapEmptyMap);
        }

        /* compiled from: PaymentMethodCreateParams.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Link$Companion;", "", "()V", "PARAM_CONSUMER_SESSION_CLIENT_SECRET", "", "PARAM_CREDENTIALS", "PARAM_PAYMENT_DETAILS_ID", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PaymentMethodCreateParams.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJG\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016JG\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006%"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;", "", "<init>", "()V", "Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createCard", "(Lcom/stripe/android/model/CardParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "card", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "", "", "metadata", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "allowRedisplay", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "fpx", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "netbanking", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lorg/json/JSONObject;", "googlePayPaymentData", "createFromGooglePay", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "createUSBankAccount", "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "PARAM_ALLOW_REDISPLAY", "Ljava/lang/String;", "PARAM_BILLING_DETAILS", "PARAM_METADATA", "PARAM_TYPE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentMethodCreateParams createCard(CardParams cardParams) {
            String preferred;
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            String number = cardParams.getNumber();
            Integer numValueOf = Integer.valueOf(cardParams.getExpMonth());
            Integer numValueOf2 = Integer.valueOf(cardParams.getExpYear());
            String cvc = cardParams.getCvc();
            Set<String> attribution = cardParams.getAttribution();
            Networks networks = cardParams.getNetworks();
            String str = null;
            return create$default(this, new Card(number, numValueOf, numValueOf2, cvc, str, attribution, (networks == null || (preferred = networks.getPreferred()) == null) ? null : new Card.Networks(preferred), 16, null), new PaymentMethod.BillingDetails(cardParams.getAddress(), null, cardParams.getName(), str, 10, null), cardParams.getMetadata(), (PaymentMethod.AllowRedisplay) null, 8, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Card card, PaymentMethod.BillingDetails billingDetails, Map map, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                allowRedisplay = null;
            }
            return companion.create(card, billingDetails, (Map<String, String>) map, allowRedisplay);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.AllowRedisplay allowRedisplay) {
            Intrinsics.checkNotNullParameter(card, "card");
            return new PaymentMethodCreateParams(card, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                allowRedisplay = null;
            }
            return companion.create(fpx, billingDetails, (Map<String, String>) map, allowRedisplay);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.AllowRedisplay allowRedisplay) {
            Intrinsics.checkNotNullParameter(fpx, "fpx");
            return new PaymentMethodCreateParams(fpx, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                allowRedisplay = null;
            }
            return companion.create(netbanking, billingDetails, (Map<String, String>) map, allowRedisplay);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.AllowRedisplay allowRedisplay) {
            Intrinsics.checkNotNullParameter(netbanking, "netbanking");
            return new PaymentMethodCreateParams(netbanking, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final PaymentMethodCreateParams createFromGooglePay(JSONObject googlePayPaymentData) throws JSONException {
            com.stripe.android.model.Card card;
            TokenizationMethod tokenizationMethod;
            Intrinsics.checkNotNullParameter(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult googlePayResultFromJson = GooglePayResult.INSTANCE.fromJson(googlePayPaymentData);
            Token token = googlePayResultFromJson.getToken();
            String string2 = null;
            String id = token != null ? token.getId() : null;
            if (id == null) {
                id = "";
            }
            String str = id;
            if (token != null && (card = token.getCard()) != null && (tokenizationMethod = card.getTokenizationMethod()) != null) {
                string2 = tokenizationMethod.toString();
            }
            return create$default(this, new Card(null, null, null, null, str, SetsKt.setOfNotNull(string2), null, 79, null), new PaymentMethod.BillingDetails(googlePayResultFromJson.getAddress(), googlePayResultFromJson.getEmail(), googlePayResultFromJson.getName(), googlePayResultFromJson.getPhoneNumber()), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createUSBankAccount$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                allowRedisplay = null;
            }
            return companion.createUSBankAccount(billingDetails, map, allowRedisplay);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.AllowRedisplay allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.USBankAccount, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }
    }
}
