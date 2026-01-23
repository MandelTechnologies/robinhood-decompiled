package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoColors.kt */
@Metadata(m3635d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0010\u000b\n\u0003\b\u0099\u0001\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÃ\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\u0003\u0012\u0006\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u00020\u0003\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\u0006\u0010P\u001a\u00020\u0003\u0012\u0006\u0010Q\u001a\u00020\u0003\u0012\u0006\u0010R\u001a\u00020\u0003\u0012\u0006\u0010S\u001a\u00020\u0003\u0012\u0006\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010W\u001a\u00020\u0003\u0012\u0006\u0010X\u001a\u00020\u0003\u0012\u0006\u0010Y\u001a\u00020\u0003\u0012\u0006\u0010Z\u001a\u00020\u0003\u0012\u0006\u0010[\u001a\u00020\u0003\u0012\u0006\u0010\\\u001a\u00020\u0003\u0012\u0006\u0010]\u001a\u00020\u0003\u0012\u0006\u0010^\u001a\u00020\u0003\u0012\u0006\u0010_\u001a\u00020\u0003\u0012\u0006\u0010`\u001a\u00020\u0003\u0012\u0006\u0010a\u001a\u00020\u0003\u0012\u0006\u0010b\u001a\u00020\u0003\u0012\u0006\u0010c\u001a\u00020\u0003\u0012\u0006\u0010d\u001a\u00020\u0003\u0012\u0006\u0010e\u001a\u00020\u0003\u0012\u0006\u0010f\u001a\u00020\u0003\u0012\u0006\u0010g\u001a\u00020\u0003\u0012\u0006\u0010h\u001a\u00020\u0003\u0012\u0006\u0010i\u001a\u00020\u0003\u0012\u0006\u0010j\u001a\u00020\u0003\u0012\u0006\u0010k\u001a\u00020\u0003\u0012\u0006\u0010l\u001a\u00020\u0003\u0012\u0006\u0010m\u001a\u00020n\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010p\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010u\u001a\u00020\u0003\u0012\u0006\u0010v\u001a\u00020\u0003\u0012\u0006\u0010w\u001a\u00020\u0003\u0012\u0006\u0010x\u001a\u00020\u0003\u0012\u0006\u0010y\u001a\u00020\u0003¢\u0006\u0004\bz\u0010{J¤\t\u0010\u0084\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\u00032\b\b\u0002\u0010P\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020\u00032\b\b\u0002\u0010R\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020\u00032\b\b\u0002\u0010W\u001a\u00020\u00032\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010Y\u001a\u00020\u00032\b\b\u0002\u0010Z\u001a\u00020\u00032\b\b\u0002\u0010[\u001a\u00020\u00032\b\b\u0002\u0010\\\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00032\b\b\u0002\u0010`\u001a\u00020\u00032\b\b\u0002\u0010a\u001a\u00020\u00032\b\b\u0002\u0010b\u001a\u00020\u00032\b\b\u0002\u0010c\u001a\u00020\u00032\b\b\u0002\u0010d\u001a\u00020\u00032\b\b\u0002\u0010e\u001a\u00020\u00032\b\b\u0002\u0010f\u001a\u00020\u00032\b\b\u0002\u0010g\u001a\u00020\u00032\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00032\b\b\u0002\u0010j\u001a\u00020\u00032\b\b\u0002\u0010k\u001a\u00020\u00032\b\b\u0002\u0010l\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020n2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010u\u001a\u00020\u00032\b\b\u0002\u0010v\u001a\u00020\u00032\b\b\u0002\u0010w\u001a\u00020\u0003¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u0010\u0010\u0087\u0002\u001a\u00030\u0088\u0002H\u0000¢\u0006\u0003\b\u0089\u0002J\u0010\u0010\u008a\u0002\u001a\u00030\u0088\u0002H\u0000¢\u0006\u0003\b\u008b\u0002J\u0010\u0010\u008c\u0002\u001a\u00030\u0088\u0002H\u0000¢\u0006\u0003\b\u008d\u0002J\u0010\u0010\u0090\u0002\u001a\u00030\u0088\u0002H\u0000¢\u0006\u0003\b\u0091\u0002J\u001a\u0010\u0092\u0002\u001a\u00030\u0088\u00022\b\u0010\u0092\u0002\u001a\u00030\u0093\u0002H\u0000¢\u0006\u0003\b\u0094\u0002R\u0013\u0010\f\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010~\u001a\u0004\b|\u0010}R\u0013\u0010\r\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010~\u001a\u0004\b\u007f\u0010}R\u0014\u0010\u000e\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0080\u0001\u0010}R\u0014\u0010\u000f\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0081\u0001\u0010}R\u0014\u0010\u0010\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0082\u0001\u0010}R\u0014\u0010\u0011\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0083\u0001\u0010}R\u0014\u0010\u0012\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0084\u0001\u0010}R\u0014\u0010\u0013\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0085\u0001\u0010}R\u0014\u0010\u0014\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0086\u0001\u0010}R\u0014\u0010\u0015\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0087\u0001\u0010}R\u0014\u0010\u0016\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0088\u0001\u0010}R\u0014\u0010\u0017\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0089\u0001\u0010}R\u0014\u0010\u0018\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008a\u0001\u0010}R\u0014\u0010\u0019\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008b\u0001\u0010}R\u0014\u0010\u001a\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008c\u0001\u0010}R\u0014\u0010\u001b\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008d\u0001\u0010}R\u0014\u0010\u001c\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008e\u0001\u0010}R\u0014\u0010\u001d\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008f\u0001\u0010}R\u0014\u0010\u001e\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0090\u0001\u0010}R\u0014\u0010\u001f\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0091\u0001\u0010}R\u0014\u0010 \u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0092\u0001\u0010}R\u0014\u0010!\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0093\u0001\u0010}R\u0014\u0010\"\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0094\u0001\u0010}R\u0014\u0010#\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0095\u0001\u0010}R\u0014\u0010$\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0096\u0001\u0010}R\u0014\u0010%\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0097\u0001\u0010}R\u0014\u0010&\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0098\u0001\u0010}R\u0014\u0010'\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u0099\u0001\u0010}R\u0014\u0010(\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009a\u0001\u0010}R\u0014\u0010)\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009b\u0001\u0010}R\u0014\u0010*\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009c\u0001\u0010}R\u0014\u0010+\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009d\u0001\u0010}R\u0014\u0010,\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009e\u0001\u0010}R\u0014\u0010-\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009f\u0001\u0010}R\u0014\u0010.\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b \u0001\u0010}R\u0014\u0010/\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¡\u0001\u0010}R\u0014\u00100\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¢\u0001\u0010}R\u0014\u00101\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b£\u0001\u0010}R\u0014\u00102\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¤\u0001\u0010}R\u0014\u00103\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¥\u0001\u0010}R\u0014\u00104\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¦\u0001\u0010}R\u0014\u00105\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b§\u0001\u0010}R\u0014\u00106\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¨\u0001\u0010}R\u0014\u00107\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b©\u0001\u0010}R\u0014\u00108\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bª\u0001\u0010}R\u0014\u00109\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b«\u0001\u0010}R\u0014\u0010:\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¬\u0001\u0010}R\u0014\u0010;\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00ad\u0001\u0010}R\u0014\u0010<\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b®\u0001\u0010}R\u0014\u0010=\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¯\u0001\u0010}R\u0014\u0010>\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b°\u0001\u0010}R\u0014\u0010?\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b±\u0001\u0010}R\u0014\u0010@\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b²\u0001\u0010}R\u0014\u0010A\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b³\u0001\u0010}R\u0014\u0010B\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b´\u0001\u0010}R\u0014\u0010C\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bµ\u0001\u0010}R\u0014\u0010D\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¶\u0001\u0010}R\u0014\u0010E\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b·\u0001\u0010}R\u0014\u0010F\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¸\u0001\u0010}R\u0014\u0010G\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¹\u0001\u0010}R\u0014\u0010H\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bº\u0001\u0010}R\u0014\u0010I\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b»\u0001\u0010}R\u0014\u0010J\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¼\u0001\u0010}R\u0014\u0010K\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b½\u0001\u0010}R\u0014\u0010L\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¾\u0001\u0010}R\u0014\u0010M\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b¿\u0001\u0010}R\u0014\u0010N\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÀ\u0001\u0010}R\u0014\u0010O\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÁ\u0001\u0010}R\u0014\u0010P\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÂ\u0001\u0010}R\u0014\u0010Q\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÃ\u0001\u0010}R\u0014\u0010R\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÄ\u0001\u0010}R\u0014\u0010S\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÅ\u0001\u0010}R\u0014\u0010T\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÆ\u0001\u0010}R\u0014\u0010U\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÇ\u0001\u0010}R\u0014\u0010V\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÈ\u0001\u0010}R\u0014\u0010W\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÉ\u0001\u0010}R\u0014\u0010X\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÊ\u0001\u0010}R\u0014\u0010Y\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bË\u0001\u0010}R\u0014\u0010Z\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÌ\u0001\u0010}R\u0014\u0010[\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÍ\u0001\u0010}R\u0014\u0010\\\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÎ\u0001\u0010}R\u0014\u0010]\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÏ\u0001\u0010}R\u0014\u0010^\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÐ\u0001\u0010}R\u0014\u0010_\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÑ\u0001\u0010}R\u0014\u0010`\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÒ\u0001\u0010}R\u0014\u0010a\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÓ\u0001\u0010}R\u0014\u0010b\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÔ\u0001\u0010}R\u0014\u0010c\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÕ\u0001\u0010}R\u0014\u0010d\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÖ\u0001\u0010}R\u0014\u0010e\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\b×\u0001\u0010}R\u0014\u0010f\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bØ\u0001\u0010}R\u0014\u0010g\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÙ\u0001\u0010}R\u0014\u0010h\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÚ\u0001\u0010}R\u0014\u0010i\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÛ\u0001\u0010}R\u0014\u0010j\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÜ\u0001\u0010}R\u0014\u0010k\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÝ\u0001\u0010}R\u0014\u0010l\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bÞ\u0001\u0010}R\u0012\u0010m\u001a\u00020n¢\u0006\t\n\u0000\u001a\u0005\bm\u0010ß\u0001R\u0010\u0010o\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010s\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010u\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010~R\u0014\u0010v\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bà\u0001\u0010}R\u0014\u0010w\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bá\u0001\u0010}R\u0014\u0010x\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bâ\u0001\u0010}R\u0014\u0010y\u001a\u00020\u0003¢\u0006\u000b\n\u0002\u0010~\u001a\u0005\bã\u0001\u0010}R1\u0010\u0002\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bè\u0001\u0010é\u0001\u001a\u0005\bå\u0001\u0010}\"\u0006\bæ\u0001\u0010ç\u0001R1\u0010\u0004\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bì\u0001\u0010é\u0001\u001a\u0005\bê\u0001\u0010}\"\u0006\bë\u0001\u0010ç\u0001R1\u0010\u0005\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bï\u0001\u0010é\u0001\u001a\u0005\bí\u0001\u0010}\"\u0006\bî\u0001\u0010ç\u0001R1\u0010\u0006\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bò\u0001\u0010é\u0001\u001a\u0005\bð\u0001\u0010}\"\u0006\bñ\u0001\u0010ç\u0001R1\u0010\u0007\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bõ\u0001\u0010é\u0001\u001a\u0005\bó\u0001\u0010}\"\u0006\bô\u0001\u0010ç\u0001R1\u0010\b\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bø\u0001\u0010é\u0001\u001a\u0005\bö\u0001\u0010}\"\u0006\b÷\u0001\u0010ç\u0001R1\u0010\t\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bû\u0001\u0010é\u0001\u001a\u0005\bù\u0001\u0010}\"\u0006\bú\u0001\u0010ç\u0001R1\u0010\n\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bþ\u0001\u0010é\u0001\u001a\u0005\bü\u0001\u0010}\"\u0006\bý\u0001\u0010ç\u0001R1\u0010\u000b\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\b\u0081\u0002\u0010é\u0001\u001a\u0005\bÿ\u0001\u0010}\"\u0006\b\u0080\u0002\u0010ç\u0001R\u0013\u0010\u0082\u0002\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010}R\u0017\u0010\u008e\u0002\u001a\u00020n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010ß\u0001¨\u0006\u0095\u0002"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoColors;", "", "accent", "Landroidx/compose/ui/graphics/Color;", AccountNavigationViewState.LOG_OUT_TEXT_COLOR, "negative", "fg", "fg2", "fg3", "bg3", "bg2", "bg", "jet", "nova", "jouleLight", "joule", "jouleDark", "solLight", "sol", "solDark", "lumenLight", "lumen", "lumenDark", "xrayLight", "xray", "xrayDark", "primeLight", "prime", "primeDark", "biomeLight", "biome", "biomeDark", "dotLight", "dot", "dotDark", "hydroLight", "hydro", "hydroDark", "cosmonautLight", "cosmonaut", "cosmonautDark", "uvLight", "uv", "uvDark", "irisLight", "iris", "irisDark", "milleniumLight", "millenium", "milleniumDark", "resinLight", "resin", "resinDark", "droidLight", "droid", "droidDark", "cloneLight", "clone", "cloneDark", "mineral", "andros", "ion", "jade", "stratos", "exos", "ruby", "gaia", "neon", "bloom", "flare", "moon", "morph", "astro", "neptune", "synth", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13", "c14", "c15", "c16", "c17", "c18", "c19", "c20", "ccGoldFg", "ccGoldFg2", "ccGoldFg3", "ccGoldBg", "ccGoldBg2", "ccGoldBg3", "ccGoldAccent", "ccSilverAccent", "ccSilverFg", "ccSilverFg2", "ccSilverFg3", "ccSilverBg", "ccSilverBg2", "ccSilverBg3", "isDay", "", "elevatedFg", "elevatedFg2", "elevatedFg3", "elevatedBg3", "elevatedBg2", "elevatedBg", "accessibleNegative", "widgetBg", "widgetBg2", "widgetSurfaceBg", "menuBg", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getJet-0d7_KjU", "()J", "J", "getNova-0d7_KjU", "getJouleLight-0d7_KjU", "getJoule-0d7_KjU", "getJouleDark-0d7_KjU", "getSolLight-0d7_KjU", "getSol-0d7_KjU", "getSolDark-0d7_KjU", "getLumenLight-0d7_KjU", "getLumen-0d7_KjU", "getLumenDark-0d7_KjU", "getXrayLight-0d7_KjU", "getXray-0d7_KjU", "getXrayDark-0d7_KjU", "getPrimeLight-0d7_KjU", "getPrime-0d7_KjU", "getPrimeDark-0d7_KjU", "getBiomeLight-0d7_KjU", "getBiome-0d7_KjU", "getBiomeDark-0d7_KjU", "getDotLight-0d7_KjU", "getDot-0d7_KjU", "getDotDark-0d7_KjU", "getHydroLight-0d7_KjU", "getHydro-0d7_KjU", "getHydroDark-0d7_KjU", "getCosmonautLight-0d7_KjU", "getCosmonaut-0d7_KjU", "getCosmonautDark-0d7_KjU", "getUvLight-0d7_KjU", "getUv-0d7_KjU", "getUvDark-0d7_KjU", "getIrisLight-0d7_KjU", "getIris-0d7_KjU", "getIrisDark-0d7_KjU", "getMilleniumLight-0d7_KjU", "getMillenium-0d7_KjU", "getMilleniumDark-0d7_KjU", "getResinLight-0d7_KjU", "getResin-0d7_KjU", "getResinDark-0d7_KjU", "getDroidLight-0d7_KjU", "getDroid-0d7_KjU", "getDroidDark-0d7_KjU", "getCloneLight-0d7_KjU", "getClone-0d7_KjU", "getCloneDark-0d7_KjU", "getMineral-0d7_KjU", "getAndros-0d7_KjU", "getIon-0d7_KjU", "getJade-0d7_KjU", "getStratos-0d7_KjU", "getExos-0d7_KjU", "getRuby-0d7_KjU", "getGaia-0d7_KjU", "getNeon-0d7_KjU", "getBloom-0d7_KjU", "getFlare-0d7_KjU", "getMoon-0d7_KjU", "getMorph-0d7_KjU", "getAstro-0d7_KjU", "getNeptune-0d7_KjU", "getSynth-0d7_KjU", "getC1-0d7_KjU", "getC2-0d7_KjU", "getC3-0d7_KjU", "getC4-0d7_KjU", "getC5-0d7_KjU", "getC6-0d7_KjU", "getC7-0d7_KjU", "getC8-0d7_KjU", "getC9-0d7_KjU", "getC10-0d7_KjU", "getC11-0d7_KjU", "getC12-0d7_KjU", "getC13-0d7_KjU", "getC14-0d7_KjU", "getC15-0d7_KjU", "getC16-0d7_KjU", "getC17-0d7_KjU", "getC18-0d7_KjU", "getC19-0d7_KjU", "getC20-0d7_KjU", "getCcGoldFg-0d7_KjU", "getCcGoldFg2-0d7_KjU", "getCcGoldFg3-0d7_KjU", "getCcGoldBg-0d7_KjU", "getCcGoldBg2-0d7_KjU", "getCcGoldBg3-0d7_KjU", "getCcGoldAccent-0d7_KjU", "getCcSilverAccent-0d7_KjU", "getCcSilverFg-0d7_KjU", "getCcSilverFg2-0d7_KjU", "getCcSilverFg3-0d7_KjU", "getCcSilverBg-0d7_KjU", "getCcSilverBg2-0d7_KjU", "getCcSilverBg3-0d7_KjU", "()Z", "getWidgetBg-0d7_KjU", "getWidgetBg2-0d7_KjU", "getWidgetSurfaceBg-0d7_KjU", "getMenuBg-0d7_KjU", "<set-?>", "getAccent-0d7_KjU", "setAccent-8_81llA", "(J)V", "accent$delegate", "Landroidx/compose/runtime/MutableState;", "getPositive-0d7_KjU", "setPositive-8_81llA", "positive$delegate", "getNegative-0d7_KjU", "setNegative-8_81llA", "negative$delegate", "getFg-0d7_KjU", "setFg-8_81llA", "fg$delegate", "getFg2-0d7_KjU", "setFg2-8_81llA", "fg2$delegate", "getFg3-0d7_KjU", "setFg3-8_81llA", "fg3$delegate", "getBg3-0d7_KjU", "setBg3-8_81llA", "bg3$delegate", "getBg2-0d7_KjU", "setBg2-8_81llA", "bg2$delegate", "getBg-0d7_KjU", "setBg-8_81llA", "bg$delegate", "scrimColor", "getScrimColor-0d7_KjU", "copy", "copy-0oIltwM", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;JJJ)Lcom/robinhood/compose/bento/theme/BentoColors;", AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE, "", "gold$lib_compose_bento_externalRelease", "elevated", "elevated$lib_compose_bento_externalRelease", "achromatic", "achromatic$lib_compose_bento_externalRelease", "isAchromatic", "isAchromatic$lib_compose_bento_externalRelease", "accessible", "accessible$lib_compose_bento_externalRelease", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "direction$lib_compose_bento_externalRelease", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoColors {
    public static final int $stable = 0;

    /* renamed from: accent$delegate, reason: from kotlin metadata */
    private final SnapshotState accent;
    private final long accessibleNegative;
    private final long andros;
    private final long astro;

    /* renamed from: bg$delegate, reason: from kotlin metadata */
    private final SnapshotState bg;

    /* renamed from: bg2$delegate, reason: from kotlin metadata */
    private final SnapshotState bg2;

    /* renamed from: bg3$delegate, reason: from kotlin metadata */
    private final SnapshotState bg3;
    private final long biome;
    private final long biomeDark;
    private final long biomeLight;
    private final long bloom;
    private final long c1;
    private final long c10;
    private final long c11;
    private final long c12;
    private final long c13;
    private final long c14;
    private final long c15;
    private final long c16;
    private final long c17;
    private final long c18;
    private final long c19;
    private final long c2;
    private final long c20;
    private final long c3;
    private final long c4;
    private final long c5;
    private final long c6;
    private final long c7;
    private final long c8;
    private final long c9;
    private final long ccGoldAccent;
    private final long ccGoldBg;
    private final long ccGoldBg2;
    private final long ccGoldBg3;
    private final long ccGoldFg;
    private final long ccGoldFg2;
    private final long ccGoldFg3;
    private final long ccSilverAccent;
    private final long ccSilverBg;
    private final long ccSilverBg2;
    private final long ccSilverBg3;
    private final long ccSilverFg;
    private final long ccSilverFg2;
    private final long ccSilverFg3;
    private final long clone;
    private final long cloneDark;
    private final long cloneLight;
    private final long cosmonaut;
    private final long cosmonautDark;
    private final long cosmonautLight;
    private final long dot;
    private final long dotDark;
    private final long dotLight;
    private final long droid;
    private final long droidDark;
    private final long droidLight;
    private final Color elevatedBg;
    private final Color elevatedBg2;
    private final Color elevatedBg3;
    private final Color elevatedFg;
    private final Color elevatedFg2;
    private final Color elevatedFg3;
    private final long exos;

    /* renamed from: fg$delegate, reason: from kotlin metadata */
    private final SnapshotState fg;

    /* renamed from: fg2$delegate, reason: from kotlin metadata */
    private final SnapshotState fg2;

    /* renamed from: fg3$delegate, reason: from kotlin metadata */
    private final SnapshotState fg3;
    private final long flare;
    private final long gaia;
    private final long hydro;
    private final long hydroDark;
    private final long hydroLight;
    private final long ion;
    private final long iris;
    private final long irisDark;
    private final long irisLight;
    private final boolean isDay;
    private final long jade;
    private final long jet;
    private final long joule;
    private final long jouleDark;
    private final long jouleLight;
    private final long lumen;
    private final long lumenDark;
    private final long lumenLight;
    private final long menuBg;
    private final long millenium;
    private final long milleniumDark;
    private final long milleniumLight;
    private final long mineral;
    private final long moon;
    private final long morph;

    /* renamed from: negative$delegate, reason: from kotlin metadata */
    private final SnapshotState negative;
    private final long neon;
    private final long neptune;
    private final long nova;

    /* renamed from: positive$delegate, reason: from kotlin metadata */
    private final SnapshotState positive;
    private final long prime;
    private final long primeDark;
    private final long primeLight;
    private final long resin;
    private final long resinDark;
    private final long resinLight;
    private final long ruby;
    private final long sol;
    private final long solDark;
    private final long solLight;
    private final long stratos;
    private final long synth;
    private final long uv;
    private final long uvDark;
    private final long uvLight;
    private final long widgetBg;
    private final long widgetBg2;
    private final long widgetSurfaceBg;
    private final long xray;
    private final long xrayDark;
    private final long xrayLight;

    /* compiled from: BentoColors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTheme4.values().length];
            try {
                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BentoColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j90, long j91, long j92, long j93, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, boolean z, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, long j107, long j108, long j109, long j110, long j111, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, j86, j87, j88, j89, j90, j91, j92, j93, j94, j95, j96, j97, j98, j99, j100, j101, j102, j103, j104, j105, j106, z, color, color2, color3, color4, color5, color6, j107, j108, j109, j110, j111);
    }

    private BentoColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j90, long j91, long j92, long j93, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, boolean z, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, long j107, long j108, long j109, long j110, long j111) {
        this.jet = j10;
        this.nova = j11;
        this.jouleLight = j12;
        this.joule = j13;
        this.jouleDark = j14;
        this.solLight = j15;
        this.sol = j16;
        this.solDark = j17;
        this.lumenLight = j18;
        this.lumen = j19;
        this.lumenDark = j20;
        this.xrayLight = j21;
        this.xray = j22;
        this.xrayDark = j23;
        this.primeLight = j24;
        this.prime = j25;
        this.primeDark = j26;
        this.biomeLight = j27;
        this.biome = j28;
        this.biomeDark = j29;
        this.dotLight = j30;
        this.dot = j31;
        this.dotDark = j32;
        this.hydroLight = j33;
        this.hydro = j34;
        this.hydroDark = j35;
        this.cosmonautLight = j36;
        this.cosmonaut = j37;
        this.cosmonautDark = j38;
        this.uvLight = j39;
        this.uv = j40;
        this.uvDark = j41;
        this.irisLight = j42;
        this.iris = j43;
        this.irisDark = j44;
        this.milleniumLight = j45;
        this.millenium = j46;
        this.milleniumDark = j47;
        this.resinLight = j48;
        this.resin = j49;
        this.resinDark = j50;
        this.droidLight = j51;
        this.droid = j52;
        this.droidDark = j53;
        this.cloneLight = j54;
        this.clone = j55;
        this.cloneDark = j56;
        this.mineral = j57;
        this.andros = j58;
        this.ion = j59;
        this.jade = j60;
        this.stratos = j61;
        this.exos = j62;
        this.ruby = j63;
        this.gaia = j64;
        this.neon = j65;
        this.bloom = j66;
        this.flare = j67;
        this.moon = j68;
        this.morph = j69;
        this.astro = j70;
        this.neptune = j71;
        this.synth = j72;
        this.c1 = j73;
        this.c2 = j74;
        this.c3 = j75;
        this.c4 = j76;
        this.c5 = j77;
        this.c6 = j78;
        this.c7 = j79;
        this.c8 = j80;
        this.c9 = j81;
        this.c10 = j82;
        this.c11 = j83;
        this.c12 = j84;
        this.c13 = j85;
        this.c14 = j86;
        this.c15 = j87;
        this.c16 = j88;
        this.c17 = j89;
        this.c18 = j90;
        this.c19 = j91;
        this.c20 = j92;
        this.ccGoldFg = j93;
        this.ccGoldFg2 = j94;
        this.ccGoldFg3 = j95;
        this.ccGoldBg = j96;
        this.ccGoldBg2 = j97;
        this.ccGoldBg3 = j98;
        this.ccGoldAccent = j99;
        this.ccSilverAccent = j100;
        this.ccSilverFg = j101;
        this.ccSilverFg2 = j102;
        this.ccSilverFg3 = j103;
        this.ccSilverBg = j104;
        this.ccSilverBg2 = j105;
        this.ccSilverBg3 = j106;
        this.isDay = z;
        this.elevatedFg = color;
        this.elevatedFg2 = color2;
        this.elevatedFg3 = color3;
        this.elevatedBg3 = color4;
        this.elevatedBg2 = color5;
        this.elevatedBg = color6;
        this.accessibleNegative = j107;
        this.widgetBg = j108;
        this.widgetBg2 = j109;
        this.widgetSurfaceBg = j110;
        this.menuBg = j111;
        this.accent = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j), null, 2, null);
        this.positive = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j2), null, 2, null);
        this.negative = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j3), null, 2, null);
        this.fg = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j4), null, 2, null);
        this.fg2 = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j5), null, 2, null);
        this.fg3 = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j6), null, 2, null);
        this.bg3 = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j7), null, 2, null);
        this.bg2 = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j8), null, 2, null);
        this.bg = SnapshotState3.mutableStateOf$default(Color.m6701boximpl(j9), null, 2, null);
    }

    /* renamed from: getJet-0d7_KjU, reason: not valid java name and from getter */
    public final long getJet() {
        return this.jet;
    }

    /* renamed from: getNova-0d7_KjU, reason: not valid java name and from getter */
    public final long getNova() {
        return this.nova;
    }

    /* renamed from: getJouleLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getJouleLight() {
        return this.jouleLight;
    }

    /* renamed from: getJoule-0d7_KjU, reason: not valid java name and from getter */
    public final long getJoule() {
        return this.joule;
    }

    /* renamed from: getJouleDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getJouleDark() {
        return this.jouleDark;
    }

    /* renamed from: getSolLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getSolLight() {
        return this.solLight;
    }

    /* renamed from: getSol-0d7_KjU, reason: not valid java name and from getter */
    public final long getSol() {
        return this.sol;
    }

    /* renamed from: getSolDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getSolDark() {
        return this.solDark;
    }

    /* renamed from: getLumenLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getLumenLight() {
        return this.lumenLight;
    }

    /* renamed from: getLumen-0d7_KjU, reason: not valid java name and from getter */
    public final long getLumen() {
        return this.lumen;
    }

    /* renamed from: getLumenDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getLumenDark() {
        return this.lumenDark;
    }

    /* renamed from: getXrayLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getXrayLight() {
        return this.xrayLight;
    }

    /* renamed from: getXray-0d7_KjU, reason: not valid java name and from getter */
    public final long getXray() {
        return this.xray;
    }

    /* renamed from: getXrayDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getXrayDark() {
        return this.xrayDark;
    }

    /* renamed from: getPrimeLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimeLight() {
        return this.primeLight;
    }

    /* renamed from: getPrime-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrime() {
        return this.prime;
    }

    /* renamed from: getPrimeDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimeDark() {
        return this.primeDark;
    }

    /* renamed from: getBiomeLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getBiomeLight() {
        return this.biomeLight;
    }

    /* renamed from: getBiome-0d7_KjU, reason: not valid java name and from getter */
    public final long getBiome() {
        return this.biome;
    }

    /* renamed from: getBiomeDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getBiomeDark() {
        return this.biomeDark;
    }

    /* renamed from: getDotLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getDotLight() {
        return this.dotLight;
    }

    /* renamed from: getDot-0d7_KjU, reason: not valid java name and from getter */
    public final long getDot() {
        return this.dot;
    }

    /* renamed from: getDotDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getDotDark() {
        return this.dotDark;
    }

    /* renamed from: getHydroLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getHydroLight() {
        return this.hydroLight;
    }

    /* renamed from: getHydro-0d7_KjU, reason: not valid java name and from getter */
    public final long getHydro() {
        return this.hydro;
    }

    /* renamed from: getHydroDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getHydroDark() {
        return this.hydroDark;
    }

    /* renamed from: getCosmonautLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getCosmonautLight() {
        return this.cosmonautLight;
    }

    /* renamed from: getCosmonaut-0d7_KjU, reason: not valid java name and from getter */
    public final long getCosmonaut() {
        return this.cosmonaut;
    }

    /* renamed from: getCosmonautDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getCosmonautDark() {
        return this.cosmonautDark;
    }

    /* renamed from: getUvLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getUvLight() {
        return this.uvLight;
    }

    /* renamed from: getUv-0d7_KjU, reason: not valid java name and from getter */
    public final long getUv() {
        return this.uv;
    }

    /* renamed from: getUvDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getUvDark() {
        return this.uvDark;
    }

    /* renamed from: getIrisLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getIrisLight() {
        return this.irisLight;
    }

    /* renamed from: getIris-0d7_KjU, reason: not valid java name and from getter */
    public final long getIris() {
        return this.iris;
    }

    /* renamed from: getIrisDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getIrisDark() {
        return this.irisDark;
    }

    /* renamed from: getMilleniumLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getMilleniumLight() {
        return this.milleniumLight;
    }

    /* renamed from: getMillenium-0d7_KjU, reason: not valid java name and from getter */
    public final long getMillenium() {
        return this.millenium;
    }

    /* renamed from: getMilleniumDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getMilleniumDark() {
        return this.milleniumDark;
    }

    /* renamed from: getResinLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getResinLight() {
        return this.resinLight;
    }

    /* renamed from: getResin-0d7_KjU, reason: not valid java name and from getter */
    public final long getResin() {
        return this.resin;
    }

    /* renamed from: getResinDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getResinDark() {
        return this.resinDark;
    }

    /* renamed from: getDroidLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getDroidLight() {
        return this.droidLight;
    }

    /* renamed from: getDroid-0d7_KjU, reason: not valid java name and from getter */
    public final long getDroid() {
        return this.droid;
    }

    /* renamed from: getDroidDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getDroidDark() {
        return this.droidDark;
    }

    /* renamed from: getCloneLight-0d7_KjU, reason: not valid java name and from getter */
    public final long getCloneLight() {
        return this.cloneLight;
    }

    /* renamed from: getClone-0d7_KjU, reason: not valid java name and from getter */
    public final long getClone() {
        return this.clone;
    }

    /* renamed from: getCloneDark-0d7_KjU, reason: not valid java name and from getter */
    public final long getCloneDark() {
        return this.cloneDark;
    }

    /* renamed from: getMineral-0d7_KjU, reason: not valid java name and from getter */
    public final long getMineral() {
        return this.mineral;
    }

    /* renamed from: getAndros-0d7_KjU, reason: not valid java name and from getter */
    public final long getAndros() {
        return this.andros;
    }

    /* renamed from: getIon-0d7_KjU, reason: not valid java name and from getter */
    public final long getIon() {
        return this.ion;
    }

    /* renamed from: getJade-0d7_KjU, reason: not valid java name and from getter */
    public final long getJade() {
        return this.jade;
    }

    /* renamed from: getStratos-0d7_KjU, reason: not valid java name and from getter */
    public final long getStratos() {
        return this.stratos;
    }

    /* renamed from: getExos-0d7_KjU, reason: not valid java name and from getter */
    public final long getExos() {
        return this.exos;
    }

    /* renamed from: getRuby-0d7_KjU, reason: not valid java name and from getter */
    public final long getRuby() {
        return this.ruby;
    }

    /* renamed from: getGaia-0d7_KjU, reason: not valid java name and from getter */
    public final long getGaia() {
        return this.gaia;
    }

    /* renamed from: getNeon-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeon() {
        return this.neon;
    }

    /* renamed from: getBloom-0d7_KjU, reason: not valid java name and from getter */
    public final long getBloom() {
        return this.bloom;
    }

    /* renamed from: getFlare-0d7_KjU, reason: not valid java name and from getter */
    public final long getFlare() {
        return this.flare;
    }

    /* renamed from: getMoon-0d7_KjU, reason: not valid java name and from getter */
    public final long getMoon() {
        return this.moon;
    }

    /* renamed from: getMorph-0d7_KjU, reason: not valid java name and from getter */
    public final long getMorph() {
        return this.morph;
    }

    /* renamed from: getAstro-0d7_KjU, reason: not valid java name and from getter */
    public final long getAstro() {
        return this.astro;
    }

    /* renamed from: getNeptune-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeptune() {
        return this.neptune;
    }

    /* renamed from: getSynth-0d7_KjU, reason: not valid java name and from getter */
    public final long getSynth() {
        return this.synth;
    }

    /* renamed from: getC1-0d7_KjU, reason: not valid java name and from getter */
    public final long getC1() {
        return this.c1;
    }

    /* renamed from: getC2-0d7_KjU, reason: not valid java name and from getter */
    public final long getC2() {
        return this.c2;
    }

    /* renamed from: getC3-0d7_KjU, reason: not valid java name and from getter */
    public final long getC3() {
        return this.c3;
    }

    /* renamed from: getC4-0d7_KjU, reason: not valid java name and from getter */
    public final long getC4() {
        return this.c4;
    }

    /* renamed from: getC5-0d7_KjU, reason: not valid java name and from getter */
    public final long getC5() {
        return this.c5;
    }

    /* renamed from: getC6-0d7_KjU, reason: not valid java name and from getter */
    public final long getC6() {
        return this.c6;
    }

    /* renamed from: getC7-0d7_KjU, reason: not valid java name and from getter */
    public final long getC7() {
        return this.c7;
    }

    /* renamed from: getC8-0d7_KjU, reason: not valid java name and from getter */
    public final long getC8() {
        return this.c8;
    }

    /* renamed from: getC9-0d7_KjU, reason: not valid java name and from getter */
    public final long getC9() {
        return this.c9;
    }

    /* renamed from: getC10-0d7_KjU, reason: not valid java name and from getter */
    public final long getC10() {
        return this.c10;
    }

    /* renamed from: getC11-0d7_KjU, reason: not valid java name and from getter */
    public final long getC11() {
        return this.c11;
    }

    /* renamed from: getC12-0d7_KjU, reason: not valid java name and from getter */
    public final long getC12() {
        return this.c12;
    }

    /* renamed from: getC13-0d7_KjU, reason: not valid java name and from getter */
    public final long getC13() {
        return this.c13;
    }

    /* renamed from: getC14-0d7_KjU, reason: not valid java name and from getter */
    public final long getC14() {
        return this.c14;
    }

    /* renamed from: getC15-0d7_KjU, reason: not valid java name and from getter */
    public final long getC15() {
        return this.c15;
    }

    /* renamed from: getC16-0d7_KjU, reason: not valid java name and from getter */
    public final long getC16() {
        return this.c16;
    }

    /* renamed from: getC17-0d7_KjU, reason: not valid java name and from getter */
    public final long getC17() {
        return this.c17;
    }

    /* renamed from: getC18-0d7_KjU, reason: not valid java name and from getter */
    public final long getC18() {
        return this.c18;
    }

    /* renamed from: getC19-0d7_KjU, reason: not valid java name and from getter */
    public final long getC19() {
        return this.c19;
    }

    /* renamed from: getC20-0d7_KjU, reason: not valid java name and from getter */
    public final long getC20() {
        return this.c20;
    }

    /* renamed from: getCcGoldFg-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldFg() {
        return this.ccGoldFg;
    }

    /* renamed from: getCcGoldFg2-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldFg2() {
        return this.ccGoldFg2;
    }

    /* renamed from: getCcGoldFg3-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldFg3() {
        return this.ccGoldFg3;
    }

    /* renamed from: getCcGoldBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldBg() {
        return this.ccGoldBg;
    }

    /* renamed from: getCcGoldBg2-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldBg2() {
        return this.ccGoldBg2;
    }

    /* renamed from: getCcGoldBg3-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldBg3() {
        return this.ccGoldBg3;
    }

    /* renamed from: getCcGoldAccent-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcGoldAccent() {
        return this.ccGoldAccent;
    }

    /* renamed from: getCcSilverAccent-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverAccent() {
        return this.ccSilverAccent;
    }

    /* renamed from: getCcSilverFg-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverFg() {
        return this.ccSilverFg;
    }

    /* renamed from: getCcSilverFg2-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverFg2() {
        return this.ccSilverFg2;
    }

    /* renamed from: getCcSilverFg3-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverFg3() {
        return this.ccSilverFg3;
    }

    /* renamed from: getCcSilverBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverBg() {
        return this.ccSilverBg;
    }

    /* renamed from: getCcSilverBg2-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverBg2() {
        return this.ccSilverBg2;
    }

    /* renamed from: getCcSilverBg3-0d7_KjU, reason: not valid java name and from getter */
    public final long getCcSilverBg3() {
        return this.ccSilverBg3;
    }

    /* renamed from: isDay, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: getWidgetBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getWidgetBg() {
        return this.widgetBg;
    }

    /* renamed from: getWidgetBg2-0d7_KjU, reason: not valid java name and from getter */
    public final long getWidgetBg2() {
        return this.widgetBg2;
    }

    /* renamed from: getWidgetSurfaceBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getWidgetSurfaceBg() {
        return this.widgetSurfaceBg;
    }

    /* renamed from: getMenuBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getMenuBg() {
        return this.menuBg;
    }

    /* renamed from: setAccent-8_81llA, reason: not valid java name */
    private final void m21358setAccent8_81llA(long j) {
        this.accent.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m21368getAccent0d7_KjU() {
        return ((Color) this.accent.getValue()).getValue();
    }

    /* renamed from: setPositive-8_81llA, reason: not valid java name */
    private final void m21366setPositive8_81llA(long j) {
        this.positive.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPositive-0d7_KjU, reason: not valid java name */
    public final long m21456getPositive0d7_KjU() {
        return ((Color) this.positive.getValue()).getValue();
    }

    /* renamed from: setNegative-8_81llA, reason: not valid java name */
    private final void m21365setNegative8_81llA(long j) {
        this.negative.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getNegative-0d7_KjU, reason: not valid java name */
    public final long m21452getNegative0d7_KjU() {
        return ((Color) this.negative.getValue()).getValue();
    }

    /* renamed from: setFg-8_81llA, reason: not valid java name */
    private final void m21362setFg8_81llA(long j) {
        this.fg.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getFg-0d7_KjU, reason: not valid java name */
    public final long m21425getFg0d7_KjU() {
        return ((Color) this.fg.getValue()).getValue();
    }

    /* renamed from: setFg2-8_81llA, reason: not valid java name */
    private final void m21363setFg28_81llA(long j) {
        this.fg2.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getFg2-0d7_KjU, reason: not valid java name */
    public final long m21426getFg20d7_KjU() {
        return ((Color) this.fg2.getValue()).getValue();
    }

    /* renamed from: setFg3-8_81llA, reason: not valid java name */
    private final void m21364setFg38_81llA(long j) {
        this.fg3.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getFg3-0d7_KjU, reason: not valid java name */
    public final long m21427getFg30d7_KjU() {
        return ((Color) this.fg3.getValue()).getValue();
    }

    /* renamed from: setBg3-8_81llA, reason: not valid java name */
    private final void m21361setBg38_81llA(long j) {
        this.bg3.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBg3-0d7_KjU, reason: not valid java name */
    public final long m21373getBg30d7_KjU() {
        return ((Color) this.bg3.getValue()).getValue();
    }

    /* renamed from: setBg2-8_81llA, reason: not valid java name */
    private final void m21360setBg28_81llA(long j) {
        this.bg2.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBg2-0d7_KjU, reason: not valid java name */
    public final long m21372getBg20d7_KjU() {
        return ((Color) this.bg2.getValue()).getValue();
    }

    /* renamed from: setBg-8_81llA, reason: not valid java name */
    private final void m21359setBg8_81llA(long j) {
        this.bg.setValue(Color.m6701boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBg-0d7_KjU, reason: not valid java name */
    public final long m21371getBg0d7_KjU() {
        return ((Color) this.bg.getValue()).getValue();
    }

    /* renamed from: getScrimColor-0d7_KjU, reason: not valid java name */
    public final long m21464getScrimColor0d7_KjU() {
        return Color.m6705copywmQWz5c$default(this.jet, this.isDay ? 0.6f : 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: copy-0oIltwM$default, reason: not valid java name */
    public static /* synthetic */ BentoColors m21357copy0oIltwM$default(BentoColors bentoColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j90, long j91, long j92, long j93, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, boolean z, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, long j107, long j108, long j109, int i, int i2, int i3, int i4, Object obj) {
        long j110;
        long j111;
        long j112;
        long j113;
        long j114;
        long j115;
        Color color7;
        Color color8;
        Color color9;
        Color color10;
        Color color11;
        Color color12;
        long j116;
        boolean z2;
        long j117;
        long j118;
        long j119;
        long j120;
        long j121;
        long j122;
        long j123;
        long j124;
        long j125;
        long j126;
        long j127;
        long j128;
        long j129;
        long j130;
        long j131;
        long j132;
        long j133;
        long j134;
        long j135;
        long j136;
        long j137;
        long j138;
        long j139;
        long j140;
        long j141;
        long j142;
        long j143;
        long j144;
        long j145;
        long j146;
        long j147;
        long j148;
        long j149;
        long j150;
        long j151;
        long j152;
        long j153;
        long j154;
        long j155;
        long j156;
        long jM21368getAccent0d7_KjU = (i & 1) != 0 ? bentoColors.m21368getAccent0d7_KjU() : j;
        long jM21456getPositive0d7_KjU = (i & 2) != 0 ? bentoColors.m21456getPositive0d7_KjU() : j2;
        long jM21452getNegative0d7_KjU = (i & 4) != 0 ? bentoColors.m21452getNegative0d7_KjU() : j3;
        long jM21425getFg0d7_KjU = (i & 8) != 0 ? bentoColors.m21425getFg0d7_KjU() : j4;
        long jM21426getFg20d7_KjU = (i & 16) != 0 ? bentoColors.m21426getFg20d7_KjU() : j5;
        long jM21427getFg30d7_KjU = (i & 32) != 0 ? bentoColors.m21427getFg30d7_KjU() : j6;
        long jM21373getBg30d7_KjU = (i & 64) != 0 ? bentoColors.m21373getBg30d7_KjU() : j7;
        long j157 = jM21368getAccent0d7_KjU;
        long jM21372getBg20d7_KjU = (i & 128) != 0 ? bentoColors.m21372getBg20d7_KjU() : j8;
        long jM21371getBg0d7_KjU = (i & 256) != 0 ? bentoColors.m21371getBg0d7_KjU() : j9;
        long j158 = (i & 512) != 0 ? bentoColors.jet : j10;
        long j159 = (i & 1024) != 0 ? bentoColors.nova : j11;
        long j160 = (i & 2048) != 0 ? bentoColors.jouleLight : j12;
        long j161 = (i & 4096) != 0 ? bentoColors.joule : j13;
        long j162 = (i & 8192) != 0 ? bentoColors.jouleDark : j14;
        long j163 = (i & 16384) != 0 ? bentoColors.solLight : j15;
        long j164 = (i & 32768) != 0 ? bentoColors.sol : j16;
        long j165 = (i & 65536) != 0 ? bentoColors.solDark : j17;
        long j166 = (i & 131072) != 0 ? bentoColors.lumenLight : j18;
        long j167 = (i & 262144) != 0 ? bentoColors.lumen : j19;
        long j168 = (i & 524288) != 0 ? bentoColors.lumenDark : j20;
        long j169 = (i & 1048576) != 0 ? bentoColors.xrayLight : j21;
        long j170 = (i & 2097152) != 0 ? bentoColors.xray : j22;
        long j171 = (i & 4194304) != 0 ? bentoColors.xrayDark : j23;
        long j172 = (i & 8388608) != 0 ? bentoColors.primeLight : j24;
        long j173 = (i & 16777216) != 0 ? bentoColors.prime : j25;
        long j174 = (i & 33554432) != 0 ? bentoColors.primeDark : j26;
        long j175 = (i & 67108864) != 0 ? bentoColors.biomeLight : j27;
        long j176 = (i & 134217728) != 0 ? bentoColors.biome : j28;
        long j177 = (i & 268435456) != 0 ? bentoColors.biomeDark : j29;
        long j178 = (i & 536870912) != 0 ? bentoColors.dotLight : j30;
        long j179 = (i & 1073741824) != 0 ? bentoColors.dot : j31;
        long j180 = (i & Integer.MIN_VALUE) != 0 ? bentoColors.dotDark : j32;
        long j181 = (i2 & 1) != 0 ? bentoColors.hydroLight : j33;
        long j182 = (i2 & 2) != 0 ? bentoColors.hydro : j34;
        long j183 = (i2 & 4) != 0 ? bentoColors.hydroDark : j35;
        long j184 = (i2 & 8) != 0 ? bentoColors.cosmonautLight : j36;
        long j185 = (i2 & 16) != 0 ? bentoColors.cosmonaut : j37;
        long j186 = (i2 & 32) != 0 ? bentoColors.cosmonautDark : j38;
        long j187 = (i2 & 64) != 0 ? bentoColors.uvLight : j39;
        long j188 = (i2 & 128) != 0 ? bentoColors.uv : j40;
        long j189 = (i2 & 256) != 0 ? bentoColors.uvDark : j41;
        long j190 = (i2 & 512) != 0 ? bentoColors.irisLight : j42;
        long j191 = (i2 & 1024) != 0 ? bentoColors.iris : j43;
        long j192 = (i2 & 2048) != 0 ? bentoColors.irisDark : j44;
        long j193 = (i2 & 4096) != 0 ? bentoColors.milleniumLight : j45;
        long j194 = (i2 & 8192) != 0 ? bentoColors.millenium : j46;
        long j195 = (i2 & 16384) != 0 ? bentoColors.milleniumDark : j47;
        long j196 = (i2 & 32768) != 0 ? bentoColors.resinLight : j48;
        long j197 = (i2 & 65536) != 0 ? bentoColors.resin : j49;
        long j198 = (i2 & 131072) != 0 ? bentoColors.resinDark : j50;
        long j199 = (i2 & 262144) != 0 ? bentoColors.droidLight : j51;
        long j200 = (i2 & 524288) != 0 ? bentoColors.droid : j52;
        long j201 = (i2 & 1048576) != 0 ? bentoColors.droidDark : j53;
        long j202 = (i2 & 2097152) != 0 ? bentoColors.cloneLight : j54;
        long j203 = (4194304 & i2) != 0 ? bentoColors.clone : j55;
        long j204 = (8388608 & i2) != 0 ? bentoColors.cloneDark : j56;
        long j205 = (16777216 & i2) != 0 ? bentoColors.mineral : j57;
        long j206 = (33554432 & i2) != 0 ? bentoColors.andros : j58;
        long j207 = (67108864 & i2) != 0 ? bentoColors.ion : j59;
        long j208 = (134217728 & i2) != 0 ? bentoColors.jade : j60;
        long j209 = (268435456 & i2) != 0 ? bentoColors.stratos : j61;
        long j210 = (536870912 & i2) != 0 ? bentoColors.exos : j62;
        long j211 = (1073741824 & i2) != 0 ? bentoColors.ruby : j63;
        long j212 = (Integer.MIN_VALUE & i2) != 0 ? bentoColors.gaia : j64;
        long j213 = (i3 & 1) != 0 ? bentoColors.neon : j65;
        long j214 = (i3 & 2) != 0 ? bentoColors.bloom : j66;
        long j215 = (i3 & 4) != 0 ? bentoColors.flare : j67;
        long j216 = (i3 & 8) != 0 ? bentoColors.moon : j68;
        long j217 = (i3 & 16) != 0 ? bentoColors.morph : j69;
        long j218 = (i3 & 32) != 0 ? bentoColors.astro : j70;
        long j219 = (i3 & 64) != 0 ? bentoColors.neptune : j71;
        long j220 = (i3 & 128) != 0 ? bentoColors.synth : j72;
        long j221 = (i3 & 256) != 0 ? bentoColors.c1 : j73;
        long j222 = (i3 & 512) != 0 ? bentoColors.c2 : j74;
        long j223 = (i3 & 1024) != 0 ? bentoColors.c3 : j75;
        long j224 = (i3 & 2048) != 0 ? bentoColors.c4 : j76;
        long j225 = (i3 & 4096) != 0 ? bentoColors.c5 : j77;
        long j226 = (i3 & 8192) != 0 ? bentoColors.c6 : j78;
        long j227 = (i3 & 16384) != 0 ? bentoColors.c7 : j79;
        long j228 = (i3 & 32768) != 0 ? bentoColors.c8 : j80;
        long j229 = (i3 & 65536) != 0 ? bentoColors.c9 : j81;
        long j230 = (i3 & 131072) != 0 ? bentoColors.c10 : j82;
        long j231 = (i3 & 262144) != 0 ? bentoColors.c11 : j83;
        long j232 = (i3 & 524288) != 0 ? bentoColors.c12 : j84;
        long j233 = (i3 & 1048576) != 0 ? bentoColors.c13 : j85;
        long j234 = (i3 & 2097152) != 0 ? bentoColors.c14 : j86;
        long j235 = (i3 & 4194304) != 0 ? bentoColors.c15 : j87;
        long j236 = (i3 & 8388608) != 0 ? bentoColors.c16 : j88;
        long j237 = (i3 & 16777216) != 0 ? bentoColors.c17 : j89;
        long j238 = (i3 & 33554432) != 0 ? bentoColors.c18 : j90;
        long j239 = (i3 & 67108864) != 0 ? bentoColors.c19 : j91;
        long j240 = (i3 & 134217728) != 0 ? bentoColors.c20 : j92;
        long j241 = (i3 & 268435456) != 0 ? bentoColors.ccGoldFg : j93;
        long j242 = (i3 & 536870912) != 0 ? bentoColors.ccGoldFg2 : j94;
        long j243 = (i3 & 1073741824) != 0 ? bentoColors.ccGoldFg3 : j95;
        long j244 = (i3 & Integer.MIN_VALUE) != 0 ? bentoColors.ccGoldBg : j96;
        long j245 = (i4 & 1) != 0 ? bentoColors.ccGoldBg2 : j97;
        long j246 = (i4 & 2) != 0 ? bentoColors.ccGoldBg3 : j98;
        long j247 = (i4 & 4) != 0 ? bentoColors.ccGoldAccent : j99;
        long j248 = (i4 & 8) != 0 ? bentoColors.ccSilverAccent : j100;
        long j249 = (i4 & 16) != 0 ? bentoColors.ccSilverFg : j101;
        long j250 = (i4 & 32) != 0 ? bentoColors.ccSilverFg2 : j102;
        long j251 = (i4 & 64) != 0 ? bentoColors.ccSilverFg3 : j103;
        long j252 = (i4 & 128) != 0 ? bentoColors.ccSilverBg : j104;
        long j253 = (i4 & 256) != 0 ? bentoColors.ccSilverBg2 : j105;
        long j254 = (i4 & 512) != 0 ? bentoColors.ccSilverBg3 : j106;
        boolean z3 = (i4 & 1024) != 0 ? bentoColors.isDay : z;
        long j255 = j254;
        Color color13 = (i4 & 2048) != 0 ? bentoColors.elevatedFg : color;
        Color color14 = (i4 & 4096) != 0 ? bentoColors.elevatedFg2 : color2;
        Color color15 = color13;
        Color color16 = (i4 & 8192) != 0 ? bentoColors.elevatedFg3 : color3;
        Color color17 = (i4 & 16384) != 0 ? bentoColors.elevatedBg3 : color4;
        Color color18 = (i4 & 32768) != 0 ? bentoColors.elevatedBg2 : color5;
        Color color19 = (i4 & 65536) != 0 ? bentoColors.elevatedBg : color6;
        Color color20 = color14;
        long j256 = (i4 & 131072) != 0 ? bentoColors.accessibleNegative : j107;
        long j257 = (i4 & 262144) != 0 ? bentoColors.widgetBg : j108;
        if ((i4 & 524288) != 0) {
            j111 = j257;
            j110 = bentoColors.widgetBg2;
            j113 = j252;
            j114 = j253;
            j115 = j255;
            color7 = color15;
            color8 = color16;
            color9 = color17;
            color10 = color18;
            color11 = color20;
            color12 = color19;
            j116 = j256;
            z2 = z3;
            j118 = j244;
            j119 = j245;
            j120 = j246;
            j121 = j247;
            j122 = j248;
            j123 = j249;
            j124 = j250;
            j112 = j251;
            j126 = j236;
            j127 = j237;
            j128 = j238;
            j129 = j239;
            j130 = j240;
            j131 = j241;
            j132 = j242;
            j117 = j243;
            j134 = j228;
            j135 = j229;
            j136 = j230;
            j137 = j231;
            j138 = j232;
            j139 = j233;
            j140 = j234;
            j125 = j235;
            j142 = j220;
            j143 = j221;
            j144 = j222;
            j145 = j223;
            j146 = j224;
            j147 = j225;
            j148 = j226;
            j133 = j227;
            j150 = j212;
            j151 = j213;
            j152 = j214;
            j153 = j215;
            j154 = j216;
            j155 = j217;
            j156 = j218;
            j141 = j219;
            j149 = j211;
        } else {
            j110 = j109;
            j111 = j257;
            j112 = j251;
            j113 = j252;
            j114 = j253;
            j115 = j255;
            color7 = color15;
            color8 = color16;
            color9 = color17;
            color10 = color18;
            color11 = color20;
            color12 = color19;
            j116 = j256;
            z2 = z3;
            j117 = j243;
            j118 = j244;
            j119 = j245;
            j120 = j246;
            j121 = j247;
            j122 = j248;
            j123 = j249;
            j124 = j250;
            j125 = j235;
            j126 = j236;
            j127 = j237;
            j128 = j238;
            j129 = j239;
            j130 = j240;
            j131 = j241;
            j132 = j242;
            j133 = j227;
            j134 = j228;
            j135 = j229;
            j136 = j230;
            j137 = j231;
            j138 = j232;
            j139 = j233;
            j140 = j234;
            j141 = j219;
            j142 = j220;
            j143 = j221;
            j144 = j222;
            j145 = j223;
            j146 = j224;
            j147 = j225;
            j148 = j226;
            j149 = j211;
            j150 = j212;
            j151 = j213;
            j152 = j214;
            j153 = j215;
            j154 = j216;
            j155 = j217;
            j156 = j218;
        }
        return bentoColors.m21367copy0oIltwM(j157, jM21456getPositive0d7_KjU, jM21452getNegative0d7_KjU, jM21425getFg0d7_KjU, jM21426getFg20d7_KjU, jM21427getFg30d7_KjU, jM21373getBg30d7_KjU, jM21372getBg20d7_KjU, jM21371getBg0d7_KjU, j158, j159, j160, j161, j162, j163, j164, j165, j166, j167, j168, j169, j170, j171, j172, j173, j174, j175, j176, j177, j178, j179, j180, j181, j182, j183, j184, j185, j186, j187, j188, j189, j190, j191, j192, j193, j194, j195, j196, j197, j198, j199, j200, j201, j202, j203, j204, j205, j206, j207, j208, j209, j210, j149, j150, j151, j152, j153, j154, j155, j156, j141, j142, j143, j144, j145, j146, j147, j148, j133, j134, j135, j136, j137, j138, j139, j140, j125, j126, j127, j128, j129, j130, j131, j132, j117, j118, j119, j120, j121, j122, j123, j124, j112, j113, j114, j115, z2, color7, color11, color8, color9, color10, color12, j116, j111, j110);
    }

    /* renamed from: copy-0oIltwM, reason: not valid java name */
    public final BentoColors m21367copy0oIltwM(long accent, long positive, long negative, long fg, long fg2, long fg3, long bg3, long bg2, long bg, long jet, long nova, long jouleLight, long joule, long jouleDark, long solLight, long sol, long solDark, long lumenLight, long lumen, long lumenDark, long xrayLight, long xray, long xrayDark, long primeLight, long prime, long primeDark, long biomeLight, long biome, long biomeDark, long dotLight, long dot, long dotDark, long hydroLight, long hydro, long hydroDark, long cosmonautLight, long cosmonaut, long cosmonautDark, long uvLight, long uv, long uvDark, long irisLight, long iris, long irisDark, long milleniumLight, long millenium, long milleniumDark, long resinLight, long resin, long resinDark, long droidLight, long droid, long droidDark, long cloneLight, long clone, long cloneDark, long mineral, long andros, long ion, long jade, long stratos, long exos, long ruby, long gaia, long neon, long bloom, long flare, long moon, long morph, long astro, long neptune, long synth, long c1, long c2, long c3, long c4, long c5, long c6, long c7, long c8, long c9, long c10, long c11, long c12, long c13, long c14, long c15, long c16, long c17, long c18, long c19, long c20, long ccGoldFg, long ccGoldFg2, long ccGoldFg3, long ccGoldBg, long ccGoldBg2, long ccGoldBg3, long ccGoldAccent, long ccSilverAccent, long ccSilverFg, long ccSilverFg2, long ccSilverFg3, long ccSilverBg, long ccSilverBg2, long ccSilverBg3, boolean isDay, Color elevatedFg, Color elevatedFg2, Color elevatedFg3, Color elevatedBg3, Color elevatedBg2, Color elevatedBg, long accessibleNegative, long widgetBg, long widgetBg2) {
        return new BentoColors(accent, positive, negative, fg, fg2, fg3, bg3, bg2, bg, jet, nova, jouleLight, joule, jouleDark, solLight, sol, solDark, lumenLight, lumen, lumenDark, xrayLight, xray, xrayDark, primeLight, prime, primeDark, biomeLight, biome, biomeDark, dotLight, dot, dotDark, hydroLight, hydro, hydroDark, cosmonautLight, cosmonaut, cosmonautDark, uvLight, uv, uvDark, irisLight, iris, irisDark, milleniumLight, millenium, milleniumDark, resinLight, resin, resinDark, droidLight, droid, droidDark, cloneLight, clone, cloneDark, mineral, andros, ion, jade, stratos, exos, ruby, gaia, neon, bloom, flare, moon, morph, astro, neptune, synth, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, ccGoldFg, ccGoldFg2, ccGoldFg3, ccGoldBg, ccGoldBg2, ccGoldBg3, ccGoldAccent, ccSilverAccent, ccSilverFg, ccSilverFg2, ccSilverFg3, ccSilverBg, ccSilverBg2, ccSilverBg3, isDay, elevatedFg, elevatedFg2, elevatedFg3, elevatedBg3, elevatedBg2, elevatedBg, accessibleNegative, widgetBg, widgetBg2, this.widgetSurfaceBg, this.menuBg, null);
    }

    public final void gold$lib_compose_bento_externalRelease() {
        m21358setAccent8_81llA(this.solLight);
    }

    public final void elevated$lib_compose_bento_externalRelease() {
        Color color = this.elevatedFg;
        m21362setFg8_81llA(color != null ? color.getValue() : m21425getFg0d7_KjU());
        Color color2 = this.elevatedFg2;
        m21363setFg28_81llA(color2 != null ? color2.getValue() : m21426getFg20d7_KjU());
        Color color3 = this.elevatedFg3;
        m21364setFg38_81llA(color3 != null ? color3.getValue() : m21427getFg30d7_KjU());
        Color color4 = this.elevatedBg3;
        m21361setBg38_81llA(color4 != null ? color4.getValue() : m21373getBg30d7_KjU());
        Color color5 = this.elevatedBg2;
        m21360setBg28_81llA(color5 != null ? color5.getValue() : m21372getBg20d7_KjU());
        Color color6 = this.elevatedBg;
        m21359setBg8_81llA(color6 != null ? color6.getValue() : m21371getBg0d7_KjU());
    }

    public final void achromatic$lib_compose_bento_externalRelease() {
        m21358setAccent8_81llA(m21425getFg0d7_KjU());
    }

    public final boolean isAchromatic$lib_compose_bento_externalRelease() {
        return Color.m6707equalsimpl0(m21368getAccent0d7_KjU(), m21425getFg0d7_KjU());
    }

    public final void accessible$lib_compose_bento_externalRelease() {
        m21365setNegative8_81llA(this.accessibleNegative);
    }

    public final void direction$lib_compose_bento_externalRelease(BentoTheme4 direction) {
        long jM21456getPositive0d7_KjU;
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            jM21456getPositive0d7_KjU = m21456getPositive0d7_KjU();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jM21456getPositive0d7_KjU = m21452getNegative0d7_KjU();
        }
        m21358setAccent8_81llA(jM21456getPositive0d7_KjU);
    }
}
