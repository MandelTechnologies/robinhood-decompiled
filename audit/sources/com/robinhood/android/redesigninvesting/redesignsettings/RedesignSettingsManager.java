package com.robinhood.android.redesigninvesting.redesignsettings;

import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettings;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import redesign_settings.p528v1.GetHighlightSettingsRequestDto;
import redesign_settings.p528v1.GetHighlightSettingsResponseDto;
import redesign_settings.p528v1.RedesignSettingsService;

/* compiled from: RedesignSettingsManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\u00020\r*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettingsManager;", "", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "client", "Lredesign_settings/v1/RedesignSettingsService;", "redesignSettings", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toClientModel", "Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "lib-redesign-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RedesignSettingsManager {
    private final MicrogramManager microgramManager;

    /* compiled from: RedesignSettingsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettingsManager", m3645f = "RedesignSettingsManager.kt", m3646l = {35}, m3647m = "redesignSettings")
    /* renamed from: com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettingsManager$redesignSettings$1 */
    static final class C266261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C266261(Continuation<? super C266261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RedesignSettingsManager.this.redesignSettings(null, this);
        }
    }

    public RedesignSettingsManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        this.microgramManager = microgramManager;
    }

    private final MicrogramManager2 microgramInstance(CoroutineScope lifecycleScope) {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, lifecycleScope, new MicrogramLaunchId(new RemoteMicrogramApplication("app-redesign-settings", null, 2, null), null, 2, null), null, 4, null);
    }

    private final RedesignSettingsService client(CoroutineScope lifecycleScope) {
        return (RedesignSettingsService) microgramInstance(lifecycleScope).getComponent().getServiceLocator().getClient(RedesignSettingsService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object redesignSettings(CoroutineScope coroutineScope, Continuation<? super RedesignSettings> continuation) {
        C266261 c266261;
        RedesignSettingsManager redesignSettingsManager;
        if (continuation instanceof C266261) {
            c266261 = (C266261) continuation;
            int i = c266261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c266261.label = i - Integer.MIN_VALUE;
            } else {
                c266261 = new C266261(continuation);
            }
        }
        Object objGetHighlightSettings = c266261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c266261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetHighlightSettings);
            RedesignSettingsService redesignSettingsServiceClient = client(coroutineScope);
            GetHighlightSettingsRequestDto getHighlightSettingsRequestDto = new GetHighlightSettingsRequestDto();
            c266261.L$0 = this;
            c266261.label = 1;
            objGetHighlightSettings = redesignSettingsServiceClient.GetHighlightSettings(getHighlightSettingsRequestDto, c266261);
            if (objGetHighlightSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
            redesignSettingsManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redesignSettingsManager = (RedesignSettingsManager) c266261.L$0;
            ResultKt.throwOnFailure(objGetHighlightSettings);
        }
        return redesignSettingsManager.toClientModel((GetHighlightSettingsResponseDto) objGetHighlightSettings);
    }

    private final RedesignSettings toClientModel(GetHighlightSettingsResponseDto getHighlightSettingsResponseDto) {
        return new RedesignSettings(new RedesignSettings.HighlightSettings(new BigDecimal(String.valueOf(getHighlightSettingsResponseDto.getPrice_movement_threshold())), getHighlightSettingsResponseDto.getRisk_score_threshold(), getHighlightSettingsResponseDto.getMax_top_movers_highlights_displayed(), getHighlightSettingsResponseDto.getMin_highlights_required_for_display(), getHighlightSettingsResponseDto.getMax_highlights_displayed(), getHighlightSettingsResponseDto.getMin_equity_holdings_for_display(), 0L, 0L, 192, null));
    }
}
