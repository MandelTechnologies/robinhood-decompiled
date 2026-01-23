package com.robinhood.android.configurationvitals;

import android.os.Build;
import bff_vitals.service.p021v1.BffVitalsService;
import bff_vitals.service.p021v1.FetchVitalsRequestDto;
import bff_vitals.service.p021v1.FetchVitalsResponseDto;
import com.robinhood.models.api.ConfigurationVitals;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.ReleaseVersion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsProviderModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProviderModule;", "", "<init>", "()V", "provideConfigurationVitalsProvider", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "vitalsService", "Lbff_vitals/service/v1/BffVitalsService;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationVitalsProviderModule {
    public static final ConfigurationVitalsProviderModule INSTANCE = new ConfigurationVitalsProviderModule();

    private ConfigurationVitalsProviderModule() {
    }

    /* compiled from: ConfigurationVitalsProviderModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"com/robinhood/android/configurationvitals/ConfigurationVitalsProviderModule$provideConfigurationVitalsProvider$1", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "getConfigurationVitals", "Lcom/robinhood/models/api/ConfigurationVitals;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsProviderModule$provideConfigurationVitalsProvider$1 */
    public static final class C119501 implements ConfigurationVitalsProvider {
        final /* synthetic */ AppType $appType;
        final /* synthetic */ ReleaseVersion $releaseVersion;
        final /* synthetic */ BffVitalsService $vitalsService;

        C119501(BffVitalsService bffVitalsService, AppType appType, ReleaseVersion releaseVersion) {
            this.$vitalsService = bffVitalsService;
            this.$appType = appType;
            this.$releaseVersion = releaseVersion;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.robinhood.android.configurationvitals.ConfigurationVitalsProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object getConfigurationVitals(Continuation<? super ConfigurationVitals> continuation) {
            ConfigurationVitalsProviderModule2 configurationVitalsProviderModule2;
            if (continuation instanceof ConfigurationVitalsProviderModule2) {
                configurationVitalsProviderModule2 = (ConfigurationVitalsProviderModule2) continuation;
                int i = configurationVitalsProviderModule2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    configurationVitalsProviderModule2.label = i - Integer.MIN_VALUE;
                } else {
                    configurationVitalsProviderModule2 = new ConfigurationVitalsProviderModule2(this, continuation);
                }
            }
            Object objFetchVitals = configurationVitalsProviderModule2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = configurationVitalsProviderModule2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetchVitals);
                BffVitalsService bffVitalsService = this.$vitalsService;
                FetchVitalsRequestDto fetchVitalsRequestDto = new FetchVitalsRequestDto(FetchVitalsRequestDto.PlatformDto.PLATFORM_ANDROID, AppTypes.getConfigurationVitalsApplication(this.$appType), String.valueOf(Build.VERSION.SDK_INT), this.$releaseVersion.getVersionName());
                configurationVitalsProviderModule2.label = 1;
                objFetchVitals = bffVitalsService.FetchVitals(fetchVitalsRequestDto, configurationVitalsProviderModule2);
                if (objFetchVitals == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchVitals);
            }
            FetchVitalsResponseDto fetchVitalsResponseDto = (FetchVitalsResponseDto) objFetchVitals;
            return new ConfigurationVitals(fetchVitalsResponseDto.getClear_cache_created_before_timestamp(), FetchVitalsResponseUtil.toUnsupportedVersionContent(fetchVitalsResponseDto));
        }
    }

    public final ConfigurationVitalsProvider provideConfigurationVitalsProvider(BffVitalsService vitalsService, AppType appType, ReleaseVersion releaseVersion) {
        Intrinsics.checkNotNullParameter(vitalsService, "vitalsService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        return new C119501(vitalsService, appType, releaseVersion);
    }
}
