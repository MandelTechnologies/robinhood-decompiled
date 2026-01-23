package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonAdapter;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.squareup.workflow1.p415ui.ViewRegistry2;
import com.squareup.workflow1.p415ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import com.withpersona.sdk2.inquiry.internal.InquiryCompleteRunner;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.internal.InquiryInitializingRunner;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.p420ui.DisableableContainer;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieService;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.NumberAdapter;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: InquiryModule.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0003\u001a\u00070\u0002¢\u0006\u0002\b!H\u0007¢\u0006\u0004\b\u0003\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\"¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryModule;", "", "", "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lretrofit2/Retrofit;", "retrofit", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "inquiryService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "uiService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;", "governmentService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdService;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieService;", "selfieService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieService;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "documentService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "webRtcRetrofit", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "webRtcService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcService;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "fallbackModeService", "(Lretrofit2/Retrofit;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fallbackModeServerEndpoint;
    private final String serverEndpoint;
    private final String webRtcServerEndpoint;

    @JvmStatic
    public static final Set<Object> provideMoshiJsonAdapter() {
        return INSTANCE.provideMoshiJsonAdapter();
    }

    @JvmStatic
    public static final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return INSTANCE.provideMoshiJsonAdapterBinding();
    }

    @JvmStatic
    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    @JvmStatic
    public static final Set<ViewFactory<?>> provideViewBindings() {
        return INSTANCE.provideViewBindings();
    }

    @JvmStatic
    public static final ViewRegistry viewRegistry(Set<ViewFactory<?>> set) {
        return INSTANCE.viewRegistry(set);
    }

    public InquiryModule(String serverEndpoint, String webRtcServerEndpoint, String fallbackModeServerEndpoint) {
        Intrinsics.checkNotNullParameter(serverEndpoint, "serverEndpoint");
        Intrinsics.checkNotNullParameter(webRtcServerEndpoint, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        this.serverEndpoint = serverEndpoint;
        this.webRtcServerEndpoint = webRtcServerEndpoint;
        this.fallbackModeServerEndpoint = fallbackModeServerEndpoint;
    }

    public final InquiryService inquiryService(Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(InquiryService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (InquiryService) objCreate;
    }

    public final UiService uiService(Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(UiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (UiService) objCreate;
    }

    public final GovernmentIdService governmentService(Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(GovernmentIdService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (GovernmentIdService) objCreate;
    }

    public final SelfieService selfieService(Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SelfieService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (SelfieService) objCreate;
    }

    public final DocumentService documentService(Retrofit retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(DocumentService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (DocumentService) objCreate;
    }

    public final WebRtcService webRtcService(Retrofit webRtcRetrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(webRtcRetrofit, "webRtcRetrofit");
        Object objCreate = webRtcRetrofit.newBuilder().baseUrl(this.webRtcServerEndpoint).build().create(WebRtcService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (WebRtcService) objCreate;
    }

    public final FallbackModeService fallbackModeService(Retrofit fallbackModeRetrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objCreate = fallbackModeRetrofit.newBuilder().baseUrl(this.fallbackModeServerEndpoint).build().create(FallbackModeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (FallbackModeService) objCreate;
    }

    /* renamed from: serverEndpoint, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    /* compiled from: InquiryModule.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0015\u0010\u0006\u001a\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\b¢\u0006\u0002\b\t0\u0007H\u0007J\u0012\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0007J\r\u0010\u000b\u001a\u00070\f¢\u0006\u0002\b\rH\u0007J\u0013\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f0\u0007H\u0007J\u0012\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0007H\u0007J\u0013\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u000f0\u0007H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryModule$Companion;", "", "<init>", "()V", "viewRegistry", "Lcom/squareup/workflow1/ui/ViewRegistry;", "viewBindings", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideViewBindings", "userAgent", "", "Lcom/withpersona/sdk2/inquiry/network/core/HttpHeader;", "provideMoshiJsonAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "provideMoshiJsonAdapterBinding", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "provideMoshiJsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ViewRegistry viewRegistry(Set<ViewFactory<?>> viewBindings) {
            Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
            ViewFactory[] viewFactoryArr = (ViewFactory[]) viewBindings.toArray(new ViewFactory[0]);
            return ViewRegistry2.ViewRegistry((ViewFactory[]) Arrays.copyOf(viewFactoryArr, viewFactoryArr.length));
        }

        @JvmStatic
        public final Set<ViewFactory<?>> provideViewBindings() {
            return SetsKt.setOf((Object[]) new ViewFactory[]{InquiryInitializingRunner.INSTANCE, InquiryCompleteRunner.INSTANCE, BackStackContainer.INSTANCE, DisableableContainer.INSTANCE, ScreenWithTransitionContainer.INSTANCE});
        }

        public final String userAgent() {
            return "Persona/1.0 (Android) Inquiry/2.21.1";
        }

        @JvmStatic
        public final Set<Object> provideMoshiJsonAdapter() {
            return SetsKt.setOf(CreateInquiryRequest.Data.INSTANCE, CreateInquirySessionResponse.GpsCollectionRequirement.INSTANCE, CreateInquirySessionResponse.GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.INSTANCE, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.INSTANCE, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE);
        }

        @JvmStatic
        public final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
            return SetsKt.emptySet();
        }

        @JvmStatic
        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return SetsKt.setOf(InquiryField.INSTANCE.createAdapter());
        }
    }
}
