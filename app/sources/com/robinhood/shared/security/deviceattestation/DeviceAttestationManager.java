package com.robinhood.shared.security.deviceattestation;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import baffi.service.p016v1.common.DevicePlatformDto;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.baffi.proto.p282v1.publicservice.AttestDeviceRequestDto;
import com.robinhood.baffi.proto.p282v1.publicservice.AttestDeviceResponseDto;
import com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService;
import com.robinhood.baffi.proto.p282v1.publicservice.DeviceAttestStatusRequestDto;
import com.robinhood.baffi.proto.p282v1.publicservice.DeviceAttestStatusResponseDto;
import com.robinhood.baffi.proto.p282v1.publicservice.GenerateDeviceNonceRequestDto;
import com.robinhood.baffi.proto.p282v1.publicservice.GenerateDeviceNonceResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationEnrollmentResult;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.ByteString;

/* compiled from: DeviceAttestationManager.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001fJ\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010\u001bJ.\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010/J\u0018\u00100\u001a\u0004\u0018\u00010\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u00101J\u001e\u00102\u001a\u0002H3\"\u0004\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304H\u0082@¢\u0006\u0002\u00105R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "baffiService", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/prefs/TrustedDeviceIdPref;Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;Landroid/content/Context;)V", "keyStore", "Ljava/security/KeyStore;", "kotlin.jvm.PlatformType", "requestKeyIdHeader", "Lkotlin/Pair;", "", "getRequestKeyIdHeader", "()Lkotlin/Pair;", "deviceAttestVersionHeader", "getDeviceAttestVersionHeader", "integrityManager", "Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "isRegistered", "", "()Z", "getKeyId", "generateNonce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enrollDevice", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "isInPlayIntegrityExperiment", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signRequest", "nonce", "bodySha256", "Lokio/ByteString;", "enrollDeviceInternal", "registerDevice", "nonceBase64", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkDeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "attestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponseDto;", "attestationChainBase64", "", "playIntegrityToken", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPlayIntegrityToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "T", "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DeviceAttestationManager {
    private static final String ALIAS = "robinhood_device_attestation_keystore_alias";
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    private static final long ENROLL_RETRY_INTERVAL_MILLIS = 100;
    private static final long GOOGLE_CLOUD_TOKEN = 848403716711L;
    private static final int MAX_ENROLL_RETRY_ATTEMPTS = 3;
    private final BaffiPublicService baffiService;
    private final Context context;
    private final StandardIntegrityManager integrityManager;
    private final KeyStore keyStore;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "attestDevice")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$attestDevice$1 */
    static final class C396601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C396601(Continuation<? super C396601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.attestDevice(null, null, null, this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {200}, m3647m = "checkDeviceAttestStatus")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$checkDeviceAttestStatus$1 */
    static final class C396611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C396611(Continuation<? super C396611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.checkDeviceAttestStatus(this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {86, 90}, m3647m = "enrollDevice")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$enrollDevice$1 */
    static final class C396621 extends ContinuationImpl {
        int I$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C396621(Continuation<? super C396621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.enrollDevice(false, this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {125, 131, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "enrollDeviceInternal")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$enrollDeviceInternal$1 */
    static final class C396631 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C396631(Continuation<? super C396631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.enrollDeviceInternal(false, this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "generateNonce")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$generateNonce$1 */
    static final class C396641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C396641(Continuation<? super C396641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.generateNonce(this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {182, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "registerDevice")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$registerDevice$1 */
    static final class C396651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C396651(Continuation<? super C396651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.registerDevice(null, false, this);
        }
    }

    /* compiled from: DeviceAttestationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.deviceattestation.DeviceAttestationManager", m3645f = "DeviceAttestationManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "requestPlayIntegrityToken")
    /* renamed from: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$requestPlayIntegrityToken$1 */
    static final class C396661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C396661(Continuation<? super C396661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceAttestationManager.this.requestPlayIntegrityToken(null, this);
        }
    }

    public DeviceAttestationManager(TrustedDeviceIdPref trustedDeviceIdPref, BaffiPublicService baffiService, Context context) {
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(baffiService, "baffiService");
        Intrinsics.checkNotNullParameter(context, "context");
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.baffiService = baffiService;
        this.context = context;
        this.keyStore = KeyStore.getInstance("AndroidKeyStore");
        StandardIntegrityManager standardIntegrityManagerCreateStandard = IntegrityManagerFactory.createStandard(context);
        Intrinsics.checkNotNullExpressionValue(standardIntegrityManagerCreateStandard, "createStandard(...)");
        this.integrityManager = standardIntegrityManagerCreateStandard;
    }

    private final Tuples2<String, String> getRequestKeyIdHeader() {
        return Tuples4.m3642to(DeviceAttestationConstants.HEADER_REQUEST_KEY_ID, getKeyId());
    }

    private final Tuples2<String, String> getDeviceAttestVersionHeader() {
        return Tuples4.m3642to(DeviceAttestationConstants.HEADER_DEVICE_ATTEST_VERSION, DeviceAttestationConstants.DEVICE_ATTEST_VERSION);
    }

    public final boolean isRegistered() throws NoSuchAlgorithmException, IOException, CertificateException {
        this.keyStore.load(null);
        return this.keyStore.containsAlias(ALIAS);
    }

    public final String getKeyId() {
        String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(this.keyStore.getCertificate(ALIAS).getPublicKey().getEncoded()), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateNonce(Continuation<? super String> continuation) {
        C396641 c396641;
        if (continuation instanceof C396641) {
            c396641 = (C396641) continuation;
            int i = c396641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396641.label = i - Integer.MIN_VALUE;
            } else {
                c396641 = new C396641(continuation);
            }
        }
        Object objGenerateDeviceNonce = c396641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396641.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGenerateDeviceNonce);
                BaffiPublicService baffiPublicService = this.baffiService;
                GenerateDeviceNonceRequestDto generateDeviceNonceRequestDto = new GenerateDeviceNonceRequestDto(this.trustedDeviceIdPref.get());
                c396641.label = 1;
                objGenerateDeviceNonce = baffiPublicService.GenerateDeviceNonce(generateDeviceNonceRequestDto, c396641);
                if (objGenerateDeviceNonce == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGenerateDeviceNonce);
            }
            return ((GenerateDeviceNonceResponseDto) objGenerateDeviceNonce).getNonce_base64();
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006b -> B:29:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enrollDevice(boolean z, Continuation<? super DeviceAttestationEnrollmentResult> continuation) throws NoSuchAlgorithmException, IOException, CertificateException {
        C396621 c396621;
        int i;
        int i2;
        boolean z2;
        DeviceAttestationEnrollmentResult deviceAttestationEnrollmentResult;
        if (continuation instanceof C396621) {
            c396621 = (C396621) continuation;
            int i3 = c396621.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c396621.label = i3 - Integer.MIN_VALUE;
            } else {
                c396621 = new C396621(continuation);
            }
        }
        Object obj = c396621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c396621.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            i = 0;
            if (i >= 3) {
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c396621.I$0;
                z2 = c396621.Z$0;
                ResultKt.throwOnFailure(obj);
                i = i2 + 1;
                z = z2;
                if (i >= 3) {
                    c396621.Z$0 = z;
                    c396621.I$0 = i;
                    c396621.label = 1;
                    Object objEnrollDeviceInternal = enrollDeviceInternal(z, c396621);
                    if (objEnrollDeviceInternal != coroutine_suspended) {
                        z2 = z;
                        i2 = i;
                        obj = objEnrollDeviceInternal;
                        deviceAttestationEnrollmentResult = (DeviceAttestationEnrollmentResult) obj;
                        if (deviceAttestationEnrollmentResult instanceof DeviceAttestationEnrollmentResult.ServerError) {
                            return deviceAttestationEnrollmentResult;
                        }
                        c396621.Z$0 = z2;
                        c396621.I$0 = i2;
                        c396621.label = 2;
                    }
                    return coroutine_suspended;
                }
                return DeviceAttestationEnrollmentResult.ServerError.INSTANCE;
            }
            i2 = c396621.I$0;
            z2 = c396621.Z$0;
            ResultKt.throwOnFailure(obj);
            deviceAttestationEnrollmentResult = (DeviceAttestationEnrollmentResult) obj;
            if (deviceAttestationEnrollmentResult instanceof DeviceAttestationEnrollmentResult.ServerError) {
            }
        }
    }

    public final String signRequest(String nonce, ByteString bodySha256) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(bodySha256, "bodySha256");
        this.keyStore.load(null);
        byte[] byteArray = bodySha256.toByteArray();
        byte[] bArrDecode = Base64.decode(nonce, 2);
        Intrinsics.checkNotNull(bArrDecode);
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(ArraysKt.plus(bArrDecode, byteArray));
        KeyStore.Entry entry = this.keyStore.getEntry(ALIAS, null);
        if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
            throw new IllegalStateException("Check failed.");
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        signature.update(bArrDigest);
        String strEncodeToString = Base64.encodeToString(signature.sign(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:46:0x0091, B:20:0x003d, B:40:0x0080, B:41:0x0082, B:43:0x0088, B:48:0x0094, B:23:0x0043, B:32:0x0065, B:34:0x006d, B:36:0x0070, B:27:0x0050, B:29:0x005a, B:37:0x0075), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:46:0x0091, B:20:0x003d, B:40:0x0080, B:41:0x0082, B:43:0x0088, B:48:0x0094, B:23:0x0043, B:32:0x0065, B:34:0x006d, B:36:0x0070, B:27:0x0050, B:29:0x005a, B:37:0x0075), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enrollDeviceInternal(boolean z, Continuation<? super DeviceAttestationEnrollmentResult> continuation) throws NoSuchAlgorithmException, IOException, CertificateException {
        C396631 c396631;
        DeviceAttestStatusResponseDto deviceAttestStatusResponseDto;
        String nonce_base64;
        if (continuation instanceof C396631) {
            c396631 = (C396631) continuation;
            int i = c396631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396631.label = i - Integer.MIN_VALUE;
            } else {
                c396631 = new C396631(continuation);
            }
        }
        Object objGenerateNonce = c396631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396631.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGenerateNonce);
                try {
                    this.keyStore.load(null);
                    if (this.keyStore.containsAlias(ALIAS)) {
                        c396631.Z$0 = z;
                        c396631.label = 1;
                        objGenerateNonce = checkDeviceAttestStatus(c396631);
                        if (objGenerateNonce == coroutine_suspended) {
                        }
                        deviceAttestStatusResponseDto = (DeviceAttestStatusResponseDto) objGenerateNonce;
                        if (!deviceAttestStatusResponseDto.getRegistered()) {
                        }
                    } else {
                        c396631.Z$0 = z;
                        c396631.label = 2;
                        objGenerateNonce = generateNonce(c396631);
                        if (objGenerateNonce == coroutine_suspended) {
                        }
                        nonce_base64 = (String) objGenerateNonce;
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
                    return DeviceAttestationEnrollmentResult.KeyStoreLoadError.INSTANCE;
                }
            }
            if (i2 == 1) {
                z = c396631.Z$0;
                ResultKt.throwOnFailure(objGenerateNonce);
                deviceAttestStatusResponseDto = (DeviceAttestStatusResponseDto) objGenerateNonce;
                if (!deviceAttestStatusResponseDto.getRegistered()) {
                    return DeviceAttestationEnrollmentResult.AlreadyRegistered.INSTANCE;
                }
                nonce_base64 = deviceAttestStatusResponseDto.getNonce_base64();
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objGenerateNonce);
                    return (DeviceAttestationEnrollmentResult) objGenerateNonce;
                }
                z = c396631.Z$0;
                ResultKt.throwOnFailure(objGenerateNonce);
                nonce_base64 = (String) objGenerateNonce;
            }
            if (nonce_base64.length() > 0) {
                c396631.label = 3;
                objGenerateNonce = registerDevice(nonce_base64, z, c396631);
            } else {
                return DeviceAttestationEnrollmentResult.InvalidNonce.INSTANCE;
            }
        } catch (Exception e2) {
            if (Throwables.isNetworkRelated(e2)) {
                return DeviceAttestationEnrollmentResult.ServerError.INSTANCE;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e2, false, null, 4, null);
            return DeviceAttestationEnrollmentResult.Error.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (r14 != r2) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.robinhood.shared.security.deviceattestation.DeviceAttestationManager] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerDevice(String str, boolean z, Continuation<? super DeviceAttestationEnrollmentResult> continuation) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        C396651 c396651;
        ArrayList arrayList;
        String str2;
        if (continuation instanceof C396651) {
            c396651 = (C396651) continuation;
            int i = c396651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396651.label = i - Integer.MIN_VALUE;
            } else {
                c396651 = new C396651(continuation);
            }
        }
        Object objRequestPlayIntegrityToken = c396651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396651.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRequestPlayIntegrityToken);
                byte[] bArrDecode = Base64.decode(str, 2);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(ALIAS, 12).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256", "SHA-512").setAttestationChallenge(bArrDecode).build();
                Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
                keyPairGenerator.initialize(keyGenParameterSpecBuild);
                keyPairGenerator.generateKeyPair();
                Certificate[] certificateChain = this.keyStore.getCertificateChain(ALIAS);
                if (certificateChain != null && certificateChain.length != 0) {
                    arrayList = new ArrayList(certificateChain.length);
                    for (Certificate certificate : certificateChain) {
                        Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        arrayList.add(Base64.encodeToString(((X509Certificate) certificate).getEncoded(), 0));
                    }
                    if (z) {
                        c396651.L$0 = str;
                        c396651.L$1 = arrayList;
                        c396651.label = 1;
                        objRequestPlayIntegrityToken = requestPlayIntegrityToken(str, c396651);
                        if (objRequestPlayIntegrityToken == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        str2 = null;
                        c396651.L$0 = null;
                        c396651.L$1 = null;
                        c396651.label = 2;
                        objRequestPlayIntegrityToken = attestDevice(str, arrayList, str2, c396651);
                    }
                }
                return DeviceAttestationEnrollmentResult.InvalidCertificate.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRequestPlayIntegrityToken);
                if (((AttestDeviceResponseDto) objRequestPlayIntegrityToken).getSuccess()) {
                    return DeviceAttestationEnrollmentResult.Success.INSTANCE;
                }
                return DeviceAttestationEnrollmentResult.Failed.INSTANCE;
            }
            ?? r12 = (List) c396651.L$1;
            String str3 = (String) c396651.L$0;
            ResultKt.throwOnFailure(objRequestPlayIntegrityToken);
            arrayList = r12;
            str = str3;
            str2 = (String) objRequestPlayIntegrityToken;
            c396651.L$0 = null;
            c396651.L$1 = null;
            c396651.label = 2;
            objRequestPlayIntegrityToken = attestDevice(str, arrayList, str2, c396651);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            return DeviceAttestationEnrollmentResult.Error.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkDeviceAttestStatus(Continuation<? super DeviceAttestStatusResponseDto> continuation) {
        C396611 c396611;
        if (continuation instanceof C396611) {
            c396611 = (C396611) continuation;
            int i = c396611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396611.label = i - Integer.MIN_VALUE;
            } else {
                c396611 = new C396611(continuation);
            }
        }
        Object objDeviceAttestStatus = c396611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeviceAttestStatus);
            BaffiPublicService baffiPublicService = this.baffiService;
            Request<DeviceAttestStatusRequestDto> request = new Request<>(new DeviceAttestStatusRequestDto(this.trustedDeviceIdPref.get()), MapsKt.mapOf(getRequestKeyIdHeader()));
            c396611.label = 1;
            objDeviceAttestStatus = baffiPublicService.DeviceAttestStatus(request, c396611);
            if (objDeviceAttestStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeviceAttestStatus);
        }
        return ((Response) objDeviceAttestStatus).getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attestDevice(String str, List<String> list, String str2, Continuation<? super AttestDeviceResponseDto> continuation) {
        C396601 c396601;
        if (continuation instanceof C396601) {
            c396601 = (C396601) continuation;
            int i = c396601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396601.label = i - Integer.MIN_VALUE;
            } else {
                c396601 = new C396601(continuation);
            }
        }
        Object objAttestDevice = c396601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAttestDevice);
            AttestDeviceRequestDto attestDeviceRequestDto = new AttestDeviceRequestDto(DevicePlatformDto.PLATFORM_ANDROID, null, list, str2, null, this.trustedDeviceIdPref.get(), 18, null);
            BaffiPublicService baffiPublicService = this.baffiService;
            Request<AttestDeviceRequestDto> request = new Request<>(attestDeviceRequestDto, MapsKt.mapOf(getRequestKeyIdHeader(), getDeviceAttestVersionHeader(), Tuples4.m3642to(DeviceAttestationConstants.HEADER_REQUEST_NONCE, str)));
            c396601.label = 1;
            objAttestDevice = baffiPublicService.AttestDevice(request, c396601);
            if (objAttestDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAttestDevice);
        }
        return ((Response) objAttestDevice).getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPlayIntegrityToken(String str, Continuation<? super String> continuation) throws NoSuchAlgorithmException {
        C396661 c396661;
        if (continuation instanceof C396661) {
            c396661 = (C396661) continuation;
            int i = c396661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396661.label = i - Integer.MIN_VALUE;
            } else {
                c396661 = new C396661(continuation);
            }
        }
        Object objAwait = c396661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396661.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Task<StandardIntegrityManager.StandardIntegrityTokenProvider> taskPrepareIntegrityToken = this.integrityManager.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(GOOGLE_CLOUD_TOKEN).build());
                Intrinsics.checkNotNullExpressionValue(taskPrepareIntegrityToken, "prepareIntegrityToken(...)");
                c396661.L$0 = str;
                c396661.label = 1;
                objAwait = await(taskPrepareIntegrityToken, c396661);
                if (objAwait == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
                return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
            }
            str = (String) c396661.L$0;
            ResultKt.throwOnFailure(objAwait);
            String str2 = str + getKeyId();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Task<StandardIntegrityManager.StandardIntegrityToken> taskRequest = ((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(Base64.encodeToString(messageDigest.digest(bytes), 2)).build());
            Intrinsics.checkNotNullExpressionValue(taskRequest, "request(...)");
            c396661.L$0 = null;
            c396661.label = 2;
            objAwait = await(taskRequest, c396661);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object await(Task<T> task, Continuation<? super T> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        task.addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$await$2$1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(T t) {
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(t));
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.shared.security.deviceattestation.DeviceAttestationManager$await$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                Continuation<T> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(exception)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
