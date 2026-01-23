package com.robinhood.android.store.linking;

import hippo.service.p470v1.BWWorkspaceService;
import hippo.service.p470v1.GetAppSettingsRequestDto;
import hippo.service.p470v1.GetAppSettingsResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MobileLinkingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$appSettingsEndpoint$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MobileLinkingStore2 extends FunctionReferenceImpl implements Function2<GetAppSettingsRequestDto, Continuation<? super GetAppSettingsResponseDto>, Object>, ContinuationImpl6 {
    MobileLinkingStore2(Object obj) {
        super(2, obj, BWWorkspaceService.class, "GetAppSettings", "GetAppSettings(Lhippo/service/v1/GetAppSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAppSettingsRequestDto getAppSettingsRequestDto, Continuation<? super GetAppSettingsResponseDto> continuation) {
        return ((BWWorkspaceService) this.receiver).GetAppSettings(getAppSettingsRequestDto, continuation);
    }
}
