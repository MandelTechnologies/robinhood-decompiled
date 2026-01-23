package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl;
import com.stripe.android.stripe3ds2.init.HardwareIdSupplier;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.SecurityChecker2;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.p418ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.PublicKeyFactory;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory2;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeThreeDs2ServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 =2\u00020\u0001:\u0001=B?\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0017B+\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001aB1\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001bB1\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001cBQ\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010#JY\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\f2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101Ja\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\f2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b0\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "transactionFactory", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "publicKeyFactory", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "warnings", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;Ljava/util/List;)V", "Landroid/content/Context;", "context", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;)V", "", "sdkReferenceNumber", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecker", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lkotlin/coroutines/CoroutineContext;)V", "directoryServerID", "messageVersion", "isLiveMode", "directoryServerName", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "dsPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "createTransaction", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StripeThreeDs2ServiceImpl implements StripeThreeDs2Service {
    private static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final ImageCache imageCache;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PublicKeyFactory publicKeyFactory;
    private final TransactionFactory transactionFactory;
    private final List<Warning> warnings;

    public StripeThreeDs2ServiceImpl(MessageVersionRegistry messageVersionRegistry, ImageCache imageCache, ErrorReporter errorReporter, TransactionFactory transactionFactory, PublicKeyFactory publicKeyFactory, List<Warning> warnings) {
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(transactionFactory, "transactionFactory");
        Intrinsics.checkNotNullParameter(publicKeyFactory, "publicKeyFactory");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        this.messageVersionRegistry = messageVersionRegistry;
        this.imageCache = imageCache;
        this.errorReporter = errorReporter;
        this.transactionFactory = transactionFactory;
        this.publicKeyFactory = publicKeyFactory;
        this.warnings = warnings;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext workContext) {
        this(context, "3DS_LOA_SDK_STIN_020100_00142", z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, String sdkReferenceNumber, boolean z, CoroutineContext workContext) {
        this(context, ImageCache.Default.INSTANCE, sdkReferenceNumber, z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, boolean z, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(context, imageCache, str, new DefaultErrorReporter(applicationContext, null, null, Logger.INSTANCE.get(z), null, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null), coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        this(context, imageCache, str, errorReporter, new StripeEphemeralKeyPairGenerator(errorReporter), new HardwareIdSupplier(context), new SecurityChecker2(null, 1, 0 == true ? 1 : 0), new MessageVersionRegistry(), coroutineContext);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, HardwareIdSupplier hardwareIdSupplier, SecurityChecker securityChecker, MessageVersionRegistry messageVersionRegistry, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(messageVersionRegistry, imageCache, errorReporter, new TransactionFactory2(new DefaultAuthenticationRequestParametersFactory(new DeviceDataFactoryImpl(applicationContext, hardwareIdSupplier), new DeviceParamNotAvailableFactoryImpl(hardwareIdSupplier), securityChecker, ephemeralKeyPairGenerator, new DefaultAppInfoRepository(context, coroutineContext), messageVersionRegistry, str, errorReporter, coroutineContext), ephemeralKeyPairGenerator, str), new PublicKeyFactory(context, errorReporter), securityChecker.getWarnings());
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public Transaction createTransaction(SdkTransactionId sdkTransactionId, String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, StripeUiCustomization uiCustomization) throws SDKRuntimeException, InvalidInputException {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerID, "directoryServerID");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(dsPublicKey, "dsPublicKey");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        return createTransaction(directoryServerID, messageVersion, isLiveMode, directoryServerName, rootCerts, dsPublicKey, keyId, sdkTransactionId);
    }

    private final Transaction createTransaction(String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, SdkTransactionId sdkTransactionId) {
        if (!this.messageVersionRegistry.isSupported(messageVersion)) {
            if (messageVersion == null) {
                messageVersion = "";
            }
            throw new InvalidInputException("Message version is unsupported: " + messageVersion, null, 2, null);
        }
        return this.transactionFactory.create(directoryServerID, rootCerts, dsPublicKey, keyId, sdkTransactionId, isLiveMode, Brand.INSTANCE.lookup$3ds2sdk_release(directoryServerName, this.errorReporter));
    }

    /* compiled from: StripeThreeDs2ServiceImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl$Companion;", "", "()V", "STRIPE_SDK_REFERENCE_NUMBER", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
