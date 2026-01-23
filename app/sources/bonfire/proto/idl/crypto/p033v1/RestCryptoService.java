package bonfire.proto.idl.crypto.p033v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestCryptoService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0096@¢\u0006\u0004\b$\u0010\rJ\u0018\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020&0\u000bH\u0096@¢\u0006\u0004\b(\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/RestCryptoService;", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "Lbonfire/proto/idl/crypto/v1/CryptoServiceRetrofit;", "retrofit", "<init>", "(Lbonfire/proto/idl/crypto/v1/CryptoServiceRetrofit;)V", "Lbonfire/proto/idl/crypto/v1/NewsfeedRequestDto;", "request", "Lbonfire/proto/idl/crypto/v1/NewsfeedResponseDto;", "Newsfeed", "(Lbonfire/proto/idl/crypto/v1/NewsfeedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesResponseDto;", "GetCryptoCategories", "(Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "GetNonCurrencyPairAccountSwitcher", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "GetCurrencyPairAccountSwitcher", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "GetCryptoUserAgreements", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "GetCryptoPulsePreview", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "GetCryptoPulseFeed", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshRequestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "GetCryptoPulseFeedRefresh", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/CryptoServiceRetrofit;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestCryptoService implements CryptoService {
    private final CryptoServiceRetrofit retrofit;

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {98}, m3647m = "GetCryptoCategories")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoCategories$1 */
    static final class C42911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42911(Continuation<? super C42911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoCategories((GetCryptoCategoriesRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {104}, m3647m = "GetCryptoCategories")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoCategories$2 */
    static final class C42922 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42922(Continuation<? super C42922> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoCategories((Request<GetCryptoCategoriesRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "GetCryptoPulseFeed")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulseFeed$1 */
    static final class C42931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42931(Continuation<? super C42931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulseFeed((GetCryptoPulseFeedRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "GetCryptoPulseFeed")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulseFeed$2 */
    static final class C42942 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42942(Continuation<? super C42942> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulseFeed((Request<GetCryptoPulseFeedRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "GetCryptoPulseFeedRefresh")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulseFeedRefresh$1 */
    static final class C42951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42951(Continuation<? super C42951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulseFeedRefresh((GetCryptoPulseFeedRefreshRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {200}, m3647m = "GetCryptoPulseFeedRefresh")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulseFeedRefresh$2 */
    static final class C42962 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42962(Continuation<? super C42962> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulseFeedRefresh((Request<GetCryptoPulseFeedRefreshRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "GetCryptoPulsePreview")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulsePreview$1 */
    static final class C42971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42971(Continuation<? super C42971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulsePreview((GetCryptoPulsePreviewRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "GetCryptoPulsePreview")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoPulsePreview$2 */
    static final class C42982 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42982(Continuation<? super C42982> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoPulsePreview((Request<GetCryptoPulsePreviewRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "GetCryptoUserAgreements")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoUserAgreements$1 */
    static final class C42991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C42991(Continuation<? super C42991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoUserAgreements((GetCryptoUserAgreementsRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "GetCryptoUserAgreements")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCryptoUserAgreements$2 */
    static final class C43002 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43002(Continuation<? super C43002> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCryptoUserAgreements((Request<GetCryptoUserAgreementsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "GetCurrencyPairAccountSwitcher")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCurrencyPairAccountSwitcher$1 */
    static final class C43011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43011(Continuation<? super C43011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCurrencyPairAccountSwitcher((GetCurrencyPairAccountSwitcherRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {136}, m3647m = "GetCurrencyPairAccountSwitcher")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetCurrencyPairAccountSwitcher$2 */
    static final class C43022 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43022(Continuation<? super C43022> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetCurrencyPairAccountSwitcher((Request<GetCurrencyPairAccountSwitcherRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {115}, m3647m = "GetNonCurrencyPairAccountSwitcher")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetNonCurrencyPairAccountSwitcher$1 */
    static final class C43031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43031(Continuation<? super C43031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetNonCurrencyPairAccountSwitcher((GetNonCurrencyPairAccountSwitcherRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "GetNonCurrencyPairAccountSwitcher")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$GetNonCurrencyPairAccountSwitcher$2 */
    static final class C43042 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43042(Continuation<? super C43042> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.GetNonCurrencyPairAccountSwitcher((Request<GetNonCurrencyPairAccountSwitcherRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {20}, m3647m = "Newsfeed")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$Newsfeed$1 */
    static final class C43051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43051(Continuation<? super C43051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.Newsfeed((NewsfeedRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bonfire.proto.idl.crypto.v1.RestCryptoService", m3645f = "RestCryptoService.kt", m3646l = {26}, m3647m = "Newsfeed")
    /* renamed from: bonfire.proto.idl.crypto.v1.RestCryptoService$Newsfeed$2 */
    static final class C43062 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C43062(Continuation<? super C43062> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoService.this.Newsfeed((Request<NewsfeedRequestDto>) null, this);
        }
    }

    public RestCryptoService(CryptoServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Newsfeed(NewsfeedRequestDto newsfeedRequestDto, Continuation<? super NewsfeedResponseDto> continuation) {
        C43051 c43051;
        if (continuation instanceof C43051) {
            c43051 = (C43051) continuation;
            int i = c43051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43051.label = i - Integer.MIN_VALUE;
            } else {
                c43051 = new C43051(continuation);
            }
        }
        Object objNewsfeed = c43051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objNewsfeed);
            Request<NewsfeedRequestDto> request = new Request<>(newsfeedRequestDto, null, 2, null);
            c43051.label = 1;
            objNewsfeed = Newsfeed(request, c43051);
            if (objNewsfeed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objNewsfeed);
        }
        return ((Response) objNewsfeed).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Newsfeed(Request<NewsfeedRequestDto> request, Continuation<? super Response<NewsfeedResponseDto>> continuation) {
        C43062 c43062;
        if (continuation instanceof C43062) {
            c43062 = (C43062) continuation;
            int i = c43062.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43062.label = i - Integer.MIN_VALUE;
            } else {
                c43062 = new C43062(continuation);
            }
        }
        Object objNewsfeed = c43062.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43062.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objNewsfeed);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String currency_id = !Intrinsics.areEqual(request.getData().getCurrency_id(), "") ? request.getData().getCurrency_id() : null;
            c43062.label = 1;
            objNewsfeed = cryptoServiceRetrofit.Newsfeed(metadata, currency_id, c43062);
            if (objNewsfeed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objNewsfeed);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objNewsfeed);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoCategories(GetCryptoCategoriesRequestDto getCryptoCategoriesRequestDto, Continuation<? super GetCryptoCategoriesResponseDto> continuation) {
        C42911 c42911;
        if (continuation instanceof C42911) {
            c42911 = (C42911) continuation;
            int i = c42911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42911.label = i - Integer.MIN_VALUE;
            } else {
                c42911 = new C42911(continuation);
            }
        }
        Object objGetCryptoCategories = c42911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoCategories);
            Request<GetCryptoCategoriesRequestDto> request = new Request<>(getCryptoCategoriesRequestDto, null, 2, null);
            c42911.label = 1;
            objGetCryptoCategories = GetCryptoCategories(request, c42911);
            if (objGetCryptoCategories == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoCategories);
        }
        return ((Response) objGetCryptoCategories).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoCategories(Request<GetCryptoCategoriesRequestDto> request, Continuation<? super Response<GetCryptoCategoriesResponseDto>> continuation) {
        C42922 c42922;
        if (continuation instanceof C42922) {
            c42922 = (C42922) continuation;
            int i = c42922.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42922.label = i - Integer.MIN_VALUE;
            } else {
                c42922 = new C42922(continuation);
            }
        }
        Object objGetCryptoCategories = c42922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoCategories);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String location = !Intrinsics.areEqual(request.getData().getLocation(), "") ? request.getData().getLocation() : null;
            String asset_type = Intrinsics.areEqual(request.getData().getAsset_type(), "") ? null : request.getData().getAsset_type();
            c42922.label = 1;
            objGetCryptoCategories = cryptoServiceRetrofit.GetCryptoCategories(metadata, location, asset_type, c42922);
            if (objGetCryptoCategories == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoCategories);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoCategories);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNonCurrencyPairAccountSwitcher(GetNonCurrencyPairAccountSwitcherRequestDto getNonCurrencyPairAccountSwitcherRequestDto, Continuation<? super GetNonCurrencyPairAccountSwitcherResponseDto> continuation) {
        C43031 c43031;
        if (continuation instanceof C43031) {
            c43031 = (C43031) continuation;
            int i = c43031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43031.label = i - Integer.MIN_VALUE;
            } else {
                c43031 = new C43031(continuation);
            }
        }
        Object objGetNonCurrencyPairAccountSwitcher = c43031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNonCurrencyPairAccountSwitcher);
            Request<GetNonCurrencyPairAccountSwitcherRequestDto> request = new Request<>(getNonCurrencyPairAccountSwitcherRequestDto, null, 2, null);
            c43031.label = 1;
            objGetNonCurrencyPairAccountSwitcher = GetNonCurrencyPairAccountSwitcher(request, c43031);
            if (objGetNonCurrencyPairAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNonCurrencyPairAccountSwitcher);
        }
        return ((Response) objGetNonCurrencyPairAccountSwitcher).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNonCurrencyPairAccountSwitcher(Request<GetNonCurrencyPairAccountSwitcherRequestDto> request, Continuation<? super Response<GetNonCurrencyPairAccountSwitcherResponseDto>> continuation) {
        C43042 c43042;
        if (continuation instanceof C43042) {
            c43042 = (C43042) continuation;
            int i = c43042.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43042.label = i - Integer.MIN_VALUE;
            } else {
                c43042 = new C43042(continuation);
            }
        }
        Object objGetNonCurrencyPairAccountSwitcher = c43042.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43042.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNonCurrencyPairAccountSwitcher);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c43042.label = 1;
            objGetNonCurrencyPairAccountSwitcher = cryptoServiceRetrofit.GetNonCurrencyPairAccountSwitcher(metadata, c43042);
            if (objGetNonCurrencyPairAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNonCurrencyPairAccountSwitcher);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetNonCurrencyPairAccountSwitcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrencyPairAccountSwitcher(GetCurrencyPairAccountSwitcherRequestDto getCurrencyPairAccountSwitcherRequestDto, Continuation<? super GetCurrencyPairAccountSwitcherResponseDto> continuation) {
        C43011 c43011;
        if (continuation instanceof C43011) {
            c43011 = (C43011) continuation;
            int i = c43011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43011.label = i - Integer.MIN_VALUE;
            } else {
                c43011 = new C43011(continuation);
            }
        }
        Object objGetCurrencyPairAccountSwitcher = c43011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrencyPairAccountSwitcher);
            Request<GetCurrencyPairAccountSwitcherRequestDto> request = new Request<>(getCurrencyPairAccountSwitcherRequestDto, null, 2, null);
            c43011.label = 1;
            objGetCurrencyPairAccountSwitcher = GetCurrencyPairAccountSwitcher(request, c43011);
            if (objGetCurrencyPairAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrencyPairAccountSwitcher);
        }
        return ((Response) objGetCurrencyPairAccountSwitcher).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrencyPairAccountSwitcher(Request<GetCurrencyPairAccountSwitcherRequestDto> request, Continuation<? super Response<GetCurrencyPairAccountSwitcherResponseDto>> continuation) {
        C43022 c43022;
        if (continuation instanceof C43022) {
            c43022 = (C43022) continuation;
            int i = c43022.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43022.label = i - Integer.MIN_VALUE;
            } else {
                c43022 = new C43022(continuation);
            }
        }
        Object objGetCurrencyPairAccountSwitcher = c43022.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43022.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrencyPairAccountSwitcher);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String currency_pair_id = request.getData().getCurrency_pair_id();
            c43022.label = 1;
            objGetCurrencyPairAccountSwitcher = cryptoServiceRetrofit.GetCurrencyPairAccountSwitcher(metadata, currency_pair_id, c43022);
            if (objGetCurrencyPairAccountSwitcher == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrencyPairAccountSwitcher);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCurrencyPairAccountSwitcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoUserAgreements(GetCryptoUserAgreementsRequestDto getCryptoUserAgreementsRequestDto, Continuation<? super GetCryptoUserAgreementsResponseDto> continuation) {
        C42991 c42991;
        if (continuation instanceof C42991) {
            c42991 = (C42991) continuation;
            int i = c42991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42991.label = i - Integer.MIN_VALUE;
            } else {
                c42991 = new C42991(continuation);
            }
        }
        Object objGetCryptoUserAgreements = c42991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoUserAgreements);
            Request<GetCryptoUserAgreementsRequestDto> request = new Request<>(getCryptoUserAgreementsRequestDto, null, 2, null);
            c42991.label = 1;
            objGetCryptoUserAgreements = GetCryptoUserAgreements(request, c42991);
            if (objGetCryptoUserAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoUserAgreements);
        }
        return ((Response) objGetCryptoUserAgreements).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoUserAgreements(Request<GetCryptoUserAgreementsRequestDto> request, Continuation<? super Response<GetCryptoUserAgreementsResponseDto>> continuation) {
        C43002 c43002;
        if (continuation instanceof C43002) {
            c43002 = (C43002) continuation;
            int i = c43002.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c43002.label = i - Integer.MIN_VALUE;
            } else {
                c43002 = new C43002(continuation);
            }
        }
        Object objGetCryptoUserAgreements = c43002.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c43002.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoUserAgreements);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = !Intrinsics.areEqual(request.getData().getRhs_account_number(), "") ? request.getData().getRhs_account_number() : null;
            c43002.label = 1;
            objGetCryptoUserAgreements = cryptoServiceRetrofit.GetCryptoUserAgreements(metadata, rhs_account_number, c43002);
            if (objGetCryptoUserAgreements == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoUserAgreements);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoUserAgreements);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulsePreview(GetCryptoPulsePreviewRequestDto getCryptoPulsePreviewRequestDto, Continuation<? super GetCryptoPulsePreviewResponseDto> continuation) {
        C42971 c42971;
        if (continuation instanceof C42971) {
            c42971 = (C42971) continuation;
            int i = c42971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42971.label = i - Integer.MIN_VALUE;
            } else {
                c42971 = new C42971(continuation);
            }
        }
        Object objGetCryptoPulsePreview = c42971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulsePreview);
            Request<GetCryptoPulsePreviewRequestDto> request = new Request<>(getCryptoPulsePreviewRequestDto, null, 2, null);
            c42971.label = 1;
            objGetCryptoPulsePreview = GetCryptoPulsePreview(request, c42971);
            if (objGetCryptoPulsePreview == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulsePreview);
        }
        return ((Response) objGetCryptoPulsePreview).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulsePreview(Request<GetCryptoPulsePreviewRequestDto> request, Continuation<? super Response<GetCryptoPulsePreviewResponseDto>> continuation) {
        C42982 c42982;
        if (continuation instanceof C42982) {
            c42982 = (C42982) continuation;
            int i = c42982.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42982.label = i - Integer.MIN_VALUE;
            } else {
                c42982 = new C42982(continuation);
            }
        }
        Object objGetCryptoPulsePreview = c42982.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42982.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulsePreview);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            c42982.label = 1;
            objGetCryptoPulsePreview = cryptoServiceRetrofit.GetCryptoPulsePreview(metadata, account_id, c42982);
            if (objGetCryptoPulsePreview == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulsePreview);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoPulsePreview);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulseFeed(GetCryptoPulseFeedRequestDto getCryptoPulseFeedRequestDto, Continuation<? super GetCryptoPulseFeedResponseDto> continuation) {
        C42931 c42931;
        if (continuation instanceof C42931) {
            c42931 = (C42931) continuation;
            int i = c42931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42931.label = i - Integer.MIN_VALUE;
            } else {
                c42931 = new C42931(continuation);
            }
        }
        Object objGetCryptoPulseFeed = c42931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulseFeed);
            Request<GetCryptoPulseFeedRequestDto> request = new Request<>(getCryptoPulseFeedRequestDto, null, 2, null);
            c42931.label = 1;
            objGetCryptoPulseFeed = GetCryptoPulseFeed(request, c42931);
            if (objGetCryptoPulseFeed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulseFeed);
        }
        return ((Response) objGetCryptoPulseFeed).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulseFeed(Request<GetCryptoPulseFeedRequestDto> request, Continuation<? super Response<GetCryptoPulseFeedResponseDto>> continuation) {
        C42942 c42942;
        if (continuation instanceof C42942) {
            c42942 = (C42942) continuation;
            int i = c42942.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42942.label = i - Integer.MIN_VALUE;
            } else {
                c42942 = new C42942(continuation);
            }
        }
        Object objGetCryptoPulseFeed = c42942.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42942.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulseFeed);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            c42942.label = 1;
            objGetCryptoPulseFeed = cryptoServiceRetrofit.GetCryptoPulseFeed(metadata, account_id, c42942);
            if (objGetCryptoPulseFeed == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulseFeed);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoPulseFeed);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bonfire.proto.idl.crypto.p033v1.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulseFeedRefresh(GetCryptoPulseFeedRefreshRequestDto getCryptoPulseFeedRefreshRequestDto, Continuation<? super GetCryptoPulseFeedRefreshResponseDto> continuation) {
        C42951 c42951;
        if (continuation instanceof C42951) {
            c42951 = (C42951) continuation;
            int i = c42951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42951.label = i - Integer.MIN_VALUE;
            } else {
                c42951 = new C42951(continuation);
            }
        }
        Object objGetCryptoPulseFeedRefresh = c42951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulseFeedRefresh);
            Request<GetCryptoPulseFeedRefreshRequestDto> request = new Request<>(getCryptoPulseFeedRefreshRequestDto, null, 2, null);
            c42951.label = 1;
            objGetCryptoPulseFeedRefresh = GetCryptoPulseFeedRefresh(request, c42951);
            if (objGetCryptoPulseFeedRefresh == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulseFeedRefresh);
        }
        return ((Response) objGetCryptoPulseFeedRefresh).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoPulseFeedRefresh(Request<GetCryptoPulseFeedRefreshRequestDto> request, Continuation<? super Response<GetCryptoPulseFeedRefreshResponseDto>> continuation) {
        C42962 c42962;
        if (continuation instanceof C42962) {
            c42962 = (C42962) continuation;
            int i = c42962.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42962.label = i - Integer.MIN_VALUE;
            } else {
                c42962 = new C42962(continuation);
            }
        }
        C42962 c429622 = c42962;
        Object objGetCryptoPulseFeedRefresh = c429622.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c429622.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoPulseFeedRefresh);
            CryptoServiceRetrofit cryptoServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            List<String> currency_pair_ids = request.getData().getCurrency_pair_ids();
            Boolean boolBoxBoolean = request.getData().getInclude_digest() ? boxing.boxBoolean(request.getData().getInclude_digest()) : null;
            c429622.label = 1;
            objGetCryptoPulseFeedRefresh = cryptoServiceRetrofit.GetCryptoPulseFeedRefresh(metadata, account_id, currency_pair_ids, boolBoxBoolean, c429622);
            if (objGetCryptoPulseFeedRefresh == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoPulseFeedRefresh);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoPulseFeedRefresh);
    }
}
