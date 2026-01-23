package com.plaid.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.protobuf.Timestamp;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.AbstractC7207s6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import com.robinhood.android.investFlow.InvestFlowConstants;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* renamed from: com.plaid.internal.T7 */
/* loaded from: classes16.dex */
public final class C5973T7 {

    /* renamed from: a */
    public final String f1721a;

    /* renamed from: b */
    public final String f1722b;

    /* renamed from: c */
    public final String f1723c;

    /* renamed from: d */
    public final String f1724d;

    /* renamed from: e */
    public final String f1725e;

    /* renamed from: f */
    public final PackageManager f1726f;

    /* renamed from: g */
    public final String f1727g;

    /* renamed from: h */
    public final C6022Z2 f1728h;

    /* renamed from: i */
    public final Lazy f1729i;

    /* renamed from: j */
    public final Lazy f1730j;

    /* renamed from: k */
    public final Lazy f1731k;

    /* renamed from: l */
    public final Lazy f1732l;

    public C5973T7(String str, String androidVersionName, String str2, String str3, String str4, String packageName, String linkRedirectUrl, PackageManager packageManager, String str5, C6022Z2 workflowVersionOverride) {
        C5860H4 deviceInfo = C5860H4.f1365a;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(androidVersionName, "androidVersionName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(linkRedirectUrl, "linkRedirectUrl");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(workflowVersionOverride, "workflowVersionOverride");
        this.f1721a = androidVersionName;
        this.f1722b = str2;
        this.f1723c = str3;
        this.f1724d = str4;
        this.f1725e = packageName;
        this.f1726f = packageManager;
        this.f1727g = str5;
        this.f1728h = workflowVersionOverride;
        this.f1729i = LazyKt.lazy(C5938P7.f1635a);
        this.f1730j = LazyKt.lazy(new C5955R7(str));
        this.f1731k = LazyKt.lazy(new C5947Q7(this));
        this.f1732l = LazyKt.lazy(new C5964S7(this));
    }

    /* renamed from: a */
    public final Workflow$LinkWorkflowStartRequest m1323a(AbstractC5894L2.a linkState) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        C5892L0 c5892l0 = linkState.f1456b;
        Intrinsics.checkNotNullParameter(c5892l0, "<this>");
        Configuration$LinkTokenConfiguration.C6981a c6981aM1470a = Configuration$LinkTokenConfiguration.newBuilder().m1476e(c5892l0.f1442a).m1474c(c5892l0.f1443b).m1475d(c5892l0.f1444c).m1473b(c5892l0.f1445d).m1477f(c5892l0.f1446e).m1471a(c5892l0.f1447f).m1470a(c5892l0.f1448g);
        C5883K0 c5883k0 = c5892l0.f1449h;
        if (c5883k0 != null) {
            Intrinsics.checkNotNullParameter(c5883k0, "<this>");
            Configuration$EmbeddedOpenLinkConfiguration.C6973a c6973aM1465a = Configuration$EmbeddedOpenLinkConfiguration.newBuilder().m1464a(c5883k0.f1416a).m1465a(c5883k0.f1420e);
            if (c5883k0.f1417b != null) {
                c6973aM1465a.m1466a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder().build());
            } else if (c5883k0.f1419d != null) {
                c6973aM1465a.m1467a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder().build());
            } else if (c5883k0.f1418c != null) {
                c6973aM1465a.m1468a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder().m1463a(c5883k0.f1418c.f1389a).build());
            }
            Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfigurationBuild = c6973aM1465a.build();
            Intrinsics.checkNotNullExpressionValue(configuration$EmbeddedOpenLinkConfigurationBuild, "build(...)");
            c6981aM1470a.m1472a(configuration$EmbeddedOpenLinkConfigurationBuild);
        }
        Intrinsics.checkNotNull(c6981aM1470a);
        Configuration$LinkTokenConfiguration configuration$LinkTokenConfigurationBuild = c6981aM1470a.m1469a((Configuration$PlatformIdentifierConfiguration) this.f1730j.getValue()).build();
        Intrinsics.checkNotNull(configuration$LinkTokenConfigurationBuild);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j).setNanos((int) ((jCurrentTimeMillis % j) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT)).build();
        Intrinsics.checkNotNullExpressionValue(timestampBuild, "build(...)");
        PackageManager packageManager = this.f1726f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = m1322a().m1426a(timestampBuild).m1432a(configuration$LinkTokenConfigurationBuild).m1428a(Configuration$ClientCapabilities.newBuilder().m1448a(listQueryIntentServices.isEmpty()).build()).build();
        Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    /* renamed from: a */
    public final Workflow$LinkWorkflowStartRequest m1324a(AbstractC5894L2.b linkState, boolean z) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        Configuration$LinkTokenConfiguration.C6981a c6981aM1476e = Configuration$LinkTokenConfiguration.newBuilder().m1474c(linkState.f1461b).m1476e(linkState.f1462c.getToken());
        String str = this.f1724d;
        if (str == null) {
            str = "";
        }
        Configuration$LinkTokenConfiguration.C6981a c6981aM1469a = c6981aM1476e.m1475d(str).m1469a((Configuration$PlatformIdentifierConfiguration) this.f1730j.getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j).setNanos((int) ((jCurrentTimeMillis % j) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT)).build();
        Intrinsics.checkNotNullExpressionValue(timestampBuild, "build(...)");
        PackageManager packageManager = this.f1726f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = m1322a().m1426a(timestampBuild).m1431a(c6981aM1469a).m1428a(Configuration$ClientCapabilities.newBuilder().m1448a(listQueryIntentServices.isEmpty()).m1449b(z).build()).build();
        Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    /* renamed from: a */
    public final Workflow$LinkWorkflowStartRequest.C6228a m1322a() {
        Workflow$LinkWorkflowStartRequest.C6228a c6228aM1429a = Workflow$LinkWorkflowStartRequest.newBuilder().m1433a((Configuration$SDKMetadata) this.f1732l.getValue()).m1429a((Configuration$DeviceMetadata) this.f1731k.getValue());
        this.f1728h.invoke();
        return c6228aM1429a.m1434a("");
    }

    /* renamed from: a */
    public final Workflow$LinkWorkflowStartRequest m1326a(String linkToken) {
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        Configuration$EmbeddedLinkTokenConfiguration.C6968a c6968aM1462c = Configuration$EmbeddedLinkTokenConfiguration.newBuilder().m1460a(UUID.randomUUID().toString()).m1462c(linkToken);
        String str = this.f1724d;
        if (str == null) {
            str = "";
        }
        Configuration$EmbeddedLinkTokenConfiguration.C6968a c6968aM1459a = c6968aM1462c.m1461b(str).m1459a((Configuration$PlatformIdentifierConfiguration) this.f1730j.getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j).setNanos((int) ((jCurrentTimeMillis % j) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT)).build();
        Intrinsics.checkNotNullExpressionValue(timestampBuild, "build(...)");
        PackageManager packageManager = this.f1726f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = m1322a().m1426a(timestampBuild).m1430a(c6968aM1459a).m1428a(Configuration$ClientCapabilities.newBuilder().m1448a(listQueryIntentServices.isEmpty()).build()).build();
        Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    /* renamed from: a */
    public final Workflow$LinkWorkflowStartRequest m1325a(AbstractC5894L2.k linkState, AbstractC7207s6.a result) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        Intrinsics.checkNotNullParameter(result, "result");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String strQueryParameter = companion.get(linkState.f1500f).queryParameter("token");
        String strQueryParameter2 = companion.get(linkState.f1500f).queryParameter("oauthNonce");
        String queryParameter = null;
        if (strQueryParameter == null || !StringsKt.startsWith$default(strQueryParameter, "link-", false, 2, (Object) null)) {
            strQueryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.C6228a c6228aM1322a = m1322a();
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.C6226a c6226aM1424a = Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder().m1425b(result.f3205a).m1424a(strQueryParameter);
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.C6224a c6224aNewBuilder = Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder();
        try {
            Uri uri = Uri.parse(result.f3205a);
            if (uri != null) {
                queryParameter = uri.getQueryParameter("oauth_state_id");
            }
        } catch (Exception unused) {
        }
        if (queryParameter == null) {
            queryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.C6224a c6224aM1422b = c6224aNewBuilder.m1422b(queryParameter);
        if (strQueryParameter2 == null) {
            strQueryParameter2 = "";
        }
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = c6228aM1322a.m1427a(c6226aM1424a.m1423a(c6224aM1422b.m1421a(strQueryParameter2))).build();
        Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }
}
