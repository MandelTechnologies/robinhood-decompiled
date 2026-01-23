package com.plaid.internal;

import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.AbstractC7256y0;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.exception.LinkInvalidResultException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.z0 */
/* loaded from: classes16.dex */
public final class C7265z0 {

    /* renamed from: a */
    public final InterfaceC7162n6 f3332a;

    /* renamed from: com.plaid.internal.z0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3333a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3334b;

        static {
            int[] iArr = new int[Pane$PaneRendering.EnumC6734b.values().length];
            try {
                iArr[Pane$PaneRendering.EnumC6734b.SINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pane$PaneRendering.EnumC6734b.HEADLESS_O_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3333a = iArr;
            int[] iArr2 = new int[SdkResult$SDKResult.EnumC7017b.values().length];
            try {
                iArr2[SdkResult$SDKResult.EnumC7017b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SdkResult$SDKResult.EnumC7017b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f3334b = iArr2;
        }
    }

    public C7265z0(InterfaceC7162n6 paneStore) {
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        this.f3332a = paneStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1675a(AbstractC5894L2 abstractC5894L2, ContinuationImpl continuationImpl) {
        C5793A0 c5793a0;
        C6009X7 c6009x7M1233f;
        Object objMo1566a;
        C7265z0 c7265z0;
        if (continuationImpl instanceof C5793A0) {
            c5793a0 = (C5793A0) continuationImpl;
            int i = c5793a0.f1227f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5793a0.f1227f = i - Integer.MIN_VALUE;
            } else {
                c5793a0 = new C5793A0(this, continuationImpl);
            }
        }
        Object obj = c5793a0.f1225d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5793a0.f1227f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (abstractC5894L2 instanceof AbstractC5894L2.e) {
                return new AbstractC7256y0.d(((AbstractC5894L2.e) abstractC5894L2).m1239i());
            }
            if (abstractC5894L2 instanceof AbstractC5894L2.i) {
                return new AbstractC7256y0.c((AbstractC5894L2.i) abstractC5894L2);
            }
            if (abstractC5894L2 instanceof AbstractC5894L2.k) {
                AbstractC5894L2.k kVar = (AbstractC5894L2.k) abstractC5894L2;
                return kVar.m1247m() ? kVar.m1243i() == null ? m1671a(new C5804B2("Can't open out of process webview without channel info"), abstractC5894L2.mo1235h()) : new AbstractC7256y0.h(kVar.m1245k(), kVar.m1246l(), kVar.m1243i()) : new AbstractC7256y0.k(kVar.m1245k(), kVar.m1246l(), kVar.m1244j());
            }
            if (abstractC5894L2 instanceof AbstractC5894L2.d) {
                return new AbstractC7256y0.b(((AbstractC5894L2.d) abstractC5894L2).m1238i());
            }
            c6009x7M1233f = abstractC5894L2.m1233f();
            InterfaceC7162n6 interfaceC7162n6 = this.f3332a;
            c5793a0.f1222a = this;
            c5793a0.f1223b = abstractC5894L2;
            c5793a0.f1224c = c6009x7M1233f;
            c5793a0.f1227f = 1;
            objMo1566a = interfaceC7162n6.mo1566a(c6009x7M1233f, c5793a0);
            if (objMo1566a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7265z0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6009X7 c6009x7 = c5793a0.f1224c;
            AbstractC5894L2 abstractC5894L22 = c5793a0.f1223b;
            C7265z0 c7265z02 = c5793a0.f1222a;
            ResultKt.throwOnFailure(obj);
            c6009x7M1233f = c6009x7;
            abstractC5894L2 = abstractC5894L22;
            c7265z0 = c7265z02;
            objMo1566a = obj;
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) objMo1566a;
        if (pane$PaneRendering == null) {
            C5795A2 c5795a2 = new C5795A2("No pane in response");
            String strMo1235h = abstractC5894L2.mo1235h();
            c7265z0.getClass();
            return m1671a(c5795a2, strMo1235h);
        }
        Pane$PaneRendering.EnumC6734b renderingCase = pane$PaneRendering.getRenderingCase();
        int i3 = renderingCase == null ? -1 : a.f3333a[renderingCase.ordinal()];
        if (i3 == -1) {
            C5804B2 c5804b2 = new C5804B2("Can't render pane because rendering is null");
            String strMo1235h2 = abstractC5894L2.mo1235h();
            c7265z0.getClass();
            return m1671a(c5804b2, strMo1235h2);
        }
        if (i3 == 1) {
            c7265z0.getClass();
            return m1672a(pane$PaneRendering, abstractC5894L2);
        }
        if (i3 == 2) {
            return new AbstractC7256y0.i.a(c6009x7M1233f);
        }
        String str = "Native panes are no longer supported: " + pane$PaneRendering.getRenderingCase();
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        C5795A2 c5795a22 = new C5795A2(str);
        String strMo1235h3 = abstractC5894L2.mo1235h();
        c7265z0.getClass();
        return m1671a(c5795a22, strMo1235h3);
    }

    /* renamed from: a */
    public static AbstractC7256y0 m1672a(Pane$PaneRendering pane$PaneRendering, AbstractC5894L2 abstractC5894L2) {
        List<Common$SDKEvent> onAppearList;
        if (pane$PaneRendering.hasSink()) {
            SinkPaneOuterClass$SinkPane.Rendering sink = pane$PaneRendering.getSink();
            if (sink.hasResult()) {
                SdkResult$SDKResult result = sink.getResult();
                SinkPaneOuterClass$SinkPane.Rendering.Events events = sink.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(C7262y6.m1670a(common$SDKEvent), AbstractC5849G2.d.f1351a);
                        }
                    }
                }
                try {
                    SdkResult$SDKResult.EnumC7017b callback = result.getCallback();
                    int i = callback == null ? -1 : a.f3334b[callback.ordinal()];
                    if (i == 1) {
                        Intrinsics.checkNotNull(result);
                        String metadataJson = sink.getMetadataJson();
                        Intrinsics.checkNotNullExpressionValue(metadataJson, "getMetadataJson(...)");
                        return new AbstractC7256y0.j(m1674a(result, metadataJson));
                    }
                    if (i == 2) {
                        Intrinsics.checkNotNull(result);
                        String strM1253a = C5906M2.m1253a(abstractC5894L2);
                        String errorJson = sink.getErrorJson();
                        Intrinsics.checkNotNullExpressionValue(errorJson, "getErrorJson(...)");
                        String metadataJson2 = sink.getMetadataJson();
                        Intrinsics.checkNotNullExpressionValue(metadataJson2, "getMetadataJson(...)");
                        return new AbstractC7256y0.d(m1673a(result, strM1253a, errorJson, metadataJson2));
                    }
                    throw new LinkInvalidResultException("Result type not supported by client: " + result.getCallback());
                } catch (Throwable th) {
                    return m1671a(th, abstractC5894L2.mo1235h());
                }
            }
            pane$PaneRendering.getId();
            pane$PaneRendering.getPaneNodeId();
            return m1671a(new C5795A2("Tried to convert sink pane but result was null"), abstractC5894L2.mo1235h());
        }
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        return m1671a(new C5795A2("Tried to get sink but didn't exist"), abstractC5894L2.mo1235h());
    }

    /* renamed from: a */
    public static LinkExit m1673a(SdkResult$SDKResult result, String storedRequestId, String errorJson, String metadataJson) {
        LinkExitMetadata metadata;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(storedRequestId, "storedRequestId");
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        if (result.hasError() && !Intrinsics.areEqual(result.getError().getRequestId(), "")) {
            storedRequestId = result.getError().getRequestId();
        }
        String str = storedRequestId;
        LinkError linkError = null;
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata.Institution institution = result.getMetadata().hasInstitution() ? result.getMetadata().getInstitution() : null;
            String linkSessionId = result.getMetadata().getLinkSessionId();
            String name = institution != null ? institution.getName() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            String str2 = name;
            metadata = new LinkExitMetadata(LinkExitMetadataStatus.INSTANCE.fromString(result.getMetadata().getStatus()), (institutionId == null || institutionId.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(institutionId, str2), linkSessionId, str, metadataJson);
        } else {
            metadata = C5876J2.m1222a(55, str);
        }
        SdkResult$SDKResult.Error error = result.hasError() ? result.getError() : null;
        if (error != null) {
            String errorCode = error.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            String errorMessage = error.getErrorMessage();
            Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
            String displayMessage = error.getDisplayMessage();
            Intrinsics.checkNotNullExpressionValue(displayMessage, "getDisplayMessage(...)");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
            Intrinsics.checkNotNullParameter(errorJson, "errorJson");
            linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson);
        }
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    /* renamed from: a */
    public static LinkSuccess m1674a(SdkResult$SDKResult result, String metadataJson) throws LinkException {
        String name;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata metadata = result.getMetadata();
            Intrinsics.checkNotNull(metadata);
            List<SdkResult$SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            Intrinsics.checkNotNullExpressionValue(accountsList, "getAccountsList(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountsList, 10));
            Iterator<T> it = accountsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SdkResult$SDKResult.Metadata.Account account = (SdkResult$SDKResult.Metadata.Account) it.next();
                String accountId = account.getId();
                Intrinsics.checkNotNullExpressionValue(accountId, "getId(...)");
                String name2 = account.getName();
                String mask = account.getMask();
                LinkAccountSubtype accountSubType = LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType());
                String verificationStatus = account.getVerificationStatus();
                if (verificationStatus != null && verificationStatus.length() != 0) {
                    name = account.getVerificationStatus();
                }
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(accountSubType, "accountSubType");
                arrayList.add(new LinkAccount(accountId, name2, mask, accountSubType, LinkAccountVerificationStatus.INSTANCE.convert(name), null, 32, null));
            }
            SdkResult$SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            name = institution != null ? institution.getName() : null;
            String linkSessionId = metadata.getLinkSessionId();
            Intrinsics.checkNotNullExpressionValue(linkSessionId, "getLinkSessionId(...)");
            LinkSuccessMetadata linkSuccessMetadataM1225a = C5876J2.m1225a(arrayList, institutionId, name, linkSessionId, metadataJson);
            String publicToken = result.getPublicToken();
            Intrinsics.checkNotNullExpressionValue(publicToken, "getPublicToken(...)");
            return C5876J2.m1223a(publicToken, linkSuccessMetadataM1225a);
        }
        throw new LinkException("Was successful but returned no data: " + result);
    }

    /* renamed from: a */
    public static AbstractC7256y0.d m1671a(Throwable th, String str) {
        C5953R5.a.m1301a(C5953R5.f1671a, th);
        return new AbstractC7256y0.d(C5876J2.m1228b(th, str));
    }
}
