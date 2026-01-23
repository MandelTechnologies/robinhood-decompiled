package com.robinhood.utils.extensions;

import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Some;
import com.robinhood.utils.http.BackendPoll;
import com.robinhood.utils.p408rx.ExponentialRetry;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.WallClockPoll;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.rxkotlin.flowable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: Observables.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00070\u0002¢\u0006\u0004\b\r\u0010\u0004\u001aG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a{\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0012*\u00020\u0000\"\b\b\u0002\u0010\u0013*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00020\b2\u001a\b\u0004\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aE\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001f\u0010 \u001aW\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b%\u0010&\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000'0\u0002¢\u0006\u0004\b(\u0010\u0004\u001aO\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0013*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0004\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010\f\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0013*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0004\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010\f\u001aO\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0013*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0004\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010\f\u001aO\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0013*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0004\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010\f\u001a/\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b-\u0010\u0004\u001a3\u00101\u001a\u000200\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010/\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000.¢\u0006\u0004\b1\u00102\u001a3\u00105\u001a\u000200\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u00104\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u000003¢\u0006\u0004\b5\u00106\u001a[\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0013*\u00020\u0000*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000070'2\u001a\b\u0004\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a5\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000070'¢\u0006\u0004\b;\u0010<\u001a7\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000=¢\u0006\u0004\b?\u0010@\u001a5\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001e0A¢\u0006\u0004\bC\u0010D\u001aÃ\u0002\u00109\u001a\b\u0012\u0004\u0012\u00028\n0\u0002\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F\"\u0004\b\u0002\u0010G\"\u0004\b\u0003\u0010H\"\u0004\b\u0004\u0010I\"\u0004\b\u0005\u0010J\"\u0004\b\u0006\u0010K\"\u0004\b\u0007\u0010L\"\u0004\b\b\u0010M\"\u0004\b\t\u0010N\"\u0004\b\n\u0010\u0013*\u00020O2\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00022\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u00022\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\u00022\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00040\u00022\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u00022\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00060\u00022\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00070\u00022\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00028\b0\u00022\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\t0\u00022H\u0010[\u001aD\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0Z¢\u0006\u0004\b9\u0010\\\u001aß\u0002\u00109\u001a\b\u0012\u0004\u0012\u00028\u000b0\u0002\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F\"\u0004\b\u0002\u0010G\"\u0004\b\u0003\u0010H\"\u0004\b\u0004\u0010I\"\u0004\b\u0005\u0010J\"\u0004\b\u0006\u0010K\"\u0004\b\u0007\u0010L\"\u0004\b\b\u0010M\"\u0004\b\t\u0010N\"\u0004\b\n\u0010]\"\u0004\b\u000b\u0010\u0013*\u00020O2\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00022\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u00022\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\u00022\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00040\u00022\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u00022\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00060\u00022\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00070\u00022\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00028\b0\u00022\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\t0\u00022\u000e\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\n0\u00022N\u0010[\u001aJ\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b0_¢\u0006\u0004\b9\u0010`\u001aû\u0002\u00109\u001a\b\u0012\u0004\u0012\u00028\f0\u0002\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F\"\u0004\b\u0002\u0010G\"\u0004\b\u0003\u0010H\"\u0004\b\u0004\u0010I\"\u0004\b\u0005\u0010J\"\u0004\b\u0006\u0010K\"\u0004\b\u0007\u0010L\"\u0004\b\b\u0010M\"\u0004\b\t\u0010N\"\u0004\b\n\u0010]\"\u0004\b\u000b\u0010a\"\u0004\b\f\u0010\u0013*\u00020O2\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00022\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u00022\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\u00022\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00040\u00022\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u00022\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00060\u00022\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00070\u00022\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00028\b0\u00022\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\t0\u00022\u000e\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\n0\u00022\u000e\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u000b0\u00022T\u0010[\u001aP\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f0c¢\u0006\u0004\b9\u0010d\u001a\u0097\u0003\u00109\u001a\b\u0012\u0004\u0012\u00028\r0\u0002\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F\"\u0004\b\u0002\u0010G\"\u0004\b\u0003\u0010H\"\u0004\b\u0004\u0010I\"\u0004\b\u0005\u0010J\"\u0004\b\u0006\u0010K\"\u0004\b\u0007\u0010L\"\u0004\b\b\u0010M\"\u0004\b\t\u0010N\"\u0004\b\n\u0010]\"\u0004\b\u000b\u0010a\"\u0004\b\f\u0010e\"\u0004\b\r\u0010\u0013*\u00020O2\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00022\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u00022\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\u00022\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00040\u00022\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u00022\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00060\u00022\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00070\u00022\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00028\b0\u00022\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\t0\u00022\u000e\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\n0\u00022\u000e\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u000b0\u00022\u000e\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\f0\u00022Z\u0010[\u001aV\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r0g¢\u0006\u0004\b9\u0010h\u001aD\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010i\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010j\u001a\u00020\tH\u0086\b¢\u0006\u0004\bk\u0010l\u001a9\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010i\u001a\u00020m2\b\b\u0002\u0010j\u001a\u00020\t¢\u0006\u0004\bk\u0010n\u001a<\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010i\u001a\u00020m2\b\b\u0002\u0010j\u001a\u00020\tH\u0086\b¢\u0006\u0004\bo\u0010n\u001aL\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000p0\u00022\u0006\u0010q\u001a\u00020!2\b\b\u0002\u0010j\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\tH\u0086\b¢\u0006\u0004\bs\u0010t\u001aQ\u0010y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010x0>\"\u0004\b\u0000\u0010u\"\u0004\b\u0001\u0010v*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0014\b\u0004\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000¢\u0006\u0004\by\u0010z\u001a7\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b{\u0010\u001b\u001a;\u00109\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002\"\u0004\b\u0000\u0010\u0001*\u00020O2\u0014\u0010|\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000070'¢\u0006\u0004\b9\u0010}\u001a8\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010~*\u00020\u0000\"\n\b\u0001\u0010\u007f\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b¢\u0006\u0005\b\u0080\u0001\u0010\u0004\u001a<\u0010\u0082\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00000\u0081\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0083\u0001"}, m3636d2 = {"", "T", "Lio/reactivex/Observable;", "ignoreNetworkExceptions", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "filterIsPresent", "", "Lkotlin/Function1;", "", "predicate", "firstOrEmpty", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "mapFirstOptional", "other", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "connectWhen", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "U", "R", "mapper", "Lkotlin/Function2;", "resultSelector", "switchMap", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "restartObservable", "restartWhen", "(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "", "maxRetries", "", "retryExponential", "(Lio/reactivex/Observable;ILkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "retryAfter", "(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;ILkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "flatten", "mapNotNull", "mapDistinct", "mapDistinctNotNull", "mapNullAsEmptyToObservable", "toOptionals", "Lio/reactivex/Observer;", "observer", "Lio/reactivex/disposables/Disposable;", "subscribeTo", "(Lio/reactivex/Observable;Lio/reactivex/Observer;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Emitter;", "emitter", "subscribe", "(Lio/reactivex/Observable;Lio/reactivex/Emitter;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/ObservableSource;", "combiner", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "combineLatestToList", "(Ljava/lang/Iterable;)Lio/reactivex/Observable;", "Lio/reactivex/SingleSource;", "Lio/reactivex/Single;", "firstOrSwitchIfEmpty", "(Lio/reactivex/Observable;Lio/reactivex/SingleSource;)Lio/reactivex/Single;", "Lkotlin/Function0;", "errorSupplier", "firstOrError", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)Lio/reactivex/Single;", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "Lio/reactivex/rxkotlin/Observables;", "o1", "o2", "o3", "o4", "o5", "o6", "o7", "o8", "o9", "o10", "Lkotlin/Function10;", "combineFunction", "(Lio/reactivex/rxkotlin/Observables;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function10;)Lio/reactivex/Observable;", "T11", "o11", "Lkotlin/Function11;", "(Lio/reactivex/rxkotlin/Observables;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function11;)Lio/reactivex/Observable;", "T12", "o12", "Lkotlin/Function12;", "(Lio/reactivex/rxkotlin/Observables;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function12;)Lio/reactivex/Observable;", "T13", "o13", "Lkotlin/Function13;", "(Lio/reactivex/rxkotlin/Observables;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function13;)Lio/reactivex/Observable;", "interval", "delayFirstEmit", "poll", "(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Z)Lio/reactivex/Observable;", "j$/time/Duration", "(Lio/reactivex/Observable;Lj$/time/Duration;Z)Lio/reactivex/Observable;", "wallClockPoll", "Lretrofit2/Response;", "defaultIntervalInSeconds", "retryIfNetworkError", "backendPoll", "(Lio/reactivex/Observable;JZZ)Lio/reactivex/Observable;", "K", "V", "keyFunction", "", "collectIntoMap", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Single;", "mapToLatestFrom", "sources", "(Lio/reactivex/rxkotlin/Observables;Ljava/lang/Iterable;)Lio/reactivex/Observable;", "A", "B", "filterSubtype", "Lkotlin/Pair;", "withPrevious", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ObservablesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryAfter$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final <T> Observable<T> ignoreNetworkExceptions(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observableOnErrorResumeNext = observable.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.ignoreNetworkExceptions.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Logger.INSTANCE.mo1679d("Ignored network exception: " + t + ", url: " + Throwables.getRequestUrl(t), new Object[0]);
                return Throwables.isNetworkRelated(t) ? Observable.empty() : Observable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    public static final <T> Observable<T> firstOrEmpty(Observable<List<T>> observable, final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Observable<T> observable2 = (Observable<T>) observable.flatMap(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.firstOrEmpty.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(List<? extends T> items) {
                T next;
                Observable observableJust;
                Intrinsics.checkNotNullParameter(items, "items");
                Function1<T, Boolean> function1 = predicate;
                Iterator<T> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (function1.invoke(next).booleanValue()) {
                        break;
                    }
                }
                return (next == null || (observableJust = Observable.just(next)) == null) ? Observable.empty() : observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "flatMap(...)");
        return observable2;
    }

    public static final <T> Observable<Optional<T>> mapFirstOptional(Observable<? extends List<? extends T>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<Optional<T>> observable2 = (Observable<Optional<T>>) observable.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.mapFirstOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<T> apply(List<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Lists4.firstOptional(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "map(...)");
        return observable2;
    }

    public static /* synthetic */ Observable connectWhen$default(Observable observable, Observable observable2, Observable observable3, int i, Object obj) {
        if ((i & 2) != 0) {
            observable3 = Observable.empty();
        }
        return connectWhen(observable, observable2, observable3);
    }

    public static final <T> Observable<T> connectWhen(final Observable<T> observable, Observable<Boolean> other, final Observable<? extends T> observable2) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(observable2, "default");
        Observable<T> observable3 = (Observable<T>) other.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.connectWhen.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue() ? observable : observable2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable3, "switchMap(...)");
        return observable3;
    }

    public static final <T, U, R> Observable<R> switchMap(Observable<T> observable, final Function1<? super T, ? extends Observable<? extends U>> mapper, final Function2<? super T, ? super U, ? extends R> resultSelector) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(resultSelector, "resultSelector");
        Observable<R> observableSwitchMap = observable.switchMap(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.switchMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419461<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Observable observable2 = (Observable) mapper.invoke(t);
                final Function2<T, U, R> function2 = resultSelector;
                return observable2.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.switchMap.1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(U u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Function2<T, U, R> function22 = function2;
                        T t2 = t;
                        Intrinsics.checkNotNull(t2);
                        return function22.invoke(t2, u);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public static final <T> Observable<T> restartWhen(Observable<T> observable, final Observable<?> restartObservable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(restartObservable, "restartObservable");
        Observable<T> observableRetryWhen = observable.retryWhen(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.restartWhen.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Throwable> exceptions) {
                Intrinsics.checkNotNullParameter(exceptions, "exceptions");
                return restartObservable.takeUntil(exceptions.ignoreElements().toObservable()).mergeWith(exceptions.flatMap(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.restartWhen.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Observable.error(it);
                    }
                }));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableRetryWhen, "retryWhen(...)");
        return observableRetryWhen;
    }

    public static /* synthetic */ Observable retryExponential$default(Observable observable, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.extensions.ObservablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ObservablesKt.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(observable, i, function1);
    }

    public static final <T> Observable<T> retryExponential(Observable<T> observable, int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        final ExponentialRetry exponentialRetry = new ExponentialRetry(i, predicate);
        Observable<T> observableRetryWhen = observable.retryWhen(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.retryExponential.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Throwable> errors) {
                Intrinsics.checkNotNullParameter(errors, "errors");
                ExponentialRetry exponentialRetry2 = exponentialRetry;
                Flowable<Throwable> flowable = errors.toFlowable(BackpressureStrategy.LATEST);
                Intrinsics.checkNotNullExpressionValue(flowable, "toFlowable(...)");
                return exponentialRetry2.apply(flowable).toObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableRetryWhen, "retryWhen(...)");
        return observableRetryWhen;
    }

    public static /* synthetic */ Observable retryAfter$default(Observable observable, long j, TimeUnit timeUnit, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.extensions.ObservablesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ObservablesKt.retryAfter$lambda$1((Throwable) obj2));
                }
            };
        }
        return retryAfter(observable, j, timeUnit, i3, function1);
    }

    public static final <T> Observable<T> retryAfter(Observable<T> observable, final long j, final TimeUnit timeUnit, final int i, final Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Observable<T> observableRetryWhen = observable.retryWhen(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.retryAfter.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Throwable> errors) {
                Intrinsics.checkNotNullParameter(errors, "errors");
                Flowable<Throwable> flowable = errors.toFlowable(BackpressureStrategy.BUFFER);
                Intrinsics.checkNotNullExpressionValue(flowable, "toFlowable(...)");
                Flowable<Integer> flowableRange = Flowable.range(1, i);
                Intrinsics.checkNotNullExpressionValue(flowableRange, "range(...)");
                final int i2 = i;
                final Function1<Throwable, Boolean> function1 = predicate;
                final long j2 = j;
                final TimeUnit timeUnit2 = timeUnit;
                Flowable flowableZip = Flowable.zip(flowable, flowableRange, new BiFunction() { // from class: com.robinhood.utils.extensions.ObservablesKt$retryAfter$2$apply$$inlined$zipWith$default$1
                    @Override // io.reactivex.functions.BiFunction
                    public final R apply(Throwable t, Integer u) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        Intrinsics.checkNotNullParameter(u, "u");
                        Throwable th = t;
                        if (u.intValue() < i2 && ((Boolean) function1.invoke(th)).booleanValue()) {
                            return (R) Flowable.timer(j2, timeUnit2);
                        }
                        return (R) Flowable.error(th);
                    }
                }, false, 1);
                Intrinsics.checkNotNullExpressionValue(flowableZip, "zip(...)");
                return flowable.mergeAll(flowableZip).toObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableRetryWhen, "retryWhen(...)");
        return observableRetryWhen;
    }

    public static final <T> Observable<T> filterIsPresent(Observable<Optional<T>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<U> observableOfType = observable.ofType(Some.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        Observable<T> map = observableOfType.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.filterIsPresent.1
            @Override // io.reactivex.functions.Function
            public final T apply(Some<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final <T> Observable<T> flatten(Observable<? extends Iterable<? extends T>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observable2 = (Observable<T>) observable.flatMapIterable(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.flatten.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Iterable<T> apply(Iterable<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "flatMapIterable(...)");
        return observable2;
    }

    /* compiled from: Observables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.utils.extensions.ObservablesKt$mapNotNull$1 */
    /* loaded from: classes12.dex */
    public static final class C419371<T, R> implements Function {
        final /* synthetic */ Function1<T, R> $mapper;

        /* JADX WARN: Multi-variable type inference failed */
        public C419371(Function1<? super T, ? extends R> function1) {
            this.$mapper = function1;
        }

        @Override // io.reactivex.functions.Function
        public final Optional<R> apply(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional3.asOptional(this.$mapper.invoke(it));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((C419371<T, R>) obj);
        }
    }

    public static final <T, R> Observable<R> mapDistinctNotNull(Observable<T> observable, Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Observable<R> map = observable.map(new C419371(mapper));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<R> observableDistinctUntilChanged = filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static final <T, R> Observable<R> mapNotNull(Observable<T> observable, Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Observable<R> map = observable.map(new C419371(mapper));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return filterIsPresent(map);
    }

    public static final <T, R> Observable<R> mapDistinct(Observable<T> observable, final Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Observable<R> observableDistinctUntilChanged = observable.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.mapDistinct.1
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return mapper.invoke(it);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static final <T, R> Observable<R> mapNullAsEmptyToObservable(Observable<T> observable, final Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Observable<R> observableFlatMap = observable.flatMap(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.mapNullAsEmptyToObservable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419381<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(T t) {
                Intrinsics.checkNotNullParameter(t, "t");
                R rInvoke = mapper.invoke(t);
                if (rInvoke != null) {
                    return Observable.just(rInvoke);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public static final <T> Observable<Optional<T>> toOptionals(Observable<? extends T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<Optional<T>> observable2 = (Observable<Optional<T>>) observable.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.toOptionals.1
            @Override // io.reactivex.functions.Function
            public final Optional<T> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419471<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "map(...)");
        return observable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Disposable subscribeTo(Observable<? extends T> observable, Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        ConnectableObservable<? extends T> connectableObservablePublish = observable.publish();
        connectableObservablePublish.subscribe((Observer<? super Object>) observer);
        Disposable disposableConnect = connectableObservablePublish.connect();
        Intrinsics.checkNotNullExpressionValue(disposableConnect, "connect(...)");
        return disposableConnect;
    }

    public static final <T> Disposable subscribe(Observable<? extends T> observable, final Emitter<? super T> emitter) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Disposable disposableSubscribe = observable.subscribe(new Consumer() { // from class: com.robinhood.utils.extensions.ObservablesKt.subscribe.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                emitter.onNext(p0);
            }
        }, new Consumer() { // from class: com.robinhood.utils.extensions.ObservablesKt.subscribe.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                emitter.onError(p0);
            }
        }, new Action() { // from class: com.robinhood.utils.extensions.ObservablesKt.subscribe.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                emitter.onComplete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    public static final <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, final Function1<? super List<? extends T>, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Observable<R> observableCombineLatest = Observable.combineLatest(iterable, new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.combineLatest.1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] values) {
                Intrinsics.checkNotNullParameter(values, "values");
                Function1<List<? extends T>, R> function1 = combiner;
                List<? extends T> listAsList = kotlin.collections.ArraysKt.asList(values);
                Intrinsics.checkNotNull(listAsList, "null cannot be cast to non-null type kotlin.collections.List<T of com.robinhood.utils.extensions.ObservablesKt.combineLatest>");
                return function1.invoke(listAsList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final <T> Observable<List<T>> combineLatestToList(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Observable<List<T>> observableCombineLatest = Observable.combineLatest(iterable, new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt$combineLatestToList$$inlined$combineLatest$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] values) {
                Intrinsics.checkNotNullParameter(values, "values");
                R r = (R) kotlin.collections.ArraysKt.asList(values);
                Intrinsics.checkNotNull(r, "null cannot be cast to non-null type kotlin.collections.List<T of com.robinhood.utils.extensions.ObservablesKt.combineLatest>");
                return r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final <T> Single<T> firstOrSwitchIfEmpty(Observable<T> observable, SingleSource<? extends T> other) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Single<T> singleSwitchIfEmpty = observable.firstElement().switchIfEmpty(other);
        Intrinsics.checkNotNullExpressionValue(singleSwitchIfEmpty, "switchIfEmpty(...)");
        return singleSwitchIfEmpty;
    }

    public static final <T> Single<T> firstOrError(Observable<T> observable, final Function0<? extends Throwable> errorSupplier) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(errorSupplier, "errorSupplier");
        Single singleError = Single.error((Callable<? extends Throwable>) new Callable(errorSupplier) { // from class: com.robinhood.utils.extensions.ObservablesKt$sam$java_util_concurrent_Callable$0
            private final /* synthetic */ Function0 function;

            {
                Intrinsics.checkNotNullParameter(errorSupplier, "function");
                this.function = errorSupplier;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.function.invoke();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleError, "error(...)");
        return firstOrSwitchIfEmpty(observable, singleError);
    }

    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> Observable<R> combineLatest(Observables observables, Observable<? extends T1> o1, Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4, Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7, Observable<? extends T8> o8, Observable<? extends T9> o9, Observable<? extends T10> o10, final Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(observables, "<this>");
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(o4, "o4");
        Intrinsics.checkNotNullParameter(o5, "o5");
        Intrinsics.checkNotNullParameter(o6, "o6");
        Intrinsics.checkNotNullParameter(o7, "o7");
        Intrinsics.checkNotNullParameter(o8, "o8");
        Intrinsics.checkNotNullParameter(o9, "o9");
        Intrinsics.checkNotNullParameter(o10, "o10");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(CollectionsKt.listOf((Object[]) new Observable[]{o1, o2, o3, o4, o5, o6, o7, o8, o9, o10}), new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.combineLatest.2
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return combineFunction.invoke(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7], e[8], e[9]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> Observable<R> combineLatest(Observables observables, Observable<? extends T1> o1, Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4, Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7, Observable<? extends T8> o8, Observable<? extends T9> o9, Observable<? extends T10> o10, Observable<? extends T11> o11, final Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(observables, "<this>");
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(o4, "o4");
        Intrinsics.checkNotNullParameter(o5, "o5");
        Intrinsics.checkNotNullParameter(o6, "o6");
        Intrinsics.checkNotNullParameter(o7, "o7");
        Intrinsics.checkNotNullParameter(o8, "o8");
        Intrinsics.checkNotNullParameter(o9, "o9");
        Intrinsics.checkNotNullParameter(o10, "o10");
        Intrinsics.checkNotNullParameter(o11, "o11");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(CollectionsKt.listOf((Object[]) new Observable[]{o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11}), new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.combineLatest.3
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return combineFunction.invoke(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7], e[8], e[9], e[10]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> Observable<R> combineLatest(Observables observables, Observable<? extends T1> o1, Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4, Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7, Observable<? extends T8> o8, Observable<? extends T9> o9, Observable<? extends T10> o10, Observable<? extends T11> o11, Observable<? extends T12> o12, final Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(observables, "<this>");
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(o4, "o4");
        Intrinsics.checkNotNullParameter(o5, "o5");
        Intrinsics.checkNotNullParameter(o6, "o6");
        Intrinsics.checkNotNullParameter(o7, "o7");
        Intrinsics.checkNotNullParameter(o8, "o8");
        Intrinsics.checkNotNullParameter(o9, "o9");
        Intrinsics.checkNotNullParameter(o10, "o10");
        Intrinsics.checkNotNullParameter(o11, "o11");
        Intrinsics.checkNotNullParameter(o12, "o12");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(CollectionsKt.listOf((Object[]) new Observable[]{o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12}), new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.combineLatest.4
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return combineFunction.invoke(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7], e[8], e[9], e[10], e[11]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> Observable<R> combineLatest(Observables observables, Observable<? extends T1> o1, Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4, Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7, Observable<? extends T8> o8, Observable<? extends T9> o9, Observable<? extends T10> o10, Observable<? extends T11> o11, Observable<? extends T12> o12, Observable<? extends T13> o13, final Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(observables, "<this>");
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        Intrinsics.checkNotNullParameter(o3, "o3");
        Intrinsics.checkNotNullParameter(o4, "o4");
        Intrinsics.checkNotNullParameter(o5, "o5");
        Intrinsics.checkNotNullParameter(o6, "o6");
        Intrinsics.checkNotNullParameter(o7, "o7");
        Intrinsics.checkNotNullParameter(o8, "o8");
        Intrinsics.checkNotNullParameter(o9, "o9");
        Intrinsics.checkNotNullParameter(o10, "o10");
        Intrinsics.checkNotNullParameter(o11, "o11");
        Intrinsics.checkNotNullParameter(o12, "o12");
        Intrinsics.checkNotNullParameter(o13, "o13");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(CollectionsKt.listOf((Object[]) new Observable[]{o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13}), new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt.combineLatest.5
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return combineFunction.invoke(e[0], e[1], e[2], e[3], e[4], e[5], e[6], e[7], e[8], e[9], e[10], e[11], e[12]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static /* synthetic */ Observable poll$default(Observable observable, long j, TimeUnit timeUnit, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable observableCompose = observable.compose(new Poll(j, timeUnit, z));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    public static final <T> Observable<T> poll(Observable<T> observable, long j, TimeUnit timeUnit, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable<T> observable2 = (Observable<T>) observable.compose(new Poll(j, timeUnit, z));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static /* synthetic */ Observable poll$default(Observable observable, Duration duration, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return poll(observable, duration, z);
    }

    public static final <T> Observable<T> poll(Observable<T> observable, Duration interval, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Observable<T> observable2 = (Observable<T>) observable.compose(new Poll(interval.toMillis(), TimeUnit.MILLISECONDS, z));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static /* synthetic */ Observable wallClockPoll$default(Observable observable, Duration interval, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Observable observableCompose = observable.compose(new WallClockPoll(interval, z));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    public static final <T> Observable<T> wallClockPoll(Observable<T> observable, Duration interval, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Observable<T> observable2 = (Observable<T>) observable.compose(new WallClockPoll(interval, z));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static /* synthetic */ Observable backendPoll$default(Observable observable, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable observableCompose = observable.compose(new BackendPoll(j, z, z2));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    public static final <T> Observable<T> backendPoll(Observable<Response<T>> observable, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observable2 = (Observable<T>) observable.compose(new BackendPoll(j, z, z2));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static final <K, V> Single<Map<K, V>> collectIntoMap(Observable<V> observable, final Function1<? super V, ? extends K> keyFunction) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(keyFunction, "keyFunction");
        Single<Map<K, V>> single = (Single<Map<K, V>>) observable.collect(new Callable() { // from class: com.robinhood.utils.extensions.ObservablesKt.collectIntoMap.1
            @Override // java.util.concurrent.Callable
            public final Map<K, V> call() {
                return new LinkedHashMap();
            }
        }, new BiConsumer() { // from class: com.robinhood.utils.extensions.ObservablesKt.collectIntoMap.2
            @Override // io.reactivex.functions.BiConsumer
            public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
                accept((Map<K, Map<K, V>>) obj, (Map<K, V>) obj2);
            }

            public final void accept(Map<K, V> map, V v) {
                Intrinsics.checkNotNullParameter(map, "map");
                map.put(keyFunction.invoke(v), v);
            }
        });
        Intrinsics.checkNotNullExpressionValue(single, "collect(...)");
        return single;
    }

    public static final <T, U> Observable<U> mapToLatestFrom(Observable<T> observable, Observable<U> other) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Observable<U> observable2 = (Observable<U>) observable.withLatestFrom(other, new BiFunction() { // from class: com.robinhood.utils.extensions.ObservablesKt.mapToLatestFrom.1
            @Override // io.reactivex.functions.BiFunction
            public final U apply(T t, U t2) {
                Intrinsics.checkNotNullParameter(t, "<unused var>");
                Intrinsics.checkNotNullParameter(t2, "t2");
                return t2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "withLatestFrom(...)");
        return observable2;
    }

    public static final <T> Observable<? extends List<T>> combineLatest(Observables observables, Iterable<? extends ObservableSource<? extends T>> sources) {
        Intrinsics.checkNotNullParameter(observables, "<this>");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Observable<? extends List<T>> observableCombineLatest = Observable.combineLatest(sources, new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt$combineLatest$javaCompatFunction$1
            @Override // io.reactivex.functions.Function
            public final List<T> apply(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<T> listAsList = kotlin.collections.ArraysKt.asList(it);
                Intrinsics.checkNotNull(listAsList, "null cannot be cast to non-null type kotlin.collections.List<T of com.robinhood.utils.extensions.ObservablesKt.combineLatest>");
                return listAsList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static final /* synthetic */ <A, B extends A> Observable<B> filterSubtype(Observable<A> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.needClassReification();
        Observable<A> observableFilter = observable.filter(new Predicate() { // from class: com.robinhood.utils.extensions.ObservablesKt.filterSubtype.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(A it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.reifiedOperationMarker(3, "B");
                return Objects.nonNull(it);
            }
        });
        Intrinsics.reifiedOperationMarker(4, "B");
        Observable<B> observable2 = (Observable<B>) observableFilter.cast(Object.class);
        Intrinsics.checkNotNullExpressionValue(observable2, "cast(...)");
        return observable2;
    }

    public static final <T> Observable<Tuples2<Optional<T>, T>> withPrevious(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Optional2 optional2 = Optional2.INSTANCE;
        Observable<R> observableScan = observable.scan(new Tuples2(optional2, optional2), new BiFunction() { // from class: com.robinhood.utils.extensions.ObservablesKt.withPrevious.1
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Tuples2<? extends Optional<? extends Tuples2<? extends Optional<? extends T>, ? extends Optional<? extends T>>>, ? extends Optional<? extends Tuples2<? extends Optional<? extends T>, ? extends Optional<? extends T>>>>) obj, (Tuples2<? extends Optional<? extends T>, ? extends Optional<? extends T>>) obj2);
            }

            public final Tuples2<Optional<T>, Optional<T>> apply(Tuples2<? extends Optional<? extends T>, ? extends Optional<? extends T>> prev, T curr) {
                Intrinsics.checkNotNullParameter(prev, "prev");
                Intrinsics.checkNotNullParameter(curr, "curr");
                return Tuples4.m3642to(prev.getSecond(), Optional3.asOptional(curr));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableScan, "scan(...)");
        Observable map = observableScan.map(new Function() { // from class: com.robinhood.utils.extensions.ObservablesKt$withPrevious$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Tuples2 tuples2 = (Tuples2) it;
                Optional optional = (Optional) tuples2.component1();
                Object objComponent1 = ((Optional) tuples2.component2()).component1();
                return Optional3.asOptional(objComponent1 != null ? new Tuples2(optional, objComponent1) : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ObservablesKt$withPrevious$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return filterIsPresent(map);
    }
}
