package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.Window;
import androidx.lifecycle.SavedStateHandle;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.PickVisualMediaRequest;
import coil.ImageLoader;
import com.robinhood.utils.http.Headers;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.withpersona.sdk2.camera.C50845CameraXController_Factory;
import com.withpersona.sdk2.camera.CameraModule;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraModule_ParsedSideResultFactory;
import com.withpersona.sdk2.camera.CameraModule_SelfiePoseFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.GovernmentIdFeed_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.SelfieProcessor_Factory;
import com.withpersona.sdk2.camera.camera2.C50846Camera2ManagerFactory_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory_Impl;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager_Factory;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.device.DeviceId2;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider2;
import com.withpersona.sdk2.inquiry.device.DeviceModule;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_DeviceIdProviderFactory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_DeviceInfoProviderFactory;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider2;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider_Factory;
import com.withpersona.sdk2.inquiry.device.RealDeviceInfoProvider_Factory;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.C50847GovernmentIdAnalyzeWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdCameraScreenViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdCameraScreenViewFactory_Factory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.C50848GovernmentIdHintWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.C50849SubmitVerificationWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker;
import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker;
import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerModule;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerModule_ApiControllerFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C50858OfflineModeApiController_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C50859StaticTemplateSession_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_EnvironmentFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_FallbackModeFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_FallbackModeManagerFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_SavedStateHandleFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper_Factory;
import com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory_Factory;
import com.withpersona.sdk2.inquiry.internal.integrity.StandardIntegrityManagerFactory2;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper_Factory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_Companion_UserAgentFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_DocumentServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_FallbackModeServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_GovernmentServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_InquiryServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ProvideMoshiJsonAdapterBindingFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ProvideMoshiJsonAdapterFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_SelfieServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ServerEndpointFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_UiServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_ViewRegistryFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_WebRtcServiceFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule_CustomTabsLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule_OpenDocumentsResultLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule_TakePictureResultLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModule_RequestPermissionResultLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModule_ResolvableApiLauncherFactory;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.Logger8;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.modal.ModalModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.nfc.C50860ScanNfcWorker_Factory;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModule;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.p424ui.C50864CreateReusablePersonaWorker_Factory;
import com.withpersona.sdk2.inquiry.p424ui.C50865VerifyReusablePersonaWorker_Factory;
import com.withpersona.sdk2.inquiry.p424ui.ComponentWorkHelper;
import com.withpersona.sdk2.inquiry.p424ui.CreateReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.p424ui.CreateReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.p424ui.UiModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p424ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.p424ui.VerifyReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.p424ui.network.UiAddressAutocompleteWorker;
import com.withpersona.sdk2.inquiry.p424ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import com.withpersona.sdk2.inquiry.permissions.C50861DeviceFeatureRequestWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxModule;
import com.withpersona.sdk2.inquiry.sandbox.SandboxModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.selfie.C50862SelfieAnalyzeWorker_Factory;
import com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory;
import com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieCameraScreenViewFactory;
import com.withpersona.sdk2.inquiry.selfie.SelfieCameraScreenViewFactory_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieModule_ProvideViewBindingsFactory;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.C50863SubmitVerificationWorker_Factory;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieService;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.shared.FileHelper;
import com.withpersona.sdk2.inquiry.shared.RealFileHelper_Factory;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import com.withpersona.sdk2.inquiry.shared.SharedModule_FileHelperFactory;
import com.withpersona.sdk2.inquiry.shared.SharedModule_ImageHelperFactory;
import com.withpersona.sdk2.inquiry.shared.SharedModule_SystemUiControllerFactory;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollectorModule;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollectorModule_DataCollectorFactory;
import com.withpersona.sdk2.inquiry.shared.dispatchers.DispatchersModule;
import com.withpersona.sdk2.inquiry.shared.dispatchers.DispatchersModule_ProvideDefaultDispatcherFactory;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger_Factory;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryControllerModule;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryControllerModule_ExternalInquiryControllerFactory;
import com.withpersona.sdk2.inquiry.shared.files.FilesModule;
import com.withpersona.sdk2.inquiry.shared.files.FilesModule_ProvideSdkFilesManagerFactory;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper_Factory;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager_Factory;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.RealFontDownloader_Factory;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.DoubleCheck;
import dagger.internal.MapFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.SharedFlow2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class DaggerInquiryComponent {
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApiControllerModule apiControllerModule;
        private CameraModule cameraModule;
        private CustomTabsLauncherModule customTabsLauncherModule;
        private DataCollectorModule dataCollectorModule;
        private DeviceModule deviceModule;
        private DispatchersModule dispatchersModule;
        private DocumentLaunchersModule documentLaunchersModule;
        private DocumentSelectLauncherModule documentSelectLauncherModule;
        private ExternalInquiryControllerModule externalInquiryControllerModule;
        private FallbackModeModule fallbackModeModule;
        private FilesModule filesModule;
        private InquiryActivityModule inquiryActivityModule;
        private InquiryModule inquiryModule;
        private NetworkCoreModule networkCoreModule;
        private PassportNfcReaderLauncherModule passportNfcReaderLauncherModule;
        private PermissionsLauncherModule permissionsLauncherModule;
        private ResolvableApiLauncherModule resolvableApiLauncherModule;
        private SandboxModule sandboxModule;
        private SharedModule sharedModule;

        private Builder() {
        }

        public Builder networkCoreModule(NetworkCoreModule networkCoreModule) {
            this.networkCoreModule = (NetworkCoreModule) Preconditions.checkNotNull(networkCoreModule);
            return this;
        }

        public Builder inquiryModule(InquiryModule inquiryModule) {
            this.inquiryModule = (InquiryModule) Preconditions.checkNotNull(inquiryModule);
            return this;
        }

        public Builder documentSelectLauncherModule(DocumentSelectLauncherModule documentSelectLauncherModule) {
            this.documentSelectLauncherModule = (DocumentSelectLauncherModule) Preconditions.checkNotNull(documentSelectLauncherModule);
            return this;
        }

        public Builder permissionsLauncherModule(PermissionsLauncherModule permissionsLauncherModule) {
            this.permissionsLauncherModule = (PermissionsLauncherModule) Preconditions.checkNotNull(permissionsLauncherModule);
            return this;
        }

        public Builder filesModule(FilesModule filesModule) {
            this.filesModule = (FilesModule) Preconditions.checkNotNull(filesModule);
            return this;
        }

        public Builder inquiryActivityModule(InquiryActivityModule inquiryActivityModule) {
            this.inquiryActivityModule = (InquiryActivityModule) Preconditions.checkNotNull(inquiryActivityModule);
            return this;
        }

        public Builder customTabsLauncherModule(CustomTabsLauncherModule customTabsLauncherModule) {
            this.customTabsLauncherModule = (CustomTabsLauncherModule) Preconditions.checkNotNull(customTabsLauncherModule);
            return this;
        }

        public Builder documentLaunchersModule(DocumentLaunchersModule documentLaunchersModule) {
            this.documentLaunchersModule = (DocumentLaunchersModule) Preconditions.checkNotNull(documentLaunchersModule);
            return this;
        }

        public Builder passportNfcReaderLauncherModule(PassportNfcReaderLauncherModule passportNfcReaderLauncherModule) {
            this.passportNfcReaderLauncherModule = (PassportNfcReaderLauncherModule) Preconditions.checkNotNull(passportNfcReaderLauncherModule);
            return this;
        }

        public Builder dataCollectorModule(DataCollectorModule dataCollectorModule) {
            this.dataCollectorModule = (DataCollectorModule) Preconditions.checkNotNull(dataCollectorModule);
            return this;
        }

        public Builder fallbackModeModule(FallbackModeModule fallbackModeModule) {
            this.fallbackModeModule = (FallbackModeModule) Preconditions.checkNotNull(fallbackModeModule);
            return this;
        }

        public Builder sharedModule(SharedModule sharedModule) {
            this.sharedModule = (SharedModule) Preconditions.checkNotNull(sharedModule);
            return this;
        }

        public Builder apiControllerModule(ApiControllerModule apiControllerModule) {
            this.apiControllerModule = (ApiControllerModule) Preconditions.checkNotNull(apiControllerModule);
            return this;
        }

        public Builder externalInquiryControllerModule(ExternalInquiryControllerModule externalInquiryControllerModule) {
            this.externalInquiryControllerModule = (ExternalInquiryControllerModule) Preconditions.checkNotNull(externalInquiryControllerModule);
            return this;
        }

        public Builder resolvableApiLauncherModule(ResolvableApiLauncherModule resolvableApiLauncherModule) {
            this.resolvableApiLauncherModule = (ResolvableApiLauncherModule) Preconditions.checkNotNull(resolvableApiLauncherModule);
            return this;
        }

        public InquiryComponent build() {
            Preconditions.checkBuilderRequirement(this.networkCoreModule, NetworkCoreModule.class);
            Preconditions.checkBuilderRequirement(this.inquiryModule, InquiryModule.class);
            Preconditions.checkBuilderRequirement(this.documentSelectLauncherModule, DocumentSelectLauncherModule.class);
            if (this.cameraModule == null) {
                this.cameraModule = new CameraModule();
            }
            Preconditions.checkBuilderRequirement(this.permissionsLauncherModule, PermissionsLauncherModule.class);
            Preconditions.checkBuilderRequirement(this.filesModule, FilesModule.class);
            Preconditions.checkBuilderRequirement(this.inquiryActivityModule, InquiryActivityModule.class);
            Preconditions.checkBuilderRequirement(this.customTabsLauncherModule, CustomTabsLauncherModule.class);
            Preconditions.checkBuilderRequirement(this.documentLaunchersModule, DocumentLaunchersModule.class);
            if (this.sandboxModule == null) {
                this.sandboxModule = new SandboxModule();
            }
            Preconditions.checkBuilderRequirement(this.passportNfcReaderLauncherModule, PassportNfcReaderLauncherModule.class);
            Preconditions.checkBuilderRequirement(this.dataCollectorModule, DataCollectorModule.class);
            Preconditions.checkBuilderRequirement(this.fallbackModeModule, FallbackModeModule.class);
            if (this.sharedModule == null) {
                this.sharedModule = new SharedModule();
            }
            if (this.dispatchersModule == null) {
                this.dispatchersModule = new DispatchersModule();
            }
            Preconditions.checkBuilderRequirement(this.apiControllerModule, ApiControllerModule.class);
            Preconditions.checkBuilderRequirement(this.externalInquiryControllerModule, ExternalInquiryControllerModule.class);
            Preconditions.checkBuilderRequirement(this.resolvableApiLauncherModule, ResolvableApiLauncherModule.class);
            if (this.deviceModule == null) {
                this.deviceModule = new DeviceModule();
            }
            return new InquiryComponentImpl(this.networkCoreModule, this.inquiryModule, this.documentSelectLauncherModule, this.cameraModule, this.permissionsLauncherModule, this.filesModule, this.inquiryActivityModule, this.customTabsLauncherModule, this.documentLaunchersModule, this.sandboxModule, this.passportNfcReaderLauncherModule, this.dataCollectorModule, this.fallbackModeModule, this.sharedModule, this.dispatchersModule, this.apiControllerModule, this.externalInquiryControllerModule, this.resolvableApiLauncherModule, this.deviceModule);
        }
    }

    private static final class InquiryComponentImpl implements InquiryComponent {
        private Provider<ApiController> apiControllerProvider;
        private Provider<DeviceVendorIDProvider> appSetIdHelperProvider;
        private Provider<Application> applicationProvider;
        private C50846Camera2ManagerFactory_Factory camera2ManagerFactoryProvider;
        private final CameraModule cameraModule;
        private Provider<CameraStatsManager> cameraStatsManagerProvider;
        private C50845CameraXController_Factory cameraXControllerProvider;
        private Provider<Context> contextProvider;
        private C50850CreateInquirySessionWorker_Factory createInquirySessionWorkerProvider;
        private C50851CreateInquiryWorker_Factory createInquiryWorkerProvider;
        private C50864CreateReusablePersonaWorker_Factory createReusablePersonaWorkerProvider;
        private Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> customTabsLauncherProvider;
        private final DataCollectorModule dataCollectorModule;
        private Provider<DataCollector> dataCollectorProvider;
        private C50861DeviceFeatureRequestWorker_Factory deviceFeatureRequestWorkerProvider;
        private Provider<DeviceId> deviceIdProvider;
        private Provider<DeviceInfoProvider> deviceInfoProvider;
        private Provider<DocumentService> documentServiceProvider;
        private Provider<Environment> environmentProvider;
        private Provider<ErrorReportingManager> errorReportingManagerProvider;
        private C50852ExchangeOneTimeCodeWorker_Factory exchangeOneTimeCodeWorkerProvider;
        private Provider<ExternalEventLogger> externalEventLoggerProvider;
        private final ExternalInquiryControllerModule externalInquiryControllerModule;
        private Provider<ExternalInquiryController> externalInquiryControllerProvider;
        private Provider<StaticTemplateSession.Factory> factoryProvider;
        private Provider<ExchangeOneTimeCodeWorker.Factory> factoryProvider10;
        private Provider<SubmitVerificationWorker.Factory> factoryProvider11;
        private Provider<CameraXController.Factory> factoryProvider12;
        private Provider<Camera2ManagerFactory.Factory> factoryProvider13;
        private Provider<DeviceFeatureRequestWorker.Factory> factoryProvider14;
        private Provider<GovernmentIdAnalyzeWorker.Factory> factoryProvider15;
        private Provider<GovernmentIdHintWorker.Factory> factoryProvider16;
        private Provider<SubmitVerificationWorker.Factory> factoryProvider17;
        private Provider<SelfieAnalyzeWorker.Factory> factoryProvider18;
        private Provider<ScanNfcWorker.Factory> factoryProvider19;
        private Provider<OfflineModeApiController.Factory> factoryProvider2;
        private Provider<CreateReusablePersonaWorker.Factory> factoryProvider20;
        private Provider<VerifyReusablePersonaWorker.Factory> factoryProvider21;
        private Provider<RestoreUiStepStateWorker.Factory> factoryProvider22;
        private Provider<Logger8.Factory> factoryProvider3;
        private Provider<CreateInquiryWorker.Factory> factoryProvider4;
        private Provider<CreateInquirySessionWorker.Factory> factoryProvider5;
        private Provider<PollingWorker.Factory> factoryProvider6;
        private Provider<TransitionBackWorker.Factory> factoryProvider7;
        private Provider<TransitionWorker.Factory> factoryProvider8;
        private Provider<UpdateInquirySessionWorker.Factory> factoryProvider9;
        private Provider<FallbackModeApiController> fallbackModeApiControllerProvider;
        private Provider<FallbackModeManager> fallbackModeManagerProvider;
        private Provider<FallbackMode> fallbackModeProvider;
        private Provider<FallbackModeService> fallbackModeServiceProvider;
        private Provider<FileHelper> fileHelperProvider;
        private final FilesModule filesModule;
        private C50847GovernmentIdAnalyzeWorker_Factory governmentIdAnalyzeWorkerProvider;
        private Provider<GovernmentIdCameraScreenViewFactory> governmentIdCameraScreenViewFactoryProvider;
        private Provider<GovernmentIdFeed> governmentIdFeedProvider;
        private C50848GovernmentIdHintWorker_Factory governmentIdHintWorkerProvider;
        private Provider<GovernmentIdService> governmentServiceProvider;
        private Provider<ImageHelper> imageHelperProvider;
        private Provider<ImageLoader> imageLoaderProvider;
        private final InquiryActivityModule inquiryActivityModule;
        private Provider<InquiryApiHelper> inquiryApiHelperProvider;
        private final InquiryComponentImpl inquiryComponentImpl;
        private Provider<InquiryService> inquiryServiceProvider;
        private Provider<Interceptor> interceptorProvider;
        private Provider<Interceptor> interceptorProvider2;
        private Provider<String> keyInflectionProvider;
        private Provider<Logger> loggerProvider;
        private Provider<Map<String, String>> mapOfStringAndStringProvider;
        private Provider<Moshi> moshiProvider;
        private Provider<NavigationStateManager> navigationStateManagerProvider;
        private C50858OfflineModeApiController_Factory offlineModeApiControllerProvider;
        private Provider<OkHttpClient> okhttpClientProvider;
        private Provider<OldSelfieCameraScreenViewFactory> oldSelfieCameraScreenViewFactoryProvider;
        private Provider<ActivityResultLauncher<String[]>> openDocumentResultLauncherProvider;
        private Provider<ActivityResultLauncher<String[]>> openDocumentsResultLauncherProvider;
        private Provider<SharedFlow2<Result<GovernmentIdFeed5>>> parsedSideResultProvider;
        private Provider<ActivityResultLauncher<PassportNfcReaderConfig>> passportNfcReaderLauncherProvider;
        private Provider<PlayIntegrityHelper> playIntegrityHelperProvider;
        private C50853PollingWorker_Factory pollingWorkerProvider;
        private Provider<CoroutineDispatcher> provideDefaultDispatcherProvider;
        private Provider<SdkFilesManager> provideSdkFilesManagerProvider;
        private Provider<Set<ViewFactory<?>>> provideViewBindingsProvider;
        private Provider<Set<ViewFactory<?>>> provideViewBindingsProvider2;
        private Provider<RealCameraStatsManager> realCameraStatsManagerProvider;
        private Provider<DeviceId2> realDeviceIdProvider;
        private Provider<DeviceInfoProvider2> realDeviceInfoProvider;
        private Provider<DeviceVendorIDProvider2> realDeviceVendorIDProvider;
        private Provider<RealFallbackModeManager> realFallbackModeManagerProvider;
        private Provider<RealFontDownloader> realFontDownloaderProvider;
        private Provider<StandardIntegrityManagerFactory2> realStandardIntegrityManagerFactoryProvider;
        private Provider<ActivityResultLauncher<String>> requestPermissionResultLauncherProvider;
        private Provider<ActivityResultLauncher<IntentSenderRequest>> resolvableApiLauncherProvider;
        private Provider<Interceptor> responseInterceptorProvider;
        private C50854RestoreUiStepStateWorker_Factory restoreUiStepStateWorkerProvider;
        private Provider<Retrofit> retrofitProvider;
        private Provider<SandboxFlags> sandboxFlagsProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private C50860ScanNfcWorker_Factory scanNfcWorkerProvider;
        private Provider<ActivityResultLauncher<PickVisualMediaRequest>> selectFromPhotoLibraryLauncherProvider;
        private C50862SelfieAnalyzeWorker_Factory selfieAnalyzeWorkerProvider;
        private Provider<SelfieCameraScreenViewFactory> selfieCameraScreenViewFactoryProvider;
        private Provider<SelfieDirectionFeed> selfieDirectionFeedProvider;
        private Provider<SharedFlow2<SelfieFrameInfo>> selfiePoseProvider;
        private Provider<SelfieService> selfieServiceProvider;
        private Provider<String> serverEndpointProvider;
        private Provider<Set<Interceptor>> setOfInterceptorProvider;
        private Provider<Set<JsonAdapterBinding<?>>> setOfJsonAdapterBindingOfProvider;
        private Provider<Set<JsonAdapter.Factory>> setOfJsonAdapterFactoryProvider;
        private Provider<Set<Object>> setOfObjectProvider;
        private Provider<Set<ViewFactory<?>>> setOfViewFactoryOfProvider;
        private C50859StaticTemplateSession_Factory staticTemplateSessionProvider;
        private C50849SubmitVerificationWorker_Factory submitVerificationWorkerProvider;
        private C50863SubmitVerificationWorker_Factory submitVerificationWorkerProvider2;
        private SubsystemLogger_Factory subsystemLoggerProvider;
        private Provider<SystemUiController> systemUiControllerProvider;
        private Provider<ActivityResultLauncher<Uri>> takePictureResultLauncherProvider;
        private C50855TransitionBackWorker_Factory transitionBackWorkerProvider;
        private C50856TransitionWorker_Factory transitionWorkerProvider;
        private Provider<UiService> uiServiceProvider;
        private Provider<UiStepSavedStateHelper> uiStepSavedStateHelperProvider;
        private C50857UpdateInquirySessionWorker_Factory updateInquirySessionWorkerProvider;
        private Provider<String> useServerStylesProvider;
        private C50865VerifyReusablePersonaWorker_Factory verifyReusablePersonaWorkerProvider;
        private Provider<ViewRegistry> viewRegistryProvider;
        private Provider<WebRtcService> webRtcServiceProvider;
        private Provider<Window> windowProvider;

        private InquiryComponentImpl(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            this.inquiryComponentImpl = this;
            this.inquiryActivityModule = inquiryActivityModule;
            this.filesModule = filesModule;
            this.cameraModule = cameraModule;
            this.dataCollectorModule = dataCollectorModule;
            this.externalInquiryControllerModule = externalInquiryControllerModule;
            initialize(networkCoreModule, inquiryModule, documentSelectLauncherModule, cameraModule, permissionsLauncherModule, filesModule, inquiryActivityModule, customTabsLauncherModule, documentLaunchersModule, sandboxModule, passportNfcReaderLauncherModule, dataCollectorModule, fallbackModeModule, sharedModule, dispatchersModule, apiControllerModule, externalInquiryControllerModule, resolvableApiLauncherModule, deviceModule);
            initialize2(networkCoreModule, inquiryModule, documentSelectLauncherModule, cameraModule, permissionsLauncherModule, filesModule, inquiryActivityModule, customTabsLauncherModule, documentLaunchersModule, sandboxModule, passportNfcReaderLauncherModule, dataCollectorModule, fallbackModeModule, sharedModule, dispatchersModule, apiControllerModule, externalInquiryControllerModule, resolvableApiLauncherModule, deviceModule);
            initialize3(networkCoreModule, inquiryModule, documentSelectLauncherModule, cameraModule, permissionsLauncherModule, filesModule, inquiryActivityModule, customTabsLauncherModule, documentLaunchersModule, sandboxModule, passportNfcReaderLauncherModule, dataCollectorModule, fallbackModeModule, sharedModule, dispatchersModule, apiControllerModule, externalInquiryControllerModule, resolvableApiLauncherModule, deviceModule);
            initialize4(networkCoreModule, inquiryModule, documentSelectLauncherModule, cameraModule, permissionsLauncherModule, filesModule, inquiryActivityModule, customTabsLauncherModule, documentLaunchersModule, sandboxModule, passportNfcReaderLauncherModule, dataCollectorModule, fallbackModeModule, sharedModule, dispatchersModule, apiControllerModule, externalInquiryControllerModule, resolvableApiLauncherModule, deviceModule);
            initialize5(networkCoreModule, inquiryModule, documentSelectLauncherModule, cameraModule, permissionsLauncherModule, filesModule, inquiryActivityModule, customTabsLauncherModule, documentLaunchersModule, sandboxModule, passportNfcReaderLauncherModule, dataCollectorModule, fallbackModeModule, sharedModule, dispatchersModule, apiControllerModule, externalInquiryControllerModule, resolvableApiLauncherModule, deviceModule);
        }

        private DocumentSelectWorker documentSelectWorker() {
            return new DocumentSelectWorker(this.openDocumentResultLauncherProvider.get(), InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), FilesModule_ProvideSdkFilesManagerFactory.provideSdkFilesManager(this.filesModule));
        }

        private LocalVideoCaptureRenderer localVideoCaptureRenderer() {
            return new LocalVideoCaptureRenderer(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider12.get(), this.factoryProvider13.get(), this.navigationStateManagerProvider.get());
        }

        private WebRtcRenderer webRtcRenderer() {
            return new WebRtcRenderer(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider12.get(), this.factoryProvider13.get(), this.navigationStateManagerProvider.get());
        }

        private PermissionRequestWorker.Factory permissionRequestWorkerFactory() {
            return new PermissionRequestWorker.Factory(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.requestPermissionResultLauncherProvider.get());
        }

        private DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow() {
            return new DeviceFeatureRequestWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider14.get());
        }

        private PermissionRequestWorkflow permissionRequestWorkflow() {
            return new PermissionRequestWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), permissionRequestWorkerFactory(), deviceFeatureRequestWorkflow());
        }

        private WebRtcWorker.Factory webRtcWorkerFactory() {
            return new WebRtcWorker.Factory(this.webRtcServiceProvider.get());
        }

        private CaptureRenderer captureRenderer() {
            return new CaptureRenderer(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), permissionRequestWorkflow(), this.factoryProvider15.get(), this.factoryProvider16.get(), webRtcWorkerFactory(), this.factoryProvider12.get(), this.factoryProvider13.get(), this.navigationStateManagerProvider.get());
        }

        private AutoClassifyWorker.Factory autoClassifyWorkerFactory() {
            return new AutoClassifyWorker.Factory(this.governmentServiceProvider.get(), this.imageHelperProvider.get());
        }

        private AutoClassificationRenderer autoClassificationRenderer() {
            return new AutoClassificationRenderer(this.navigationStateManagerProvider.get());
        }

        private CameraStatsManager cameraStatsManager() {
            return CameraModule_CameraStatsManagerFactory.cameraStatsManager(this.cameraModule, DoubleCheck.lazy((Provider) this.realCameraStatsManagerProvider));
        }

        private GovernmentIdWorkflow governmentIdWorkflow() {
            return new GovernmentIdWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.imageLoaderProvider.get(), this.factoryProvider11.get(), documentSelectWorker(), localVideoCaptureRenderer(), webRtcRenderer(), captureRenderer(), autoClassifyWorkerFactory(), autoClassificationRenderer(), cameraStatsManager(), this.navigationStateManagerProvider.get(), this.externalEventLoggerProvider.get());
        }

        private com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer localVideoCaptureRenderer2() {
            return new com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider12.get(), this.factoryProvider13.get(), this.navigationStateManagerProvider.get());
        }

        private SelfieWorkflow selfieWorkflow() {
            return new SelfieWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider17.get(), webRtcWorkerFactory(), this.factoryProvider18.get(), permissionRequestWorkflow(), localVideoCaptureRenderer2(), this.factoryProvider12.get(), this.factoryProvider13.get(), cameraStatsManager(), this.navigationStateManagerProvider.get(), this.externalEventLoggerProvider.get());
        }

        private UiAddressAutocompleteWorker.Factory uiAddressAutocompleteWorkerFactory() {
            return new UiAddressAutocompleteWorker.Factory(this.uiServiceProvider.get());
        }

        private UiAddressDetailsWorker.Factory uiAddressDetailsWorkerFactory() {
            return new UiAddressDetailsWorker.Factory(this.uiServiceProvider.get());
        }

        private ComponentWorkHelper componentWorkHelper() {
            return new ComponentWorkHelper(uiAddressAutocompleteWorkerFactory(), uiAddressDetailsWorkerFactory());
        }

        private UiWorkflow uiWorkflow() {
            return new UiWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider19.get(), this.factoryProvider20.get(), this.factoryProvider21.get(), this.navigationStateManagerProvider.get(), permissionRequestWorkflow(), componentWorkHelper(), this.externalEventLoggerProvider.get());
        }

        private DocumentCameraWorker documentCameraWorker() {
            return new DocumentCameraWorker(this.takePictureResultLauncherProvider.get(), InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), FilesModule_ProvideSdkFilesManagerFactory.provideSdkFilesManager(this.filesModule));
        }

        private DocumentsSelectWorker.Factory documentsSelectWorkerFactory() {
            return new DocumentsSelectWorker.Factory(this.openDocumentsResultLauncherProvider.get(), this.selectFromPhotoLibraryLauncherProvider.get(), InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), FilesModule_ProvideSdkFilesManagerFactory.provideSdkFilesManager(this.filesModule));
        }

        private DocumentCreateWorker.Factory documentCreateWorkerFactory() {
            return new DocumentCreateWorker.Factory(this.documentServiceProvider.get());
        }

        private DocumentLoadWorker.Factory documentLoadWorkerFactory() {
            return new DocumentLoadWorker.Factory(this.documentServiceProvider.get());
        }

        private DocumentFileUploadWorker.Factory documentFileUploadWorkerFactory() {
            return new DocumentFileUploadWorker.Factory(this.documentServiceProvider.get(), this.fileHelperProvider.get());
        }

        private DocumentFileDeleteWorker.Factory documentFileDeleteWorkerFactory() {
            return new DocumentFileDeleteWorker.Factory(this.documentServiceProvider.get());
        }

        private DocumentSubmitWorker.Factory documentSubmitWorkerFactory() {
            return new DocumentSubmitWorker.Factory(this.documentServiceProvider.get(), this.fallbackModeManagerProvider.get(), DataCollectorModule_DataCollectorFactory.dataCollector(this.dataCollectorModule));
        }

        private DocumentWorkflow documentWorkflow() {
            return new DocumentWorkflow(this.imageLoaderProvider.get(), InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), permissionRequestWorkflow(), documentCameraWorker(), documentsSelectWorkerFactory(), documentCreateWorkerFactory(), documentLoadWorkerFactory(), documentFileUploadWorkerFactory(), documentFileDeleteWorkerFactory(), documentSubmitWorkerFactory(), this.navigationStateManagerProvider.get(), this.externalEventLoggerProvider.get());
        }

        private void initialize(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            this.contextProvider = InquiryActivityModule_ContextFactory.create(inquiryActivityModule);
            this.serverEndpointProvider = InquiryModule_ServerEndpointFactory.create(inquiryModule);
            this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule);
            this.setOfObjectProvider = SetFactory.builder(0, 1).addCollectionProvider(InquiryModule_ProvideMoshiJsonAdapterFactory.create()).build();
            this.setOfJsonAdapterBindingOfProvider = SetFactory.builder(0, 1).addCollectionProvider(InquiryModule_ProvideMoshiJsonAdapterBindingFactory.create()).build();
            SetFactory setFactoryBuild = SetFactory.builder(0, 4).addCollectionProvider(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create()).addCollectionProvider(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create()).addCollectionProvider(InquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create()).addCollectionProvider(GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory.create()).build();
            this.setOfJsonAdapterFactoryProvider = setFactoryBuild;
            Provider<Moshi> provider = DoubleCheck.provider((Provider) NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.setOfObjectProvider, this.setOfJsonAdapterBindingOfProvider, (Provider<Set<JsonAdapter.Factory>>) setFactoryBuild));
            this.moshiProvider = provider;
            this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, provider);
            Provider<SandboxFlags> provider2 = DoubleCheck.provider((Provider) SandboxFlags_Factory.create());
            this.sandboxFlagsProvider = provider2;
            this.interceptorProvider2 = SandboxModule_InterceptorFactory.create(sandboxModule, provider2);
            this.setOfInterceptorProvider = SetFactory.builder(3, 0).addProvider(this.responseInterceptorProvider).addProvider(this.interceptorProvider).addProvider(this.interceptorProvider2).build();
            this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.mapOfStringAndStringProvider = MapFactory.builder(3).put((MapFactory.Builder) "Key-Inflection", (Provider) this.keyInflectionProvider).put((MapFactory.Builder) "Persona-Use-Mobile-Server-Styles", (Provider) this.useServerStylesProvider).put((MapFactory.Builder) Headers.USER_AGENT, (Provider) InquiryModule_Companion_UserAgentFactory.create()).build();
            RealDeviceVendorIDProvider_Factory realDeviceVendorIDProvider_FactoryCreate = RealDeviceVendorIDProvider_Factory.create(this.contextProvider);
            this.realDeviceVendorIDProvider = realDeviceVendorIDProvider_FactoryCreate;
            this.appSetIdHelperProvider = DoubleCheck.provider((Provider) DeviceModule_AppSetIdHelperFactory.create(deviceModule, realDeviceVendorIDProvider_FactoryCreate));
            RealDeviceInfoProvider_Factory realDeviceInfoProvider_FactoryCreate = RealDeviceInfoProvider_Factory.create(this.contextProvider);
            this.realDeviceInfoProvider = realDeviceInfoProvider_FactoryCreate;
            this.deviceInfoProvider = DoubleCheck.provider((Provider) DeviceModule_DeviceInfoProviderFactory.create(deviceModule, realDeviceInfoProvider_FactoryCreate));
            Logger_Factory logger_FactoryCreate = Logger_Factory.create(this.contextProvider);
            this.loggerProvider = logger_FactoryCreate;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.setOfInterceptorProvider, this.mapOfStringAndStringProvider, this.contextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, (Provider<Logger>) logger_FactoryCreate);
            this.okhttpClientProvider = networkCoreModule_OkhttpClientFactoryCreate;
            Provider<Retrofit> provider3 = DoubleCheck.provider((Provider) NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.serverEndpointProvider, (Provider<OkHttpClient>) networkCoreModule_OkhttpClientFactoryCreate, this.moshiProvider));
            this.retrofitProvider = provider3;
            this.inquiryServiceProvider = DoubleCheck.provider((Provider) InquiryModule_InquiryServiceFactory.create(inquiryModule, provider3));
            this.fallbackModeProvider = FallbackModeModule_FallbackModeFactory.create(fallbackModeModule);
            this.fallbackModeServiceProvider = DoubleCheck.provider((Provider) InquiryModule_FallbackModeServiceFactory.create(inquiryModule, this.retrofitProvider));
            this.savedStateHandleProvider = FallbackModeModule_SavedStateHandleFactory.create(fallbackModeModule);
        }

        private void initialize2(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            C50859StaticTemplateSession_Factory c50859StaticTemplateSession_FactoryCreate = C50859StaticTemplateSession_Factory.create(this.savedStateHandleProvider);
            this.staticTemplateSessionProvider = c50859StaticTemplateSession_FactoryCreate;
            Provider<StaticTemplateSession.Factory> providerCreateFactoryProvider = StaticTemplateSession_Factory_Impl.createFactoryProvider(c50859StaticTemplateSession_FactoryCreate);
            this.factoryProvider = providerCreateFactoryProvider;
            this.fallbackModeApiControllerProvider = FallbackModeApiController_Factory.create(this.fallbackModeServiceProvider, this.moshiProvider, providerCreateFactoryProvider);
            C50858OfflineModeApiController_Factory c50858OfflineModeApiController_FactoryCreate = C50858OfflineModeApiController_Factory.create(this.moshiProvider, this.contextProvider, this.factoryProvider);
            this.offlineModeApiControllerProvider = c50858OfflineModeApiController_FactoryCreate;
            Provider<OfflineModeApiController.Factory> providerCreateFactoryProvider2 = OfflineModeApiController_Factory_Impl.createFactoryProvider(c50858OfflineModeApiController_FactoryCreate);
            this.factoryProvider2 = providerCreateFactoryProvider2;
            this.apiControllerProvider = ApiControllerModule_ApiControllerFactory.create(apiControllerModule, this.fallbackModeApiControllerProvider, providerCreateFactoryProvider2);
            FallbackModeModule_EnvironmentFactory fallbackModeModule_EnvironmentFactoryCreate = FallbackModeModule_EnvironmentFactory.create(fallbackModeModule);
            this.environmentProvider = fallbackModeModule_EnvironmentFactoryCreate;
            this.realFallbackModeManagerProvider = DoubleCheck.provider((Provider) RealFallbackModeManager_Factory.create(this.fallbackModeProvider, this.apiControllerProvider, fallbackModeModule_EnvironmentFactoryCreate, this.moshiProvider));
            RealDeviceIdProvider_Factory realDeviceIdProvider_FactoryCreate = RealDeviceIdProvider_Factory.create(this.contextProvider);
            this.realDeviceIdProvider = realDeviceIdProvider_FactoryCreate;
            this.deviceIdProvider = DoubleCheck.provider((Provider) DeviceModule_DeviceIdProviderFactory.create(deviceModule, realDeviceIdProvider_FactoryCreate));
            SubsystemLogger_Factory subsystemLogger_FactoryCreate = SubsystemLogger_Factory.create(this.loggerProvider);
            this.subsystemLoggerProvider = subsystemLogger_FactoryCreate;
            this.factoryProvider3 = SubsystemLogger_Factory_Impl.createFactoryProvider(subsystemLogger_FactoryCreate);
            this.realStandardIntegrityManagerFactoryProvider = DoubleCheck.provider((Provider) RealStandardIntegrityManagerFactory_Factory.create());
            DispatchersModule_ProvideDefaultDispatcherFactory dispatchersModule_ProvideDefaultDispatcherFactoryCreate = DispatchersModule_ProvideDefaultDispatcherFactory.create(dispatchersModule);
            this.provideDefaultDispatcherProvider = dispatchersModule_ProvideDefaultDispatcherFactoryCreate;
            Provider<PlayIntegrityHelper> provider = DoubleCheck.provider((Provider) PlayIntegrityHelper_Factory.create(this.contextProvider, this.factoryProvider3, this.realStandardIntegrityManagerFactoryProvider, dispatchersModule_ProvideDefaultDispatcherFactoryCreate));
            this.playIntegrityHelperProvider = provider;
            Provider<InquiryApiHelper> provider2 = DoubleCheck.provider((Provider) InquiryApiHelper_Factory.create(this.contextProvider, this.inquiryServiceProvider, this.realFallbackModeManagerProvider, this.sandboxFlagsProvider, this.deviceIdProvider, provider));
            this.inquiryApiHelperProvider = provider2;
            C50851CreateInquiryWorker_Factory c50851CreateInquiryWorker_FactoryCreate = C50851CreateInquiryWorker_Factory.create(provider2);
            this.createInquiryWorkerProvider = c50851CreateInquiryWorker_FactoryCreate;
            this.factoryProvider4 = CreateInquiryWorker_Factory_Impl.createFactoryProvider(c50851CreateInquiryWorker_FactoryCreate);
            C50850CreateInquirySessionWorker_Factory c50850CreateInquirySessionWorker_FactoryCreate = C50850CreateInquirySessionWorker_Factory.create(this.inquiryApiHelperProvider);
            this.createInquirySessionWorkerProvider = c50850CreateInquirySessionWorker_FactoryCreate;
            this.factoryProvider5 = CreateInquirySessionWorker_Factory_Impl.createFactoryProvider(c50850CreateInquirySessionWorker_FactoryCreate);
            InquiryActivityModule_ApplicationFactory inquiryActivityModule_ApplicationFactoryCreate = InquiryActivityModule_ApplicationFactory.create(inquiryActivityModule);
            this.applicationProvider = inquiryActivityModule_ApplicationFactoryCreate;
            Provider<RealFontDownloader> provider3 = DoubleCheck.provider((Provider) RealFontDownloader_Factory.create(this.okhttpClientProvider, inquiryActivityModule_ApplicationFactoryCreate));
            this.realFontDownloaderProvider = provider3;
            C50853PollingWorker_Factory c50853PollingWorker_FactoryCreate = C50853PollingWorker_Factory.create(this.contextProvider, this.inquiryServiceProvider, this.deviceIdProvider, this.sandboxFlagsProvider, this.realFallbackModeManagerProvider, provider3);
            this.pollingWorkerProvider = c50853PollingWorker_FactoryCreate;
            this.factoryProvider6 = PollingWorker_Factory_Impl.createFactoryProvider(c50853PollingWorker_FactoryCreate);
            this.transitionBackWorkerProvider = C50855TransitionBackWorker_Factory.create(this.inquiryApiHelperProvider);
        }

        private void initialize3(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            this.factoryProvider7 = TransitionBackWorker_Factory_Impl.createFactoryProvider(this.transitionBackWorkerProvider);
            this.fallbackModeManagerProvider = DoubleCheck.provider((Provider) FallbackModeModule_FallbackModeManagerFactory.create(fallbackModeModule, this.realFallbackModeManagerProvider));
            Provider<UiStepSavedStateHelper> provider = DoubleCheck.provider((Provider) UiStepSavedStateHelper_Factory.create(this.contextProvider));
            this.uiStepSavedStateHelperProvider = provider;
            C50856TransitionWorker_Factory c50856TransitionWorker_FactoryCreate = C50856TransitionWorker_Factory.create(this.inquiryServiceProvider, this.fallbackModeManagerProvider, provider);
            this.transitionWorkerProvider = c50856TransitionWorker_FactoryCreate;
            this.factoryProvider8 = TransitionWorker_Factory_Impl.createFactoryProvider(c50856TransitionWorker_FactoryCreate);
            C50857UpdateInquirySessionWorker_Factory c50857UpdateInquirySessionWorker_FactoryCreate = C50857UpdateInquirySessionWorker_Factory.create(this.inquiryApiHelperProvider);
            this.updateInquirySessionWorkerProvider = c50857UpdateInquirySessionWorker_FactoryCreate;
            this.factoryProvider9 = UpdateInquirySessionWorker_Factory_Impl.createFactoryProvider(c50857UpdateInquirySessionWorker_FactoryCreate);
            C50852ExchangeOneTimeCodeWorker_Factory c50852ExchangeOneTimeCodeWorker_FactoryCreate = C50852ExchangeOneTimeCodeWorker_Factory.create(this.inquiryApiHelperProvider);
            this.exchangeOneTimeCodeWorkerProvider = c50852ExchangeOneTimeCodeWorker_FactoryCreate;
            this.factoryProvider10 = ExchangeOneTimeCodeWorker_Factory_Impl.createFactoryProvider(c50852ExchangeOneTimeCodeWorker_FactoryCreate);
            this.imageLoaderProvider = DoubleCheck.provider((Provider) InquiryActivityModule_ImageLoaderFactory.create(inquiryActivityModule, this.contextProvider));
            this.governmentServiceProvider = DoubleCheck.provider((Provider) InquiryModule_GovernmentServiceFactory.create(inquiryModule, this.retrofitProvider));
            this.dataCollectorProvider = DataCollectorModule_DataCollectorFactory.create(dataCollectorModule);
            this.imageHelperProvider = DoubleCheck.provider((Provider) SharedModule_ImageHelperFactory.create(sharedModule, RealImageHelper_Factory.create()));
            Provider<RealCameraStatsManager> provider2 = DoubleCheck.provider((Provider) RealCameraStatsManager_Factory.create(this.contextProvider));
            this.realCameraStatsManagerProvider = provider2;
            CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactoryCreate = CameraModule_CameraStatsManagerFactory.create(cameraModule, provider2);
            this.cameraStatsManagerProvider = cameraModule_CameraStatsManagerFactoryCreate;
            C50849SubmitVerificationWorker_Factory c50849SubmitVerificationWorker_FactoryCreate = C50849SubmitVerificationWorker_Factory.create(this.contextProvider, this.governmentServiceProvider, this.dataCollectorProvider, this.fallbackModeManagerProvider, this.imageHelperProvider, cameraModule_CameraStatsManagerFactoryCreate);
            this.submitVerificationWorkerProvider = c50849SubmitVerificationWorker_FactoryCreate;
            this.factoryProvider11 = SubmitVerificationWorker_Factory_Impl.createFactoryProvider(c50849SubmitVerificationWorker_FactoryCreate);
            this.openDocumentResultLauncherProvider = DoubleCheck.provider((Provider) DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory.create(documentSelectLauncherModule));
            FilesModule_ProvideSdkFilesManagerFactory filesModule_ProvideSdkFilesManagerFactoryCreate = FilesModule_ProvideSdkFilesManagerFactory.create(filesModule);
            this.provideSdkFilesManagerProvider = filesModule_ProvideSdkFilesManagerFactoryCreate;
            C50845CameraXController_Factory c50845CameraXController_FactoryCreate = C50845CameraXController_Factory.create(this.cameraStatsManagerProvider, filesModule_ProvideSdkFilesManagerFactoryCreate);
            this.cameraXControllerProvider = c50845CameraXController_FactoryCreate;
            this.factoryProvider12 = CameraXController_Factory_Impl.createFactoryProvider(c50845CameraXController_FactoryCreate);
            C50846Camera2ManagerFactory_Factory c50846Camera2ManagerFactory_FactoryCreate = C50846Camera2ManagerFactory_Factory.create(this.contextProvider, this.cameraStatsManagerProvider, this.provideSdkFilesManagerProvider);
            this.camera2ManagerFactoryProvider = c50846Camera2ManagerFactory_FactoryCreate;
            this.factoryProvider13 = Camera2ManagerFactory_Factory_Impl.createFactoryProvider(c50846Camera2ManagerFactory_FactoryCreate);
            ExternalInquiryControllerModule_ExternalInquiryControllerFactory externalInquiryControllerModule_ExternalInquiryControllerFactoryCreate = ExternalInquiryControllerModule_ExternalInquiryControllerFactory.create(externalInquiryControllerModule);
            this.externalInquiryControllerProvider = externalInquiryControllerModule_ExternalInquiryControllerFactoryCreate;
            this.navigationStateManagerProvider = DoubleCheck.provider((Provider) NavigationStateManager_Factory.create(externalInquiryControllerModule_ExternalInquiryControllerFactoryCreate));
        }

        private void initialize4(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            this.requestPermissionResultLauncherProvider = DoubleCheck.provider((Provider) PermissionsLauncherModule_RequestPermissionResultLauncherFactory.create(permissionsLauncherModule));
            Provider<ActivityResultLauncher<IntentSenderRequest>> provider = DoubleCheck.provider((Provider) ResolvableApiLauncherModule_ResolvableApiLauncherFactory.create(resolvableApiLauncherModule));
            this.resolvableApiLauncherProvider = provider;
            C50861DeviceFeatureRequestWorker_Factory c50861DeviceFeatureRequestWorker_FactoryCreate = C50861DeviceFeatureRequestWorker_Factory.create(provider, this.contextProvider);
            this.deviceFeatureRequestWorkerProvider = c50861DeviceFeatureRequestWorker_FactoryCreate;
            this.factoryProvider14 = DeviceFeatureRequestWorker_Factory_Impl.createFactoryProvider(c50861DeviceFeatureRequestWorker_FactoryCreate);
            Provider<SharedFlow2<Result<GovernmentIdFeed5>>> provider2 = DoubleCheck.provider((Provider) CameraModule_ParsedSideResultFactory.create(cameraModule));
            this.parsedSideResultProvider = provider2;
            GovernmentIdFeed_Factory governmentIdFeed_FactoryCreate = GovernmentIdFeed_Factory.create(provider2);
            this.governmentIdFeedProvider = governmentIdFeed_FactoryCreate;
            C50847GovernmentIdAnalyzeWorker_Factory c50847GovernmentIdAnalyzeWorker_FactoryCreate = C50847GovernmentIdAnalyzeWorker_Factory.create(this.contextProvider, governmentIdFeed_FactoryCreate, this.provideSdkFilesManagerProvider);
            this.governmentIdAnalyzeWorkerProvider = c50847GovernmentIdAnalyzeWorker_FactoryCreate;
            this.factoryProvider15 = GovernmentIdAnalyzeWorker_Factory_Impl.createFactoryProvider(c50847GovernmentIdAnalyzeWorker_FactoryCreate);
            C50848GovernmentIdHintWorker_Factory c50848GovernmentIdHintWorker_FactoryCreate = C50848GovernmentIdHintWorker_Factory.create(this.contextProvider, this.governmentIdFeedProvider);
            this.governmentIdHintWorkerProvider = c50848GovernmentIdHintWorker_FactoryCreate;
            this.factoryProvider16 = GovernmentIdHintWorker_Factory_Impl.createFactoryProvider(c50848GovernmentIdHintWorker_FactoryCreate);
            this.webRtcServiceProvider = DoubleCheck.provider((Provider) InquiryModule_WebRtcServiceFactory.create(inquiryModule, this.retrofitProvider));
            this.externalEventLoggerProvider = DoubleCheck.provider((Provider) ExternalEventLogger_Factory.create(this.externalInquiryControllerProvider));
            Provider<SelfieService> provider3 = DoubleCheck.provider((Provider) InquiryModule_SelfieServiceFactory.create(inquiryModule, this.retrofitProvider));
            this.selfieServiceProvider = provider3;
            C50863SubmitVerificationWorker_Factory c50863SubmitVerificationWorker_FactoryCreate = C50863SubmitVerificationWorker_Factory.create(this.contextProvider, provider3, this.dataCollectorProvider, this.fallbackModeManagerProvider, this.imageHelperProvider, this.cameraStatsManagerProvider);
            this.submitVerificationWorkerProvider2 = c50863SubmitVerificationWorker_FactoryCreate;
            this.factoryProvider17 = com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl.createFactoryProvider(c50863SubmitVerificationWorker_FactoryCreate);
            this.selfiePoseProvider = DoubleCheck.provider((Provider) CameraModule_SelfiePoseFactory.create(cameraModule));
            SelfieDirectionFeed_Factory selfieDirectionFeed_FactoryCreate = SelfieDirectionFeed_Factory.create(SelfieProcessor_Factory.create(), this.selfiePoseProvider);
            this.selfieDirectionFeedProvider = selfieDirectionFeed_FactoryCreate;
            C50862SelfieAnalyzeWorker_Factory c50862SelfieAnalyzeWorker_FactoryCreate = C50862SelfieAnalyzeWorker_Factory.create(selfieDirectionFeed_FactoryCreate, this.provideSdkFilesManagerProvider);
            this.selfieAnalyzeWorkerProvider = c50862SelfieAnalyzeWorker_FactoryCreate;
            this.factoryProvider18 = SelfieAnalyzeWorker_Factory_Impl.createFactoryProvider(c50862SelfieAnalyzeWorker_FactoryCreate);
            Provider<ActivityResultLauncher<PassportNfcReaderConfig>> provider4 = DoubleCheck.provider((Provider) PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory.create(passportNfcReaderLauncherModule));
            this.passportNfcReaderLauncherProvider = provider4;
            C50860ScanNfcWorker_Factory c50860ScanNfcWorker_FactoryCreate = C50860ScanNfcWorker_Factory.create(provider4, this.contextProvider, this.sandboxFlagsProvider);
            this.scanNfcWorkerProvider = c50860ScanNfcWorker_FactoryCreate;
            this.factoryProvider19 = ScanNfcWorker_Factory_Impl.createFactoryProvider(c50860ScanNfcWorker_FactoryCreate);
            this.uiServiceProvider = DoubleCheck.provider((Provider) InquiryModule_UiServiceFactory.create(inquiryModule, this.retrofitProvider));
            Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> provider5 = DoubleCheck.provider((Provider) CustomTabsLauncherModule_CustomTabsLauncherFactory.create(customTabsLauncherModule));
            this.customTabsLauncherProvider = provider5;
            this.createReusablePersonaWorkerProvider = C50864CreateReusablePersonaWorker_Factory.create(this.uiServiceProvider, this.deviceIdProvider, provider5);
        }

        private void initialize5(NetworkCoreModule networkCoreModule, InquiryModule inquiryModule, DocumentSelectLauncherModule documentSelectLauncherModule, CameraModule cameraModule, PermissionsLauncherModule permissionsLauncherModule, FilesModule filesModule, InquiryActivityModule inquiryActivityModule, CustomTabsLauncherModule customTabsLauncherModule, DocumentLaunchersModule documentLaunchersModule, SandboxModule sandboxModule, PassportNfcReaderLauncherModule passportNfcReaderLauncherModule, DataCollectorModule dataCollectorModule, FallbackModeModule fallbackModeModule, SharedModule sharedModule, DispatchersModule dispatchersModule, ApiControllerModule apiControllerModule, ExternalInquiryControllerModule externalInquiryControllerModule, ResolvableApiLauncherModule resolvableApiLauncherModule, DeviceModule deviceModule) {
            this.factoryProvider20 = CreateReusablePersonaWorker_Factory_Impl.createFactoryProvider(this.createReusablePersonaWorkerProvider);
            C50865VerifyReusablePersonaWorker_Factory c50865VerifyReusablePersonaWorker_FactoryCreate = C50865VerifyReusablePersonaWorker_Factory.create(this.customTabsLauncherProvider, this.uiServiceProvider, this.moshiProvider);
            this.verifyReusablePersonaWorkerProvider = c50865VerifyReusablePersonaWorker_FactoryCreate;
            this.factoryProvider21 = VerifyReusablePersonaWorker_Factory_Impl.createFactoryProvider(c50865VerifyReusablePersonaWorker_FactoryCreate);
            this.takePictureResultLauncherProvider = DoubleCheck.provider((Provider) DocumentLaunchersModule_TakePictureResultLauncherFactory.create(documentLaunchersModule));
            this.openDocumentsResultLauncherProvider = DoubleCheck.provider((Provider) DocumentLaunchersModule_OpenDocumentsResultLauncherFactory.create(documentLaunchersModule));
            this.selectFromPhotoLibraryLauncherProvider = DoubleCheck.provider((Provider) DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory.create(documentLaunchersModule));
            this.documentServiceProvider = DoubleCheck.provider((Provider) InquiryModule_DocumentServiceFactory.create(inquiryModule, this.retrofitProvider));
            this.fileHelperProvider = DoubleCheck.provider((Provider) SharedModule_FileHelperFactory.create(sharedModule, RealFileHelper_Factory.create()));
            C50854RestoreUiStepStateWorker_Factory c50854RestoreUiStepStateWorker_FactoryCreate = C50854RestoreUiStepStateWorker_Factory.create(this.uiStepSavedStateHelperProvider);
            this.restoreUiStepStateWorkerProvider = c50854RestoreUiStepStateWorker_FactoryCreate;
            this.factoryProvider22 = RestoreUiStepStateWorker_Factory_Impl.createFactoryProvider(c50854RestoreUiStepStateWorker_FactoryCreate);
            GovernmentIdCameraScreenViewFactory_Factory governmentIdCameraScreenViewFactory_FactoryCreate = GovernmentIdCameraScreenViewFactory_Factory.create(this.governmentIdFeedProvider, CameraPreview_Factory.create());
            this.governmentIdCameraScreenViewFactoryProvider = governmentIdCameraScreenViewFactory_FactoryCreate;
            this.provideViewBindingsProvider = GovernmentIdModule_ProvideViewBindingsFactory.create(governmentIdCameraScreenViewFactory_FactoryCreate);
            this.oldSelfieCameraScreenViewFactoryProvider = OldSelfieCameraScreenViewFactory_Factory.create(CameraPreview_Factory.create(), this.selfieDirectionFeedProvider);
            SelfieCameraScreenViewFactory_Factory selfieCameraScreenViewFactory_FactoryCreate = SelfieCameraScreenViewFactory_Factory.create(CameraPreview_Factory.create(), this.selfieDirectionFeedProvider);
            this.selfieCameraScreenViewFactoryProvider = selfieCameraScreenViewFactory_FactoryCreate;
            this.provideViewBindingsProvider2 = SelfieModule_ProvideViewBindingsFactory.create(this.oldSelfieCameraScreenViewFactoryProvider, selfieCameraScreenViewFactory_FactoryCreate);
            SetFactory setFactoryBuild = SetFactory.builder(0, 8).addCollectionProvider(InquiryModule_ProvideViewBindingsFactory.create()).addCollectionProvider(this.provideViewBindingsProvider).addCollectionProvider(UiModule_ProvideViewBindingsFactory.create()).addCollectionProvider(this.provideViewBindingsProvider2).addCollectionProvider(DocumentModule_ProvideViewBindingsFactory.create()).addCollectionProvider(SandboxModule_ProvideViewBindingsFactory.create()).addCollectionProvider(ModalModule_ProvideViewBindingsFactory.create()).addCollectionProvider(PermissionsModule_ProvideViewBindingsFactory.create()).build();
            this.setOfViewFactoryOfProvider = setFactoryBuild;
            this.viewRegistryProvider = DoubleCheck.provider((Provider) InquiryModule_ViewRegistryFactory.create(setFactoryBuild));
            this.errorReportingManagerProvider = DoubleCheck.provider((Provider) ErrorReportingManager_Factory.create(this.inquiryServiceProvider, this.moshiProvider, this.loggerProvider));
            InquiryActivityModule_WindowFactory inquiryActivityModule_WindowFactoryCreate = InquiryActivityModule_WindowFactory.create(inquiryActivityModule);
            this.windowProvider = inquiryActivityModule_WindowFactoryCreate;
            this.systemUiControllerProvider = DoubleCheck.provider((Provider) SharedModule_SystemUiControllerFactory.create(sharedModule, inquiryActivityModule_WindowFactoryCreate));
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public InquiryWorkflow workflow() {
            return new InquiryWorkflow(InquiryActivityModule_ContextFactory.context(this.inquiryActivityModule), this.factoryProvider4.get(), this.factoryProvider5.get(), this.factoryProvider6.get(), this.factoryProvider7.get(), this.factoryProvider8.get(), this.factoryProvider9.get(), this.factoryProvider10.get(), governmentIdWorkflow(), selfieWorkflow(), uiWorkflow(), documentWorkflow(), this.sandboxFlagsProvider.get(), ExternalInquiryControllerModule_ExternalInquiryControllerFactory.externalInquiryController(this.externalInquiryControllerModule), this.navigationStateManagerProvider.get(), this.externalEventLoggerProvider.get(), this.uiStepSavedStateHelperProvider.get(), this.factoryProvider22.get());
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public ViewRegistry viewRegistry() {
            return this.viewRegistryProvider.get();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public ErrorReportingManager errorReportingManager() {
            return this.errorReportingManagerProvider.get();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public ImageLoader imageLoader() {
            return this.imageLoaderProvider.get();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public DeviceVendorIDProvider deviceVendorIdProvider() {
            return this.appSetIdHelperProvider.get();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public SystemUiController systemUiController() {
            return this.systemUiControllerProvider.get();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryComponent
        public FontDownloader fontDownloader() {
            return this.realFontDownloaderProvider.get();
        }
    }
}
