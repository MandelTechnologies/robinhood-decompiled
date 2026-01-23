package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AppEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 Õ\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Õ\u0001BÉ\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\b\b\u0002\u00101\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\b\b\u0002\u00103\u001a\u00020\u0004\u0012\b\b\u0002\u00104\u001a\u00020\u0004\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0004\u0012\b\b\u0002\u00108\u001a\u00020\u0004\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\u0004\u0012\b\b\u0002\u0010;\u001a\u00020\u0004\u0012\b\b\u0002\u0010<\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u00020\u0004\u0012\b\b\u0002\u0010>\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\b\b\u0002\u0010@\u001a\u00020\u0004\u0012\b\b\u0002\u0010A\u001a\u00020\u0006\u0012\b\b\u0002\u0010B\u001a\u00020\u0004\u0012\b\b\u0002\u0010C\u001a\u00020D\u0012\b\b\u0002\u0010E\u001a\u00020D\u0012\b\b\u0002\u0010F\u001a\u00020D\u0012\b\b\u0002\u0010G\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0004\u0012\b\b\u0002\u0010I\u001a\u00020\u0004\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\b\b\u0002\u0010K\u001a\u00020D\u0012\b\b\u0002\u0010L\u001a\u00020\u0004\u0012\b\b\u0002\u0010M\u001a\u00020\u0004\u0012\b\b\u0002\u0010N\u001a\u00020\u0006\u0012\b\b\u0002\u0010O\u001a\u00020\u0004\u0012\b\b\u0002\u0010P\u001a\u00020\u0004\u0012\b\b\u0002\u0010Q\u001a\u00020\u0004\u0012\b\b\u0002\u0010R\u001a\u00020D\u0012\b\b\u0002\u0010S\u001a\u00020\u0004\u0012\b\b\u0002\u0010T\u001a\u00020D\u0012\b\b\u0002\u0010U\u001a\u00020\u0004\u0012\b\b\u0002\u0010V\u001a\u00020D\u0012\b\b\u0002\u0010W\u001a\u00020D\u0012\b\b\u0002\u0010X\u001a\u00020\u0004\u0012\b\b\u0002\u0010Y\u001a\u00020\u0006\u0012\b\b\u0002\u0010Z\u001a\u00020\u0004\u0012\b\b\u0002\u0010[\u001a\u00020\u0004\u0012\b\b\u0002\u0010\\\u001a\u00020\u0004\u0012\b\b\u0002\u0010]\u001a\u00020D\u0012\b\b\u0002\u0010^\u001a\u00020\u0004\u0012\b\b\u0002\u0010_\u001a\u00020\u0006\u0012\b\b\u0002\u0010`\u001a\u00020\u0006\u0012\b\b\u0002\u0010a\u001a\u00020\u0004\u0012\b\b\u0002\u0010b\u001a\u00020\u0004\u0012\b\b\u0002\u0010c\u001a\u00020\u0004\u0012\b\b\u0002\u0010d\u001a\u00020\u0004\u0012\b\b\u0002\u0010e\u001a\u00020\u0004\u0012\b\b\u0002\u0010f\u001a\u00020g¢\u0006\u0004\bh\u0010iJ\t\u0010Í\u0001\u001a\u00020\u0002H\u0017J\u0017\u0010Î\u0001\u001a\u00030Ï\u00012\n\u0010Ð\u0001\u001a\u0005\u0018\u00010Ñ\u0001H\u0096\u0002J\t\u0010Ò\u0001\u001a\u00020\u0006H\u0016J\t\u0010Ó\u0001\u001a\u00020\u0004H\u0016JÉ\u0007\u0010Ô\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\u00062\b\b\u0002\u0010B\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u00042\b\b\u0002\u0010J\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020D2\b\b\u0002\u0010L\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00042\b\b\u0002\u0010Q\u001a\u00020\u00042\b\b\u0002\u0010R\u001a\u00020D2\b\b\u0002\u0010S\u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020D2\b\b\u0002\u0010U\u001a\u00020\u00042\b\b\u0002\u0010V\u001a\u00020D2\b\b\u0002\u0010W\u001a\u00020D2\b\b\u0002\u0010X\u001a\u00020\u00042\b\b\u0002\u0010Y\u001a\u00020\u00062\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020D2\b\b\u0002\u0010^\u001a\u00020\u00042\b\b\u0002\u0010_\u001a\u00020\u00062\b\b\u0002\u0010`\u001a\u00020\u00062\b\b\u0002\u0010a\u001a\u00020\u00042\b\b\u0002\u0010b\u001a\u00020\u00042\b\b\u0002\u0010c\u001a\u00020\u00042\b\b\u0002\u0010d\u001a\u00020\u00042\b\b\u0002\u0010e\u001a\u00020\u00042\b\b\u0002\u0010f\u001a\u00020gR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010kR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010mR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010kR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010kR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010kR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010kR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010kR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010kR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010kR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010kR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010mR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010kR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010kR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010kR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010kR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010kR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010kR\u0017\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010kR\u0017\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010kR\u0017\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010kR\u0017\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010kR\u0017\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010kR\u0017\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010kR\u0017\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010kR\u0017\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010kR\u0017\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010kR\u0017\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010kR\u0017\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010kR\u0017\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010kR\u0017\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010kR\u0017\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010kR\u0017\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010kR\u0017\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010kR\u0017\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010kR\u0017\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010kR\u0017\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010kR\u0017\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010kR\u0017\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010kR\u0017\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010kR\u0017\u00100\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010kR\u0017\u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010kR\u0017\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010kR\u0017\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010kR\u0017\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010kR\u0017\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010kR\u0017\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010kR\u0017\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010kR\u0017\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010kR\u0017\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010kR\u0017\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010kR\u0017\u0010;\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010kR\u0017\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010kR\u0017\u0010=\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010kR\u0017\u0010>\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010kR\u0017\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010kR\u0017\u0010@\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010kR\u0017\u0010A\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010mR\u0017\u0010B\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010kR\u0018\u0010C\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010E\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010«\u0001R\u0018\u0010F\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010«\u0001R\u0017\u0010G\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010kR\u0017\u0010H\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010kR\u0017\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010kR\u0017\u0010J\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010kR\u0018\u0010K\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b²\u0001\u0010«\u0001R\u0017\u0010L\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010kR\u0017\u0010M\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010kR\u0017\u0010N\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010mR\u0017\u0010O\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010kR\u0017\u0010P\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010kR\u0017\u0010Q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010kR\u0018\u0010R\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010«\u0001R\u0017\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010kR\u0018\u0010T\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010«\u0001R\u0017\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010kR\u0018\u0010V\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010«\u0001R\u0018\u0010W\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010«\u0001R\u0017\u0010X\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010kR\u0017\u0010Y\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010mR\u0017\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010kR\u0017\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010kR\u0017\u0010\\\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010kR\u0018\u0010]\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010«\u0001R\u0017\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010kR\u0017\u0010_\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010mR\u0017\u0010`\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010mR\u0017\u0010a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010kR\u0017\u0010b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÉ\u0001\u0010kR\u0017\u0010c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010kR\u0017\u0010d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010kR\u0017\u0010e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010k¨\u0006Ö\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventData;", "Lcom/squareup/wire/Message;", "", "screen_name", "", "screen_depth", "", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "message", "number_of_notifications", "field_name", "user_input", "tab_group_name", "tab_name", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;", "button_group_title", "button_title", "button_description", "entity_type", Constants.REFERRER, "root_url", "email_address", "email_category", "test_version", "uuid", "user_agent", "action_name", "url", "page", "section", "component", "element", "name", "url_params", "performance_data", "recipient", "sender", "event_name", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", MatchSelectionActivity.TRANSFER_ID_EXTRA, "relationship_id", "duration", "target_screen_name", "clp_value", "", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "fid_value", "source_tag", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "time", "event_type", "asset_class", "payload", "milliseconds", "po_box", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "recommendation_id", "invest_flow_schedule_id", "invest_flow_order_id", "request_duration", "request_url", "response_status_code", "item_index", "message_title", "message_body", "masked_referrer", "masked_email_address", "masked_recipient", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth", "()I", "getScreen_description", "getTime_spent", "getTransition_reason", "getType", "getMessage_type", "getMessage_uuid", "getEntity_id", "getSource", "getSource_screen_name", "getMessage", "getNumber_of_notifications", "getField_name", "getUser_input", "getTab_group_name", "getTab_name", "getTag", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;", "getButton_group_title", "getButton_title", "getButton_description", "getEntity_type", "getReferrer", "getRoot_url", "getEmail_address", "getEmail_category", "getTest_version", "getUuid", "getUser_agent", "getAction_name", "getUrl", "getPage", "getSection", "getComponent", "getElement", "getName", "getUrl_params", "getPerformance_data", "getRecipient", "getSender", "getEvent_name", "getError_code", "getError_message", "getError_type", "getDisplay_message", "getExit_status", "getInstitution_id", "getInstitution_name", "getInstitution_search_query", "getLink_session_id", "getMfa_type", "getRequest_id", "getPlaid_timestamp", "getView_name", "getStatus", "getAccounts", "getTransfer_id", "getRelationship_id", "getDuration", "getTarget_screen_name", "getClp_value", "()D", "getLcp_value", "getEtr_value", "getDescription", "getInstrument_id", "getSymbol", "getDirection", "getFid_value", "getSource_tag", "getItem", "getTime", "getEvent_type", "getAsset_class", "getPayload", "getMilliseconds", "getPo_box", "getInp_value", "getDebug_target", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests", "getRecommendation_id", "getInvest_flow_schedule_id", "getInvest_flow_order_id", "getRequest_duration", "getRequest_url", "getResponse_status_code", "getItem_index", "getMessage_title", "getMessage_body", "getMasked_referrer", "getMasked_email_address", "getMasked_recipient", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AppEventData extends Message {

    @JvmField
    public static final ProtoAdapter<AppEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 56, tag = 57)
    private final String accounts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final String action_name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AppEventDataAdditionalInfo#ADAPTER", jsonName = "additionalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final AppEventDataAdditionalInfo additional_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 73, tag = 74)
    private final String asset_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String button_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonGroupTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String button_group_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "clpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 61, tag = 62)
    private final double clp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 35)
    private final String component;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "debugTarget", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 78, tag = 79)
    private final String debug_target;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 64, tag = 65)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 67, tag = EnumC7081g.SDK_ASSET_ICON_HOME_VALUE)
    private final String direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 45, tag = 46)
    private final String display_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 59, tag = 60)
    private final int duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 36)
    private final String element;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final String email_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final String email_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final String entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 43)
    private final String error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 44)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 45)
    private final String error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "etrValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 63, tag = 64)
    private final double etr_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 42)
    private final String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, tag = 73)
    private final String event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exitStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 46, tag = 47)
    private final String exit_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "fidValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, tag = 69)
    private final double fid_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fieldName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String field_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "inpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 77, tag = 78)
    private final double inp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 48)
    private final String institution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 48, tag = 49)
    private final String institution_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionSearchQuery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 50)
    private final String institution_search_query;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 65, tag = 66)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "investFlowOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 85, tag = 86)
    private final String invest_flow_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "investFlowScheduleId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 84, tag = 85)
    private final String invest_flow_schedule_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 70, tag = EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE)
    private final String item;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "itemIndex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 89, tag = 90)
    private final int item_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "lcpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 62, tag = 63)
    private final double lcp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkSessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 50, tag = 51)
    private final String link_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "loadingNavigationLargestRequestDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 80, tag = 81)
    private final double loading_navigation_largest_request_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadingNavigationLargestRequestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 81, tag = 82)
    private final String loading_navigation_largest_request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "loadingNavigationNumRequests", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 82, tag = 83)
    private final int loading_navigation_num_requests;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "loadingNavigationValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 79, tag = 80)
    private final double loading_navigation_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedEmailAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 93, tag = 1026)
    private final String masked_email_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedRecipient", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 94, tag = 1040)
    private final String masked_recipient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedReferrer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 92, tag = 1024)
    private final String masked_referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageBody", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 91, tag = 92)
    private final String message_body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 90, tag = 91)
    private final String message_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String message_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String message_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mfaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 51, tag = 52)
    private final String mfa_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 75, tag = 76)
    private final double milliseconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 37)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfNotifications", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final int number_of_notifications;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final String page;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 74, tag = 75)
    private final String payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "performanceData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 39)
    private final String performance_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plaidTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 53, tag = 54)
    private final String plaid_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "poBox", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 76, tag = 77)
    private final String po_box;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 40)
    private final String recipient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recommendationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 83, tag = 84)
    private final String recommendation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 58, tag = 59)
    private final String relationship_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "requestDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 86, tag = 87)
    private final double request_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 52, tag = 53)
    private final String request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 87, tag = 88)
    private final String request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "responseStatusCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 88, tag = 89)
    private final int response_status_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rootUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final String root_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "screenDepth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int screen_depth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String screen_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final String section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 41)
    private final String sender;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceScreenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String source_screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceTag", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 69, tag = 70)
    private final String source_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 55, tag = 56)
    private final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 66, tag = 67)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tabGroupName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String tab_group_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tabName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String tab_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetScreenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 60, tag = 61)
    private final String target_screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final String test_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, tag = EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE)
    private final int time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int time_spent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 57, tag = 58)
    private final String transfer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transitionReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String transition_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "urlParams", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 38)
    private final String url_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final String user_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userInput", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String user_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final String uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "viewName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 54, tag = 55)
    private final String view_name;

    public AppEventData() {
        this(null, 0, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0.0d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, 0, null, null, null, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, null, null, null, 0.0d, null, 0, 0, null, null, null, null, null, null, -1, -1, -1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventData(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfo appEventDataAdditionalInfo, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, ByteString byteString, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str78 = (i9 & 1) != 0 ? "" : str;
        int i12 = (i9 & 2) != 0 ? 0 : i;
        String str79 = (i9 & 4) != 0 ? "" : str2;
        int i13 = (i9 & 8) != 0 ? 0 : i2;
        String str80 = (i9 & 16) != 0 ? "" : str3;
        String str81 = (i9 & 32) != 0 ? "" : str4;
        String str82 = (i9 & 64) != 0 ? "" : str5;
        String str83 = (i9 & 128) != 0 ? "" : str6;
        String str84 = (i9 & 256) != 0 ? "" : str7;
        String str85 = (i9 & 512) != 0 ? "" : str8;
        String str86 = (i9 & 1024) != 0 ? "" : str9;
        String str87 = (i9 & 2048) != 0 ? "" : str10;
        String str88 = str78;
        int i14 = (i9 & 4096) != 0 ? 0 : i3;
        String str89 = (i9 & 8192) != 0 ? "" : str11;
        String str90 = (i9 & 16384) != 0 ? "" : str12;
        String str91 = (i9 & 32768) != 0 ? "" : str13;
        String str92 = (i9 & 65536) != 0 ? "" : str14;
        String str93 = (i9 & 131072) != 0 ? "" : str15;
        AppEventDataAdditionalInfo appEventDataAdditionalInfo2 = (i9 & 262144) != 0 ? null : appEventDataAdditionalInfo;
        String str94 = (i9 & 524288) != 0 ? "" : str16;
        String str95 = (i9 & 1048576) != 0 ? "" : str17;
        String str96 = (i9 & 2097152) != 0 ? "" : str18;
        String str97 = (i9 & 4194304) != 0 ? "" : str19;
        String str98 = (i9 & 8388608) != 0 ? "" : str20;
        String str99 = (i9 & 16777216) != 0 ? "" : str21;
        String str100 = (i9 & 33554432) != 0 ? "" : str22;
        String str101 = (i9 & 67108864) != 0 ? "" : str23;
        String str102 = (i9 & 134217728) != 0 ? "" : str24;
        String str103 = (i9 & 268435456) != 0 ? "" : str25;
        String str104 = (i9 & 536870912) != 0 ? "" : str26;
        String str105 = (i9 & 1073741824) != 0 ? "" : str27;
        String str106 = (i9 & Integer.MIN_VALUE) != 0 ? "" : str28;
        this(str88, i12, str79, i13, str80, str81, str82, str83, str84, str85, str86, str87, i14, str89, str90, str91, str92, str93, appEventDataAdditionalInfo2, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, (i10 & 1) != 0 ? "" : str29, (i10 & 2) != 0 ? "" : str30, (i10 & 4) != 0 ? "" : str31, (i10 & 8) != 0 ? "" : str32, (i10 & 16) != 0 ? "" : str33, (i10 & 32) != 0 ? "" : str34, (i10 & 64) != 0 ? "" : str35, (i10 & 128) != 0 ? "" : str36, (i10 & 256) != 0 ? "" : str37, (i10 & 512) != 0 ? "" : str38, (i10 & 1024) != 0 ? "" : str39, (i10 & 2048) != 0 ? "" : str40, (i10 & 4096) != 0 ? "" : str41, (i10 & 8192) != 0 ? "" : str42, (i10 & 16384) != 0 ? "" : str43, (i10 & 32768) != 0 ? "" : str44, (i10 & 65536) != 0 ? "" : str45, (i10 & 131072) != 0 ? "" : str46, (i10 & 262144) != 0 ? "" : str47, (i10 & 524288) != 0 ? "" : str48, (i10 & 1048576) != 0 ? "" : str49, (i10 & 2097152) != 0 ? "" : str50, (i10 & 4194304) != 0 ? "" : str51, (i10 & 8388608) != 0 ? "" : str52, (i10 & 16777216) != 0 ? "" : str53, (i10 & 33554432) != 0 ? "" : str54, (i10 & 67108864) != 0 ? "" : str55, (i10 & 134217728) != 0 ? 0 : i4, (i10 & 268435456) != 0 ? "" : str56, (i10 & 536870912) != 0 ? 0.0d : d, (i10 & 1073741824) != 0 ? 0.0d : d2, (i10 & Integer.MIN_VALUE) != 0 ? 0.0d : d3, (i11 & 1) != 0 ? "" : str57, (i11 & 2) != 0 ? "" : str58, (i11 & 4) != 0 ? "" : str59, (i11 & 8) != 0 ? "" : str60, (i11 & 16) != 0 ? 0.0d : d4, (i11 & 32) != 0 ? "" : str61, (i11 & 64) != 0 ? "" : str62, (i11 & 128) != 0 ? 0 : i5, (i11 & 256) != 0 ? "" : str63, (i11 & 512) != 0 ? "" : str64, (i11 & 1024) != 0 ? "" : str65, (i11 & 2048) != 0 ? 0.0d : d5, (i11 & 4096) != 0 ? "" : str66, (i11 & 8192) != 0 ? 0.0d : d6, (i11 & 16384) != 0 ? "" : str67, (i11 & 32768) != 0 ? 0.0d : d7, (i11 & 65536) != 0 ? 0.0d : d8, (i11 & 131072) != 0 ? "" : str68, (i11 & 262144) != 0 ? 0 : i6, (i11 & 524288) != 0 ? "" : str69, (i11 & 1048576) != 0 ? "" : str70, (i11 & 2097152) != 0 ? "" : str71, (i11 & 4194304) == 0 ? d9 : 0.0d, (i11 & 8388608) != 0 ? "" : str72, (i11 & 16777216) != 0 ? 0 : i7, (i11 & 33554432) != 0 ? 0 : i8, (i11 & 67108864) != 0 ? "" : str73, (i11 & 134217728) != 0 ? "" : str74, (i11 & 268435456) != 0 ? "" : str75, (i11 & 536870912) != 0 ? "" : str76, (i11 & 1073741824) == 0 ? str77 : "", (i11 & Integer.MIN_VALUE) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24010newBuilder();
    }

    public final String getScreen_name() {
        return this.screen_name;
    }

    public final int getScreen_depth() {
        return this.screen_depth;
    }

    public final String getScreen_description() {
        return this.screen_description;
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    public final String getTransition_reason() {
        return this.transition_reason;
    }

    public final String getType() {
        return this.type;
    }

    public final String getMessage_type() {
        return this.message_type;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSource_screen_name() {
        return this.source_screen_name;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getNumber_of_notifications() {
        return this.number_of_notifications;
    }

    public final String getField_name() {
        return this.field_name;
    }

    public final String getUser_input() {
        return this.user_input;
    }

    public final String getTab_group_name() {
        return this.tab_group_name;
    }

    public final String getTab_name() {
        return this.tab_name;
    }

    public final String getTag() {
        return this.tag;
    }

    public final AppEventDataAdditionalInfo getAdditional_info() {
        return this.additional_info;
    }

    public final String getButton_group_title() {
        return this.button_group_title;
    }

    public final String getButton_title() {
        return this.button_title;
    }

    public final String getButton_description() {
        return this.button_description;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getRoot_url() {
        return this.root_url;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getEmail_category() {
        return this.email_category;
    }

    public final String getTest_version() {
        return this.test_version;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public final String getAction_name() {
        return this.action_name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getElement() {
        return this.element;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl_params() {
        return this.url_params;
    }

    public final String getPerformance_data() {
        return this.performance_data;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    public final String getDisplay_message() {
        return this.display_message;
    }

    public final String getExit_status() {
        return this.exit_status;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public final String getInstitution_name() {
        return this.institution_name;
    }

    public final String getInstitution_search_query() {
        return this.institution_search_query;
    }

    public final String getLink_session_id() {
        return this.link_session_id;
    }

    public final String getMfa_type() {
        return this.mfa_type;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final String getPlaid_timestamp() {
        return this.plaid_timestamp;
    }

    public final String getView_name() {
        return this.view_name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getAccounts() {
        return this.accounts;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final String getRelationship_id() {
        return this.relationship_id;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getTarget_screen_name() {
        return this.target_screen_name;
    }

    public final double getClp_value() {
        return this.clp_value;
    }

    public final double getLcp_value() {
        return this.lcp_value;
    }

    public final double getEtr_value() {
        return this.etr_value;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final double getFid_value() {
        return this.fid_value;
    }

    public final String getSource_tag() {
        return this.source_tag;
    }

    public final String getItem() {
        return this.item;
    }

    public final int getTime() {
        return this.time;
    }

    public final String getEvent_type() {
        return this.event_type;
    }

    public final String getAsset_class() {
        return this.asset_class;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final double getMilliseconds() {
        return this.milliseconds;
    }

    public final String getPo_box() {
        return this.po_box;
    }

    public final double getInp_value() {
        return this.inp_value;
    }

    public final String getDebug_target() {
        return this.debug_target;
    }

    public final double getLoading_navigation_value() {
        return this.loading_navigation_value;
    }

    public final double getLoading_navigation_largest_request_duration() {
        return this.loading_navigation_largest_request_duration;
    }

    public final String getLoading_navigation_largest_request_url() {
        return this.loading_navigation_largest_request_url;
    }

    public final int getLoading_navigation_num_requests() {
        return this.loading_navigation_num_requests;
    }

    public final String getRecommendation_id() {
        return this.recommendation_id;
    }

    public final String getInvest_flow_schedule_id() {
        return this.invest_flow_schedule_id;
    }

    public final String getInvest_flow_order_id() {
        return this.invest_flow_order_id;
    }

    public final double getRequest_duration() {
        return this.request_duration;
    }

    public final String getRequest_url() {
        return this.request_url;
    }

    public final int getResponse_status_code() {
        return this.response_status_code;
    }

    public final int getItem_index() {
        return this.item_index;
    }

    public final String getMessage_title() {
        return this.message_title;
    }

    public final String getMessage_body() {
        return this.message_body;
    }

    public final String getMasked_referrer() {
        return this.masked_referrer;
    }

    public final String getMasked_email_address() {
        return this.masked_email_address;
    }

    public final String getMasked_recipient() {
        return this.masked_recipient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppEventData(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int i3, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfo appEventDataAdditionalInfo, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int i4, String target_screen_name, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, double d4, String source_tag, String item, int i5, String event_type, String asset_class, String payload, double d5, String po_box, double d6, String debug_target, double d7, double d8, String loading_navigation_largest_request_url, int i6, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double d9, String request_url, int i7, int i8, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(user_input, "user_input");
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url_params, "url_params");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_name = screen_name;
        this.screen_depth = i;
        this.screen_description = screen_description;
        this.time_spent = i2;
        this.transition_reason = transition_reason;
        this.type = type2;
        this.message_type = message_type;
        this.message_uuid = message_uuid;
        this.entity_id = entity_id;
        this.source = source;
        this.source_screen_name = source_screen_name;
        this.message = message;
        this.number_of_notifications = i3;
        this.field_name = field_name;
        this.user_input = user_input;
        this.tab_group_name = tab_group_name;
        this.tab_name = tab_name;
        this.tag = tag;
        this.additional_info = appEventDataAdditionalInfo;
        this.button_group_title = button_group_title;
        this.button_title = button_title;
        this.button_description = button_description;
        this.entity_type = entity_type;
        this.referrer = referrer;
        this.root_url = root_url;
        this.email_address = email_address;
        this.email_category = email_category;
        this.test_version = test_version;
        this.uuid = uuid;
        this.user_agent = user_agent;
        this.action_name = action_name;
        this.url = url;
        this.page = page;
        this.section = section;
        this.component = component;
        this.element = element;
        this.name = name;
        this.url_params = url_params;
        this.performance_data = performance_data;
        this.recipient = recipient;
        this.sender = sender;
        this.event_name = event_name;
        this.error_code = error_code;
        this.error_message = error_message;
        this.error_type = error_type;
        this.display_message = display_message;
        this.exit_status = exit_status;
        this.institution_id = institution_id;
        this.institution_name = institution_name;
        this.institution_search_query = institution_search_query;
        this.link_session_id = link_session_id;
        this.mfa_type = mfa_type;
        this.request_id = request_id;
        this.plaid_timestamp = plaid_timestamp;
        this.view_name = view_name;
        this.status = status;
        this.accounts = accounts2;
        this.transfer_id = transfer_id;
        this.relationship_id = relationship_id;
        this.duration = i4;
        this.target_screen_name = target_screen_name;
        this.clp_value = d;
        this.lcp_value = d2;
        this.etr_value = d3;
        this.description = description;
        this.instrument_id = instrument_id;
        this.symbol = symbol;
        this.direction = direction;
        this.fid_value = d4;
        this.source_tag = source_tag;
        this.item = item;
        this.time = i5;
        this.event_type = event_type;
        this.asset_class = asset_class;
        this.payload = payload;
        this.milliseconds = d5;
        this.po_box = po_box;
        this.inp_value = d6;
        this.debug_target = debug_target;
        this.loading_navigation_value = d7;
        this.loading_navigation_largest_request_duration = d8;
        this.loading_navigation_largest_request_url = loading_navigation_largest_request_url;
        this.loading_navigation_num_requests = i6;
        this.recommendation_id = recommendation_id;
        this.invest_flow_schedule_id = invest_flow_schedule_id;
        this.invest_flow_order_id = invest_flow_order_id;
        this.request_duration = d9;
        this.request_url = request_url;
        this.response_status_code = i7;
        this.item_index = i8;
        this.message_title = message_title;
        this.message_body = message_body;
        this.masked_referrer = masked_referrer;
        this.masked_email_address = masked_email_address;
        this.masked_recipient = masked_recipient;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24010newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AppEventData)) {
            return false;
        }
        AppEventData appEventData = (AppEventData) other;
        return Intrinsics.areEqual(unknownFields(), appEventData.unknownFields()) && Intrinsics.areEqual(this.screen_name, appEventData.screen_name) && this.screen_depth == appEventData.screen_depth && Intrinsics.areEqual(this.screen_description, appEventData.screen_description) && this.time_spent == appEventData.time_spent && Intrinsics.areEqual(this.transition_reason, appEventData.transition_reason) && Intrinsics.areEqual(this.type, appEventData.type) && Intrinsics.areEqual(this.message_type, appEventData.message_type) && Intrinsics.areEqual(this.message_uuid, appEventData.message_uuid) && Intrinsics.areEqual(this.entity_id, appEventData.entity_id) && Intrinsics.areEqual(this.source, appEventData.source) && Intrinsics.areEqual(this.source_screen_name, appEventData.source_screen_name) && Intrinsics.areEqual(this.message, appEventData.message) && this.number_of_notifications == appEventData.number_of_notifications && Intrinsics.areEqual(this.field_name, appEventData.field_name) && Intrinsics.areEqual(this.user_input, appEventData.user_input) && Intrinsics.areEqual(this.tab_group_name, appEventData.tab_group_name) && Intrinsics.areEqual(this.tab_name, appEventData.tab_name) && Intrinsics.areEqual(this.tag, appEventData.tag) && Intrinsics.areEqual(this.additional_info, appEventData.additional_info) && Intrinsics.areEqual(this.button_group_title, appEventData.button_group_title) && Intrinsics.areEqual(this.button_title, appEventData.button_title) && Intrinsics.areEqual(this.button_description, appEventData.button_description) && Intrinsics.areEqual(this.entity_type, appEventData.entity_type) && Intrinsics.areEqual(this.referrer, appEventData.referrer) && Intrinsics.areEqual(this.root_url, appEventData.root_url) && Intrinsics.areEqual(this.email_address, appEventData.email_address) && Intrinsics.areEqual(this.email_category, appEventData.email_category) && Intrinsics.areEqual(this.test_version, appEventData.test_version) && Intrinsics.areEqual(this.uuid, appEventData.uuid) && Intrinsics.areEqual(this.user_agent, appEventData.user_agent) && Intrinsics.areEqual(this.action_name, appEventData.action_name) && Intrinsics.areEqual(this.url, appEventData.url) && Intrinsics.areEqual(this.page, appEventData.page) && Intrinsics.areEqual(this.section, appEventData.section) && Intrinsics.areEqual(this.component, appEventData.component) && Intrinsics.areEqual(this.element, appEventData.element) && Intrinsics.areEqual(this.name, appEventData.name) && Intrinsics.areEqual(this.url_params, appEventData.url_params) && Intrinsics.areEqual(this.performance_data, appEventData.performance_data) && Intrinsics.areEqual(this.recipient, appEventData.recipient) && Intrinsics.areEqual(this.sender, appEventData.sender) && Intrinsics.areEqual(this.event_name, appEventData.event_name) && Intrinsics.areEqual(this.error_code, appEventData.error_code) && Intrinsics.areEqual(this.error_message, appEventData.error_message) && Intrinsics.areEqual(this.error_type, appEventData.error_type) && Intrinsics.areEqual(this.display_message, appEventData.display_message) && Intrinsics.areEqual(this.exit_status, appEventData.exit_status) && Intrinsics.areEqual(this.institution_id, appEventData.institution_id) && Intrinsics.areEqual(this.institution_name, appEventData.institution_name) && Intrinsics.areEqual(this.institution_search_query, appEventData.institution_search_query) && Intrinsics.areEqual(this.link_session_id, appEventData.link_session_id) && Intrinsics.areEqual(this.mfa_type, appEventData.mfa_type) && Intrinsics.areEqual(this.request_id, appEventData.request_id) && Intrinsics.areEqual(this.plaid_timestamp, appEventData.plaid_timestamp) && Intrinsics.areEqual(this.view_name, appEventData.view_name) && Intrinsics.areEqual(this.status, appEventData.status) && Intrinsics.areEqual(this.accounts, appEventData.accounts) && Intrinsics.areEqual(this.transfer_id, appEventData.transfer_id) && Intrinsics.areEqual(this.relationship_id, appEventData.relationship_id) && this.duration == appEventData.duration && Intrinsics.areEqual(this.target_screen_name, appEventData.target_screen_name) && this.clp_value == appEventData.clp_value && this.lcp_value == appEventData.lcp_value && this.etr_value == appEventData.etr_value && Intrinsics.areEqual(this.description, appEventData.description) && Intrinsics.areEqual(this.instrument_id, appEventData.instrument_id) && Intrinsics.areEqual(this.symbol, appEventData.symbol) && Intrinsics.areEqual(this.direction, appEventData.direction) && this.fid_value == appEventData.fid_value && Intrinsics.areEqual(this.source_tag, appEventData.source_tag) && Intrinsics.areEqual(this.item, appEventData.item) && this.time == appEventData.time && Intrinsics.areEqual(this.event_type, appEventData.event_type) && Intrinsics.areEqual(this.asset_class, appEventData.asset_class) && Intrinsics.areEqual(this.payload, appEventData.payload) && this.milliseconds == appEventData.milliseconds && Intrinsics.areEqual(this.po_box, appEventData.po_box) && this.inp_value == appEventData.inp_value && Intrinsics.areEqual(this.debug_target, appEventData.debug_target) && this.loading_navigation_value == appEventData.loading_navigation_value && this.loading_navigation_largest_request_duration == appEventData.loading_navigation_largest_request_duration && Intrinsics.areEqual(this.loading_navigation_largest_request_url, appEventData.loading_navigation_largest_request_url) && this.loading_navigation_num_requests == appEventData.loading_navigation_num_requests && Intrinsics.areEqual(this.recommendation_id, appEventData.recommendation_id) && Intrinsics.areEqual(this.invest_flow_schedule_id, appEventData.invest_flow_schedule_id) && Intrinsics.areEqual(this.invest_flow_order_id, appEventData.invest_flow_order_id) && this.request_duration == appEventData.request_duration && Intrinsics.areEqual(this.request_url, appEventData.request_url) && this.response_status_code == appEventData.response_status_code && this.item_index == appEventData.item_index && Intrinsics.areEqual(this.message_title, appEventData.message_title) && Intrinsics.areEqual(this.message_body, appEventData.message_body) && Intrinsics.areEqual(this.masked_referrer, appEventData.masked_referrer) && Intrinsics.areEqual(this.masked_email_address, appEventData.masked_email_address) && Intrinsics.areEqual(this.masked_recipient, appEventData.masked_recipient);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.screen_name.hashCode()) * 37) + Integer.hashCode(this.screen_depth)) * 37) + this.screen_description.hashCode()) * 37) + Integer.hashCode(this.time_spent)) * 37) + this.transition_reason.hashCode()) * 37) + this.type.hashCode()) * 37) + this.message_type.hashCode()) * 37) + this.message_uuid.hashCode()) * 37) + this.entity_id.hashCode()) * 37) + this.source.hashCode()) * 37) + this.source_screen_name.hashCode()) * 37) + this.message.hashCode()) * 37) + Integer.hashCode(this.number_of_notifications)) * 37) + this.field_name.hashCode()) * 37) + this.user_input.hashCode()) * 37) + this.tab_group_name.hashCode()) * 37) + this.tab_name.hashCode()) * 37) + this.tag.hashCode()) * 37;
        AppEventDataAdditionalInfo appEventDataAdditionalInfo = this.additional_info;
        int iHashCode2 = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (appEventDataAdditionalInfo != null ? appEventDataAdditionalInfo.hashCode() : 0)) * 37) + this.button_group_title.hashCode()) * 37) + this.button_title.hashCode()) * 37) + this.button_description.hashCode()) * 37) + this.entity_type.hashCode()) * 37) + this.referrer.hashCode()) * 37) + this.root_url.hashCode()) * 37) + this.email_address.hashCode()) * 37) + this.email_category.hashCode()) * 37) + this.test_version.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.user_agent.hashCode()) * 37) + this.action_name.hashCode()) * 37) + this.url.hashCode()) * 37) + this.page.hashCode()) * 37) + this.section.hashCode()) * 37) + this.component.hashCode()) * 37) + this.element.hashCode()) * 37) + this.name.hashCode()) * 37) + this.url_params.hashCode()) * 37) + this.performance_data.hashCode()) * 37) + this.recipient.hashCode()) * 37) + this.sender.hashCode()) * 37) + this.event_name.hashCode()) * 37) + this.error_code.hashCode()) * 37) + this.error_message.hashCode()) * 37) + this.error_type.hashCode()) * 37) + this.display_message.hashCode()) * 37) + this.exit_status.hashCode()) * 37) + this.institution_id.hashCode()) * 37) + this.institution_name.hashCode()) * 37) + this.institution_search_query.hashCode()) * 37) + this.link_session_id.hashCode()) * 37) + this.mfa_type.hashCode()) * 37) + this.request_id.hashCode()) * 37) + this.plaid_timestamp.hashCode()) * 37) + this.view_name.hashCode()) * 37) + this.status.hashCode()) * 37) + this.accounts.hashCode()) * 37) + this.transfer_id.hashCode()) * 37) + this.relationship_id.hashCode()) * 37) + Integer.hashCode(this.duration)) * 37) + this.target_screen_name.hashCode()) * 37) + Double.hashCode(this.clp_value)) * 37) + Double.hashCode(this.lcp_value)) * 37) + Double.hashCode(this.etr_value)) * 37) + this.description.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.direction.hashCode()) * 37) + Double.hashCode(this.fid_value)) * 37) + this.source_tag.hashCode()) * 37) + this.item.hashCode()) * 37) + Integer.hashCode(this.time)) * 37) + this.event_type.hashCode()) * 37) + this.asset_class.hashCode()) * 37) + this.payload.hashCode()) * 37) + Double.hashCode(this.milliseconds)) * 37) + this.po_box.hashCode()) * 37) + Double.hashCode(this.inp_value)) * 37) + this.debug_target.hashCode()) * 37) + Double.hashCode(this.loading_navigation_value)) * 37) + Double.hashCode(this.loading_navigation_largest_request_duration)) * 37) + this.loading_navigation_largest_request_url.hashCode()) * 37) + Integer.hashCode(this.loading_navigation_num_requests)) * 37) + this.recommendation_id.hashCode()) * 37) + this.invest_flow_schedule_id.hashCode()) * 37) + this.invest_flow_order_id.hashCode()) * 37) + Double.hashCode(this.request_duration)) * 37) + this.request_url.hashCode()) * 37) + Integer.hashCode(this.response_status_code)) * 37) + Integer.hashCode(this.item_index)) * 37) + this.message_title.hashCode()) * 37) + this.message_body.hashCode()) * 37) + this.masked_referrer.hashCode()) * 37) + this.masked_email_address.hashCode()) * 37) + this.masked_recipient.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen_name=" + Internal.sanitize(this.screen_name));
        arrayList.add("screen_depth=" + this.screen_depth);
        arrayList.add("screen_description=" + Internal.sanitize(this.screen_description));
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("transition_reason=" + Internal.sanitize(this.transition_reason));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("message_type=" + Internal.sanitize(this.message_type));
        arrayList.add("message_uuid=" + Internal.sanitize(this.message_uuid));
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("source_screen_name=" + Internal.sanitize(this.source_screen_name));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("number_of_notifications=" + this.number_of_notifications);
        arrayList.add("field_name=" + Internal.sanitize(this.field_name));
        arrayList.add("user_input=" + Internal.sanitize(this.user_input));
        arrayList.add("tab_group_name=" + Internal.sanitize(this.tab_group_name));
        arrayList.add("tab_name=" + Internal.sanitize(this.tab_name));
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        AppEventDataAdditionalInfo appEventDataAdditionalInfo = this.additional_info;
        if (appEventDataAdditionalInfo != null) {
            arrayList.add("additional_info=" + appEventDataAdditionalInfo);
        }
        arrayList.add("button_group_title=" + Internal.sanitize(this.button_group_title));
        arrayList.add("button_title=" + Internal.sanitize(this.button_title));
        arrayList.add("button_description=" + Internal.sanitize(this.button_description));
        arrayList.add("entity_type=" + Internal.sanitize(this.entity_type));
        arrayList.add("referrer=" + Internal.sanitize(this.referrer));
        arrayList.add("root_url=" + Internal.sanitize(this.root_url));
        arrayList.add("email_address=" + Internal.sanitize(this.email_address));
        arrayList.add("email_category=" + Internal.sanitize(this.email_category));
        arrayList.add("test_version=" + Internal.sanitize(this.test_version));
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        arrayList.add("action_name=" + Internal.sanitize(this.action_name));
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("page=" + Internal.sanitize(this.page));
        arrayList.add("section=" + Internal.sanitize(this.section));
        arrayList.add("component=" + Internal.sanitize(this.component));
        arrayList.add("element=" + Internal.sanitize(this.element));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("url_params=" + Internal.sanitize(this.url_params));
        arrayList.add("performance_data=" + Internal.sanitize(this.performance_data));
        arrayList.add("recipient=" + Internal.sanitize(this.recipient));
        arrayList.add("sender=" + Internal.sanitize(this.sender));
        arrayList.add("event_name=" + Internal.sanitize(this.event_name));
        arrayList.add("error_code=" + Internal.sanitize(this.error_code));
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        arrayList.add("error_type=" + Internal.sanitize(this.error_type));
        arrayList.add("display_message=" + Internal.sanitize(this.display_message));
        arrayList.add("exit_status=" + Internal.sanitize(this.exit_status));
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        arrayList.add("institution_name=" + Internal.sanitize(this.institution_name));
        arrayList.add("institution_search_query=" + Internal.sanitize(this.institution_search_query));
        arrayList.add("link_session_id=" + Internal.sanitize(this.link_session_id));
        arrayList.add("mfa_type=" + Internal.sanitize(this.mfa_type));
        arrayList.add("request_id=" + Internal.sanitize(this.request_id));
        arrayList.add("plaid_timestamp=" + Internal.sanitize(this.plaid_timestamp));
        arrayList.add("view_name=" + Internal.sanitize(this.view_name));
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("accounts=" + Internal.sanitize(this.accounts));
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("relationship_id=" + Internal.sanitize(this.relationship_id));
        arrayList.add("duration=" + this.duration);
        arrayList.add("target_screen_name=" + Internal.sanitize(this.target_screen_name));
        arrayList.add("clp_value=" + this.clp_value);
        arrayList.add("lcp_value=" + this.lcp_value);
        arrayList.add("etr_value=" + this.etr_value);
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("direction=" + Internal.sanitize(this.direction));
        arrayList.add("fid_value=" + this.fid_value);
        arrayList.add("source_tag=" + Internal.sanitize(this.source_tag));
        arrayList.add("item=" + Internal.sanitize(this.item));
        arrayList.add("time=" + this.time);
        arrayList.add("event_type=" + Internal.sanitize(this.event_type));
        arrayList.add("asset_class=" + Internal.sanitize(this.asset_class));
        arrayList.add("payload=" + Internal.sanitize(this.payload));
        arrayList.add("milliseconds=" + this.milliseconds);
        arrayList.add("po_box=" + Internal.sanitize(this.po_box));
        arrayList.add("inp_value=" + this.inp_value);
        arrayList.add("debug_target=" + Internal.sanitize(this.debug_target));
        arrayList.add("loading_navigation_value=" + this.loading_navigation_value);
        arrayList.add("loading_navigation_largest_request_duration=" + this.loading_navigation_largest_request_duration);
        arrayList.add("loading_navigation_largest_request_url=" + Internal.sanitize(this.loading_navigation_largest_request_url));
        arrayList.add("loading_navigation_num_requests=" + this.loading_navigation_num_requests);
        arrayList.add("recommendation_id=" + Internal.sanitize(this.recommendation_id));
        arrayList.add("invest_flow_schedule_id=" + Internal.sanitize(this.invest_flow_schedule_id));
        arrayList.add("invest_flow_order_id=" + Internal.sanitize(this.invest_flow_order_id));
        arrayList.add("request_duration=" + this.request_duration);
        arrayList.add("request_url=" + Internal.sanitize(this.request_url));
        arrayList.add("response_status_code=" + this.response_status_code);
        arrayList.add("item_index=" + this.item_index);
        arrayList.add("message_title=" + Internal.sanitize(this.message_title));
        arrayList.add("message_body=" + Internal.sanitize(this.message_body));
        arrayList.add("masked_referrer=" + Internal.sanitize(this.masked_referrer));
        arrayList.add("masked_email_address=" + Internal.sanitize(this.masked_email_address));
        arrayList.add("masked_recipient=" + Internal.sanitize(this.masked_recipient));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AppEventData copy$default(AppEventData appEventData, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfo appEventDataAdditionalInfo, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, ByteString byteString, int i9, int i10, int i11, Object obj) {
        String str78 = (i9 & 1) != 0 ? appEventData.screen_name : str;
        int i12 = (i9 & 2) != 0 ? appEventData.screen_depth : i;
        String str79 = (i9 & 4) != 0 ? appEventData.screen_description : str2;
        int i13 = (i9 & 8) != 0 ? appEventData.time_spent : i2;
        String str80 = (i9 & 16) != 0 ? appEventData.transition_reason : str3;
        String str81 = (i9 & 32) != 0 ? appEventData.type : str4;
        String str82 = (i9 & 64) != 0 ? appEventData.message_type : str5;
        String str83 = (i9 & 128) != 0 ? appEventData.message_uuid : str6;
        String str84 = (i9 & 256) != 0 ? appEventData.entity_id : str7;
        String str85 = (i9 & 512) != 0 ? appEventData.source : str8;
        String str86 = (i9 & 1024) != 0 ? appEventData.source_screen_name : str9;
        String str87 = (i9 & 2048) != 0 ? appEventData.message : str10;
        String str88 = str78;
        int i14 = (i9 & 4096) != 0 ? appEventData.number_of_notifications : i3;
        String str89 = (i9 & 8192) != 0 ? appEventData.field_name : str11;
        String str90 = (i9 & 16384) != 0 ? appEventData.user_input : str12;
        String str91 = (i9 & 32768) != 0 ? appEventData.tab_group_name : str13;
        String str92 = (i9 & 65536) != 0 ? appEventData.tab_name : str14;
        String str93 = (i9 & 131072) != 0 ? appEventData.tag : str15;
        AppEventDataAdditionalInfo appEventDataAdditionalInfo2 = (i9 & 262144) != 0 ? appEventData.additional_info : appEventDataAdditionalInfo;
        String str94 = (i9 & 524288) != 0 ? appEventData.button_group_title : str16;
        String str95 = (i9 & 1048576) != 0 ? appEventData.button_title : str17;
        String str96 = (i9 & 2097152) != 0 ? appEventData.button_description : str18;
        String str97 = (i9 & 4194304) != 0 ? appEventData.entity_type : str19;
        String str98 = (i9 & 8388608) != 0 ? appEventData.referrer : str20;
        String str99 = (i9 & 16777216) != 0 ? appEventData.root_url : str21;
        String str100 = (i9 & 33554432) != 0 ? appEventData.email_address : str22;
        String str101 = (i9 & 67108864) != 0 ? appEventData.email_category : str23;
        String str102 = (i9 & 134217728) != 0 ? appEventData.test_version : str24;
        String str103 = (i9 & 268435456) != 0 ? appEventData.uuid : str25;
        String str104 = (i9 & 536870912) != 0 ? appEventData.user_agent : str26;
        String str105 = (i9 & 1073741824) != 0 ? appEventData.action_name : str27;
        String str106 = (i9 & Integer.MIN_VALUE) != 0 ? appEventData.url : str28;
        String str107 = (i10 & 1) != 0 ? appEventData.page : str29;
        String str108 = (i10 & 2) != 0 ? appEventData.section : str30;
        String str109 = (i10 & 4) != 0 ? appEventData.component : str31;
        String str110 = (i10 & 8) != 0 ? appEventData.element : str32;
        String str111 = (i10 & 16) != 0 ? appEventData.name : str33;
        String str112 = (i10 & 32) != 0 ? appEventData.url_params : str34;
        String str113 = (i10 & 64) != 0 ? appEventData.performance_data : str35;
        String str114 = (i10 & 128) != 0 ? appEventData.recipient : str36;
        String str115 = (i10 & 256) != 0 ? appEventData.sender : str37;
        String str116 = (i10 & 512) != 0 ? appEventData.event_name : str38;
        String str117 = (i10 & 1024) != 0 ? appEventData.error_code : str39;
        String str118 = (i10 & 2048) != 0 ? appEventData.error_message : str40;
        String str119 = (i10 & 4096) != 0 ? appEventData.error_type : str41;
        String str120 = (i10 & 8192) != 0 ? appEventData.display_message : str42;
        String str121 = (i10 & 16384) != 0 ? appEventData.exit_status : str43;
        String str122 = (i10 & 32768) != 0 ? appEventData.institution_id : str44;
        String str123 = (i10 & 65536) != 0 ? appEventData.institution_name : str45;
        String str124 = (i10 & 131072) != 0 ? appEventData.institution_search_query : str46;
        String str125 = (i10 & 262144) != 0 ? appEventData.link_session_id : str47;
        String str126 = (i10 & 524288) != 0 ? appEventData.mfa_type : str48;
        String str127 = (i10 & 1048576) != 0 ? appEventData.request_id : str49;
        String str128 = (i10 & 2097152) != 0 ? appEventData.plaid_timestamp : str50;
        String str129 = (i10 & 4194304) != 0 ? appEventData.view_name : str51;
        String str130 = (i10 & 8388608) != 0 ? appEventData.status : str52;
        String str131 = (i10 & 16777216) != 0 ? appEventData.accounts : str53;
        String str132 = (i10 & 33554432) != 0 ? appEventData.transfer_id : str54;
        String str133 = (i10 & 67108864) != 0 ? appEventData.relationship_id : str55;
        int i15 = (i10 & 134217728) != 0 ? appEventData.duration : i4;
        String str134 = (i10 & 268435456) != 0 ? appEventData.target_screen_name : str56;
        double d10 = (i10 & 536870912) != 0 ? appEventData.clp_value : d;
        double d11 = (i10 & 1073741824) != 0 ? appEventData.lcp_value : d2;
        double d12 = (i10 & Integer.MIN_VALUE) != 0 ? appEventData.etr_value : d3;
        String str135 = (i11 & 1) != 0 ? appEventData.description : str57;
        String str136 = (i11 & 2) != 0 ? appEventData.instrument_id : str58;
        String str137 = str135;
        String str138 = (i11 & 4) != 0 ? appEventData.symbol : str59;
        String str139 = (i11 & 8) != 0 ? appEventData.direction : str60;
        String str140 = str136;
        double d13 = (i11 & 16) != 0 ? appEventData.fid_value : d4;
        String str141 = (i11 & 32) != 0 ? appEventData.source_tag : str61;
        String str142 = (i11 & 64) != 0 ? appEventData.item : str62;
        String str143 = str141;
        int i16 = (i11 & 128) != 0 ? appEventData.time : i5;
        String str144 = (i11 & 256) != 0 ? appEventData.event_type : str63;
        String str145 = (i11 & 512) != 0 ? appEventData.asset_class : str64;
        String str146 = (i11 & 1024) != 0 ? appEventData.payload : str65;
        String str147 = str142;
        double d14 = (i11 & 2048) != 0 ? appEventData.milliseconds : d5;
        String str148 = (i11 & 4096) != 0 ? appEventData.po_box : str66;
        double d15 = (i11 & 8192) != 0 ? appEventData.inp_value : d6;
        String str149 = (i11 & 16384) != 0 ? appEventData.debug_target : str67;
        double d16 = (i11 & 32768) != 0 ? appEventData.loading_navigation_value : d7;
        double d17 = (i11 & 65536) != 0 ? appEventData.loading_navigation_largest_request_duration : d8;
        String str150 = (i11 & 131072) != 0 ? appEventData.loading_navigation_largest_request_url : str68;
        int i17 = (i11 & 262144) != 0 ? appEventData.loading_navigation_num_requests : i6;
        return appEventData.copy(str88, i12, str79, i13, str80, str81, str82, str83, str84, str85, str86, str87, i14, str89, str90, str91, str92, str93, appEventDataAdditionalInfo2, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, i15, str134, d10, d11, d12, str137, str140, str138, str139, d13, str143, str147, i16, str144, str145, str146, d14, str148, d15, str149, d16, d17, str150, i17, (i11 & 524288) != 0 ? appEventData.recommendation_id : str69, (i11 & 1048576) != 0 ? appEventData.invest_flow_schedule_id : str70, (i11 & 2097152) != 0 ? appEventData.invest_flow_order_id : str71, (i11 & 4194304) != 0 ? appEventData.request_duration : d9, (i11 & 8388608) != 0 ? appEventData.request_url : str72, (16777216 & i11) != 0 ? appEventData.response_status_code : i7, (i11 & 33554432) != 0 ? appEventData.item_index : i8, (i11 & 67108864) != 0 ? appEventData.message_title : str73, (i11 & 134217728) != 0 ? appEventData.message_body : str74, (i11 & 268435456) != 0 ? appEventData.masked_referrer : str75, (i11 & 536870912) != 0 ? appEventData.masked_email_address : str76, (i11 & 1073741824) != 0 ? appEventData.masked_recipient : str77, (i11 & Integer.MIN_VALUE) != 0 ? appEventData.unknownFields() : byteString);
    }

    public final AppEventData copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int number_of_notifications, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfo additional_info, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int duration, String target_screen_name, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, double fid_value, String source_tag, String item, int time, String event_type, String asset_class, String payload, double milliseconds, String po_box, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double request_duration, String request_url, int response_status_code, int item_index, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(user_input, "user_input");
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url_params, "url_params");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AppEventData(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, number_of_notifications, field_name, user_input, tab_group_name, tab_name, tag, additional_info, button_group_title, button_title, button_description, entity_type, referrer, root_url, email_address, email_category, test_version, uuid, user_agent, action_name, url, page, section, component, element, name, url_params, performance_data, recipient, sender, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, transfer_id, relationship_id, duration, target_screen_name, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, fid_value, source_tag, item, time, event_type, asset_class, payload, milliseconds, po_box, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, recommendation_id, invest_flow_schedule_id, invest_flow_order_id, request_duration, request_url, response_status_code, item_index, message_title, message_body, masked_referrer, masked_email_address, masked_recipient, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AppEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AppEventData$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AppEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String str = "";
                String str2 = str;
                String str3 = str2;
                String str4 = str3;
                String str5 = str4;
                String str6 = str5;
                String str7 = str6;
                String str8 = str7;
                String str9 = str8;
                String str10 = str9;
                String str11 = str10;
                String str12 = str11;
                String str13 = str12;
                String str14 = str13;
                String str15 = str14;
                String str16 = str15;
                String str17 = str16;
                String str18 = str17;
                String str19 = str18;
                String str20 = str19;
                String str21 = str20;
                String str22 = str21;
                String str23 = str22;
                String str24 = str23;
                String str25 = str24;
                String str26 = str25;
                String str27 = str26;
                String str28 = str27;
                String str29 = str28;
                String str30 = str29;
                String str31 = str30;
                String str32 = str31;
                String str33 = str32;
                String str34 = str33;
                String str35 = str34;
                String str36 = str35;
                String str37 = str36;
                String str38 = str37;
                String str39 = str38;
                String str40 = str39;
                String str41 = str40;
                String str42 = str41;
                String str43 = str42;
                String str44 = str43;
                String str45 = str44;
                String str46 = str45;
                String str47 = str46;
                String str48 = str47;
                String str49 = str48;
                String str50 = str49;
                String str51 = str50;
                String str52 = str51;
                String str53 = str52;
                String str54 = str53;
                String str55 = str54;
                String str56 = str55;
                String str57 = str56;
                String str58 = str57;
                String str59 = str58;
                String str60 = str59;
                String str61 = str60;
                String str62 = str61;
                String str63 = str62;
                String str64 = str63;
                String str65 = str64;
                String str66 = str65;
                String str67 = str66;
                String str68 = str67;
                String str69 = str68;
                String str70 = str69;
                String str71 = str70;
                String str72 = str71;
                String str73 = str72;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                AppEventDataAdditionalInfo appEventDataAdditionalInfo = null;
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                double d7 = 0.0d;
                double d8 = 0.0d;
                double d9 = 0.0d;
                String str74 = str73;
                String str75 = str74;
                String str76 = str75;
                String str77 = str76;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str78 = str74;
                    if (iNextTag == -1) {
                        return new AppEventData(str73, i, str78, i2, str75, str76, str77, str, str2, str3, str4, str5, i3, str6, str7, str8, str9, str10, appEventDataAdditionalInfo, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, i4, str51, d, d2, d3, str52, str53, str54, str55, d4, str56, str57, i5, str58, str59, str60, d5, str61, d6, str62, d7, d8, str63, i6, str64, str65, str66, d9, str67, i7, i8, str68, str69, str70, str71, str72, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1024) {
                        String strDecode = ProtoAdapter.STRING.decode(reader);
                        Unit unit = Unit.INSTANCE;
                        str70 = strDecode;
                    } else if (iNextTag == 1026) {
                        String strDecode2 = ProtoAdapter.STRING.decode(reader);
                        Unit unit2 = Unit.INSTANCE;
                        str71 = strDecode2;
                    } else if (iNextTag != 1040) {
                        switch (iNextTag) {
                            case 1:
                                String strDecode3 = ProtoAdapter.STRING.decode(reader);
                                Unit unit3 = Unit.INSTANCE;
                                str73 = strDecode3;
                                break;
                            case 2:
                                int iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit4 = Unit.INSTANCE;
                                i = iIntValue;
                                break;
                            case 3:
                                String strDecode4 = ProtoAdapter.STRING.decode(reader);
                                Unit unit5 = Unit.INSTANCE;
                                str74 = strDecode4;
                                continue;
                            case 4:
                                int iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit6 = Unit.INSTANCE;
                                i2 = iIntValue2;
                                break;
                            case 5:
                                String strDecode5 = ProtoAdapter.STRING.decode(reader);
                                Unit unit7 = Unit.INSTANCE;
                                str75 = strDecode5;
                                break;
                            case 6:
                                String strDecode6 = ProtoAdapter.STRING.decode(reader);
                                Unit unit8 = Unit.INSTANCE;
                                str76 = strDecode6;
                                break;
                            case 7:
                                String strDecode7 = ProtoAdapter.STRING.decode(reader);
                                Unit unit9 = Unit.INSTANCE;
                                str77 = strDecode7;
                                break;
                            case 8:
                                String strDecode8 = ProtoAdapter.STRING.decode(reader);
                                Unit unit10 = Unit.INSTANCE;
                                str = strDecode8;
                                break;
                            case 9:
                                String strDecode9 = ProtoAdapter.STRING.decode(reader);
                                Unit unit11 = Unit.INSTANCE;
                                str2 = strDecode9;
                                break;
                            case 10:
                                String strDecode10 = ProtoAdapter.STRING.decode(reader);
                                Unit unit12 = Unit.INSTANCE;
                                str3 = strDecode10;
                                break;
                            case 11:
                                String strDecode11 = ProtoAdapter.STRING.decode(reader);
                                Unit unit13 = Unit.INSTANCE;
                                str4 = strDecode11;
                                break;
                            case 12:
                                String strDecode12 = ProtoAdapter.STRING.decode(reader);
                                Unit unit14 = Unit.INSTANCE;
                                str5 = strDecode12;
                                break;
                            case 13:
                                int iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit15 = Unit.INSTANCE;
                                i3 = iIntValue3;
                                break;
                            case 14:
                                String strDecode13 = ProtoAdapter.STRING.decode(reader);
                                Unit unit16 = Unit.INSTANCE;
                                str6 = strDecode13;
                                break;
                            case 15:
                                String strDecode14 = ProtoAdapter.STRING.decode(reader);
                                Unit unit17 = Unit.INSTANCE;
                                str7 = strDecode14;
                                break;
                            case 16:
                                String strDecode15 = ProtoAdapter.STRING.decode(reader);
                                Unit unit18 = Unit.INSTANCE;
                                str8 = strDecode15;
                                break;
                            case 17:
                                String strDecode16 = ProtoAdapter.STRING.decode(reader);
                                Unit unit19 = Unit.INSTANCE;
                                str9 = strDecode16;
                                break;
                            case 18:
                                String strDecode17 = ProtoAdapter.STRING.decode(reader);
                                Unit unit20 = Unit.INSTANCE;
                                str10 = strDecode17;
                                break;
                            case 19:
                                AppEventDataAdditionalInfo appEventDataAdditionalInfoDecode = AppEventDataAdditionalInfo.ADAPTER.decode(reader);
                                Unit unit21 = Unit.INSTANCE;
                                appEventDataAdditionalInfo = appEventDataAdditionalInfoDecode;
                                break;
                            case 20:
                                String strDecode18 = ProtoAdapter.STRING.decode(reader);
                                Unit unit22 = Unit.INSTANCE;
                                str11 = strDecode18;
                                break;
                            case 21:
                                String strDecode19 = ProtoAdapter.STRING.decode(reader);
                                Unit unit23 = Unit.INSTANCE;
                                str12 = strDecode19;
                                break;
                            case 22:
                                String strDecode20 = ProtoAdapter.STRING.decode(reader);
                                Unit unit24 = Unit.INSTANCE;
                                str13 = strDecode20;
                                break;
                            case 23:
                                String strDecode21 = ProtoAdapter.STRING.decode(reader);
                                Unit unit25 = Unit.INSTANCE;
                                str14 = strDecode21;
                                break;
                            case 24:
                                String strDecode22 = ProtoAdapter.STRING.decode(reader);
                                Unit unit26 = Unit.INSTANCE;
                                str15 = strDecode22;
                                break;
                            case 25:
                                String strDecode23 = ProtoAdapter.STRING.decode(reader);
                                Unit unit27 = Unit.INSTANCE;
                                str16 = strDecode23;
                                break;
                            case 26:
                                String strDecode24 = ProtoAdapter.STRING.decode(reader);
                                Unit unit28 = Unit.INSTANCE;
                                str17 = strDecode24;
                                break;
                            case 27:
                                String strDecode25 = ProtoAdapter.STRING.decode(reader);
                                Unit unit29 = Unit.INSTANCE;
                                str18 = strDecode25;
                                break;
                            case 28:
                                String strDecode26 = ProtoAdapter.STRING.decode(reader);
                                Unit unit30 = Unit.INSTANCE;
                                str19 = strDecode26;
                                break;
                            case 29:
                                String strDecode27 = ProtoAdapter.STRING.decode(reader);
                                Unit unit31 = Unit.INSTANCE;
                                str20 = strDecode27;
                                break;
                            case 30:
                                String strDecode28 = ProtoAdapter.STRING.decode(reader);
                                Unit unit32 = Unit.INSTANCE;
                                str21 = strDecode28;
                                break;
                            case 31:
                                String strDecode29 = ProtoAdapter.STRING.decode(reader);
                                Unit unit33 = Unit.INSTANCE;
                                str22 = strDecode29;
                                break;
                            case 32:
                                String strDecode30 = ProtoAdapter.STRING.decode(reader);
                                Unit unit34 = Unit.INSTANCE;
                                str23 = strDecode30;
                                break;
                            case 33:
                                String strDecode31 = ProtoAdapter.STRING.decode(reader);
                                Unit unit35 = Unit.INSTANCE;
                                str24 = strDecode31;
                                break;
                            case 34:
                                String strDecode32 = ProtoAdapter.STRING.decode(reader);
                                Unit unit36 = Unit.INSTANCE;
                                str25 = strDecode32;
                                break;
                            case 35:
                                String strDecode33 = ProtoAdapter.STRING.decode(reader);
                                Unit unit37 = Unit.INSTANCE;
                                str26 = strDecode33;
                                break;
                            case 36:
                                String strDecode34 = ProtoAdapter.STRING.decode(reader);
                                Unit unit38 = Unit.INSTANCE;
                                str27 = strDecode34;
                                break;
                            case 37:
                                String strDecode35 = ProtoAdapter.STRING.decode(reader);
                                Unit unit39 = Unit.INSTANCE;
                                str28 = strDecode35;
                                break;
                            case 38:
                                String strDecode36 = ProtoAdapter.STRING.decode(reader);
                                Unit unit40 = Unit.INSTANCE;
                                str29 = strDecode36;
                                break;
                            case 39:
                                String strDecode37 = ProtoAdapter.STRING.decode(reader);
                                Unit unit41 = Unit.INSTANCE;
                                str30 = strDecode37;
                                break;
                            case 40:
                                String strDecode38 = ProtoAdapter.STRING.decode(reader);
                                Unit unit42 = Unit.INSTANCE;
                                str31 = strDecode38;
                                break;
                            case 41:
                                String strDecode39 = ProtoAdapter.STRING.decode(reader);
                                Unit unit43 = Unit.INSTANCE;
                                str32 = strDecode39;
                                break;
                            case 42:
                                String strDecode40 = ProtoAdapter.STRING.decode(reader);
                                Unit unit44 = Unit.INSTANCE;
                                str33 = strDecode40;
                                break;
                            case 43:
                                String strDecode41 = ProtoAdapter.STRING.decode(reader);
                                Unit unit45 = Unit.INSTANCE;
                                str34 = strDecode41;
                                break;
                            case 44:
                                String strDecode42 = ProtoAdapter.STRING.decode(reader);
                                Unit unit46 = Unit.INSTANCE;
                                str35 = strDecode42;
                                break;
                            case 45:
                                String strDecode43 = ProtoAdapter.STRING.decode(reader);
                                Unit unit47 = Unit.INSTANCE;
                                str36 = strDecode43;
                                break;
                            case 46:
                                String strDecode44 = ProtoAdapter.STRING.decode(reader);
                                Unit unit48 = Unit.INSTANCE;
                                str37 = strDecode44;
                                break;
                            case 47:
                                String strDecode45 = ProtoAdapter.STRING.decode(reader);
                                Unit unit49 = Unit.INSTANCE;
                                str38 = strDecode45;
                                break;
                            case 48:
                                String strDecode46 = ProtoAdapter.STRING.decode(reader);
                                Unit unit50 = Unit.INSTANCE;
                                str39 = strDecode46;
                                break;
                            case 49:
                                String strDecode47 = ProtoAdapter.STRING.decode(reader);
                                Unit unit51 = Unit.INSTANCE;
                                str40 = strDecode47;
                                break;
                            case 50:
                                String strDecode48 = ProtoAdapter.STRING.decode(reader);
                                Unit unit52 = Unit.INSTANCE;
                                str41 = strDecode48;
                                break;
                            case 51:
                                String strDecode49 = ProtoAdapter.STRING.decode(reader);
                                Unit unit53 = Unit.INSTANCE;
                                str42 = strDecode49;
                                break;
                            case 52:
                                String strDecode50 = ProtoAdapter.STRING.decode(reader);
                                Unit unit54 = Unit.INSTANCE;
                                str43 = strDecode50;
                                break;
                            case 53:
                                String strDecode51 = ProtoAdapter.STRING.decode(reader);
                                Unit unit55 = Unit.INSTANCE;
                                str44 = strDecode51;
                                break;
                            case 54:
                                String strDecode52 = ProtoAdapter.STRING.decode(reader);
                                Unit unit56 = Unit.INSTANCE;
                                str45 = strDecode52;
                                break;
                            case 55:
                                String strDecode53 = ProtoAdapter.STRING.decode(reader);
                                Unit unit57 = Unit.INSTANCE;
                                str46 = strDecode53;
                                break;
                            case 56:
                                String strDecode54 = ProtoAdapter.STRING.decode(reader);
                                Unit unit58 = Unit.INSTANCE;
                                str47 = strDecode54;
                                break;
                            case 57:
                                String strDecode55 = ProtoAdapter.STRING.decode(reader);
                                Unit unit59 = Unit.INSTANCE;
                                str48 = strDecode55;
                                break;
                            case 58:
                                String strDecode56 = ProtoAdapter.STRING.decode(reader);
                                Unit unit60 = Unit.INSTANCE;
                                str49 = strDecode56;
                                break;
                            case 59:
                                String strDecode57 = ProtoAdapter.STRING.decode(reader);
                                Unit unit61 = Unit.INSTANCE;
                                str50 = strDecode57;
                                break;
                            case 60:
                                int iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                                Unit unit62 = Unit.INSTANCE;
                                i4 = iIntValue4;
                                break;
                            case 61:
                                String strDecode58 = ProtoAdapter.STRING.decode(reader);
                                Unit unit63 = Unit.INSTANCE;
                                str51 = strDecode58;
                                break;
                            case 62:
                                double dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit64 = Unit.INSTANCE;
                                d = dDoubleValue;
                                break;
                            case 63:
                                double dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit65 = Unit.INSTANCE;
                                d2 = dDoubleValue2;
                                break;
                            case 64:
                                double dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit66 = Unit.INSTANCE;
                                d3 = dDoubleValue3;
                                break;
                            case 65:
                                String strDecode59 = ProtoAdapter.STRING.decode(reader);
                                Unit unit67 = Unit.INSTANCE;
                                str52 = strDecode59;
                                break;
                            case 66:
                                String strDecode60 = ProtoAdapter.STRING.decode(reader);
                                Unit unit68 = Unit.INSTANCE;
                                str53 = strDecode60;
                                break;
                            case 67:
                                String strDecode61 = ProtoAdapter.STRING.decode(reader);
                                Unit unit69 = Unit.INSTANCE;
                                str54 = strDecode61;
                                break;
                            case SDK_ASSET_ICON_HOME_VALUE:
                                String strDecode62 = ProtoAdapter.STRING.decode(reader);
                                Unit unit70 = Unit.INSTANCE;
                                str55 = strDecode62;
                                break;
                            case 69:
                                double dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit71 = Unit.INSTANCE;
                                d4 = dDoubleValue4;
                                break;
                            case 70:
                                String strDecode63 = ProtoAdapter.STRING.decode(reader);
                                Unit unit72 = Unit.INSTANCE;
                                str56 = strDecode63;
                                break;
                            case SDK_ASSET_ICON_GUIDE_VALUE:
                                String strDecode64 = ProtoAdapter.STRING.decode(reader);
                                Unit unit73 = Unit.INSTANCE;
                                str57 = strDecode64;
                                break;
                            case SDK_ASSET_ICON_GLOBE_VALUE:
                                int iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit74 = Unit.INSTANCE;
                                i5 = iIntValue5;
                                break;
                            case 73:
                                String strDecode65 = ProtoAdapter.STRING.decode(reader);
                                Unit unit75 = Unit.INSTANCE;
                                str58 = strDecode65;
                                break;
                            case 74:
                                String strDecode66 = ProtoAdapter.STRING.decode(reader);
                                Unit unit76 = Unit.INSTANCE;
                                str59 = strDecode66;
                                break;
                            case 75:
                                String strDecode67 = ProtoAdapter.STRING.decode(reader);
                                Unit unit77 = Unit.INSTANCE;
                                str60 = strDecode67;
                                break;
                            case 76:
                                double dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit78 = Unit.INSTANCE;
                                d5 = dDoubleValue5;
                                break;
                            case 77:
                                String strDecode68 = ProtoAdapter.STRING.decode(reader);
                                Unit unit79 = Unit.INSTANCE;
                                str61 = strDecode68;
                                break;
                            case 78:
                                double dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit80 = Unit.INSTANCE;
                                d6 = dDoubleValue6;
                                break;
                            case 79:
                                String strDecode69 = ProtoAdapter.STRING.decode(reader);
                                Unit unit81 = Unit.INSTANCE;
                                str62 = strDecode69;
                                break;
                            case 80:
                                double dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit82 = Unit.INSTANCE;
                                d7 = dDoubleValue7;
                                break;
                            case 81:
                                double dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit83 = Unit.INSTANCE;
                                d8 = dDoubleValue8;
                                break;
                            case 82:
                                String strDecode70 = ProtoAdapter.STRING.decode(reader);
                                Unit unit84 = Unit.INSTANCE;
                                str63 = strDecode70;
                                break;
                            case 83:
                                int iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit85 = Unit.INSTANCE;
                                i6 = iIntValue6;
                                break;
                            case 84:
                                String strDecode71 = ProtoAdapter.STRING.decode(reader);
                                Unit unit86 = Unit.INSTANCE;
                                str64 = strDecode71;
                                break;
                            case 85:
                                String strDecode72 = ProtoAdapter.STRING.decode(reader);
                                Unit unit87 = Unit.INSTANCE;
                                str65 = strDecode72;
                                break;
                            case 86:
                                String strDecode73 = ProtoAdapter.STRING.decode(reader);
                                Unit unit88 = Unit.INSTANCE;
                                str66 = strDecode73;
                                break;
                            case 87:
                                double dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                Unit unit89 = Unit.INSTANCE;
                                d9 = dDoubleValue9;
                                break;
                            case 88:
                                String strDecode74 = ProtoAdapter.STRING.decode(reader);
                                Unit unit90 = Unit.INSTANCE;
                                str67 = strDecode74;
                                break;
                            case 89:
                                int iIntValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit91 = Unit.INSTANCE;
                                i7 = iIntValue7;
                                break;
                            case 90:
                                int iIntValue8 = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit92 = Unit.INSTANCE;
                                i8 = iIntValue8;
                                break;
                            case 91:
                                String strDecode75 = ProtoAdapter.STRING.decode(reader);
                                Unit unit93 = Unit.INSTANCE;
                                str68 = strDecode75;
                                break;
                            case 92:
                                String strDecode76 = ProtoAdapter.STRING.decode(reader);
                                Unit unit94 = Unit.INSTANCE;
                                str69 = strDecode76;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                Unit unit95 = Unit.INSTANCE;
                                break;
                        }
                    } else {
                        String strDecode77 = ProtoAdapter.STRING.decode(reader);
                        Unit unit96 = Unit.INSTANCE;
                        str72 = strDecode77;
                    }
                    str74 = str78;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppEventData value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen_name());
                }
                if (value.getScreen_depth() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getScreen_depth()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreen_description());
                }
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTransition_reason());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getType());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getSource_screen_name());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getMessage());
                }
                if (value.getNumber_of_notifications() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getField_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getField_name());
                }
                if (!Intrinsics.areEqual(value.getUser_input(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getUser_input());
                }
                if (!Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getTab_group_name());
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getTab_name());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getTag());
                }
                if (value.getAdditional_info() != null) {
                    size += AppEventDataAdditionalInfo.ADAPTER.encodedSizeWithTag(19, value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getButton_group_title());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(23, value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getRoot_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(25, value.getRoot_url());
                }
                if (!Intrinsics.areEqual(value.getEmail_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(26, value.getEmail_address());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(27, value.getEmail_category());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(28, value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(29, value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(30, value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getAction_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(31, value.getAction_name());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(32, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(33, value.getPage());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(34, value.getSection());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(35, value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(36, value.getElement());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(37, value.getName());
                }
                if (!Intrinsics.areEqual(value.getUrl_params(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(38, value.getUrl_params());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(39, value.getPerformance_data());
                }
                if (!Intrinsics.areEqual(value.getRecipient(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(40, value.getRecipient());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(41, value.getSender());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(42, value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(43, value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(44, value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(45, value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(46, value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(47, value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(48, value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(49, value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(50, value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(51, value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(52, value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(53, value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(54, value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(55, value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(56, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(57, value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(58, value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(59, value.getRelationship_id());
                }
                if (value.getDuration() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(60, Integer.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getTarget_screen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(61, value.getTarget_screen_name());
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(62, Double.valueOf(value.getClp_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(63, Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(64, Double.valueOf(value.getEtr_value()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(65, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(66, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(67, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(68, value.getDirection());
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(69, Double.valueOf(value.getFid_value()));
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(70, value.getSource_tag());
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(71, value.getItem());
                }
                if (value.getTime() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(72, Integer.valueOf(value.getTime()));
                }
                if (!Intrinsics.areEqual(value.getEvent_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(73, value.getEvent_type());
                }
                if (!Intrinsics.areEqual(value.getAsset_class(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(74, value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getPayload(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(75, value.getPayload());
                }
                if (!Double.valueOf(value.getMilliseconds()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(76, Double.valueOf(value.getMilliseconds()));
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(77, value.getPo_box());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(78, Double.valueOf(value.getInp_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(79, value.getDebug_target());
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(80, Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(81, Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(82, value.getLoading_navigation_largest_request_url());
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(83, Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Intrinsics.areEqual(value.getRecommendation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(84, value.getRecommendation_id());
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_schedule_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(85, value.getInvest_flow_schedule_id());
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(86, value.getInvest_flow_order_id());
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(87, Double.valueOf(value.getRequest_duration()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(88, value.getRequest_url());
                }
                if (value.getResponse_status_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(89, Integer.valueOf(value.getResponse_status_code()));
                }
                if (value.getItem_index() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(90, Integer.valueOf(value.getItem_index()));
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(91, value.getMessage_title());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(92, value.getMessage_body());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1024, value.getMasked_referrer());
                }
                if (!Intrinsics.areEqual(value.getMasked_email_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1026, value.getMasked_email_address());
                }
                return !Intrinsics.areEqual(value.getMasked_recipient(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1040, value.getMasked_recipient()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppEventData value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_name());
                }
                if (value.getScreen_depth() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getScreen_depth()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_description());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTransition_reason());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource_screen_name());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getMessage());
                }
                if (value.getNumber_of_notifications() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getField_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getField_name());
                }
                if (!Intrinsics.areEqual(value.getUser_input(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getUser_input());
                }
                if (!Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getTab_group_name());
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getTab_name());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getTag());
                }
                if (value.getAdditional_info() != null) {
                    AppEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 19, (int) value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getButton_group_title());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 23, (int) value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getRoot_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getRoot_url());
                }
                if (!Intrinsics.areEqual(value.getEmail_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getEmail_address());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getEmail_category());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getAction_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getAction_name());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 33, (int) value.getPage());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 34, (int) value.getSection());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 35, (int) value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 36, (int) value.getElement());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 37, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getUrl_params(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 38, (int) value.getUrl_params());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 39, (int) value.getPerformance_data());
                }
                if (!Intrinsics.areEqual(value.getRecipient(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 40, (int) value.getRecipient());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 41, (int) value.getSender());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 42, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 43, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 44, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 45, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 46, (int) value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 47, (int) value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 48, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 49, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 50, (int) value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 51, (int) value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 52, (int) value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 53, (int) value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 54, (int) value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 55, (int) value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 56, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 57, (int) value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 58, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 59, (int) value.getRelationship_id());
                }
                if (value.getDuration() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 60, (int) Integer.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getTarget_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 61, (int) value.getTarget_screen_name());
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 62, (int) Double.valueOf(value.getClp_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 63, (int) Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 64, (int) Double.valueOf(value.getEtr_value()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 65, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 66, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 67, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 68, (int) value.getDirection());
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 69, (int) Double.valueOf(value.getFid_value()));
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 70, (int) value.getSource_tag());
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 71, (int) value.getItem());
                }
                if (value.getTime() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 72, (int) Integer.valueOf(value.getTime()));
                }
                if (!Intrinsics.areEqual(value.getEvent_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 73, (int) value.getEvent_type());
                }
                if (!Intrinsics.areEqual(value.getAsset_class(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 74, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getPayload(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 75, (int) value.getPayload());
                }
                if (!Double.valueOf(value.getMilliseconds()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 76, (int) Double.valueOf(value.getMilliseconds()));
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 77, (int) value.getPo_box());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 78, (int) Double.valueOf(value.getInp_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 79, (int) value.getDebug_target());
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 80, (int) Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 81, (int) Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 82, (int) value.getLoading_navigation_largest_request_url());
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 83, (int) Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Intrinsics.areEqual(value.getRecommendation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 84, (int) value.getRecommendation_id());
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_schedule_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 85, (int) value.getInvest_flow_schedule_id());
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 86, (int) value.getInvest_flow_order_id());
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 87, (int) Double.valueOf(value.getRequest_duration()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 88, (int) value.getRequest_url());
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 89, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (value.getItem_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 90, (int) Integer.valueOf(value.getItem_index()));
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 91, (int) value.getMessage_title());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 92, (int) value.getMessage_body());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1024, (int) value.getMasked_referrer());
                }
                if (!Intrinsics.areEqual(value.getMasked_email_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1026, (int) value.getMasked_email_address());
                }
                if (!Intrinsics.areEqual(value.getMasked_recipient(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1040, (int) value.getMasked_recipient());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppEventData value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_recipient(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1040, (int) value.getMasked_recipient());
                }
                if (!Intrinsics.areEqual(value.getMasked_email_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1026, (int) value.getMasked_email_address());
                }
                if (!Intrinsics.areEqual(value.getMasked_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1024, (int) value.getMasked_referrer());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 92, (int) value.getMessage_body());
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 91, (int) value.getMessage_title());
                }
                if (value.getItem_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 90, (int) Integer.valueOf(value.getItem_index()));
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 89, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 88, (int) value.getRequest_url());
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 87, (int) Double.valueOf(value.getRequest_duration()));
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 86, (int) value.getInvest_flow_order_id());
                }
                if (!Intrinsics.areEqual(value.getInvest_flow_schedule_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 85, (int) value.getInvest_flow_schedule_id());
                }
                if (!Intrinsics.areEqual(value.getRecommendation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 84, (int) value.getRecommendation_id());
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 83, (int) Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 82, (int) value.getLoading_navigation_largest_request_url());
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 81, (int) Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 80, (int) Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 79, (int) value.getDebug_target());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 78, (int) Double.valueOf(value.getInp_value()));
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 77, (int) value.getPo_box());
                }
                if (!Double.valueOf(value.getMilliseconds()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 76, (int) Double.valueOf(value.getMilliseconds()));
                }
                if (!Intrinsics.areEqual(value.getPayload(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 75, (int) value.getPayload());
                }
                if (!Intrinsics.areEqual(value.getAsset_class(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 74, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getEvent_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 73, (int) value.getEvent_type());
                }
                if (value.getTime() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 72, (int) Integer.valueOf(value.getTime()));
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 71, (int) value.getItem());
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 70, (int) value.getSource_tag());
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 69, (int) Double.valueOf(value.getFid_value()));
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 68, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 67, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 66, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 65, (int) value.getDescription());
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 64, (int) Double.valueOf(value.getEtr_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 63, (int) Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 62, (int) Double.valueOf(value.getClp_value()));
                }
                if (!Intrinsics.areEqual(value.getTarget_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 61, (int) value.getTarget_screen_name());
                }
                if (value.getDuration() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 60, (int) Integer.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getRelationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 59, (int) value.getRelationship_id());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 58, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 57, (int) value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 56, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 55, (int) value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 54, (int) value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 53, (int) value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 52, (int) value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 51, (int) value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 50, (int) value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 49, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 48, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 47, (int) value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 46, (int) value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 45, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 44, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 43, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 42, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 41, (int) value.getSender());
                }
                if (!Intrinsics.areEqual(value.getRecipient(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 40, (int) value.getRecipient());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 39, (int) value.getPerformance_data());
                }
                if (!Intrinsics.areEqual(value.getUrl_params(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 38, (int) value.getUrl_params());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 37, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 36, (int) value.getElement());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 35, (int) value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 34, (int) value.getSection());
                }
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 33, (int) value.getPage());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getAction_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getAction_name());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getEmail_category());
                }
                if (!Intrinsics.areEqual(value.getEmail_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getEmail_address());
                }
                if (!Intrinsics.areEqual(value.getRoot_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getRoot_url());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 23, (int) value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getButton_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getButton_description());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getButton_group_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getButton_group_title());
                }
                if (value.getAdditional_info() != null) {
                    AppEventDataAdditionalInfo.ADAPTER.encodeWithTag(writer, 19, (int) value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getTag());
                }
                if (!Intrinsics.areEqual(value.getTab_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getTab_name());
                }
                if (!Intrinsics.areEqual(value.getTab_group_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getTab_group_name());
                }
                if (!Intrinsics.areEqual(value.getUser_input(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getUser_input());
                }
                if (!Intrinsics.areEqual(value.getField_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getField_name());
                }
                if (value.getNumber_of_notifications() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource_screen_name());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTransition_reason());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_description());
                }
                if (value.getScreen_depth() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getScreen_depth()));
                }
                if (Intrinsics.areEqual(value.getScreen_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppEventData redact(AppEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AppEventDataAdditionalInfo additional_info = value.getAdditional_info();
                return AppEventData.copy$default(value, null, 0, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, additional_info != null ? AppEventDataAdditionalInfo.ADAPTER.redact(additional_info) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0.0d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, 0, null, null, null, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, null, null, null, 0.0d, null, 0, 0, null, null, null, null, null, ByteString.EMPTY, -262145, -1, Integer.MAX_VALUE, null);
            }
        };
    }
}
