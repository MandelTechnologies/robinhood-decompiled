package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: ExternalInquiryController.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "", "controllerRequestFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest;", "getControllerRequestFlow", "()Lkotlinx/coroutines/flow/Flow;", "screenStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/ScreenState;", "getScreenStateFlow$annotations", "()V", "getScreenStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "getEventFlow$annotations", "getEventFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "isNavBarEnabled", "", "()Z", "handleBackPress", "getHandleBackPress", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface ExternalInquiryController {
    Flow<ControllerRequest> getControllerRequestFlow();

    SharedFlow2<InquiryEvent> getEventFlow();

    boolean getHandleBackPress();

    StateFlow2<ScreenState> getScreenStateFlow();

    boolean isNavBarEnabled();
}
