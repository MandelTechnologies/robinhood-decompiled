package com.withpersona.sdk2.inquiry.internal;

import coil.ImageLoader;
import com.squareup.workflow1.p415ui.ViewRegistry;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader;
import kotlin.Metadata;

/* compiled from: InquiryComponent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryComponent;", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "workflow", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "Lcom/squareup/workflow1/ui/ViewRegistry;", "viewRegistry", "()Lcom/squareup/workflow1/ui/ViewRegistry;", "Lcom/withpersona/sdk2/inquiry/internal/ErrorReportingManager;", "errorReportingManager", "()Lcom/withpersona/sdk2/inquiry/internal/ErrorReportingManager;", "Lcoil/ImageLoader;", "imageLoader", "()Lcoil/ImageLoader;", "Lcom/withpersona/sdk2/inquiry/device/DeviceVendorIDProvider;", "deviceVendorIdProvider", "()Lcom/withpersona/sdk2/inquiry/device/DeviceVendorIDProvider;", "Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "systemUiController", "()Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "fontDownloader", "()Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface InquiryComponent {
    DeviceVendorIDProvider deviceVendorIdProvider();

    ErrorReportingManager errorReportingManager();

    FontDownloader fontDownloader();

    ImageLoader imageLoader();

    SystemUiController systemUiController();

    ViewRegistry viewRegistry();

    InquiryWorkflow workflow();
}
