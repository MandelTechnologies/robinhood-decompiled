package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.graphics.Bitmap;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.gold.hub.GoldHubComposableTestTag;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: RhySettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0006·\u0001¸\u0001¹\u0001Bû\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0013\u0012\b\b\u0002\u0010*\u001a\u00020\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bA\u0010:J\u0010\u0010B\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bB\u0010:J\u0012\u0010C\u001a\u0004\u0018\u00010\u0011HÂ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÂ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0016HÂ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0018HÂ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001aHÂ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bM\u0010:J\u0012\u0010N\u001a\u0004\u0018\u00010\u001dHÂ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bT\u0010:J\u0018\u0010U\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bU\u0010FJ\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bV\u0010FJ\u0012\u0010W\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bY\u0010FJ\u0010\u0010Z\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010:J\u0012\u0010[\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b]\u0010FJ\u0018\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b^\u0010FJ\u0010\u0010_\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b_\u0010:J\u0010\u0010`\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b`\u0010:J\u0010\u0010a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\ba\u0010:J\u0084\u0003\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u00062\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00132\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00132\b\b\u0002\u0010*\u001a\u00020\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00132\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020 HÖ\u0001¢\u0006\u0004\bd\u0010SJ\u0010\u0010e\u001a\u00020&HÖ\u0001¢\u0006\u0004\be\u0010fJ\u001a\u0010h\u001a\u00020\u00062\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bh\u0010iR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010jR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010kR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010lR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010mR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010nR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010oR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010lR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010lR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010pR\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010qR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010rR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010tR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010uR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010v\u001a\u0004\bw\u0010QR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010x\u001a\u0004\by\u0010SR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010l\u001a\u0004\b\"\u0010:R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b$\u0010q\u001a\u0004\bz\u0010FR\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u0010q\u001a\u0004\b{\u0010FR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010|\u001a\u0004\b}\u0010XR\u001f\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b)\u0010q\u001a\u0004\b~\u0010FR\u0017\u0010*\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010l\u001a\u0004\b\u007f\u0010:R\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010\\R \u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00138\u0006¢\u0006\r\n\u0004\b.\u0010q\u001a\u0005\b\u0082\u0001\u0010FR \u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\r\n\u0004\b/\u0010q\u001a\u0005\b\u0083\u0001\u0010FR\u0018\u00100\u001a\u00020\u00068\u0006¢\u0006\r\n\u0004\b0\u0010l\u001a\u0005\b\u0084\u0001\u0010:R\u0018\u00101\u001a\u00020\u00068\u0006¢\u0006\r\n\u0004\b1\u0010l\u001a\u0005\b\u0085\u0001\u0010:R\u0018\u00102\u001a\u00020\u00068\u0006¢\u0006\r\n\u0004\b2\u0010l\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0087\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010lR\u001b\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010FR\u0013\u0010\u008a\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010:R\u0013\u0010\u008b\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010:R\u0013\u0010\u008c\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010:R\u0013\u0010\u008d\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010:R\u0013\u0010\u008e\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010:R\u0013\u0010\u008f\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010:R\u0013\u0010\u0090\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010:R\u0015\u0010\u0094\u0001\u001a\u00030\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0013\u0010\u0095\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010:R\u0015\u0010\u0099\u0001\u001a\u00030\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0013\u0010\u009a\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010:R\u0013\u0010\u009b\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010:R\u0013\u0010\u009c\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010:R\u0013\u0010\u009d\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010:R\u0013\u0010\u009e\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010:R\u0013\u0010\u009f\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010:R\u0015\u0010£\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0013\u0010¤\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010:R\u0013\u0010¥\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010:R\u0013\u0010¦\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010:R\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010SR\u0015\u0010®\u0001\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010SR\u0015\u0010°\u0001\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010SR\u0013\u0010²\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010:R\u0013\u0010´\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010:R\u0017\u0010¶\u0001\u001a\u0005\u0018\u00010§\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010©\u0001¨\u0006º\u0001"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;", "", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "spendingAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaSpendingAccount", "", "isSpendAlertsPending", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "spendAlertsSettingStatus", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "paymentCard", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "googlePayTokenList", "isCardLockPending", "isLocationProtectionPending", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "routingDetails", "Lcom/robinhood/udf/UiEvent;", "", "requestRoutingDetailsBottomSheetEvent", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "roundupEnrollmentState", "Lcom/robinhood/models/db/sheriff/User;", "user", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "cashCushionStatus", "isCashCushionStatusPending", "j$/time/Instant", "cashManagementCardValidUntil", "hasBrokerageAccount", "", "roundupAssetSymbol", "isLocationProtectionEnabled", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "pushTokenizeEvent", "pauseRoundupRewardsEvent", "", "directDepositRelationshipCount", "", "error", "showCardNumbers", "Landroid/graphics/Bitmap;", GoldHubComposableTestTag.CARD_IMAGE, "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "verificationRequired", "shouldHideCardNumber", "alwaysShowAddToGPay", "showMockedCardNumbers", "showMatchaSettings", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;ZLcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/util/List;ZZLcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/db/bonfire/CashCushionStatus;ZLj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/Integer;Lcom/robinhood/udf/UiEvent;ZLandroid/graphics/Bitmap;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZ)V", "component1", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "component2", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component3", "()Z", "component4", "()Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "component5", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "component10", "()Lcom/robinhood/udf/UiEvent;", "component11", "()Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "component12", "()Lcom/robinhood/models/db/sheriff/User;", "component13", "()Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "component14", "component15", "()Lj$/time/Instant;", "component16", "()Ljava/lang/Boolean;", "component17", "()Ljava/lang/String;", "component18", "component19", "component20", "component21", "()Ljava/lang/Integer;", "component22", "component23", "component24", "()Landroid/graphics/Bitmap;", "component25", "component26", "component27", "component28", "component29", "copy", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Lcom/robinhood/models/db/mcduckling/MinervaAccount;ZLcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/util/List;ZZLcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/db/bonfire/CashCushionStatus;ZLj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/Integer;Lcom/robinhood/udf/UiEvent;ZLandroid/graphics/Bitmap;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZ)Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "Z", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "Ljava/util/List;", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "Lcom/robinhood/models/db/sheriff/User;", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "Lj$/time/Instant;", "Ljava/lang/Boolean;", "getHasBrokerageAccount", "Ljava/lang/String;", "getRoundupAssetSymbol", "getPushTokenizeEvent", "getPauseRoundupRewardsEvent", "Ljava/lang/Integer;", "getDirectDepositRelationshipCount", "getError", "getShowCardNumbers", "Landroid/graphics/Bitmap;", "getCardImage", "getVerificationRequired", "getShouldHideCardNumber", "getAlwaysShowAddToGPay", "getShowMockedCardNumbers", "getShowMatchaSettings", "isDirectDepositActive", "getShowRoutingDetailsBottomSheetEvent", "showRoutingDetailsBottomSheetEvent", "isCardLocked", "isCardLockToggleEnabled", "isLocationProtectionToggleEnabled", "isSpendAlertsSwitchLocked", "isSpendAlertsSwitchEnabled", "isCashCushionSwitchChecked", "isCashCushionSwitchEnabled", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState;", "getMailCardState", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState;", "mailCardState", "isSpendAlertsSwitchChecked", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState;", "getChangePinState", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState;", "changePinState", "isGooglePayActionVisible", "isRoundupSignUpRowVisible", "isRoundupToggleRowVisible", "isRoundupToggleChecked", "isStockSelectionRowVisible", "isStockSelectionRowEnabled", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState;", "getCardHelpState", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState;", "cardHelpState", "isSetUpDirectDepositRowVisible", "isManageDirectDepositRowVisible", "isEarlyDirectDepositToggleVisible", "Lcom/robinhood/utils/resource/StringResource;", "getManageDirectDepositRowSecondaryText", "()Lcom/robinhood/utils/resource/StringResource;", "manageDirectDepositRowSecondaryText", "getFirstName", "firstName", "getLastName", "lastName", "getCardLastFourDigits", "cardLastFourDigits", "getShowRoundUpSettings", "showRoundUpSettings", "getShowDebitCardSettings", "showDebitCardSettings", "getCashManagementCardValidDaysRemaining", "cashManagementCardValidDaysRemaining", "ChangePinState", "MailCardState", "CardHelpState", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RhySettingsViewState {
    public static final int $stable = 8;
    private final boolean alwaysShowAddToGPay;
    private final Bitmap cardImage;
    private final CashCushionStatus cashCushionStatus;
    private final Instant cashManagementCardValidUntil;
    private final Integer directDepositRelationshipCount;
    private final UiEvent<Throwable> error;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final Boolean hasBrokerageAccount;
    private final boolean isCardLockPending;
    private final boolean isCashCushionStatusPending;
    private final boolean isDirectDepositActive;
    private final boolean isLocationProtectionEnabled;
    private final boolean isLocationProtectionPending;
    private final boolean isSpendAlertsPending;
    private final MinervaAccount minervaSpendingAccount;
    private final UiEvent<Unit> pauseRoundupRewardsEvent;
    private final PaymentCard paymentCard;
    private final UiEvent<PushTokenizeRequest> pushTokenizeEvent;
    private final UiEvent<Unit> requestRoutingDetailsBottomSheetEvent;
    private final String roundupAssetSymbol;
    private final ApiRoundupEnrollment.State roundupEnrollmentState;
    private final RhyAccountRoutingDetails routingDetails;
    private final UiEvent<Unit> shouldHideCardNumber;
    private final boolean showCardNumbers;
    private final boolean showMatchaSettings;
    private final boolean showMockedCardNumbers;
    private final ApiNotificationSettingsToggleSettingsItem.Status spendAlertsSettingStatus;
    private final RhyAccount spendingAccount;
    private final User user;
    private final UiEvent<VerificationRequiredException> verificationRequired;

    public RhySettingsViewState() {
        this(null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870911, null);
    }

    /* renamed from: component1, reason: from getter */
    private final RhyAccount getSpendingAccount() {
        return this.spendingAccount;
    }

    private final UiEvent<Unit> component10() {
        return this.requestRoutingDetailsBottomSheetEvent;
    }

    /* renamed from: component11, reason: from getter */
    private final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    /* renamed from: component12, reason: from getter */
    private final User getUser() {
        return this.user;
    }

    /* renamed from: component13, reason: from getter */
    private final CashCushionStatus getCashCushionStatus() {
        return this.cashCushionStatus;
    }

    /* renamed from: component14, reason: from getter */
    private final boolean getIsCashCushionStatusPending() {
        return this.isCashCushionStatusPending;
    }

    /* renamed from: component15, reason: from getter */
    private final Instant getCashManagementCardValidUntil() {
        return this.cashManagementCardValidUntil;
    }

    /* renamed from: component2, reason: from getter */
    private final MinervaAccount getMinervaSpendingAccount() {
        return this.minervaSpendingAccount;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsSpendAlertsPending() {
        return this.isSpendAlertsPending;
    }

    /* renamed from: component4, reason: from getter */
    private final ApiNotificationSettingsToggleSettingsItem.Status getSpendAlertsSettingStatus() {
        return this.spendAlertsSettingStatus;
    }

    /* renamed from: component5, reason: from getter */
    private final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    private final List<GooglePayTokenInfoWrapper> component6() {
        return this.googlePayTokenList;
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getIsCardLockPending() {
        return this.isCardLockPending;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getIsLocationProtectionPending() {
        return this.isLocationProtectionPending;
    }

    /* renamed from: component9, reason: from getter */
    private final RhyAccountRoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public static /* synthetic */ RhySettingsViewState copy$default(RhySettingsViewState rhySettingsViewState, RhyAccount rhyAccount, MinervaAccount minervaAccount, boolean z, ApiNotificationSettingsToggleSettingsItem.Status status, PaymentCard paymentCard, List list, boolean z2, boolean z3, RhyAccountRoutingDetails rhyAccountRoutingDetails, UiEvent uiEvent, ApiRoundupEnrollment.State state, User user, CashCushionStatus cashCushionStatus, boolean z4, Instant instant, Boolean bool, String str, boolean z5, UiEvent uiEvent2, UiEvent uiEvent3, Integer num, UiEvent uiEvent4, boolean z6, Bitmap bitmap, UiEvent uiEvent5, UiEvent uiEvent6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        boolean z10;
        boolean z11;
        RhyAccount rhyAccount2 = (i & 1) != 0 ? rhySettingsViewState.spendingAccount : rhyAccount;
        MinervaAccount minervaAccount2 = (i & 2) != 0 ? rhySettingsViewState.minervaSpendingAccount : minervaAccount;
        boolean z12 = (i & 4) != 0 ? rhySettingsViewState.isSpendAlertsPending : z;
        ApiNotificationSettingsToggleSettingsItem.Status status2 = (i & 8) != 0 ? rhySettingsViewState.spendAlertsSettingStatus : status;
        PaymentCard paymentCard2 = (i & 16) != 0 ? rhySettingsViewState.paymentCard : paymentCard;
        List list2 = (i & 32) != 0 ? rhySettingsViewState.googlePayTokenList : list;
        boolean z13 = (i & 64) != 0 ? rhySettingsViewState.isCardLockPending : z2;
        boolean z14 = (i & 128) != 0 ? rhySettingsViewState.isLocationProtectionPending : z3;
        RhyAccountRoutingDetails rhyAccountRoutingDetails2 = (i & 256) != 0 ? rhySettingsViewState.routingDetails : rhyAccountRoutingDetails;
        UiEvent uiEvent7 = (i & 512) != 0 ? rhySettingsViewState.requestRoutingDetailsBottomSheetEvent : uiEvent;
        ApiRoundupEnrollment.State state2 = (i & 1024) != 0 ? rhySettingsViewState.roundupEnrollmentState : state;
        User user2 = (i & 2048) != 0 ? rhySettingsViewState.user : user;
        CashCushionStatus cashCushionStatus2 = (i & 4096) != 0 ? rhySettingsViewState.cashCushionStatus : cashCushionStatus;
        boolean z15 = (i & 8192) != 0 ? rhySettingsViewState.isCashCushionStatusPending : z4;
        RhyAccount rhyAccount3 = rhyAccount2;
        Instant instant2 = (i & 16384) != 0 ? rhySettingsViewState.cashManagementCardValidUntil : instant;
        Boolean bool2 = (i & 32768) != 0 ? rhySettingsViewState.hasBrokerageAccount : bool;
        String str2 = (i & 65536) != 0 ? rhySettingsViewState.roundupAssetSymbol : str;
        boolean z16 = (i & 131072) != 0 ? rhySettingsViewState.isLocationProtectionEnabled : z5;
        UiEvent uiEvent8 = (i & 262144) != 0 ? rhySettingsViewState.pushTokenizeEvent : uiEvent2;
        UiEvent uiEvent9 = (i & 524288) != 0 ? rhySettingsViewState.pauseRoundupRewardsEvent : uiEvent3;
        Integer num2 = (i & 1048576) != 0 ? rhySettingsViewState.directDepositRelationshipCount : num;
        UiEvent uiEvent10 = (i & 2097152) != 0 ? rhySettingsViewState.error : uiEvent4;
        boolean z17 = (i & 4194304) != 0 ? rhySettingsViewState.showCardNumbers : z6;
        Bitmap bitmap2 = (i & 8388608) != 0 ? rhySettingsViewState.cardImage : bitmap;
        UiEvent uiEvent11 = (i & 16777216) != 0 ? rhySettingsViewState.verificationRequired : uiEvent5;
        UiEvent uiEvent12 = (i & 33554432) != 0 ? rhySettingsViewState.shouldHideCardNumber : uiEvent6;
        boolean z18 = (i & 67108864) != 0 ? rhySettingsViewState.alwaysShowAddToGPay : z7;
        boolean z19 = (i & 134217728) != 0 ? rhySettingsViewState.showMockedCardNumbers : z8;
        if ((i & 268435456) != 0) {
            z11 = z19;
            z10 = rhySettingsViewState.showMatchaSettings;
        } else {
            z10 = z9;
            z11 = z19;
        }
        return rhySettingsViewState.copy(rhyAccount3, minervaAccount2, z12, status2, paymentCard2, list2, z13, z14, rhyAccountRoutingDetails2, uiEvent7, state2, user2, cashCushionStatus2, z15, instant2, bool2, str2, z16, uiEvent8, uiEvent9, num2, uiEvent10, z17, bitmap2, uiEvent11, uiEvent12, z18, z11, z10);
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getHasBrokerageAccount() {
        return this.hasBrokerageAccount;
    }

    /* renamed from: component17, reason: from getter */
    public final String getRoundupAssetSymbol() {
        return this.roundupAssetSymbol;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsLocationProtectionEnabled() {
        return this.isLocationProtectionEnabled;
    }

    public final UiEvent<PushTokenizeRequest> component19() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<Unit> component20() {
        return this.pauseRoundupRewardsEvent;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getDirectDepositRelationshipCount() {
        return this.directDepositRelationshipCount;
    }

    public final UiEvent<Throwable> component22() {
        return this.error;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShowCardNumbers() {
        return this.showCardNumbers;
    }

    /* renamed from: component24, reason: from getter */
    public final Bitmap getCardImage() {
        return this.cardImage;
    }

    public final UiEvent<VerificationRequiredException> component25() {
        return this.verificationRequired;
    }

    public final UiEvent<Unit> component26() {
        return this.shouldHideCardNumber;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getAlwaysShowAddToGPay() {
        return this.alwaysShowAddToGPay;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getShowMockedCardNumbers() {
        return this.showMockedCardNumbers;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getShowMatchaSettings() {
        return this.showMatchaSettings;
    }

    public final RhySettingsViewState copy(RhyAccount spendingAccount, MinervaAccount minervaSpendingAccount, boolean isSpendAlertsPending, ApiNotificationSettingsToggleSettingsItem.Status spendAlertsSettingStatus, PaymentCard paymentCard, List<GooglePayTokenInfoWrapper> googlePayTokenList, boolean isCardLockPending, boolean isLocationProtectionPending, RhyAccountRoutingDetails routingDetails, UiEvent<Unit> requestRoutingDetailsBottomSheetEvent, ApiRoundupEnrollment.State roundupEnrollmentState, User user, CashCushionStatus cashCushionStatus, boolean isCashCushionStatusPending, Instant cashManagementCardValidUntil, Boolean hasBrokerageAccount, String roundupAssetSymbol, boolean isLocationProtectionEnabled, UiEvent<PushTokenizeRequest> pushTokenizeEvent, UiEvent<Unit> pauseRoundupRewardsEvent, Integer directDepositRelationshipCount, UiEvent<Throwable> error, boolean showCardNumbers, Bitmap cardImage, UiEvent<VerificationRequiredException> verificationRequired, UiEvent<Unit> shouldHideCardNumber, boolean alwaysShowAddToGPay, boolean showMockedCardNumbers, boolean showMatchaSettings) {
        return new RhySettingsViewState(spendingAccount, minervaSpendingAccount, isSpendAlertsPending, spendAlertsSettingStatus, paymentCard, googlePayTokenList, isCardLockPending, isLocationProtectionPending, routingDetails, requestRoutingDetailsBottomSheetEvent, roundupEnrollmentState, user, cashCushionStatus, isCashCushionStatusPending, cashManagementCardValidUntil, hasBrokerageAccount, roundupAssetSymbol, isLocationProtectionEnabled, pushTokenizeEvent, pauseRoundupRewardsEvent, directDepositRelationshipCount, error, showCardNumbers, cardImage, verificationRequired, shouldHideCardNumber, alwaysShowAddToGPay, showMockedCardNumbers, showMatchaSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhySettingsViewState)) {
            return false;
        }
        RhySettingsViewState rhySettingsViewState = (RhySettingsViewState) other;
        return Intrinsics.areEqual(this.spendingAccount, rhySettingsViewState.spendingAccount) && Intrinsics.areEqual(this.minervaSpendingAccount, rhySettingsViewState.minervaSpendingAccount) && this.isSpendAlertsPending == rhySettingsViewState.isSpendAlertsPending && this.spendAlertsSettingStatus == rhySettingsViewState.spendAlertsSettingStatus && Intrinsics.areEqual(this.paymentCard, rhySettingsViewState.paymentCard) && Intrinsics.areEqual(this.googlePayTokenList, rhySettingsViewState.googlePayTokenList) && this.isCardLockPending == rhySettingsViewState.isCardLockPending && this.isLocationProtectionPending == rhySettingsViewState.isLocationProtectionPending && Intrinsics.areEqual(this.routingDetails, rhySettingsViewState.routingDetails) && Intrinsics.areEqual(this.requestRoutingDetailsBottomSheetEvent, rhySettingsViewState.requestRoutingDetailsBottomSheetEvent) && this.roundupEnrollmentState == rhySettingsViewState.roundupEnrollmentState && Intrinsics.areEqual(this.user, rhySettingsViewState.user) && Intrinsics.areEqual(this.cashCushionStatus, rhySettingsViewState.cashCushionStatus) && this.isCashCushionStatusPending == rhySettingsViewState.isCashCushionStatusPending && Intrinsics.areEqual(this.cashManagementCardValidUntil, rhySettingsViewState.cashManagementCardValidUntil) && Intrinsics.areEqual(this.hasBrokerageAccount, rhySettingsViewState.hasBrokerageAccount) && Intrinsics.areEqual(this.roundupAssetSymbol, rhySettingsViewState.roundupAssetSymbol) && this.isLocationProtectionEnabled == rhySettingsViewState.isLocationProtectionEnabled && Intrinsics.areEqual(this.pushTokenizeEvent, rhySettingsViewState.pushTokenizeEvent) && Intrinsics.areEqual(this.pauseRoundupRewardsEvent, rhySettingsViewState.pauseRoundupRewardsEvent) && Intrinsics.areEqual(this.directDepositRelationshipCount, rhySettingsViewState.directDepositRelationshipCount) && Intrinsics.areEqual(this.error, rhySettingsViewState.error) && this.showCardNumbers == rhySettingsViewState.showCardNumbers && Intrinsics.areEqual(this.cardImage, rhySettingsViewState.cardImage) && Intrinsics.areEqual(this.verificationRequired, rhySettingsViewState.verificationRequired) && Intrinsics.areEqual(this.shouldHideCardNumber, rhySettingsViewState.shouldHideCardNumber) && this.alwaysShowAddToGPay == rhySettingsViewState.alwaysShowAddToGPay && this.showMockedCardNumbers == rhySettingsViewState.showMockedCardNumbers && this.showMatchaSettings == rhySettingsViewState.showMatchaSettings;
    }

    public int hashCode() {
        RhyAccount rhyAccount = this.spendingAccount;
        int iHashCode = (rhyAccount == null ? 0 : rhyAccount.hashCode()) * 31;
        MinervaAccount minervaAccount = this.minervaSpendingAccount;
        int iHashCode2 = (((iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31) + Boolean.hashCode(this.isSpendAlertsPending)) * 31;
        ApiNotificationSettingsToggleSettingsItem.Status status = this.spendAlertsSettingStatus;
        int iHashCode3 = (iHashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        PaymentCard paymentCard = this.paymentCard;
        int iHashCode4 = (iHashCode3 + (paymentCard == null ? 0 : paymentCard.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode5 = (((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isCardLockPending)) * 31) + Boolean.hashCode(this.isLocationProtectionPending)) * 31;
        RhyAccountRoutingDetails rhyAccountRoutingDetails = this.routingDetails;
        int iHashCode6 = (iHashCode5 + (rhyAccountRoutingDetails == null ? 0 : rhyAccountRoutingDetails.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.requestRoutingDetailsBottomSheetEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        ApiRoundupEnrollment.State state = this.roundupEnrollmentState;
        int iHashCode8 = (iHashCode7 + (state == null ? 0 : state.hashCode())) * 31;
        User user = this.user;
        int iHashCode9 = (iHashCode8 + (user == null ? 0 : user.hashCode())) * 31;
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        int iHashCode10 = (((iHashCode9 + (cashCushionStatus == null ? 0 : cashCushionStatus.hashCode())) * 31) + Boolean.hashCode(this.isCashCushionStatusPending)) * 31;
        Instant instant = this.cashManagementCardValidUntil;
        int iHashCode11 = (iHashCode10 + (instant == null ? 0 : instant.hashCode())) * 31;
        Boolean bool = this.hasBrokerageAccount;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.roundupAssetSymbol;
        int iHashCode13 = (((iHashCode12 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLocationProtectionEnabled)) * 31;
        UiEvent<PushTokenizeRequest> uiEvent2 = this.pushTokenizeEvent;
        int iHashCode14 = (iHashCode13 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.pauseRoundupRewardsEvent;
        int iHashCode15 = (iHashCode14 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        Integer num = this.directDepositRelationshipCount;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        UiEvent<Throwable> uiEvent4 = this.error;
        int iHashCode17 = (((iHashCode16 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31) + Boolean.hashCode(this.showCardNumbers)) * 31;
        Bitmap bitmap = this.cardImage;
        int iHashCode18 = (iHashCode17 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        UiEvent<VerificationRequiredException> uiEvent5 = this.verificationRequired;
        int iHashCode19 = (iHashCode18 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<Unit> uiEvent6 = this.shouldHideCardNumber;
        return ((((((iHashCode19 + (uiEvent6 != null ? uiEvent6.hashCode() : 0)) * 31) + Boolean.hashCode(this.alwaysShowAddToGPay)) * 31) + Boolean.hashCode(this.showMockedCardNumbers)) * 31) + Boolean.hashCode(this.showMatchaSettings);
    }

    public String toString() {
        return "RhySettingsViewState(spendingAccount=" + this.spendingAccount + ", minervaSpendingAccount=" + this.minervaSpendingAccount + ", isSpendAlertsPending=" + this.isSpendAlertsPending + ", spendAlertsSettingStatus=" + this.spendAlertsSettingStatus + ", paymentCard=" + this.paymentCard + ", googlePayTokenList=" + this.googlePayTokenList + ", isCardLockPending=" + this.isCardLockPending + ", isLocationProtectionPending=" + this.isLocationProtectionPending + ", routingDetails=" + this.routingDetails + ", requestRoutingDetailsBottomSheetEvent=" + this.requestRoutingDetailsBottomSheetEvent + ", roundupEnrollmentState=" + this.roundupEnrollmentState + ", user=" + this.user + ", cashCushionStatus=" + this.cashCushionStatus + ", isCashCushionStatusPending=" + this.isCashCushionStatusPending + ", cashManagementCardValidUntil=" + this.cashManagementCardValidUntil + ", hasBrokerageAccount=" + this.hasBrokerageAccount + ", roundupAssetSymbol=" + this.roundupAssetSymbol + ", isLocationProtectionEnabled=" + this.isLocationProtectionEnabled + ", pushTokenizeEvent=" + this.pushTokenizeEvent + ", pauseRoundupRewardsEvent=" + this.pauseRoundupRewardsEvent + ", directDepositRelationshipCount=" + this.directDepositRelationshipCount + ", error=" + this.error + ", showCardNumbers=" + this.showCardNumbers + ", cardImage=" + this.cardImage + ", verificationRequired=" + this.verificationRequired + ", shouldHideCardNumber=" + this.shouldHideCardNumber + ", alwaysShowAddToGPay=" + this.alwaysShowAddToGPay + ", showMockedCardNumbers=" + this.showMockedCardNumbers + ", showMatchaSettings=" + this.showMatchaSettings + ")";
    }

    public RhySettingsViewState(RhyAccount rhyAccount, MinervaAccount minervaAccount, boolean z, ApiNotificationSettingsToggleSettingsItem.Status status, PaymentCard paymentCard, List<GooglePayTokenInfoWrapper> list, boolean z2, boolean z3, RhyAccountRoutingDetails rhyAccountRoutingDetails, UiEvent<Unit> uiEvent, ApiRoundupEnrollment.State state, User user, CashCushionStatus cashCushionStatus, boolean z4, Instant instant, Boolean bool, String str, boolean z5, UiEvent<PushTokenizeRequest> uiEvent2, UiEvent<Unit> uiEvent3, Integer num, UiEvent<Throwable> uiEvent4, boolean z6, Bitmap bitmap, UiEvent<VerificationRequiredException> uiEvent5, UiEvent<Unit> uiEvent6, boolean z7, boolean z8, boolean z9) {
        this.spendingAccount = rhyAccount;
        this.minervaSpendingAccount = minervaAccount;
        this.isSpendAlertsPending = z;
        this.spendAlertsSettingStatus = status;
        this.paymentCard = paymentCard;
        this.googlePayTokenList = list;
        this.isCardLockPending = z2;
        this.isLocationProtectionPending = z3;
        this.routingDetails = rhyAccountRoutingDetails;
        this.requestRoutingDetailsBottomSheetEvent = uiEvent;
        this.roundupEnrollmentState = state;
        this.user = user;
        this.cashCushionStatus = cashCushionStatus;
        this.isCashCushionStatusPending = z4;
        this.cashManagementCardValidUntil = instant;
        this.hasBrokerageAccount = bool;
        this.roundupAssetSymbol = str;
        this.isLocationProtectionEnabled = z5;
        this.pushTokenizeEvent = uiEvent2;
        this.pauseRoundupRewardsEvent = uiEvent3;
        this.directDepositRelationshipCount = num;
        this.error = uiEvent4;
        this.showCardNumbers = z6;
        this.cardImage = bitmap;
        this.verificationRequired = uiEvent5;
        this.shouldHideCardNumber = uiEvent6;
        this.alwaysShowAddToGPay = z7;
        this.showMockedCardNumbers = z8;
        this.showMatchaSettings = z9;
        boolean z10 = false;
        if (num != null && num.intValue() > 0) {
            z10 = true;
        }
        this.isDirectDepositActive = z10;
    }

    public /* synthetic */ RhySettingsViewState(RhyAccount rhyAccount, MinervaAccount minervaAccount, boolean z, ApiNotificationSettingsToggleSettingsItem.Status status, PaymentCard paymentCard, List list, boolean z2, boolean z3, RhyAccountRoutingDetails rhyAccountRoutingDetails, UiEvent uiEvent, ApiRoundupEnrollment.State state, User user, CashCushionStatus cashCushionStatus, boolean z4, Instant instant, Boolean bool, String str, boolean z5, UiEvent uiEvent2, UiEvent uiEvent3, Integer num, UiEvent uiEvent4, boolean z6, Bitmap bitmap, UiEvent uiEvent5, UiEvent uiEvent6, boolean z7, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rhyAccount, (i & 2) != 0 ? null : minervaAccount, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : status, (i & 16) != 0 ? null : paymentCard, (i & 32) != 0 ? null : list, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : rhyAccountRoutingDetails, (i & 512) != 0 ? null : uiEvent, (i & 1024) != 0 ? null : state, (i & 2048) != 0 ? null : user, (i & 4096) != 0 ? null : cashCushionStatus, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? null : instant, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : str, (i & 131072) != 0 ? false : z5, (i & 262144) != 0 ? null : uiEvent2, (i & 524288) != 0 ? null : uiEvent3, (i & 1048576) != 0 ? null : num, (i & 2097152) != 0 ? null : uiEvent4, (i & 4194304) != 0 ? false : z6, (i & 8388608) != 0 ? null : bitmap, (i & 16777216) != 0 ? null : uiEvent5, (i & 33554432) != 0 ? null : uiEvent6, (i & 67108864) != 0 ? false : z7, (i & 134217728) != 0 ? false : z8, (i & 268435456) != 0 ? false : z9);
    }

    public final Boolean getHasBrokerageAccount() {
        return this.hasBrokerageAccount;
    }

    public final String getRoundupAssetSymbol() {
        return this.roundupAssetSymbol;
    }

    public final boolean isLocationProtectionEnabled() {
        return this.isLocationProtectionEnabled;
    }

    public final UiEvent<PushTokenizeRequest> getPushTokenizeEvent() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<Unit> getPauseRoundupRewardsEvent() {
        return this.pauseRoundupRewardsEvent;
    }

    public final Integer getDirectDepositRelationshipCount() {
        return this.directDepositRelationshipCount;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean getShowCardNumbers() {
        return this.showCardNumbers;
    }

    public final Bitmap getCardImage() {
        return this.cardImage;
    }

    public final UiEvent<VerificationRequiredException> getVerificationRequired() {
        return this.verificationRequired;
    }

    public final UiEvent<Unit> getShouldHideCardNumber() {
        return this.shouldHideCardNumber;
    }

    public final boolean getAlwaysShowAddToGPay() {
        return this.alwaysShowAddToGPay;
    }

    public final boolean getShowMockedCardNumbers() {
        return this.showMockedCardNumbers;
    }

    public final boolean getShowMatchaSettings() {
        return this.showMatchaSettings;
    }

    public final UiEvent<RhyAccountRoutingDetails> getShowRoutingDetailsBottomSheetEvent() {
        RhyAccountRoutingDetails rhyAccountRoutingDetails;
        UiEvent<Unit> uiEvent = this.requestRoutingDetailsBottomSheetEvent;
        if ((uiEvent != null ? uiEvent.consume() : null) == null || (rhyAccountRoutingDetails = this.routingDetails) == null) {
            return null;
        }
        return new UiEvent<>(rhyAccountRoutingDetails);
    }

    public final boolean isCardLocked() {
        PaymentCard paymentCard = this.paymentCard;
        return paymentCard != null && paymentCard.isDisabled();
    }

    public final boolean isCardLockToggleEnabled() {
        return !this.isCardLockPending;
    }

    public final boolean isLocationProtectionToggleEnabled() {
        return !this.isLocationProtectionPending;
    }

    public final boolean isSpendAlertsSwitchLocked() {
        return this.spendAlertsSettingStatus == ApiNotificationSettingsToggleSettingsItem.Status.REQUIRED_ON;
    }

    public final boolean isSpendAlertsSwitchEnabled() {
        return (this.isSpendAlertsPending || isSpendAlertsSwitchLocked() || this.spendAlertsSettingStatus == null) ? false : true;
    }

    public final boolean isCashCushionSwitchChecked() {
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        return cashCushionStatus != null && cashCushionStatus.getEnabled();
    }

    public final boolean isCashCushionSwitchEnabled() {
        return (this.cashCushionStatus == null || this.isCashCushionStatusPending) ? false : true;
    }

    public final MailCardState getMailCardState() {
        PaymentCard paymentCard = this.paymentCard;
        return (paymentCard == null || !paymentCard.isVirtual()) ? MailCardState.Hidden.INSTANCE : new MailCardState.Visible(this.paymentCard.getId());
    }

    public final boolean isSpendAlertsSwitchChecked() {
        ApiNotificationSettingsToggleSettingsItem.Status status = this.spendAlertsSettingStatus;
        return status == ApiNotificationSettingsToggleSettingsItem.Status.f5427ON || status == ApiNotificationSettingsToggleSettingsItem.Status.REQUIRED_ON;
    }

    public final ChangePinState getChangePinState() {
        if (this.paymentCard == null) {
            return ChangePinState.Hidden.INSTANCE;
        }
        return new ChangePinState.Visible(this.paymentCard);
    }

    public final boolean isGooglePayActionVisible() {
        List<GooglePayTokenInfoWrapper> list;
        if (this.alwaysShowAddToGPay) {
            return true;
        }
        PaymentCard paymentCard = this.paymentCard;
        if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE || (list = this.googlePayTokenList) == null) {
            return false;
        }
        List<GooglePayTokenInfoWrapper> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : list2) {
            if (googlePayTokenInfoWrapper.getTokenState() == 5 || googlePayTokenInfoWrapper.getTokenState() == 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRoundupSignUpRowVisible() {
        return this.roundupEnrollmentState == ApiRoundupEnrollment.State.SIGNUP;
    }

    public final boolean isRoundupToggleRowVisible() {
        return CollectionsKt.contains(SetsKt.setOf((Object[]) new ApiRoundupEnrollment.State[]{ApiRoundupEnrollment.State.INACTIVE, ApiRoundupEnrollment.State.ACTIVE}), this.roundupEnrollmentState);
    }

    public final boolean isRoundupToggleChecked() {
        return this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE;
    }

    public final boolean isStockSelectionRowVisible() {
        return isRoundupToggleRowVisible();
    }

    public final boolean isStockSelectionRowEnabled() {
        return this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE;
    }

    public final CardHelpState getCardHelpState() {
        PaymentCard paymentCard = this.paymentCard;
        UUID id = paymentCard != null ? paymentCard.getId() : null;
        if (id == null) {
            return CardHelpState.Hidden.INSTANCE;
        }
        return new CardHelpState.Visible(id);
    }

    public final boolean isSetUpDirectDepositRowVisible() {
        return !this.isDirectDepositActive;
    }

    public final boolean isManageDirectDepositRowVisible() {
        return this.isDirectDepositActive;
    }

    /* renamed from: isEarlyDirectDepositToggleVisible, reason: from getter */
    public final boolean getIsDirectDepositActive() {
        return this.isDirectDepositActive;
    }

    public final StringResource getManageDirectDepositRowSecondaryText() {
        Integer num = this.directDepositRelationshipCount;
        if (num == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C10285R.string.rhy_account_settings_fragment_linked_paychecks, Integer.valueOf(num.intValue()));
    }

    public final String getFirstName() {
        User user = this.user;
        if (user != null) {
            return user.getFirstName();
        }
        return null;
    }

    public final String getLastName() {
        User user = this.user;
        if (user != null) {
            return user.getLastName();
        }
        return null;
    }

    public final String getCardLastFourDigits() {
        PaymentCard paymentCard = this.paymentCard;
        if (paymentCard != null) {
            return paymentCard.getLastFourDigits();
        }
        return null;
    }

    public final boolean getShowRoundUpSettings() {
        return (this.spendingAccount == null || this.minervaSpendingAccount == null) ? false : true;
    }

    public final boolean getShowDebitCardSettings() {
        return (this.spendingAccount == null || this.minervaSpendingAccount == null) ? false : true;
    }

    public final StringResource getCashManagementCardValidDaysRemaining() {
        Instant instant = this.cashManagementCardValidUntil;
        if (instant != null) {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instantNow, instant);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            int days = (int) durationBetween.toDays();
            if (days >= 0) {
                return StringResource.INSTANCE.invoke(C10285R.string.rhy_card_settings_virtual_card_banner, String.valueOf(days));
            }
        }
        return null;
    }

    /* compiled from: RhySettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState;", "", "isChangePinVisible", "", "<init>", "(Z)V", "()Z", "Hidden", "Visible", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Visible;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ChangePinState {
        public static final int $stable = 0;
        private final boolean isChangePinVisible;

        public /* synthetic */ ChangePinState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private ChangePinState(boolean z) {
            this.isChangePinVisible = z;
        }

        /* renamed from: isChangePinVisible, reason: from getter */
        public final boolean getIsChangePinVisible() {
            return this.isChangePinVisible;
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Hidden extends ChangePinState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
                super(false, null);
            }
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Visible;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "isCardVirtual", "", "()Z", "isPinSet", "actionPrimaryTextRes", "", "getActionPrimaryTextRes", "()I", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Visible extends ChangePinState {
            public static final int $stable = 8;
            private final PaymentCard paymentCard;

            /* renamed from: component1, reason: from getter */
            private final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public static /* synthetic */ Visible copy$default(Visible visible, PaymentCard paymentCard, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCard = visible.paymentCard;
                }
                return visible.copy(paymentCard);
            }

            public final Visible copy(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return new Visible(paymentCard);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Visible) && Intrinsics.areEqual(this.paymentCard, ((Visible) other).paymentCard);
            }

            public int hashCode() {
                return this.paymentCard.hashCode();
            }

            public String toString() {
                return "Visible(paymentCard=" + this.paymentCard + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Visible(PaymentCard paymentCard) {
                super(true, null);
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                this.paymentCard = paymentCard;
            }

            public final UUID getCardId() {
                return this.paymentCard.getId();
            }

            public final boolean isCardVirtual() {
                return this.paymentCard.isVirtual();
            }

            public final boolean isPinSet() {
                return this.paymentCard.isPinSet();
            }

            public final int getActionPrimaryTextRes() {
                if (isPinSet()) {
                    return C10285R.string.rhy_account_settings_fragment_change_pin;
                }
                return C10285R.string.rhy_account_settings_fragment_set_pin;
            }
        }
    }

    /* compiled from: RhySettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState;", "", "isMailCardVisible", "", "<init>", "(Z)V", "()Z", "Hidden", "Visible", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState$Visible;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MailCardState {
        public static final int $stable = 0;
        private final boolean isMailCardVisible;

        public /* synthetic */ MailCardState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private MailCardState(boolean z) {
            this.isMailCardVisible = z;
        }

        /* renamed from: isMailCardVisible, reason: from getter */
        public final boolean getIsMailCardVisible() {
            return this.isMailCardVisible;
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Hidden extends MailCardState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
                super(false, null);
            }
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState$Visible;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$MailCardState;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Visible extends MailCardState {
            public static final int $stable = 8;
            private final UUID cardId;

            public static /* synthetic */ Visible copy$default(Visible visible, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = visible.cardId;
                }
                return visible.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCardId() {
                return this.cardId;
            }

            public final Visible copy(UUID cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return new Visible(cardId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Visible) && Intrinsics.areEqual(this.cardId, ((Visible) other).cardId);
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public String toString() {
                return "Visible(cardId=" + this.cardId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Visible(UUID cardId) {
                super(true, null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.cardId = cardId;
            }

            public final UUID getCardId() {
                return this.cardId;
            }
        }
    }

    /* compiled from: RhySettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState;", "", "isCardHelpVisible", "", "<init>", "(Z)V", "()Z", "Hidden", "Visible", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState$Visible;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CardHelpState {
        public static final int $stable = 0;
        private final boolean isCardHelpVisible;

        public /* synthetic */ CardHelpState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private CardHelpState(boolean z) {
            this.isCardHelpVisible = z;
        }

        /* renamed from: isCardHelpVisible, reason: from getter */
        public final boolean getIsCardHelpVisible() {
            return this.isCardHelpVisible;
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Hidden extends CardHelpState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
                super(false, null);
            }
        }

        /* compiled from: RhySettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState$Visible;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$CardHelpState;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Visible extends CardHelpState {
            public static final int $stable = 8;
            private final UUID cardId;

            public static /* synthetic */ Visible copy$default(Visible visible, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = visible.cardId;
                }
                return visible.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCardId() {
                return this.cardId;
            }

            public final Visible copy(UUID cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return new Visible(cardId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Visible) && Intrinsics.areEqual(this.cardId, ((Visible) other).cardId);
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public String toString() {
                return "Visible(cardId=" + this.cardId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Visible(UUID cardId) {
                super(true, null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.cardId = cardId;
            }

            public final UUID getCardId() {
                return this.cardId;
            }
        }
    }
}
