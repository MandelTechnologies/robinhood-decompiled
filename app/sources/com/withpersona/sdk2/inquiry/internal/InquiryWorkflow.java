package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.iso.countrycode.CountryCode;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.Named;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Conversions3;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker;
import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryState3;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.network.Conversions4;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper2;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper3;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper4;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper7;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper8;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.p420ui.DisableableScreen;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition2;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreen;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.Selfie2;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieType2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ControllerRequest;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition2;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;

/* compiled from: InquiryWorkflow.kt */
@Metadata(m3635d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u0000 \u008c\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001B\u0099\u0001\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J;\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101JA\u00104\u001a\b\u0012\u0004\u0012\u00020\u0005032\u0006\u00102\u001a\u00020\u00052\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u0002062\u0006\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u00108JC\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00032\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b;\u0010<JQ\u0010@\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020=2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\b@\u0010AJQ\u0010C\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020B2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bC\u0010DJQ\u0010F\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020E2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bF\u0010GJ[\u0010L\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0010K\u001a\u0004\u0018\u00010J2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bL\u0010MJQ\u0010O\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020N2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bO\u0010PJQ\u0010R\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020Q2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bR\u0010SJC\u0010U\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020T2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bU\u0010VJQ\u0010X\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020W2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\bX\u0010YJQ\u0010[\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020Z2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0>H\u0002¢\u0006\u0004\b[\u0010\\J;\u0010^\u001a\u00020\u00052\u0006\u0010-\u001a\u00020]2\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010b\u001a\u00020a*\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020=2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJG\u0010n\u001a\u00020:*\u00180hR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040i2\b\u0010k\u001a\u0004\u0018\u00010j2\u0006\u0010l\u001a\u00020`2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010jH\u0002¢\u0006\u0004\bn\u0010oJ!\u0010s\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u00022\b\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\bs\u0010tJC\u0010u\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00032\"\u0010/\u001a\u001e0.R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020q2\u0006\u0010w\u001a\u00020\u0003H\u0016¢\u0006\u0004\bx\u0010yR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010zR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010{R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010|R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010}R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010~R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u007fR\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0080\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0081\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0082\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0083\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0084\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0086\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0087\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0088\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0089\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u008a\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u008b\u0001¨\u0006\u0090\u0001"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/internal/CreateInquiryWorker$Factory;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker$Factory;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/PollingWorker$Factory;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker$Factory;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Factory;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/UpdateInquirySessionWorker$Factory;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/ExchangeOneTimeCodeWorker$Factory;", "exchangeOneTimeCodeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "governmentIdWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "selfieWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "uiWorkflow", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "documentWorkflow", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "externalInquiryController", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Factory;", "restoreUiStepStateWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/CreateInquiryWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/PollingWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/UpdateInquirySessionWorker$Factory;Lcom/withpersona/sdk2/inquiry/internal/ExchangeOneTimeCodeWorker$Factory;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Factory;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "renderState", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "context", "renderComplete", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "screen", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreen;", "wrapSandboxFabScreen", "(Ljava/lang/Object;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreen;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "wrapScreenWithTransition", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "renderProps", "", "runTransitionWorkerIfNeeded", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lkotlin/Function0;", "backAction", "renderShowLoadingSpinner", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "renderCreateInquiryFromTemplate", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "renderResumeFallbackInquiry", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "renderInquiryFromAttributes", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "renderCreateInquirySession", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "renderExchangeOneTimeCode", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "renderGovernmentIdStepRunning", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "renderSelfieStep", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "renderUiStep", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "renderDocumentStep", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "isInconsistentStateError", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lcom/withpersona/sdk2/inquiry/internal/StepState;", "stepState", "resyncState", "(Lcom/withpersona/sdk2/inquiry/internal/StepState;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "", "sessionToken", "error", "errorMessage", "setErrorOutput", "(Lcom/squareup/workflow1/WorkflowAction$Updater;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "props", "Lcom/squareup/workflow1/Snapshot;", "snapshot", "initialState", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/squareup/workflow1/Snapshot;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "render", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Ljava/lang/Object;", "state", "snapshotState", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/squareup/workflow1/Snapshot;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/CreateInquiryWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/CreateInquirySessionWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/PollingWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionBackWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/UpdateInquirySessionWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/internal/ExchangeOneTimeCodeWorker$Factory;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "Lcom/withpersona/sdk2/inquiry/internal/RestoreUiStepStateWorker$Factory;", "Companion", "Props", "Output", "Screen", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InquiryWorkflow extends StatefulWorkflow<Props, InquiryState, Output, Object> {
    private final Context applicationContext;
    private final CreateInquiryWorker.Factory createInquiryWorker;
    private final DocumentWorkflow documentWorkflow;
    private final ExchangeOneTimeCodeWorker.Factory exchangeOneTimeCodeWorkerFactory;
    private final ExternalEventLogger externalEventLogger;
    private final ExternalInquiryController externalInquiryController;
    private final GovernmentIdWorkflow governmentIdWorkflow;
    private final CreateInquirySessionWorker.Factory inquirySessionWorker;
    private final NavigationStateManager navigationStateManager;
    private final PollingWorker.Factory pollingWorker;
    private final RestoreUiStepStateWorker.Factory restoreUiStepStateWorkerFactory;
    private final SandboxFlags sandboxFlags;
    private final SelfieWorkflow selfieWorkflow;
    private final TransitionBackWorker.Factory transitionBackWorker;
    private final TransitionWorker.Factory transitionWorkerFactory;
    private final UiStepSavedStateHelper uiStepSavedStateHelper;
    private final UiWorkflow uiWorkflow;
    private final UpdateInquirySessionWorker.Factory updateInquirySessionWorkerFactory;

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PollingMode.values().length];
            try {
                iArr2[PollingMode.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PollingMode.Blocking.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr3[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public InquiryState initialState(Props props, Snapshot snapshot) {
        InquiryState inquiryState;
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes == null) {
                parcelable = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            inquiryState = (InquiryState) parcelable;
        } else {
            inquiryState = null;
        }
        if (inquiryState != null) {
            return inquiryState instanceof InquiryState.UiStepRunning ? InquiryState.UiStepRunning.copy$default((InquiryState.UiStepRunning) inquiryState, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, true, 131071, null) : inquiryState;
        }
        if (props instanceof Props.TemplateProps) {
            Props.TemplateProps templateProps = (Props.TemplateProps) props;
            return new InquiryState.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.getFields(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate());
        }
        if (props instanceof Props.OneTimeCodeProps) {
            return new InquiryState.ExchangeOneTimeCode(((Props.OneTimeCodeProps) props).getOneTimeLinkCode());
        }
        if (!(props instanceof Props.InquiryProps)) {
            throw new NoWhenBranchMatchedException();
        }
        Props.InquiryProps inquiryProps = (Props.InquiryProps) props;
        if (ExtensionsKt.isFallbackInquiryId(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new InquiryState.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken());
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken == null || sessionToken.length() == 0) {
            return new InquiryState.CreateInquirySession(inquiryProps.getInquiryId());
        }
        return new InquiryState.ShowLoadingSpinner(inquiryProps.getSessionToken(), new InquiryState3.CheckingForNextState(null, 1, null), inquiryProps.getInquiryId(), null, true, InquirySessionConfig.INSTANCE.getDefault());
    }

    public InquiryWorkflow(Context applicationContext, CreateInquiryWorker.Factory createInquiryWorker, CreateInquirySessionWorker.Factory inquirySessionWorker, PollingWorker.Factory pollingWorker, TransitionBackWorker.Factory transitionBackWorker, TransitionWorker.Factory transitionWorkerFactory, UpdateInquirySessionWorker.Factory updateInquirySessionWorkerFactory, ExchangeOneTimeCodeWorker.Factory exchangeOneTimeCodeWorkerFactory, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, SandboxFlags sandboxFlags, ExternalInquiryController externalInquiryController, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, UiStepSavedStateHelper uiStepSavedStateHelper, RestoreUiStepStateWorker.Factory restoreUiStepStateWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(createInquiryWorker, "createInquiryWorker");
        Intrinsics.checkNotNullParameter(inquirySessionWorker, "inquirySessionWorker");
        Intrinsics.checkNotNullParameter(pollingWorker, "pollingWorker");
        Intrinsics.checkNotNullParameter(transitionBackWorker, "transitionBackWorker");
        Intrinsics.checkNotNullParameter(transitionWorkerFactory, "transitionWorkerFactory");
        Intrinsics.checkNotNullParameter(updateInquirySessionWorkerFactory, "updateInquirySessionWorkerFactory");
        Intrinsics.checkNotNullParameter(exchangeOneTimeCodeWorkerFactory, "exchangeOneTimeCodeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdWorkflow, "governmentIdWorkflow");
        Intrinsics.checkNotNullParameter(selfieWorkflow, "selfieWorkflow");
        Intrinsics.checkNotNullParameter(uiWorkflow, "uiWorkflow");
        Intrinsics.checkNotNullParameter(documentWorkflow, "documentWorkflow");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(restoreUiStepStateWorkerFactory, "restoreUiStepStateWorkerFactory");
        this.applicationContext = applicationContext;
        this.createInquiryWorker = createInquiryWorker;
        this.inquirySessionWorker = inquirySessionWorker;
        this.pollingWorker = pollingWorker;
        this.transitionBackWorker = transitionBackWorker;
        this.transitionWorkerFactory = transitionWorkerFactory;
        this.updateInquirySessionWorkerFactory = updateInquirySessionWorkerFactory;
        this.exchangeOneTimeCodeWorkerFactory = exchangeOneTimeCodeWorkerFactory;
        this.governmentIdWorkflow = governmentIdWorkflow;
        this.selfieWorkflow = selfieWorkflow;
        this.uiWorkflow = uiWorkflow;
        this.documentWorkflow = documentWorkflow;
        this.sandboxFlags = sandboxFlags;
        this.externalInquiryController = externalInquiryController;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.restoreUiStepStateWorkerFactory = restoreUiStepStateWorkerFactory;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Object render(Props renderProps, final InquiryState renderState, final StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        Object objRenderComplete;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        runTransitionWorkerIfNeeded(renderProps, renderState, context);
        this.navigationStateManager.setTransitioningBack(Intrinsics.areEqual(renderState.getTransitionStatus(), InquiryState3.TransitioningBack.INSTANCE));
        Function0<Unit> function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InquiryWorkflow.render$lambda$1(context, this, renderState);
            }
        };
        context.runningSideEffect("controllerRequestCollector", new C436201(context, renderState, null));
        if (renderProps.getIsCancelled()) {
            context.runningSideEffect("cancel_inquiry", new C436212(context, this, renderState, null));
        }
        if (renderState instanceof InquiryState.CreateInquiryFromTemplate) {
            objRenderComplete = renderCreateInquiryFromTemplate(renderProps, (InquiryState.CreateInquiryFromTemplate) renderState, context, function0);
        } else if (renderState instanceof InquiryState.ResumeFallbackInquiry) {
            objRenderComplete = renderResumeFallbackInquiry(renderProps, (InquiryState.ResumeFallbackInquiry) renderState, context, function0);
        } else if (renderState instanceof InquiryState.CreateInquirySession) {
            objRenderComplete = renderCreateInquirySession(renderProps, (InquiryState.CreateInquirySession) renderState, context, function0);
        } else if (renderState instanceof InquiryState.ExchangeOneTimeCode) {
            objRenderComplete = renderExchangeOneTimeCode(renderProps, (InquiryState.ExchangeOneTimeCode) renderState, context, function0);
        } else if (renderState instanceof InquiryState.ShowLoadingSpinner) {
            objRenderComplete = renderShowLoadingSpinner(renderProps, (InquiryState.ShowLoadingSpinner) renderState, context, function0);
        } else if (renderState instanceof InquiryState.GovernmentIdStepRunning) {
            objRenderComplete = renderGovernmentIdStepRunning(renderProps, (InquiryState.GovernmentIdStepRunning) renderState, context);
        } else if (renderState instanceof InquiryState.SelfieStepRunning) {
            objRenderComplete = renderSelfieStep(renderProps, (InquiryState.SelfieStepRunning) renderState, context, function0);
        } else if (renderState instanceof InquiryState.UiStepRunning) {
            objRenderComplete = renderUiStep(renderProps, (InquiryState.UiStepRunning) renderState, context, function0);
        } else if (renderState instanceof InquiryState.DocumentStepRunning) {
            objRenderComplete = renderDocumentStep((InquiryState.DocumentStepRunning) renderState, context);
        } else {
            if (!(renderState instanceof InquiryState.Complete)) {
                throw new NoWhenBranchMatchedException();
            }
            objRenderComplete = renderComplete((InquiryState.Complete) renderState, context);
        }
        ScreenWithTransition screenWithTransitionWrapScreenWithTransition = wrapScreenWithTransition(objRenderComplete, renderState);
        return this.sandboxFlags.getIsSandboxModeEnabled() ? wrapSandboxFabScreen(screenWithTransitionWrapScreenWithTransition, context) : screenWithTransitionWrapScreenWithTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$onCancel(StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext renderContext, InquiryWorkflow inquiryWorkflow, final InquiryState inquiryState, final boolean z) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.render$onCancel$lambda$0(inquiryState, z, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$onCancel$lambda$0(InquiryState inquiryState, boolean z, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String inquiryId = inquiryState.getInquiryId();
        String sessionToken = inquiryState.getSessionToken();
        StepStyles2 styles = inquiryState.getStyles();
        NextStep.CancelDialog cancelDialog = inquiryState.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = inquiryState.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = inquiryState.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = inquiryState.getCancelDialog();
        action.setOutput(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(StatefulWorkflow.RenderContext renderContext, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState) {
        render$onCancel(renderContext, inquiryWorkflow, inquiryState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$1", m3645f = "InquiryWorkflow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$1 */
    static final class C436201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, InquiryState, Output, Object>.RenderContext $context;
        final /* synthetic */ InquiryState $renderState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436201(StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext renderContext, InquiryState inquiryState, Continuation<? super C436201> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.$renderState = inquiryState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InquiryWorkflow.this.new C436201(this.$context, this.$renderState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ControllerRequest> controllerRequestFlow = InquiryWorkflow.this.externalInquiryController.getControllerRequestFlow();
                final StatefulWorkflow<Props, InquiryState, Output, Object>.RenderContext renderContext = this.$context;
                final InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                final InquiryState inquiryState = this.$renderState;
                FlowCollector<? super ControllerRequest> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.render.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ControllerRequest) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ControllerRequest controllerRequest, Continuation<? super Unit> continuation) {
                        if (controllerRequest instanceof ControllerRequest.CancelRequest) {
                            InquiryWorkflow.render$onCancel(renderContext, inquiryWorkflow, inquiryState, ((ControllerRequest.CancelRequest) controllerRequest).getForce());
                            return Unit.INSTANCE;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                this.label = 1;
                if (controllerRequestFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$2", m3645f = "InquiryWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$2 */
    static final class C436212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, InquiryState, Output, Object>.RenderContext $context;
        final /* synthetic */ InquiryState $renderState;
        int label;
        final /* synthetic */ InquiryWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436212(StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext renderContext, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, Continuation<? super C436212> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = inquiryWorkflow;
            this.$renderState = inquiryState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C436212(this.$context, this.this$0, this.$renderState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InquiryWorkflow.render$onCancel(this.$context, this.this$0, this.$renderState, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderComplete$1", m3645f = "InquiryWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderComplete$1 */
    static final class C436221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, InquiryState, Output, Object>.RenderContext $context;
        final /* synthetic */ InquiryState.Complete $renderState;
        int label;
        final /* synthetic */ InquiryWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436221(StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext renderContext, InquiryWorkflow inquiryWorkflow, InquiryState.Complete complete, Continuation<? super C436221> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = inquiryWorkflow;
            this.$renderState = complete;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C436221(this.$context, this.this$0, this.$renderState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Props, InquiryState, ? extends Output>> actionSink = this.$context.getActionSink();
            InquiryWorkflow inquiryWorkflow = this.this$0;
            final InquiryState.Complete complete = this.$renderState;
            actionSink.send(StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderComplete$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InquiryWorkflow.C436221.invokeSuspend$lambda$0(complete, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(InquiryState.Complete complete, WorkflowAction.Updater updater) {
            updater.setOutput(new Output.Complete(complete.getInquiryId(), complete.getInquiryStatus(), complete.getFields(), complete.getSessionToken()));
            return Unit.INSTANCE;
        }
    }

    private final Object renderComplete(InquiryState.Complete renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        context.runningSideEffect("complete", new C436221(context, this, renderState, null));
        return new Screen.InquiryCompleteScreen();
    }

    private final SandboxScreen<Object> wrapSandboxFabScreen(Object screen, final StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        return new SandboxScreen<>(screen, new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InquiryWorkflow.wrapSandboxFabScreen$lambda$3(this.f$0, context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InquiryWorkflow.wrapSandboxFabScreen$lambda$4(this.f$0);
            }
        }, this.sandboxFlags.getSimulateGovIdNfc(), new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.wrapSandboxFabScreen$lambda$6(this.f$0, context, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wrapSandboxFabScreen$lambda$3(InquiryWorkflow inquiryWorkflow, StatefulWorkflow.RenderContext renderContext) {
        inquiryWorkflow.sandboxFlags.toggle();
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.wrapSandboxFabScreen$lambda$3$lambda$2((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wrapSandboxFabScreen$lambda$3$lambda$2(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SandboxFlags.ForcedStatus wrapSandboxFabScreen$lambda$4(InquiryWorkflow inquiryWorkflow) {
        return inquiryWorkflow.sandboxFlags.getDebugForcedStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wrapSandboxFabScreen$lambda$6(InquiryWorkflow inquiryWorkflow, StatefulWorkflow.RenderContext renderContext, boolean z) {
        inquiryWorkflow.sandboxFlags.setSimulateGovIdNfc(z);
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.wrapSandboxFabScreen$lambda$6$lambda$5((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wrapSandboxFabScreen$lambda$6$lambda$5(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        return Unit.INSTANCE;
    }

    private final ScreenWithTransition wrapScreenWithTransition(Object screen, InquiryState renderState) {
        ScreenWithTransition2 screenWithTransition2;
        if (renderState.getDidGoBack()) {
            screenWithTransition2 = ScreenWithTransition2.SLIDE_OUT;
        } else {
            screenWithTransition2 = ScreenWithTransition2.SLIDE_IN;
        }
        return new ScreenWithTransition(screen, screenWithTransition2);
    }

    private final void runTransitionWorkerIfNeeded(Props renderProps, final InquiryState renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final InquiryState3 transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof InquiryState3.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            Workflows.runningWorker(context, this.transitionWorkerFactory.create(sessionToken, inquiryId, renderState.getInquirySessionConfig(), ((InquiryState3.Transitioning) transitionStatus).getTransitionData()), Reflection.typeOf(TransitionWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$9(this.f$0, renderState, sessionToken, (TransitionWorker.Response) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof InquiryState3.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            Workflows.runningWorker(context, this.updateInquirySessionWorkerFactory.create(sessionToken, inquiryId, renderState.getInquirySessionConfig()), Reflection.typeOf(UpdateInquirySessionWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$12(this.f$0, sessionToken, transitionStatus, (InquiryApiHelper8) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof InquiryState3.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            Workflows.runningWorker(context, this.pollingWorker.create(sessionToken, inquiryId, ((InquiryState3.CheckingForNextState) transitionStatus).getPollingMode(), renderState.getInquirySessionConfig()), Reflection.typeOf(PollingWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$15(this.f$0, renderState, sessionToken, (PollingWorker.Response) obj);
                }
            });
            return;
        }
        if (!Intrinsics.areEqual(transitionStatus, InquiryState3.TransitioningBack.INSTANCE)) {
            if (transitionStatus != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            Workflows.runningWorker(context, this.transitionBackWorker.create(sessionToken, inquiryId, fromStep, renderState.getInquirySessionConfig()), Reflection.typeOf(TransitionBackWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$18(this.f$0, renderState, sessionToken, (InquiryApiHelper7) obj);
                }
            });
        }
    }

    private static final WorkflowAction<Props, InquiryState, Output> runTransitionWorkerIfNeeded$handleError(final InquiryWorkflow inquiryWorkflow, final InquiryState inquiryState, final String str, final InternalErrorInfo internalErrorInfo) {
        return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.runTransitionWorkerIfNeeded$handleError$lambda$7(internalErrorInfo, inquiryState, inquiryWorkflow, str, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runTransitionWorkerIfNeeded$handleError$lambda$7(InternalErrorInfo internalErrorInfo, InquiryState inquiryState, InquiryWorkflow inquiryWorkflow, String str, WorkflowAction.Updater action) {
        Collection<UiComponentError> collectionValues;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
            list = null;
            List list = null;
            if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
                Object state = action.getState();
                InquiryState.UiStepRunning uiStepRunning = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
                if (uiStepRunning == null) {
                    return Unit.INSTANCE;
                }
                Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
                if (details != null && (collectionValues = details.values()) != null) {
                    list = CollectionsKt.toList(collectionValues);
                }
                action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, list, null, null, false, 245755, null));
            } else if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
                if (inquiryState instanceof InquiryState2) {
                    action.setState(inquiryWorkflow.resyncState((InquiryState2) inquiryState));
                } else {
                    setErrorOutput$default(inquiryWorkflow, action, str, internalErrorInfo, null, 4, null);
                }
            } else {
                if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
                    throw new NoWhenBranchMatchedException();
                }
                if (networkErrorInfo.isRecoverable()) {
                    Object state2 = action.getState();
                    InquiryState.UiStepRunning uiStepRunning2 = state2 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state2 : null;
                    if (uiStepRunning2 == null) {
                        return Unit.INSTANCE;
                    }
                    action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning2, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, networkErrorInfo, null, false, 229371, null));
                } else {
                    setErrorOutput$default(inquiryWorkflow, action, str, internalErrorInfo, null, 4, null);
                }
            }
        } else {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new NoWhenBranchMatchedException();
            }
            setErrorOutput$default(inquiryWorkflow, action, str, internalErrorInfo, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runTransitionWorkerIfNeeded$lambda$9(InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, String str, final TransitionWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof TransitionWorker.Response.Error) {
            return runTransitionWorkerIfNeeded$handleError(inquiryWorkflow, inquiryState, str, ((TransitionWorker.Response.Error) it).getCause());
        }
        if (it instanceof TransitionWorker.Response.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$9$lambda$8(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$9$lambda$8(TransitionWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((InquiryState) action.getState()).updateTransitionStatus(new InquiryState3.UpdateInquirySession(((TransitionWorker.Response.Success) response).getNextState())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runTransitionWorkerIfNeeded$lambda$12(final InquiryWorkflow inquiryWorkflow, final String str, final InquiryState3 inquiryState3, final InquiryApiHelper8 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InquiryApiHelper8.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$12$lambda$10(this.f$0, str, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, InquiryApiHelper8.Success.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$12$lambda$11(inquiryState3, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$12$lambda$10(InquiryWorkflow inquiryWorkflow, String str, InquiryApiHelper8 inquiryApiHelper8, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        setErrorOutput$default(inquiryWorkflow, action, str, ((InquiryApiHelper8.Error) inquiryApiHelper8).getCause(), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$12$lambda$11(InquiryState3 inquiryState3, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryState3.UpdateInquirySession updateInquirySession = (InquiryState3.UpdateInquirySession) inquiryState3;
        if (updateInquirySession.getNextStep() != null) {
            action.setState(updateInquirySession.getNextStep());
        } else {
            action.setState(((InquiryState) action.getState()).updateTransitionStatus(new InquiryState3.CheckingForNextState(null, 1, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runTransitionWorkerIfNeeded$lambda$15(InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, String str, final PollingWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof PollingWorker.Response.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$15$lambda$13(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof PollingWorker.Response.Error) {
            return runTransitionWorkerIfNeeded$handleError(inquiryWorkflow, inquiryState, str, ((PollingWorker.Response.Error) it).getCause());
        }
        if (it instanceof PollingWorker.Response.PollingModeChanged) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$15$lambda$14(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$15$lambda$13(PollingWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((PollingWorker.Response.Success) response).getNextState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$15$lambda$14(PollingWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(((InquiryState) action.getState()).updateTransitionStatus(new InquiryState3.CheckingForNextState(((PollingWorker.Response.PollingModeChanged) response).getNewPollingMode())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runTransitionWorkerIfNeeded$lambda$18(final InquiryWorkflow inquiryWorkflow, final InquiryState inquiryState, final String str, final InquiryApiHelper7 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InquiryApiHelper7.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$18$lambda$16(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof InquiryApiHelper7.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.runTransitionWorkerIfNeeded$lambda$18$lambda$17(this.f$0, it, inquiryState, str, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runTransitionWorkerIfNeeded$lambda$18$lambda$16(InquiryApiHelper7 inquiryApiHelper7, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper7.Success success = (InquiryApiHelper7.Success) inquiryApiHelper7;
        success.getNextState().setDidGoBack(true);
        action.setState(success.getNextState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runTransitionWorkerIfNeeded$lambda$18$lambda$17(InquiryWorkflow inquiryWorkflow, InquiryApiHelper7 inquiryApiHelper7, InquiryState inquiryState, String str, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper7.Error error = (InquiryApiHelper7.Error) inquiryApiHelper7;
        if (inquiryWorkflow.isInconsistentStateError(error.getCause()) && (inquiryState instanceof InquiryState2)) {
            action.setState(inquiryWorkflow.resyncState((InquiryState2) inquiryState));
        } else {
            setErrorOutput$default(inquiryWorkflow, action, str, error.getCause(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final Object renderShowLoadingSpinner(Props renderProps, InquiryState.ShowLoadingSpinner renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        return new Screen.InquiryLoadingScreen(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction);
    }

    private final Object renderCreateInquiryFromTemplate(Props renderProps, InquiryState.CreateInquiryFromTemplate renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        return renderInquiryFromAttributes(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.getFields(), renderState.getThemeSetId(), 256, null), context, renderState.getStyles(), backAction);
    }

    private final Object renderResumeFallbackInquiry(Props renderProps, InquiryState.ResumeFallbackInquiry renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        return renderInquiryFromAttributes(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, 2019, null), context, renderState.getStyles(), backAction);
    }

    private final Object renderInquiryFromAttributes(Props renderProps, final InquiryAttributes attributes, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, StepStyles2 styles, Function0<Unit> backAction) {
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        Workflows.runningWorker(context, this.createInquiryWorker.create(attributes), Reflection.typeOf(CreateInquiryWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderInquiryFromAttributes$lambda$21(this.f$0, attributes, (InquiryApiHelper2) obj);
            }
        });
        return new Screen.InquiryLoadingScreen(styles, true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderInquiryFromAttributes$lambda$21(final InquiryWorkflow inquiryWorkflow, final InquiryAttributes inquiryAttributes, final InquiryApiHelper2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InquiryApiHelper2.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderInquiryFromAttributes$lambda$21$lambda$19(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof InquiryApiHelper2.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderInquiryFromAttributes$lambda$21$lambda$20(this.f$0, inquiryAttributes, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderInquiryFromAttributes$lambda$21$lambda$19(InquiryApiHelper2 inquiryApiHelper2, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper2.Success success = (InquiryApiHelper2.Success) inquiryApiHelper2;
        if (ExtensionsKt.isFallbackInquiryId(success.getInquiryId())) {
            action.setOutput(new Output.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
        } else {
            action.setState(new InquiryState.CreateInquirySession(success.getInquiryId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderInquiryFromAttributes$lambda$21$lambda$20(InquiryWorkflow inquiryWorkflow, InquiryAttributes inquiryAttributes, InquiryApiHelper2 inquiryApiHelper2, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper2.Error error = (InquiryApiHelper2.Error) inquiryApiHelper2;
        inquiryWorkflow.setErrorOutput(action, inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        return Unit.INSTANCE;
    }

    private final Object renderCreateInquirySession(Props renderProps, final InquiryState.CreateInquirySession renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        Workflows.runningWorker(context, this.inquirySessionWorker.create(renderState.getInquiryId()), Reflection.typeOf(CreateInquirySessionWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderCreateInquirySession$lambda$24(this.f$0, renderState, (InquiryApiHelper3) obj);
            }
        });
        return new Screen.InquiryLoadingScreen(renderState.getStyles(), true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderCreateInquirySession$lambda$24(final InquiryWorkflow inquiryWorkflow, final InquiryState.CreateInquirySession createInquirySession, final InquiryApiHelper3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InquiryApiHelper3.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderCreateInquirySession$lambda$24$lambda$22(createInquirySession, it, inquiryWorkflow, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof InquiryApiHelper3.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderCreateInquirySession$lambda$24$lambda$23(this.f$0, createInquirySession, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCreateInquirySession$lambda$24$lambda$22(InquiryState.CreateInquirySession createInquirySession, InquiryApiHelper3 inquiryApiHelper3, InquiryWorkflow inquiryWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper3.Success success = (InquiryApiHelper3.Success) inquiryApiHelper3;
        action.setState(new InquiryState.ShowLoadingSpinner(success.getSessionToken(), null, createInquirySession.getInquiryId(), null, true, success.getInquirySessionConfig(), 2, null));
        inquiryWorkflow.externalEventLogger.logEvent(new InquiryEvent.StartEvent(createInquirySession.getInquiryId(), InquiryArguments.INSTANCE.removeBearer(success.getSessionToken())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCreateInquirySession$lambda$24$lambda$23(InquiryWorkflow inquiryWorkflow, InquiryState.CreateInquirySession createInquirySession, InquiryApiHelper3 inquiryApiHelper3, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        setErrorOutput$default(inquiryWorkflow, action, createInquirySession.getSessionToken(), ((InquiryApiHelper3.Error) inquiryApiHelper3).getCause(), null, 4, null);
        return Unit.INSTANCE;
    }

    private final Object renderExchangeOneTimeCode(Props renderProps, final InquiryState.ExchangeOneTimeCode renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 4, null);
        Workflows.runningWorker(context, this.exchangeOneTimeCodeWorkerFactory.create(renderState.getOneTimeLinkCode()), Reflection.typeOf(ExchangeOneTimeCodeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderExchangeOneTimeCode$lambda$27(this.f$0, renderState, (InquiryApiHelper4) obj);
            }
        });
        return new Screen.InquiryLoadingScreen(renderState.getStyles(), true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderExchangeOneTimeCode$lambda$27(final InquiryWorkflow inquiryWorkflow, final InquiryState.ExchangeOneTimeCode exchangeOneTimeCode, final InquiryApiHelper4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InquiryApiHelper4.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderExchangeOneTimeCode$lambda$27$lambda$25(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof InquiryApiHelper4.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderExchangeOneTimeCode$lambda$27$lambda$26(this.f$0, exchangeOneTimeCode, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderExchangeOneTimeCode$lambda$27$lambda$25(InquiryApiHelper4 inquiryApiHelper4, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InquiryApiHelper4.Success success = (InquiryApiHelper4.Success) inquiryApiHelper4;
        if (success.getSessionToken() == null) {
            action.setState(new InquiryState.CreateInquirySession(success.getInquiryId()));
        } else {
            action.setState(new InquiryState.ShowLoadingSpinner(success.getSessionToken(), new InquiryState3.CheckingForNextState(null, 1, null), success.getInquiryId(), null, true, InquirySessionConfig.INSTANCE.getDefault()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderExchangeOneTimeCode$lambda$27$lambda$26(InquiryWorkflow inquiryWorkflow, InquiryState.ExchangeOneTimeCode exchangeOneTimeCode, InquiryApiHelper4 inquiryApiHelper4, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        setErrorOutput$default(inquiryWorkflow, action, exchangeOneTimeCode.getSessionToken(), ((InquiryApiHelper4.Error) inquiryApiHelper4).getCause(), null, 4, null);
        return Unit.INSTANCE;
    }

    private final Object renderGovernmentIdStepRunning(Props renderProps, final InquiryState.GovernmentIdStepRunning renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        String fromStep = renderState.getFromStep();
        GovernmentIdWorkflow governmentIdWorkflow = this.governmentIdWorkflow;
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> enabledIdClasses = renderState.getEnabledIdClasses();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = enabledIdClasses.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = CountryCode.COUNTRY_CODE_US;
            if (!zHasNext) {
                break;
            }
            Id id = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            if (countryCode2 != null) {
                str = countryCode2;
            }
            IdConfig idConfig = Conversions3.toIdConfig(id, str, renderState.getManualCaptureButtonDelayMs());
            if (idConfig != null) {
                arrayList.add(idConfig);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String str2 = CountryCode.COUNTRY_CODE_US;
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = renderState.getEnabledCaptureOptionsNativeMobile();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        if (countryCode3 != null) {
            str2 = countryCode3;
        }
        List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = renderState.getLocalizationOverrides();
        GovernmentIdWorkflow.Input.Strings stringsM3232to = Conversions4.m3232to(localizations, str2, (List<NextStep.GovernmentId.LocalizationOverride>) (localizationOverrides != null ? CollectionsKt.sortedDescending(localizationOverrides) : null));
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes = renderState.getEnabledCaptureFileTypes();
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = renderState.getVideoCaptureMethods();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(videoCaptureMethods, 10));
        Iterator<T> it2 = videoCaptureMethods.iterator();
        while (it2.hasNext()) {
            arrayList2.add(VideoCaptureMethod.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, enabledCaptureFileTypes, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        return context.renderChild(governmentIdWorkflow, new GovernmentIdWorkflow.Input(sessionToken, countryCode, arrayList, inquiryId, fromStep2, fromComponent, backStepEnabled, cancelButtonEnabled, enabledCaptureOptionsNativeMobile, styles, stringsM3232to, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig, !Intrinsics.areEqual(renderState.getTransitionStatus(), InquiryState3.TransitioningBack.INSTANCE), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig()), fromStep, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderGovernmentIdStepRunning$lambda$34(this.f$0, renderState, (GovernmentIdWorkflow.Output) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderGovernmentIdStepRunning$lambda$34(final InquiryWorkflow inquiryWorkflow, final InquiryState.GovernmentIdStepRunning governmentIdStepRunning, final GovernmentIdWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, GovernmentIdWorkflow.Output.Canceled.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderGovernmentIdStepRunning$lambda$34$lambda$30(governmentIdStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof GovernmentIdWorkflow.Output.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderGovernmentIdStepRunning$lambda$34$lambda$31(this.f$0, it, governmentIdStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, GovernmentIdWorkflow.Output.Finished.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderGovernmentIdStepRunning$lambda$34$lambda$32(governmentIdStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, GovernmentIdWorkflow.Output.Back.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderGovernmentIdStepRunning$lambda$34$lambda$33(governmentIdStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGovernmentIdStepRunning$lambda$34$lambda$30(InquiryState.GovernmentIdStepRunning governmentIdStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String inquiryId = governmentIdStepRunning.getInquiryId();
        String sessionToken = governmentIdStepRunning.getSessionToken();
        StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
        action.setOutput(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGovernmentIdStepRunning$lambda$34$lambda$31(InquiryWorkflow inquiryWorkflow, GovernmentIdWorkflow.Output output, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdWorkflow.Output.Error error = (GovernmentIdWorkflow.Output.Error) output;
        if (inquiryWorkflow.isInconsistentStateError(error.getCause())) {
            action.setState(inquiryWorkflow.resyncState(governmentIdStepRunning));
        } else {
            setErrorOutput$default(inquiryWorkflow, action, governmentIdStepRunning.getSessionToken(), error.getCause(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGovernmentIdStepRunning$lambda$34$lambda$32(InquiryState.GovernmentIdStepRunning governmentIdStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, null, null, new InquiryState3.CheckingForNextState(null, 1, null), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderGovernmentIdStepRunning$lambda$34$lambda$33(InquiryState.GovernmentIdStepRunning governmentIdStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.GovernmentIdStepRunning.copy$default(governmentIdStepRunning, null, null, InquiryState3.TransitioningBack.INSTANCE, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
        return Unit.INSTANCE;
    }

    private final Object renderSelfieStep(Props renderProps, final InquiryState.SelfieStepRunning renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        String str;
        String str2;
        List listListOf;
        List list;
        String str3;
        String str4;
        String fromStep = renderState.getFromStep();
        SelfieWorkflow selfieWorkflow = this.selfieWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromComponent = renderState.getFromComponent();
        String fromStep2 = renderState.getFromStep();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        String fieldKeySelfie = renderState.getFieldKeySelfie();
        boolean requireStrictSelfieCapture = renderState.getRequireStrictSelfieCapture();
        boolean skipPromptPage = renderState.getSkipPromptPage();
        SelfieWorkflow.Input.Strings stringsM3233to = Conversions4.m3233to(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        SelfieType selfieTypeM3253to = SelfieType2.m3253to(renderState.getSelfieType());
        List<NextStep.Selfie.SelfiePose> orderedPoses = renderState.getOrderedPoses();
        if (orderedPoses == null || orderedPoses.isEmpty()) {
            str = sessionToken;
            str2 = inquiryId;
            int i = WhenMappings.$EnumSwitchMapping$0[renderState.getSelfieType().ordinal()];
            if (i == 1) {
                listListOf = CollectionsKt.listOf(Selfie.Pose.Center);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listListOf = CollectionsKt.listOf((Object[]) new Selfie.Pose[]{Selfie.Pose.Center, Selfie.Pose.Left, Selfie.Pose.Right});
            }
        } else {
            List<NextStep.Selfie.SelfiePose> orderedPoses2 = renderState.getOrderedPoses();
            str = sessionToken;
            str2 = inquiryId;
            listListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(orderedPoses2, 10));
            Iterator<T> it = orderedPoses2.iterator();
            while (it.hasNext()) {
                listListOf.add(Selfie2.m3252to((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        String cameraPermissionsTitle = renderState.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnCancel();
        StepStyles.SelfieStepStyle styles = renderState.getStyles();
        NextStep.Selfie.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            list = listListOf;
            assetConfig = new NextStep.Selfie.AssetConfig(null, null, 3, null);
            str3 = str;
            str4 = cameraPermissionsTitle;
        } else {
            list = listListOf;
            str3 = str;
            str4 = cameraPermissionsTitle;
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getPendingPageTextVerticalPosition();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = renderState.getEnabledCaptureFileTypes();
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = renderState.getVideoCaptureMethods();
        String str5 = str3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(videoCaptureMethods, 10));
        Iterator<T> it2 = videoCaptureMethods.iterator();
        while (it2.hasNext()) {
            arrayList.add(VideoCaptureMethod.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        return new DisableableScreen(context.renderChild(selfieWorkflow, new SelfieWorkflow.Input(str5, str2, fromComponent, fromStep2, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, stringsM3233to, selfieTypeM3253to, list, str4, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, enabledCaptureFileTypes, arrayList, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null), assetConfig, pendingPageTextVerticalPosition, renderState.getPoseConfigs(), renderState.getDesignVersion()), fromStep, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderSelfieStep$lambda$41(this.f$0, renderState, (SelfieWorkflow.Output) obj);
            }
        }), !Intrinsics.areEqual(renderState.getTransitionStatus(), InquiryState3.TransitioningBack.INSTANCE), renderState.getFromStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderSelfieStep$lambda$41(final InquiryWorkflow inquiryWorkflow, final InquiryState.SelfieStepRunning selfieStepRunning, final SelfieWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, SelfieWorkflow.Output.Canceled.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderSelfieStep$lambda$41$lambda$37(selfieStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, SelfieWorkflow.Output.Finished.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderSelfieStep$lambda$41$lambda$38(selfieStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, SelfieWorkflow.Output.Back.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderSelfieStep$lambda$41$lambda$39(selfieStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof SelfieWorkflow.Output.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderSelfieStep$lambda$41$lambda$40(this.f$0, it, selfieStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSelfieStep$lambda$41$lambda$37(InquiryState.SelfieStepRunning selfieStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String inquiryId = selfieStepRunning.getInquiryId();
        String sessionToken = selfieStepRunning.getSessionToken();
        StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
        action.setOutput(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSelfieStep$lambda$41$lambda$38(InquiryState.SelfieStepRunning selfieStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, null, null, new InquiryState3.CheckingForNextState(null, 1, null), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 8388603, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSelfieStep$lambda$41$lambda$39(InquiryState.SelfieStepRunning selfieStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.SelfieStepRunning.copy$default(selfieStepRunning, null, null, InquiryState3.TransitioningBack.INSTANCE, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 8388603, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderSelfieStep$lambda$41$lambda$40(InquiryWorkflow inquiryWorkflow, SelfieWorkflow.Output output, InquiryState.SelfieStepRunning selfieStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieWorkflow.Output.Error error = (SelfieWorkflow.Output.Error) output;
        if (inquiryWorkflow.isInconsistentStateError(error.getCause())) {
            action.setState(inquiryWorkflow.resyncState(selfieStepRunning));
        } else {
            setErrorOutput$default(inquiryWorkflow, action, selfieStepRunning.getSessionToken(), error.getCause(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final Object renderUiStep(Props renderProps, final InquiryState.UiStepRunning renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context, Function0<Unit> backAction) {
        NextStep.C43686Ui.PromptPage promptPage;
        NextStep.C43686Ui.PromptPage promptPage2;
        NextStep.C43686Ui.PromptPage promptPage3;
        NextStep.C43686Ui.PromptPage promptPage4;
        NextStep.C43686Ui.PromptPage promptPage5;
        NextStep.C43686Ui.PromptPage promptPage6;
        NextStep.C43686Ui.PromptPage promptPage7;
        String clientSideKey = renderState.getClientSideKey();
        UiWorkflow uiWorkflow = this.uiWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        List<UiComponentConfig> components = renderState.getComponents();
        String stepName = renderState.getStepName();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        boolean finalStep = renderState.getFinalStep();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        NextStep.C43686Ui.Localizations localizations = renderState.getLocalizations();
        String gpsPermissionsTitle = (localizations == null || (promptPage7 = localizations.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsTitle();
        NextStep.C43686Ui.Localizations localizations2 = renderState.getLocalizations();
        String gpsPermissionsPrompt = (localizations2 == null || (promptPage6 = localizations2.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsPrompt();
        NextStep.C43686Ui.Localizations localizations3 = renderState.getLocalizations();
        String gpsPermissionsAllowButtonText = (localizations3 == null || (promptPage5 = localizations3.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsAllowButtonText();
        NextStep.C43686Ui.Localizations localizations4 = renderState.getLocalizations();
        String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage4 = localizations4.getPromptPage()) == null) ? null : promptPage4.getGpsPermissionsBtnCancel();
        NextStep.C43686Ui.Localizations localizations5 = renderState.getLocalizations();
        String gpsFeatureTitle = (localizations5 == null || (promptPage3 = localizations5.getPromptPage()) == null) ? null : promptPage3.getGpsFeatureTitle();
        NextStep.C43686Ui.Localizations localizations6 = renderState.getLocalizations();
        String gpsFeaturePrompt = (localizations6 == null || (promptPage2 = localizations6.getPromptPage()) == null) ? null : promptPage2.getGpsFeaturePrompt();
        NextStep.C43686Ui.Localizations localizations7 = renderState.getLocalizations();
        String gpsFeatureTurnOnText = (localizations7 == null || (promptPage = localizations7.getPromptPage()) == null) ? null : promptPage.getGpsFeatureTurnOnText();
        StepStyles.UiStepStyle styles = renderState.getStyles();
        List<UiComponentError> serverComponentErrors = renderState.getServerComponentErrors();
        InquiryState3 transitionStatus = renderState.getTransitionStatus();
        String str = gpsPermissionsTitle;
        boolean z = false;
        if (transitionStatus instanceof InquiryState3.CheckingForNextState) {
            int i = WhenMappings.$EnumSwitchMapping$1[((InquiryState3.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
        } else if ((transitionStatus instanceof InquiryState3.Transitioning) || Intrinsics.areEqual(transitionStatus, InquiryState3.TransitioningBack.INSTANCE) || (transitionStatus instanceof InquiryState3.UpdateInquirySession)) {
            z = true;
        } else if (transitionStatus != null) {
            throw new NoWhenBranchMatchedException();
        }
        DisableableScreen disableableScreen = new DisableableScreen(new Named(context.renderChild(uiWorkflow, new UiWorkflow.Input(sessionToken, inquiryId, components, stepName, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, str, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, styles, serverComponentErrors, z, renderState.getTransitionError(), renderState.getIsRestoringState()), clientSideKey, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderUiStep$lambda$49(this.f$0, renderState, (UiWorkflow.Output) obj);
            }
        }), renderState.getClientSideKey()), !Intrinsics.areEqual(renderState.getTransitionStatus(), InquiryState3.TransitioningBack.INSTANCE), renderState.getClientSideKey());
        if (renderState.getIsRestoringState()) {
            Workflows.runningWorker(context, this.restoreUiStepStateWorkerFactory.create(renderState.getSessionToken(), renderState.getInquiryId(), renderState.getStepName()), Reflection.typeOf(RestoreUiStepStateWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$53(this.f$0, renderState, (RestoreUiStepStateWorker.Output) obj);
                }
            });
            return new Screen.InquiryLoadingScreen(renderState.getStyles(), true, backAction);
        }
        if (renderState.getTransitionError() != null) {
            context.runningSideEffect(InquiryErrorMessages.toErrorCode(renderState.getTransitionError()).name(), new C436232(context, this, null));
        }
        return disableableScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderUiStep$lambda$49(final InquiryWorkflow inquiryWorkflow, final InquiryState.UiStepRunning uiStepRunning, final UiWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, UiWorkflow.Output.Canceled.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$43(uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof UiWorkflow.Output.Error) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$44(this.f$0, it, uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof UiWorkflow.Output.FinishedWithoutTransition) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$45(uiStepRunning, it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, UiWorkflow.Output.FinishedWithTransition.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$46(uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof UiWorkflow.Output.Back) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$47(uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof UiWorkflow.Output.Completed) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$49$lambda$48(uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$43(InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String inquiryId = uiStepRunning.getInquiryId();
        String sessionToken = uiStepRunning.getSessionToken();
        StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
        action.setOutput(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$44(InquiryWorkflow inquiryWorkflow, UiWorkflow.Output output, InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiWorkflow.Output.Error error = (UiWorkflow.Output.Error) output;
        if (inquiryWorkflow.isInconsistentStateError(error.getCause())) {
            action.setState(inquiryWorkflow.resyncState(uiStepRunning));
        } else {
            inquiryWorkflow.setErrorOutput(action, uiStepRunning.getSessionToken(), error.getCause(), error.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$45(InquiryState.UiStepRunning uiStepRunning, UiWorkflow.Output output, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiWorkflow.Output.FinishedWithoutTransition finishedWithoutTransition = (UiWorkflow.Output.FinishedWithoutTransition) output;
        action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, new InquiryState3.Transitioning(new TransitionWorker.TransitionData(finishedWithoutTransition.getFromComponent(), finishedWithoutTransition.getComponentParams(), finishedWithoutTransition.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$46(InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, new InquiryState3.UpdateInquirySession(null), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$47(InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, InquiryState3.TransitioningBack.INSTANCE, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$49$lambda$48(InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.getFields(), uiStepRunning.getSessionToken()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderUiStep$lambda$53(final InquiryWorkflow inquiryWorkflow, final InquiryState.UiStepRunning uiStepRunning, final RestoreUiStepStateWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, RestoreUiStepStateWorker.Output.Failure.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$53$lambda$51(this.f$0, uiStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof RestoreUiStepStateWorker.Output.Success) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderUiStep$lambda$53$lambda$52(it, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$53$lambda$51(InquiryWorkflow inquiryWorkflow, InquiryState.UiStepRunning uiStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(action.getState() instanceof InquiryState.UiStepRunning)) {
            return Unit.INSTANCE;
        }
        action.setState(inquiryWorkflow.resyncState(uiStepRunning));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderUiStep$lambda$53$lambda$52(RestoreUiStepStateWorker.Output output, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        InquiryState.UiStepRunning uiStepRunning = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
        if (uiStepRunning == null) {
            return Unit.INSTANCE;
        }
        action.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, null, null, null, null, null, ((RestoreUiStepStateWorker.Output.Success) output).getComponents(), false, false, false, null, null, null, null, null, false, 130815, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderUiStep$2", m3645f = "InquiryWorkflow.kt", m3646l = {982}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderUiStep$2 */
    static final class C436232 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, InquiryState, Output, Object>.RenderContext $context;
        int label;
        final /* synthetic */ InquiryWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436232(StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext renderContext, InquiryWorkflow inquiryWorkflow, Continuation<? super C436232> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = inquiryWorkflow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C436232(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getActionSink().send(StatefulWorkflow2.action$default(this.this$0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderUiStep$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InquiryWorkflow.C436232.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            Object state = updater.getState();
            InquiryState.UiStepRunning uiStepRunning = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
            if (uiStepRunning == null) {
                return Unit.INSTANCE;
            }
            updater.setState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 229375, null));
            return Unit.INSTANCE;
        }
    }

    private final Object renderDocumentStep(final InquiryState.DocumentStepRunning renderState, StatefulWorkflow<? super Props, InquiryState, ? extends Output, ? extends Object>.RenderContext context) {
        DocumentWorkflow.StartPage review;
        String str;
        String str2;
        String documentId = renderState.getDocumentStep().getConfig().getDocumentId();
        int i = WhenMappings.$EnumSwitchMapping$2[renderState.getDocumentStep().getConfig().getStartPage().ordinal()];
        if (i == 1) {
            review = DocumentWorkflow.StartPage.Prompt.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (documentId != null) {
                review = new DocumentWorkflow.StartPage.Review(documentId);
            } else {
                review = DocumentWorkflow.StartPage.Prompt.INSTANCE;
            }
        }
        DocumentWorkflow.StartPage startPage = review;
        String fromStep = renderState.getFromStep();
        DocumentWorkflow documentWorkflow = this.documentWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        String title = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getTitle();
        String prompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getPrompt();
        String disclaimer = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getDisclaimer();
        String btnSubmit = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getBtnSubmit();
        String title2 = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getTitle();
        String description = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getDescription();
        String fieldKeyDocument = renderState.getDocumentStep().getConfig().getFieldKeyDocument();
        String kind = renderState.getDocumentStep().getConfig().getKind();
        int documentFileLimit = renderState.getDocumentStep().getConfig().getDocumentFileLimit();
        Boolean backStepEnabled = renderState.getDocumentStep().getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = renderState.getDocumentStep().getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String cameraPermissionsTitle = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        StepStyles.DocumentStepStyle styles = renderState.getStyles();
        DocumentPages pages = renderState.getPages();
        NextStep.Document.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            str = sessionToken;
            str2 = inquiryId;
            assetConfig = new NextStep.Document.AssetConfig(null, null, 3, null);
        } else {
            str = sessionToken;
            str2 = inquiryId;
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getDocumentStep().getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPosition2.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        return new DisableableScreen(context.renderChild(documentWorkflow, new DocumentWorkflow.Input(str, str2, fromStep2, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, startPage, pages, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, styles, assetConfig, pendingPageTextVerticalPosition), fromStep, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflow.renderDocumentStep$lambda$58(this.f$0, renderState, (DocumentWorkflow.Output) obj);
            }
        }), !Intrinsics.areEqual(renderState.getTransitionStatus(), InquiryState3.TransitioningBack.INSTANCE), renderState.getFromStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderDocumentStep$lambda$58(final InquiryWorkflow inquiryWorkflow, final InquiryState.DocumentStepRunning documentStepRunning, final DocumentWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, DocumentWorkflow.Output.Canceled.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderDocumentStep$lambda$58$lambda$54(documentStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, DocumentWorkflow.Output.Back.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderDocumentStep$lambda$58$lambda$55(documentStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DocumentWorkflow.Output.Errored) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderDocumentStep$lambda$58$lambda$56(this.f$0, it, documentStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, DocumentWorkflow.Output.Finished.INSTANCE)) {
            return StatefulWorkflow2.action$default(inquiryWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InquiryWorkflow.renderDocumentStep$lambda$58$lambda$57(documentStepRunning, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDocumentStep$lambda$58$lambda$54(InquiryState.DocumentStepRunning documentStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String inquiryId = documentStepRunning.getInquiryId();
        String sessionToken = documentStepRunning.getSessionToken();
        StepStyles.DocumentStepStyle styles = documentStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = documentStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = documentStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = documentStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = documentStepRunning.getCancelDialog();
        action.setOutput(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDocumentStep$lambda$58$lambda$55(InquiryState.DocumentStepRunning documentStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.DocumentStepRunning.copy$default(documentStepRunning, null, null, InquiryState3.TransitioningBack.INSTANCE, null, null, null, null, null, null, null, 1019, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDocumentStep$lambda$58$lambda$56(InquiryWorkflow inquiryWorkflow, DocumentWorkflow.Output output, InquiryState.DocumentStepRunning documentStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        DocumentWorkflow.Output.Errored errored = (DocumentWorkflow.Output.Errored) output;
        if (inquiryWorkflow.isInconsistentStateError(errored.getCause())) {
            action.setState(inquiryWorkflow.resyncState(documentStepRunning));
        } else {
            setErrorOutput$default(inquiryWorkflow, action, documentStepRunning.getSessionToken(), errored.getCause(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderDocumentStep$lambda$58$lambda$57(InquiryState.DocumentStepRunning documentStepRunning, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(InquiryState.DocumentStepRunning.copy$default(documentStepRunning, null, null, new InquiryState3.CheckingForNextState(null, 1, null), null, null, null, null, null, null, null, 1019, null));
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(InquiryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof InquiryState.UiStepRunning) {
            InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) state;
            this.uiStepSavedStateHelper.saveComponentConfigs(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName(), uiStepRunning.getComponents());
            return SnapshotParcels.toSnapshot(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 261887, null));
        }
        return SnapshotParcels.toSnapshot(state);
    }

    private final boolean isInconsistentStateError(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    private final InquiryState.ShowLoadingSpinner resyncState(InquiryState2 stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.getSessionToken(), null, stepState.getInquiryId(), stepState.getStyles(), true, stepState.getInquirySessionConfig(), 2, null);
    }

    static /* synthetic */ void setErrorOutput$default(InquiryWorkflow inquiryWorkflow, WorkflowAction.Updater updater, String str, InternalErrorInfo internalErrorInfo, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        inquiryWorkflow.setErrorOutput(updater, str, internalErrorInfo, str2);
    }

    private final void setErrorOutput(WorkflowAction<? super Props, InquiryState, ? extends Output>.Updater updater, String str, InternalErrorInfo internalErrorInfo, String str2) {
        if (str2 == null) {
            str2 = InquiryErrorMessages.toExternalDebugMessage(internalErrorInfo);
        }
        updater.setOutput(new Output.Error(str2, InquiryErrorMessages.toErrorCode(internalErrorInfo), internalErrorInfo, str));
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "environment", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "theme", "", "getTheme", "()Ljava/lang/Integer;", "isCancelled", "", "()Z", "TemplateProps", "InquiryProps", "OneTimeCodeProps", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Props {
        Environment getEnvironment();

        Integer getTheme();

        /* renamed from: isCancelled */
        boolean getIsCancelled();

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u0017R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b'\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b\u0013\u00102¨\u00063"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "templateId", "templateVersion", "accountId", "referenceId", "environmentId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "environment", "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lcom/withpersona/sdk2/inquiry/internal/Environment;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateId", "getTemplateVersion", "getAccountId", "getReferenceId", "getEnvironmentId", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "getThemeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Z", "()Z", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class TemplateProps implements Props {
            private final String accountId;
            private final Environment environment;
            private final String environmentId;
            private final Map<String, InquiryField> fields;
            private final boolean isCancelled;
            private final String referenceId;
            private final StaticInquiryTemplate staticInquiryTemplate;
            private final String templateId;
            private final String templateVersion;
            private final Integer theme;
            private final String themeSetId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TemplateProps)) {
                    return false;
                }
                TemplateProps templateProps = (TemplateProps) other;
                return Intrinsics.areEqual(this.templateId, templateProps.templateId) && Intrinsics.areEqual(this.templateVersion, templateProps.templateVersion) && Intrinsics.areEqual(this.accountId, templateProps.accountId) && Intrinsics.areEqual(this.referenceId, templateProps.referenceId) && Intrinsics.areEqual(this.environmentId, templateProps.environmentId) && Intrinsics.areEqual(this.fields, templateProps.fields) && Intrinsics.areEqual(this.themeSetId, templateProps.themeSetId) && Intrinsics.areEqual(this.staticInquiryTemplate, templateProps.staticInquiryTemplate) && this.environment == templateProps.environment && Intrinsics.areEqual(this.theme, templateProps.theme) && this.isCancelled == templateProps.isCancelled;
            }

            public int hashCode() {
                String str = this.templateId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.templateVersion;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accountId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.referenceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.environmentId;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Map<String, InquiryField> map = this.fields;
                int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
                String str6 = this.themeSetId;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
                int iHashCode8 = (((iHashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            public String toString() {
                return "TemplateProps(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TemplateProps(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate, Environment environment, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(environment, "environment");
                this.templateId = str;
                this.templateVersion = str2;
                this.accountId = str3;
                this.referenceId = str4;
                this.environmentId = str5;
                this.fields = map;
                this.themeSetId = str6;
                this.staticInquiryTemplate = staticInquiryTemplate;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z;
            }

            public /* synthetic */ TemplateProps(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, Environment environment, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, environment, num, (i & 1024) != 0 ? false : z);
            }

            public final String getTemplateId() {
                return this.templateId;
            }

            public final String getTemplateVersion() {
                return this.templateVersion;
            }

            public final String getAccountId() {
                return this.accountId;
            }

            public final String getReferenceId() {
                return this.referenceId;
            }

            public final String getEnvironmentId() {
                return this.environmentId;
            }

            public final Map<String, InquiryField> getFields() {
                return this.fields;
            }

            public final String getThemeSetId() {
                return this.themeSetId;
            }

            public final StaticInquiryTemplate getStaticInquiryTemplate() {
                return this.staticInquiryTemplate;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Environment getEnvironment() {
                return this.environment;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Integer getTheme() {
                return this.theme;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            /* renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u000b\u0010!¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "inquiryId", "sessionToken", "environmentId", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "environment", "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/Environment;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "getEnvironmentId", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Z", "()Z", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class InquiryProps implements Props {
            private final Environment environment;
            private final String environmentId;
            private final String inquiryId;
            private final boolean isCancelled;
            private final String sessionToken;
            private final Integer theme;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InquiryProps)) {
                    return false;
                }
                InquiryProps inquiryProps = (InquiryProps) other;
                return Intrinsics.areEqual(this.inquiryId, inquiryProps.inquiryId) && Intrinsics.areEqual(this.sessionToken, inquiryProps.sessionToken) && Intrinsics.areEqual(this.environmentId, inquiryProps.environmentId) && this.environment == inquiryProps.environment && Intrinsics.areEqual(this.theme, inquiryProps.theme) && this.isCancelled == inquiryProps.isCancelled;
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.environmentId;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            public String toString() {
                return "InquiryProps(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environmentId=" + this.environmentId + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            public InquiryProps(String inquiryId, String str, String str2, Environment environment, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(environment, "environment");
                this.inquiryId = inquiryId;
                this.sessionToken = str;
                this.environmentId = str2;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z;
            }

            public /* synthetic */ InquiryProps(String str, String str2, String str3, Environment environment, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, environment, num, (i & 32) != 0 ? false : z);
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            public final String getSessionToken() {
                return this.sessionToken;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Environment getEnvironment() {
                return this.environment;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Integer getTheme() {
                return this.theme;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            /* renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\t\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "environment", "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/Environment;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Z", "()Z", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class OneTimeCodeProps implements Props {
            private final Environment environment;
            private final boolean isCancelled;
            private final String oneTimeLinkCode;
            private final Integer theme;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OneTimeCodeProps)) {
                    return false;
                }
                OneTimeCodeProps oneTimeCodeProps = (OneTimeCodeProps) other;
                return Intrinsics.areEqual(this.oneTimeLinkCode, oneTimeCodeProps.oneTimeLinkCode) && this.environment == oneTimeCodeProps.environment && Intrinsics.areEqual(this.theme, oneTimeCodeProps.theme) && this.isCancelled == oneTimeCodeProps.isCancelled;
            }

            public int hashCode() {
                int iHashCode = ((this.oneTimeLinkCode.hashCode() * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled);
            }

            public String toString() {
                return "OneTimeCodeProps(oneTimeLinkCode=" + this.oneTimeLinkCode + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            public OneTimeCodeProps(String oneTimeLinkCode, Environment environment, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
                Intrinsics.checkNotNullParameter(environment, "environment");
                this.oneTimeLinkCode = oneTimeLinkCode;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z;
            }

            public /* synthetic */ OneTimeCodeProps(String str, Environment environment, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, environment, num, (i & 8) != 0 ? false : z);
            }

            public final String getOneTimeLinkCode() {
                return this.oneTimeLinkCode;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Environment getEnvironment() {
                return this.environment;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            public Integer getTheme() {
                return this.theme;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Props
            /* renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }
        }
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Landroid/os/Parcelable;", "sessionToken", "", "getSessionToken", "()Ljava/lang/String;", "Complete", "ReinitializeWithFallbackMode", "Cancel", "Error", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Output extends Parcelable {
        String getSessionToken();

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getInquiryStatus", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "getSessionToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Complete implements Output {
            public static final Parcelable.Creator<Complete> CREATOR = new Creator();
            private final Map<String, InquiryField> fields;
            private final String inquiryId;
            private final String inquiryStatus;
            private final String sessionToken;

            /* compiled from: InquiryWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Complete> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                    }
                    return new Complete(string2, string3, linkedHashMap, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.inquiryId, complete.inquiryId) && Intrinsics.areEqual(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.areEqual(this.fields, complete.fields) && Intrinsics.areEqual(this.sessionToken, complete.sessionToken);
            }

            public int hashCode() {
                int iHashCode = ((((this.inquiryId.hashCode() * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Complete(inquiryId=" + this.inquiryId + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.inquiryStatus);
                Map<String, InquiryField> map = this.fields;
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
                dest.writeString(this.sessionToken);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Complete(String inquiryId, String inquiryStatus, Map<String, ? extends InquiryField> fields, String str) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
                Intrinsics.checkNotNullParameter(fields, "fields");
                this.inquiryId = inquiryId;
                this.inquiryStatus = inquiryStatus;
                this.fields = fields;
                this.sessionToken = str;
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            public final String getInquiryStatus() {
                return this.inquiryStatus;
            }

            public final Map<String, InquiryField> getFields() {
                return this.fields;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Output
            public String getSessionToken() {
                return this.sessionToken;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ReinitializeWithFallbackMode implements Output {
            public static final Parcelable.Creator<ReinitializeWithFallbackMode> CREATOR = new Creator();
            private final String inquiryId;
            private final String sessionToken;

            /* compiled from: InquiryWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ReinitializeWithFallbackMode> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReinitializeWithFallbackMode createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReinitializeWithFallbackMode(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReinitializeWithFallbackMode[] newArray(int i) {
                    return new ReinitializeWithFallbackMode[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReinitializeWithFallbackMode)) {
                    return false;
                }
                ReinitializeWithFallbackMode reinitializeWithFallbackMode = (ReinitializeWithFallbackMode) other;
                return Intrinsics.areEqual(this.inquiryId, reinitializeWithFallbackMode.inquiryId) && Intrinsics.areEqual(this.sessionToken, reinitializeWithFallbackMode.sessionToken);
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ReinitializeWithFallbackMode(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.sessionToken);
            }

            public ReinitializeWithFallbackMode(String inquiryId, String str) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
                this.sessionToken = str;
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Output
            public String getSessionToken() {
                return this.sessionToken;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "title", "message", "resumeButtonText", "cancelButtonText", "", "force", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getTitle", "getMessage", "getResumeButtonText", "getCancelButtonText", "Z", "getForce", "()Z", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Cancel implements Output {
            public static final Parcelable.Creator<Cancel> CREATOR = new Creator();
            private final String cancelButtonText;
            private final boolean force;
            private final String inquiryId;
            private final String message;
            private final String resumeButtonText;
            private final String sessionToken;
            private final StepStyles2 styles;
            private final String title;

            /* compiled from: InquiryWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Cancel> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancel createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancel(parcel.readString(), parcel.readString(), (StepStyles2) parcel.readParcelable(Cancel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancel[] newArray(int i) {
                    return new Cancel[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cancel)) {
                    return false;
                }
                Cancel cancel = (Cancel) other;
                return Intrinsics.areEqual(this.inquiryId, cancel.inquiryId) && Intrinsics.areEqual(this.sessionToken, cancel.sessionToken) && Intrinsics.areEqual(this.styles, cancel.styles) && Intrinsics.areEqual(this.title, cancel.title) && Intrinsics.areEqual(this.message, cancel.message) && Intrinsics.areEqual(this.resumeButtonText, cancel.resumeButtonText) && Intrinsics.areEqual(this.cancelButtonText, cancel.cancelButtonText) && this.force == cancel.force;
            }

            public int hashCode() {
                String str = this.inquiryId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sessionToken;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                StepStyles2 stepStyles2 = this.styles;
                int iHashCode3 = (iHashCode2 + (stepStyles2 == null ? 0 : stepStyles2.hashCode())) * 31;
                String str3 = this.title;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.message;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.resumeButtonText;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.cancelButtonText;
                return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.force);
            }

            public String toString() {
                return "Cancel(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", styles=" + this.styles + ", title=" + this.title + ", message=" + this.message + ", resumeButtonText=" + this.resumeButtonText + ", cancelButtonText=" + this.cancelButtonText + ", force=" + this.force + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.sessionToken);
                dest.writeParcelable(this.styles, flags);
                dest.writeString(this.title);
                dest.writeString(this.message);
                dest.writeString(this.resumeButtonText);
                dest.writeString(this.cancelButtonText);
                dest.writeInt(this.force ? 1 : 0);
            }

            public Cancel(String str, String str2, StepStyles2 stepStyles2, String str3, String str4, String str5, String str6, boolean z) {
                this.inquiryId = str;
                this.sessionToken = str2;
                this.styles = stepStyles2;
                this.title = str3;
                this.message = str4;
                this.resumeButtonText = str5;
                this.cancelButtonText = str6;
                this.force = z;
            }

            public /* synthetic */ Cancel(String str, String str2, StepStyles2 stepStyles2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, stepStyles2, str3, str4, str5, str6, (i & 128) != 0 ? false : z);
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Output
            public String getSessionToken() {
                return this.sessionToken;
            }

            public final StepStyles2 getStyles() {
                return this.styles;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getResumeButtonText() {
                return this.resumeButtonText;
            }

            public final String getCancelButtonText() {
                return this.cancelButtonText;
            }

            public final boolean getForce() {
                return this.force;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b$\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "errorCode", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "sessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDebugMessage", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "getErrorCode", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getSessionToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error implements Output {
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            private final InternalErrorInfo cause;
            private final String debugMessage;
            private final ErrorCode errorCode;
            private final String sessionToken;

            /* compiled from: InquiryWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Error(parcel.readString(), (ErrorCode) parcel.readParcelable(Error.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.areEqual(this.debugMessage, error.debugMessage) && this.errorCode == error.errorCode && Intrinsics.areEqual(this.cause, error.cause) && Intrinsics.areEqual(this.sessionToken, error.sessionToken);
            }

            public int hashCode() {
                String str = this.debugMessage;
                int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.cause.hashCode()) * 31;
                String str2 = this.sessionToken;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Error(debugMessage=" + this.debugMessage + ", errorCode=" + this.errorCode + ", cause=" + this.cause + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.debugMessage);
                dest.writeParcelable(this.errorCode, flags);
                dest.writeParcelable(this.cause, flags);
                dest.writeString(this.sessionToken);
            }

            public Error(String str, ErrorCode errorCode, InternalErrorInfo cause, String str2) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.debugMessage = str;
                this.errorCode = errorCode;
                this.cause = cause;
                this.sessionToken = str2;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public final ErrorCode getErrorCode() {
                return this.errorCode;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow.Output
            public String getSessionToken() {
                return this.sessionToken;
            }
        }
    }

    /* compiled from: InquiryWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen;", "", "<init>", "()V", "InquiryLoadingScreen", "InquiryCompleteScreen", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryCompleteScreen;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryLoadingScreen;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Screen {
        public /* synthetic */ Screen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Screen() {
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryLoadingScreen;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "useBasicSpinner", "", "onBack", "Lkotlin/Function0;", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)V", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getUseBasicSpinner", "()Z", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class InquiryLoadingScreen extends Screen {
            private final Function0<Unit> onBack;
            private final StepStyles2 styles;
            private final boolean useBasicSpinner;

            public final StepStyles2 getStyles() {
                return this.styles;
            }

            public final boolean getUseBasicSpinner() {
                return this.useBasicSpinner;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InquiryLoadingScreen(StepStyles2 stepStyles2, boolean z, Function0<Unit> onBack) {
                super(null);
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                this.styles = stepStyles2;
                this.useBasicSpinner = z;
                this.onBack = onBack;
            }
        }

        /* compiled from: InquiryWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen$InquiryCompleteScreen;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Screen;", "<init>", "()V", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class InquiryCompleteScreen extends Screen {
            public InquiryCompleteScreen() {
                super(null);
            }
        }
    }
}
