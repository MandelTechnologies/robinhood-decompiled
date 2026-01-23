package com.robinhood.shared.security.authmanager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.data.prefs.CrashlyticsUserId;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.database.BaseDbHelper;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAnalyticsIds;
import com.robinhood.models.api.ApiLoginRequest;
import com.robinhood.models.api.ApiLogoutRequest;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.models.api.ReferrerData;
import com.robinhood.models.api.WebauthnChallenge;
import com.robinhood.models.api.WebauthnCredential;
import com.robinhood.models.api.sheriff.OAuthGrantType;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.prefs.annotation.HasEverLoggedInPref;
import com.robinhood.prefs.annotation.UserEmailPref;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.prefs.annotation.UsernamePref;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.rosetta.eventlogging.LogoutContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.bitdrift.BitdriftCapture;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.shared.security.recaptcha.RecaptchaResult;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.user.contracts.auth.Logout;
import com.robinhood.store.supportchat.ChatCachedImageCleaner;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import dagger.Lazy;
import dispatch.core.Launch;
import dispatch.core.Suspend;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsH;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import timber.log.Timber;

/* compiled from: RealAuthManager.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010Å\u0001\u001a\u00030Æ\u00012\b\u0010Ç\u0001\u001a\u00030È\u0001H\u0017JO\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\b\u0010Ë\u0001\u001a\u00030¨\u00012\b\u0010Ì\u0001\u001a\u00030¨\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010Î\u0001\u001a\u0005\u0018\u00010´\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016¢\u0006\u0003\u0010Ð\u0001JP\u0010Ñ\u0001\u001a\u00030Æ\u00012\u0007\u0010Ò\u0001\u001a\u00020\u00102\b\u0010Ó\u0001\u001a\u00030Ô\u00012\n\u0010Ë\u0001\u001a\u0005\u0018\u00010¨\u00012\b\u0010Õ\u0001\u001a\u00030´\u00012\u000f\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010×\u00012\n\u0010Ø\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0016J%\u0010Ù\u0001\u001a\u00030Æ\u00012\b\u0010Ú\u0001\u001a\u00030¨\u00012\b\u0010Û\u0001\u001a\u00030¨\u0001H\u0096@¢\u0006\u0003\u0010Ü\u0001J\u0018\u0010Ý\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010Þ\u0001H\u0096@¢\u0006\u0003\u0010à\u0001J\u001d\u0010á\u0001\u001a\u00030â\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010«\u0001H\u0096@¢\u0006\u0003\u0010ã\u0001J%\u0010ä\u0001\u001a\u00030å\u00012\b\u0010Í\u0001\u001a\u00030«\u00012\b\u0010æ\u0001\u001a\u00030¨\u0001H\u0096@¢\u0006\u0003\u0010ç\u0001J\u0011\u0010è\u0001\u001a\u00030â\u0001H\u0096@¢\u0006\u0003\u0010à\u0001J%\u0010é\u0001\u001a\u00030å\u00012\b\u0010Í\u0001\u001a\u00030«\u00012\b\u0010ê\u0001\u001a\u00030¨\u0001H\u0096@¢\u0006\u0003\u0010ç\u0001J\u001d\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016J\u001b\u0010ì\u0001\u001a\u00030Ê\u00012\b\u0010Ï\u0001\u001a\u00030«\u0001H\u0096@¢\u0006\u0003\u0010ã\u0001J\u0014\u0010í\u0001\u001a\u00030Æ\u00012\b\u0010î\u0001\u001a\u00030ï\u0001H\u0016J\b\u0010ð\u0001\u001a\u00030Æ\u0001J\u001d\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\n\u0010ò\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0016J\u001b\u0010ó\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\b\u0010ô\u0001\u001a\u00030¨\u0001H\u0016J\u0014\u0010õ\u0001\u001a\u00030ö\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0016J \u0010÷\u0001\u001a\u00030Æ\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u00012\n\u0010Ø\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0002J\n\u0010ø\u0001\u001a\u00030Æ\u0001H\u0002JG\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\n\u0010ò\u0001\u001a\u0005\u0018\u00010¨\u00012\n\u0010ô\u0001\u001a\u0005\u0018\u00010¨\u00012\n\u0010Î\u0001\u001a\u0005\u0018\u00010´\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010«\u0001H\u0002¢\u0006\u0003\u0010ú\u0001J \u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\u0007\u0010û\u0001\u001a\u00020EH\u0000¢\u0006\u0003\bü\u0001J,\u0010ý\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¾\u00012\u0007\u0010û\u0001\u001a\u00020E2\n\u0010ô\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0000¢\u0006\u0003\bþ\u0001J\n\u0010ÿ\u0001\u001a\u00030Æ\u0001H\u0002J\n\u0010\u0080\u0002\u001a\u00030ö\u0001H\u0002J\u0014\u0010\u0081\u0002\u001a\u00030Æ\u0001H\u0080@¢\u0006\u0006\b\u0082\u0002\u0010à\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R)\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u00180\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001e\u00102\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R$\u00105\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R$\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010o\u001a\b\u0012\u0004\u0012\u00020p0K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010N\"\u0004\br\u0010PR$\u0010s\u001a\b\u0012\u0004\u0012\u00020t0K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010N\"\u0004\bv\u0010PR$\u0010w\u001a\b\u0012\u0004\u0012\u00020x0K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010N\"\u0004\bz\u0010PR$\u0010{\u001a\b\u0012\u0004\u0012\u00020|0K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010N\"\u0004\b~\u0010PR'\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010N\"\u0005\b\u0082\u0001\u0010PR$\u0010\u0083\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010N\"\u0005\b\u008c\u0001\u0010PR(\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010N\"\u0005\b\u0090\u0001\u0010PR(\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010N\"\u0005\b\u0094\u0001\u0010PR(\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010N\"\u0005\b\u0098\u0001\u0010PR(\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010N\"\u0005\b\u009c\u0001\u0010PR(\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010K8\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010N\"\u0005\b \u0001\u0010PR$\u0010¡\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0012\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010©\u0001\u001a\u0005\u0018\u00010¨\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010¬\u0001\u001a\u00030\u00ad\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010®\u0001\u001a\u0014\u0012\u000f\u0012\r ±\u0001*\u0005\u0018\u00010°\u00010°\u00010¯\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010¹\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010»\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010º\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¾\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u001f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006\u0083\u0002"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/coroutines/rx/RxFactory;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "userLifecycleListeners", "", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "getUserLifecycleListeners", "()Ljava/util/Set;", "setUserLifecycleListeners", "(Ljava/util/Set;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "getUsernamePref", "()Lcom/robinhood/prefs/StringPreference;", "setUsernamePref", "(Lcom/robinhood/prefs/StringPreference;)V", "userEmailPref", "getUserEmailPref", "setUserEmailPref", "userUuidPref", "getUserUuidPref", "setUserUuidPref", "userLocalityPref", "getUserLocalityPref$annotations", "()V", "getUserLocalityPref", "setUserLocalityPref", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "getTrustedDeviceIdPref", "()Lcom/robinhood/prefs/TrustedDeviceIdPref;", "setTrustedDeviceIdPref", "(Lcom/robinhood/prefs/TrustedDeviceIdPref;)V", "crashlyticsUserIdPref", "getCrashlyticsUserIdPref", "setCrashlyticsUserIdPref", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "getOAuthTokenPref", "()Lcom/robinhood/prefs/MoshiSecurePreference;", "setOAuthTokenPref", "(Lcom/robinhood/prefs/MoshiSecurePreference;)V", "branchManager", "Ldagger/Lazy;", "Lcom/robinhood/referral/branch/BranchManager;", "getBranchManager", "()Ldagger/Lazy;", "setBranchManager", "(Ldagger/Lazy;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "getPersistentCacheManager", "()Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "setPersistentCacheManager", "(Lcom/robinhood/librobinhood/util/PersistentCacheManager;)V", "hasEverLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasEverLoggedInPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasEverLoggedInPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "getBiometricChangeManager", "()Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "setBiometricChangeManager", "(Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;)V", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "getRecaptchaManager", "()Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "setRecaptchaManager", "(Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;)V", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "getSheriff", "setSheriff", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "getDiscoveryApi", "setDiscoveryApi", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "setUserPrefs", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "getGcmManager", "setGcmManager", "dbHelper", "Lcom/robinhood/database/BaseDbHelper;", "getDbHelper", "setDbHelper", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "getEndpoint", "()Lcom/robinhood/targetbackend/Endpoint;", "setEndpoint", "(Lcom/robinhood/targetbackend/Endpoint;)V", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "getLogoutKillswitch", "setLogoutKillswitch", "okHttpCache", "Lokhttp3/Cache;", "getOkHttpCache", "setOkHttpCache", "okHttpConnectionPool", "Lokhttp3/ConnectionPool;", "getOkHttpConnectionPool", "setOkHttpConnectionPool", "okHttpDispatcher", "Lokhttp3/Dispatcher;", "getOkHttpDispatcher", "setOkHttpDispatcher", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "setNavigator", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "getChatCachedImageCleaner", "setChatCachedImageCleaner", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "setNightModeManager", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;)V", "cachedUsername", "", "cachedPassword", "cachedChallengeId", "Ljava/util/UUID;", "_isLoggingOut", "Ljava/util/concurrent/atomic/AtomicBoolean;", "logoutRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loggedInFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getLoggedInFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loggedInFlow$delegate", "Lkotlin/Lazy;", "isLoggedIn", "()Z", "isInMiddleOfLoggingIn", "isLoggingOut", "logoutEvent", "Lio/reactivex/Single;", "getLogoutEvent", "()Lio/reactivex/Single;", "loggedInStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoggedInStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onUserLoaded", "", "user", "Lcom/robinhood/models/db/sheriff/User;", AnalyticsStrings.BUTTON_MAX_WELCOME_LOGIN, "Lcom/robinhood/login/LoginStatus;", "username", "password", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "skipPrompt", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "initiateLogout", "caller", "logoutType", "Lcom/robinhood/utils/data/LogoutType;", "routeToSignup", "postLogoutIntents", "", "source", "changePassword", "currentPassword", "newPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebauthnCredentials", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/WebauthnCredential;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebauthnChallenge", "Lcom/robinhood/models/api/WebauthnChallenge;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validatePasskeyRegistrationChallenge", "Lcom/robinhood/models/api/Challenge;", "registrationAuthJson", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWebauthnChallenge", "validatePasskeyLoginChallenge", "response", "loginPasskeys", "loginAccountRecovery", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onAppCreated", "verifyMfa", "mfa", "verifyWithBackupCode", "backupCode", "logout", "Lio/reactivex/Completable;", "logLogout", "setAnalyticsUserIdentifier", "loginInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "oauthToken", "loginInternal$lib_auth_manager_externalRelease", "postLoginInternal", "postLoginInternal$lib_auth_manager_externalRelease", "onSessionStarted", "logoutServer", "logoutLocal", "logoutLocal$lib_auth_manager_externalRelease", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class RealAuthManager implements AuthManager, RhProcessLifecycleOwner2 {
    private final AtomicBoolean _isLoggingOut;
    public AnalyticsLogger analytics;
    private final AuthTokenManager authTokenManager;
    public BiometricChangeManager biometricChangeManager;
    public Lazy<BranchManager> branchManager;
    private UUID cachedChallengeId;
    private String cachedPassword;
    private String cachedUsername;
    public Lazy<ChatCachedImageCleaner> chatCachedImageCleaner;
    public Context context;
    private final CoroutineScope coroutineScope;

    @CrashlyticsUserId
    public StringPreference crashlyticsUserIdPref;
    public Lazy<BaseDbHelper> dbHelper;
    public Lazy<DiscoveryApi> discoveryApi;
    public Endpoint endpoint;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    public Lazy<GcmManager> gcmManager;

    @HasEverLoggedInPref
    public BooleanPreference hasEverLoggedInPref;

    /* renamed from: loggedInFlow$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy loggedInFlow;
    public Lazy<LogoutKillswitch> logoutKillswitch;
    private final BehaviorRelay<Intent> logoutRelay;
    public Lazy<Navigator> navigator;
    public NightModeManager nightModeManager;
    public MoshiSecurePreference<OAuthToken> oAuthTokenPref;
    public Lazy<Cache> okHttpCache;
    public Lazy<ConnectionPool> okHttpConnectionPool;
    public Lazy<Dispatcher> okHttpDispatcher;
    public PersistentCacheManager persistentCacheManager;
    public RecaptchaManager recaptchaManager;
    private final RxFactory rxFactory;
    public Lazy<Sheriff> sheriff;
    public TrustedDeviceIdPref trustedDeviceIdPref;

    @UserEmailPref
    public StringPreference userEmailPref;
    public Set<UserLifecycleListener> userLifecycleListeners;
    public StringPreference userLocalityPref;

    @UserPrefs
    public Lazy<SharedPreferences> userPrefs;
    private final UserStore userStore;

    @UserUuidPref
    public StringPreference userUuidPref;

    @UsernamePref
    public StringPreference usernamePref;

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoutType.values().length];
            try {
                iArr[LogoutType.USER_INITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoutType.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogoutType.HTTP_401.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager", m3645f = "RealAuthManager.kt", m3646l = {331, 657}, m3647m = "loginAccountRecovery")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$loginAccountRecovery$1 */
    /* loaded from: classes6.dex */
    static final class C396311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C396311(Continuation<? super C396311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAuthManager.this.loginAccountRecovery(null, this);
        }
    }

    @UserLocalityPref
    public static /* synthetic */ void getUserLocalityPref$annotations() {
    }

    public RealAuthManager(@RootCoroutineScope CoroutineScope coroutineScope, AuthTokenManager authTokenManager, UserStore userStore, RxFactory rxFactory, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.coroutineScope = coroutineScope;
        this.authTokenManager = authTokenManager;
        this.userStore = userStore;
        this.rxFactory = rxFactory;
        this._isLoggingOut = new AtomicBoolean(false);
        BehaviorRelay<Intent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.logoutRelay = behaviorRelayCreate;
        this.loggedInFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealAuthManager.loggedInFlow_delegate$lambda$0(this.f$0);
            }
        });
        Launch.launchMainImmediate$default(coroutineScope, null, null, new C396281(rhProcessLifecycleOwner, this, null), 3, null);
    }

    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final Set<UserLifecycleListener> getUserLifecycleListeners() {
        Set<UserLifecycleListener> set = this.userLifecycleListeners;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLifecycleListeners");
        return null;
    }

    public final void setUserLifecycleListeners(Set<UserLifecycleListener> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.userLifecycleListeners = set;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final StringPreference getUsernamePref() {
        StringPreference stringPreference = this.usernamePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("usernamePref");
        return null;
    }

    public final void setUsernamePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.usernamePref = stringPreference;
    }

    public final StringPreference getUserEmailPref() {
        StringPreference stringPreference = this.userEmailPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userEmailPref");
        return null;
    }

    public final void setUserEmailPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.userEmailPref = stringPreference;
    }

    public final StringPreference getUserUuidPref() {
        StringPreference stringPreference = this.userUuidPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userUuidPref");
        return null;
    }

    public final void setUserUuidPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.userUuidPref = stringPreference;
    }

    public final StringPreference getUserLocalityPref() {
        StringPreference stringPreference = this.userLocalityPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLocalityPref");
        return null;
    }

    public final void setUserLocalityPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.userLocalityPref = stringPreference;
    }

    public final TrustedDeviceIdPref getTrustedDeviceIdPref() {
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref;
        if (trustedDeviceIdPref != null) {
            return trustedDeviceIdPref;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trustedDeviceIdPref");
        return null;
    }

    public final void setTrustedDeviceIdPref(TrustedDeviceIdPref trustedDeviceIdPref) {
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "<set-?>");
        this.trustedDeviceIdPref = trustedDeviceIdPref;
    }

    public final StringPreference getCrashlyticsUserIdPref() {
        StringPreference stringPreference = this.crashlyticsUserIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crashlyticsUserIdPref");
        return null;
    }

    public final void setCrashlyticsUserIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.crashlyticsUserIdPref = stringPreference;
    }

    public final MoshiSecurePreference<OAuthToken> getOAuthTokenPref() {
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref;
        if (moshiSecurePreference != null) {
            return moshiSecurePreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oAuthTokenPref");
        return null;
    }

    public final void setOAuthTokenPref(MoshiSecurePreference<OAuthToken> moshiSecurePreference) {
        Intrinsics.checkNotNullParameter(moshiSecurePreference, "<set-?>");
        this.oAuthTokenPref = moshiSecurePreference;
    }

    public final Lazy<BranchManager> getBranchManager() {
        Lazy<BranchManager> lazy = this.branchManager;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("branchManager");
        return null;
    }

    public final void setBranchManager(Lazy<BranchManager> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.branchManager = lazy;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final PersistentCacheManager getPersistentCacheManager() {
        PersistentCacheManager persistentCacheManager = this.persistentCacheManager;
        if (persistentCacheManager != null) {
            return persistentCacheManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("persistentCacheManager");
        return null;
    }

    public final void setPersistentCacheManager(PersistentCacheManager persistentCacheManager) {
        Intrinsics.checkNotNullParameter(persistentCacheManager, "<set-?>");
        this.persistentCacheManager = persistentCacheManager;
    }

    public final BooleanPreference getHasEverLoggedInPref() {
        BooleanPreference booleanPreference = this.hasEverLoggedInPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasEverLoggedInPref");
        return null;
    }

    public final void setHasEverLoggedInPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasEverLoggedInPref = booleanPreference;
    }

    public final BiometricChangeManager getBiometricChangeManager() {
        BiometricChangeManager biometricChangeManager = this.biometricChangeManager;
        if (biometricChangeManager != null) {
            return biometricChangeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("biometricChangeManager");
        return null;
    }

    public final void setBiometricChangeManager(BiometricChangeManager biometricChangeManager) {
        Intrinsics.checkNotNullParameter(biometricChangeManager, "<set-?>");
        this.biometricChangeManager = biometricChangeManager;
    }

    public final RecaptchaManager getRecaptchaManager() {
        RecaptchaManager recaptchaManager = this.recaptchaManager;
        if (recaptchaManager != null) {
            return recaptchaManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recaptchaManager");
        return null;
    }

    public final void setRecaptchaManager(RecaptchaManager recaptchaManager) {
        Intrinsics.checkNotNullParameter(recaptchaManager, "<set-?>");
        this.recaptchaManager = recaptchaManager;
    }

    public final Lazy<Sheriff> getSheriff() {
        Lazy<Sheriff> lazy = this.sheriff;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sheriff");
        return null;
    }

    public final void setSheriff(Lazy<Sheriff> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.sheriff = lazy;
    }

    public final Lazy<DiscoveryApi> getDiscoveryApi() {
        Lazy<DiscoveryApi> lazy = this.discoveryApi;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("discoveryApi");
        return null;
    }

    public final void setDiscoveryApi(Lazy<DiscoveryApi> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.discoveryApi = lazy;
    }

    public final Lazy<SharedPreferences> getUserPrefs() {
        Lazy<SharedPreferences> lazy = this.userPrefs;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    public final void setUserPrefs(Lazy<SharedPreferences> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.userPrefs = lazy;
    }

    public final Lazy<GcmManager> getGcmManager() {
        Lazy<GcmManager> lazy = this.gcmManager;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gcmManager");
        return null;
    }

    public final void setGcmManager(Lazy<GcmManager> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.gcmManager = lazy;
    }

    public final Lazy<BaseDbHelper> getDbHelper() {
        Lazy<BaseDbHelper> lazy = this.dbHelper;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dbHelper");
        return null;
    }

    public final void setDbHelper(Lazy<BaseDbHelper> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.dbHelper = lazy;
    }

    public final Endpoint getEndpoint() {
        Endpoint endpoint = this.endpoint;
        if (endpoint != null) {
            return endpoint;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endpoint");
        return null;
    }

    public final void setEndpoint(Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.endpoint = endpoint;
    }

    public final Lazy<LogoutKillswitch> getLogoutKillswitch() {
        Lazy<LogoutKillswitch> lazy = this.logoutKillswitch;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logoutKillswitch");
        return null;
    }

    public final void setLogoutKillswitch(Lazy<LogoutKillswitch> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.logoutKillswitch = lazy;
    }

    public final Lazy<Cache> getOkHttpCache() {
        Lazy<Cache> lazy = this.okHttpCache;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("okHttpCache");
        return null;
    }

    public final void setOkHttpCache(Lazy<Cache> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.okHttpCache = lazy;
    }

    public final Lazy<ConnectionPool> getOkHttpConnectionPool() {
        Lazy<ConnectionPool> lazy = this.okHttpConnectionPool;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("okHttpConnectionPool");
        return null;
    }

    public final void setOkHttpConnectionPool(Lazy<ConnectionPool> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.okHttpConnectionPool = lazy;
    }

    public final Lazy<Dispatcher> getOkHttpDispatcher() {
        Lazy<Dispatcher> lazy = this.okHttpDispatcher;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("okHttpDispatcher");
        return null;
    }

    public final void setOkHttpDispatcher(Lazy<Dispatcher> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.okHttpDispatcher = lazy;
    }

    public final Lazy<Navigator> getNavigator() {
        Lazy<Navigator> lazy = this.navigator;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Lazy<Navigator> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.navigator = lazy;
    }

    public final Lazy<ChatCachedImageCleaner> getChatCachedImageCleaner() {
        Lazy<ChatCachedImageCleaner> lazy = this.chatCachedImageCleaner;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatCachedImageCleaner");
        return null;
    }

    public final void setChatCachedImageCleaner(Lazy<ChatCachedImageCleaner> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.chatCachedImageCleaner = lazy;
    }

    public final NightModeManager getNightModeManager() {
        NightModeManager nightModeManager = this.nightModeManager;
        if (nightModeManager != null) {
            return nightModeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nightModeManager");
        return null;
    }

    public final void setNightModeManager(NightModeManager nightModeManager) {
        Intrinsics.checkNotNullParameter(nightModeManager, "<set-?>");
        this.nightModeManager = nightModeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow2<Boolean> getLoggedInFlow() {
        return (StateFlow2) this.loggedInFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 loggedInFlow_delegate$lambda$0(RealAuthManager realAuthManager) {
        return StateFlow4.MutableStateFlow(Boolean.valueOf(realAuthManager.isLoggedIn()));
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$1", m3645f = "RealAuthManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$1 */
    static final class C396281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhProcessLifecycleOwner $rhProcessLifecycleOwner;
        int label;
        final /* synthetic */ RealAuthManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396281(RhProcessLifecycleOwner rhProcessLifecycleOwner, RealAuthManager realAuthManager, Continuation<? super C396281> continuation) {
            super(2, continuation);
            this.$rhProcessLifecycleOwner = rhProcessLifecycleOwner;
            this.this$0 = realAuthManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C396281(this.$rhProcessLifecycleOwner, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$rhProcessLifecycleOwner.register(this.this$0);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public boolean isLoggedIn() {
        return this.authTokenManager.hasAuthToken();
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public boolean isInMiddleOfLoggingIn() {
        return (this.cachedUsername == null || this.cachedPassword == null) ? false : true;
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public boolean isLoggingOut() {
        return this._isLoggingOut.get();
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Single<Intent> getLogoutEvent() {
        Single<Intent> singleFirstOrError = this.logoutRelay.firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public StateFlow<Boolean> getLoggedInStateFlow() {
        return getLoggedInFlow();
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public void onUserLoaded(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        getHasEverLoggedInPref().set(true);
        String username = user.getUsername();
        String email = user.getEmail();
        String string2 = user.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String iso3166CountryCode = user.getOrigin().getLocality().getIso3166CountryCode();
        if (!Intrinsics.areEqual(username, getUsernamePref().get()) || !Intrinsics.areEqual(email, getUserEmailPref().get()) || !Intrinsics.areEqual(iso3166CountryCode, getUserLocalityPref().get())) {
            Timber.INSTANCE.mo3356i("User logged in", new Object[0]);
            getExperimentsStore().refresh(true);
            getUsernamePref().set(username);
            getUserEmailPref().set(email);
            getUserUuidPref().set(string2);
            getUserLocalityPref().set(iso3166CountryCode);
            getAnalytics().onUserChanged(username, string2);
            Iterator<T> it = getUserLifecycleListeners().iterator();
            while (it.hasNext()) {
                ((UserLifecycleListener) it.next()).onUserStateChanged(getContext(), UserLifecycleListener.State.LOGGED_IN);
            }
        }
        setAnalyticsUserIdentifier();
        Launch.launchMainImmediate$default(this.coroutineScope, null, null, new C396412(username, null), 3, null);
        Observable<ReferrerData> observableOnErrorResumeNext = getPersistentCacheManager().getSymmetricReferrerData().onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        ScopedSubscriptionKt.subscribeIn(observableOnErrorResumeNext, this.coroutineScope, new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealAuthManager.onUserLoaded$lambda$2(this.f$0, (ReferrerData) obj);
            }
        });
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$onUserLoaded$2", m3645f = "RealAuthManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$onUserLoaded$2 */
    /* loaded from: classes6.dex */
    static final class C396412 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $serverUsername;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396412(String str, Continuation<? super C396412> continuation) {
            super(2, continuation);
            this.$serverUsername = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396412(this.$serverUsername, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RealAuthManager.this.getBranchManager().get().setIdentity(this.$serverUsername);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserLoaded$lambda$2(RealAuthManager realAuthManager, ReferrerData referrerData) {
        ExperimentsStore experimentsStore = realAuthManager.getExperimentsStore();
        Intrinsics.checkNotNull(referrerData);
        experimentsStore.onReferrerCampaign(referrerData);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Single<LoginStatus> login(String username, String password, UUID challengeId, Boolean skipPrompt, UUID requestId) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        String string2 = StringsKt.trim(username).toString();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = string2.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.cachedUsername = lowerCase;
        this.cachedPassword = password;
        this.cachedChallengeId = challengeId;
        Single<LoginStatus> singleDoFinally = loginInternal(null, null, skipPrompt, requestId).doOnSubscribe(new Consumer() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager.login.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.increment(IdlingResourceType.LOGIN);
            }
        }).doFinally(new Action() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager.login.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.decrement(IdlingResourceType.LOGIN);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        return singleDoFinally;
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public void initiateLogout(Context caller, LogoutType logoutType, String username, boolean routeToSignup, List<? extends Intent> postLogoutIntents, String source) {
        boolean z;
        LogoutType logoutType2;
        String str;
        boolean z2;
        List<? extends Intent> list;
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(logoutType, "logoutType");
        Intrinsics.checkNotNullParameter(postLogoutIntents, "postLogoutIntents");
        if (this._isLoggingOut.compareAndSet(false, true)) {
            logLogout(logoutType, source);
            BitdriftCapture.INSTANCE.startNewSession();
            if (getNightModeManager().getDayNightMode() == NightModeManager2.DAY) {
                z = true;
                logoutType2 = logoutType;
                z2 = routeToSignup;
                list = postLogoutIntents;
                str = username;
            } else {
                z = false;
                logoutType2 = logoutType;
                str = username;
                z2 = routeToSignup;
                list = postLogoutIntents;
            }
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator().get(), caller, new Logout(logoutType2, str, z2, list, z), null, false, 12, null);
            caller.startActivity(intentCreateIntent$default.addFlags(268468224));
            this.logoutRelay.accept(intentCreateIntent$default);
        }
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object changePassword(String str, String str2, Continuation<? super Unit> continuation) {
        Object objChangePassword = getSheriff().get().changePassword(str2, str, continuation);
        return objChangePassword == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objChangePassword : Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object getWebauthnCredentials(Continuation<? super PaginatedResult<WebauthnCredential>> continuation) {
        return getSheriff().get().generatedPasskeysWithAccount(null, continuation);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object registerWebauthnChallenge(UUID uuid, Continuation<? super WebauthnChallenge> continuation) {
        return getSheriff().get().createWebauthnRegisterRequest(uuid, continuation);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object validatePasskeyRegistrationChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation) {
        return getSheriff().get().respondChallenge(uuid, new Challenge.Response(str), continuation);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object loginWebauthnChallenge(Continuation<? super WebauthnChallenge> continuation) {
        return getSheriff().get().createLoginWebauthnChallenge(continuation);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Object validatePasskeyLoginChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation) {
        return getSheriff().get().submitPasskeyLoginChallenge(uuid, new Challenge.PasskeyResponse(str, getTrustedDeviceIdPref().get()), continuation);
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/OAuthToken;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$loginPasskeys$1", m3645f = "RealAuthManager.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$loginPasskeys$1 */
    /* loaded from: classes6.dex */
    static final class C396341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OAuthToken>, Object> {
        final /* synthetic */ UUID $challengeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396341(UUID uuid, Continuation<? super C396341> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396341(this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OAuthToken> continuation) {
            return ((C396341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Sheriff sheriff = RealAuthManager.this.getSheriff().get();
            ApiLoginRequest.Passkeys passkeys = new ApiLoginRequest.Passkeys(OAuthGrantType.PASSKEY, "internal", RealAuthManager.this.getEndpoint().getBrokebackOAuthClientId(), boxing.boxLong(3600L), RealAuthManager.this.getTrustedDeviceIdPref().get());
            UUID uuid = this.$challengeId;
            this.label = 1;
            Object objLoginPasskeys = sheriff.loginPasskeys(passkeys, uuid, this);
            return objLoginPasskeys == coroutine_suspended ? coroutine_suspended : objLoginPasskeys;
        }
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Single<LoginStatus> loginPasskeys(UUID challengeId) {
        Single<LoginStatus> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C396341(challengeId, null), 1, null).flatMap(new Function() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager.loginPasskeys.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends LoginStatus> apply(OAuthToken oAuthToken) {
                Intrinsics.checkNotNullParameter(oAuthToken, "oAuthToken");
                return RealAuthManager.this.postLoginInternal$lib_auth_manager_externalRelease(oAuthToken, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.shared.security.auth.AuthManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loginAccountRecovery(UUID uuid, Continuation<? super LoginStatus> continuation) {
        C396311 c396311;
        if (continuation instanceof C396311) {
            c396311 = (C396311) continuation;
            int i = c396311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396311.label = i - Integer.MIN_VALUE;
            } else {
                c396311 = new C396311(continuation);
            }
        }
        Object objLoginAccountRecovery = c396311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoginAccountRecovery);
            Sheriff sheriff = getSheriff().get();
            ApiLoginRequest.AccountRecovery accountRecovery = new ApiLoginRequest.AccountRecovery(getTrustedDeviceIdPref().get(), null, getEndpoint().getBrokebackOAuthClientId(), "internal", uuid, 2, null);
            c396311.label = 1;
            objLoginAccountRecovery = sheriff.loginAccountRecovery(accountRecovery, c396311);
            if (objLoginAccountRecovery != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoginAccountRecovery);
            Intrinsics.checkNotNullExpressionValue(objLoginAccountRecovery, "await(...)");
            return objLoginAccountRecovery;
        }
        ResultKt.throwOnFailure(objLoginAccountRecovery);
        Single<LoginStatus> singlePostLoginInternal$lib_auth_manager_externalRelease = postLoginInternal$lib_auth_manager_externalRelease((OAuthToken) objLoginAccountRecovery, null);
        c396311.label = 2;
        objLoginAccountRecovery = RxAwait3.await(singlePostLoginInternal$lib_auth_manager_externalRelease, c396311);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onSessionStarted();
    }

    public final void onAppCreated() {
        Observable<User> observableObserveOn = this.userStore.getUser().observeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        ScopedSubscriptionKt.subscribeIn(observableObserveOn, this.coroutineScope, new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealAuthManager.onAppCreated$lambda$4(this.f$0, (User) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C396402(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAppCreated$lambda$4(RealAuthManager realAuthManager, User user) {
        Intrinsics.checkNotNull(user);
        realAuthManager.onUserLoaded(user);
        return Unit.INSTANCE;
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$onAppCreated$2", m3645f = "RealAuthManager.kt", m3646l = {355}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$onAppCreated$2 */
    /* loaded from: classes6.dex */
    static final class C396402 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396402(Continuation<? super C396402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396402(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!RealAuthManager.this.isLoggedIn()) {
                    RecaptchaManager recaptchaManager = RealAuthManager.this.getRecaptchaManager();
                    this.label = 1;
                    if (recaptchaManager.init(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Single<LoginStatus> verifyMfa(String mfa) {
        return loginInternal(mfa, null, Boolean.FALSE, null);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public Single<LoginStatus> verifyWithBackupCode(String backupCode) {
        Intrinsics.checkNotNullParameter(backupCode, "backupCode");
        return loginInternal(null, backupCode, Boolean.FALSE, null);
    }

    @Override // com.robinhood.shared.security.auth.AuthManager
    public synchronized Completable logout(LogoutType logoutType) {
        Completable completableLogoutServer;
        try {
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
            int i = WhenMappings.$EnumSwitchMapping$0[logoutType.ordinal()];
            if (i == 1 || i == 2) {
                completableLogoutServer = logoutServer();
            } else if (i == 3) {
                completableLogoutServer = RxFactory.DefaultImpls.rxCompletable$default(this.rxFactory, null, new C396361(null), 1, null);
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(logoutType);
                throw new ExceptionsH();
            }
        } catch (Throwable th) {
            throw th;
        }
        return completableLogoutServer;
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logout$1", m3645f = "RealAuthManager.kt", m3646l = {391}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logout$1 */
    /* loaded from: classes6.dex */
    static final class C396361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396361(Continuation<? super C396361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RealAuthManager realAuthManager = RealAuthManager.this;
                this.label = 1;
                if (realAuthManager.logoutLocal$lib_auth_manager_externalRelease(this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void logLogout(LogoutType logoutType, String source) {
        String str;
        LogoutContext.Cause cause;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[logoutType.ordinal()];
        if (i == 1) {
            str = AnalyticsStrings.USER_ACTION_LOGOUT_USER_INITIATED;
        } else if (i == 2) {
            str = AnalyticsStrings.USER_ACTION_LOGOUT_OTHER;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = AnalyticsStrings.USER_ACTION_LOGOUT_FORCED;
        }
        getAnalytics().logUserAction(str);
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.LOGOUT;
        int i2 = iArr[logoutType.ordinal()];
        if (i2 == 1) {
            cause = LogoutContext.Cause.USER_INITIATED;
        } else if (i2 == 2) {
            cause = LogoutContext.Cause.OTHER;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cause = LogoutContext.Cause.FORCE_LOGOUT;
        }
        LogoutContext.Cause cause2 = cause;
        String str2 = source == null ? "" : source;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(null, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr2, null, objArr, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LogoutContext(cause2, str2, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, Integer.MAX_VALUE, -1, 16383, null), null, null, 103, null), false, true, 2, null);
        Timber.INSTANCE.mo3356i("Log out triggered by: %s", str);
    }

    private final void setAnalyticsUserIdentifier() {
        String str = getCrashlyticsUserIdPref().get();
        if (str != null) {
            CrashReporter.INSTANCE.setUserIdentifier(str);
            return;
        }
        Single singleSubscribeOn = this.rxFactory.rxSingle(Dispatchers.getIO(), new C396431(null)).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        Observable observableOnErrorResumeNext = SinglesKt.retryExponential(singleSubscribeOn, 10, new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RealAuthManager.setAnalyticsUserIdentifier$lambda$5((Throwable) obj));
            }
        }).toObservable().onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        ScopedSubscriptionKt.subscribeIn(observableOnErrorResumeNext, this.coroutineScope, new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealAuthManager.setAnalyticsUserIdentifier$lambda$6(this.f$0, (ApiAnalyticsIds) obj);
            }
        });
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiAnalyticsIds;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$setAnalyticsUserIdentifier$1", m3645f = "RealAuthManager.kt", m3646l = {440}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$setAnalyticsUserIdentifier$1 */
    /* loaded from: classes6.dex */
    static final class C396431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAnalyticsIds>, Object> {
        int label;

        C396431(Continuation<? super C396431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAnalyticsIds> continuation) {
            return ((C396431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            DiscoveryApi discoveryApi = RealAuthManager.this.getDiscoveryApi().get();
            this.label = 1;
            Object analyticsIds = discoveryApi.getAnalyticsIds(this);
            return analyticsIds == coroutine_suspended ? coroutine_suspended : analyticsIds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setAnalyticsUserIdentifier$lambda$5(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isConnectivityException(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAnalyticsUserIdentifier$lambda$6(RealAuthManager realAuthManager, ApiAnalyticsIds apiAnalyticsIds) {
        String crashlytics = apiAnalyticsIds.getCrashlytics();
        realAuthManager.getCrashlyticsUserIdPref().set(crashlytics);
        CrashReporter.INSTANCE.setUserIdentifier(crashlytics);
        return Unit.INSTANCE;
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/OAuthToken;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$loginInternal$1", m3645f = "RealAuthManager.kt", m3646l = {467, 469}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$loginInternal$1 */
    /* loaded from: classes6.dex */
    static final class C396321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OAuthToken>, Object> {
        final /* synthetic */ String $backupCode;
        final /* synthetic */ String $mfa;
        final /* synthetic */ UUID $requestId;
        final /* synthetic */ Boolean $skipPrompt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C396321(String str, String str2, Boolean bool, UUID uuid, Continuation<? super C396321> continuation) {
            super(2, continuation);
            this.$mfa = str;
            this.$backupCode = str2;
            this.$skipPrompt = bool;
            this.$requestId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396321(this.$mfa, this.$backupCode, this.$skipPrompt, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OAuthToken> continuation) {
            return ((C396321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objExecuteLogin;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecaptchaManager recaptchaManager = RealAuthManager.this.getRecaptchaManager();
                this.label = 1;
                objExecuteLogin = recaptchaManager.executeLogin(this);
                if (objExecuteLogin != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            objExecuteLogin = obj;
            RecaptchaResult recaptchaResult = (RecaptchaResult) objExecuteLogin;
            Sheriff sheriff = RealAuthManager.this.getSheriff().get();
            String str = RealAuthManager.this.cachedUsername;
            Intrinsics.checkNotNull(str);
            String str2 = RealAuthManager.this.cachedPassword;
            Intrinsics.checkNotNull(str2);
            ApiLoginRequest.UsernamePassword usernamePassword = new ApiLoginRequest.UsernamePassword(str, str2, RealAuthManager.this.getTrustedDeviceIdPref().get(), RealAuthManager.this.authTokenManager.getDeviceLabel(), OAuthGrantType.LOGIN, "internal", RealAuthManager.this.getEndpoint().getBrokebackOAuthClientId(), this.$mfa, this.$backupCode, BuildVariant.INSTANCE.toReleaseChannel(), this.$skipPrompt, this.$requestId, recaptchaResult.getToken(), recaptchaResult.getSiteKey());
            UUID uuid = RealAuthManager.this.cachedChallengeId;
            this.label = 2;
            Object objOAuthLogin = sheriff.oAuthLogin(usernamePassword, uuid, this);
            return objOAuthLogin == coroutine_suspended ? coroutine_suspended : objOAuthLogin;
        }
    }

    private final Single<LoginStatus> loginInternal(String mfa, final String backupCode, Boolean skipPrompt, UUID requestId) {
        Single<LoginStatus> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C396321(mfa, backupCode, skipPrompt, requestId, null), 1, null).flatMap(new Function() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager.loginInternal.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends LoginStatus> apply(OAuthToken oAuthToken) {
                Intrinsics.checkNotNullParameter(oAuthToken, "oAuthToken");
                return RealAuthManager.this.postLoginInternal$lib_auth_manager_externalRelease(oAuthToken, backupCode);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Single<LoginStatus> loginInternal$lib_auth_manager_externalRelease(OAuthToken oauthToken) {
        Intrinsics.checkNotNullParameter(oauthToken, "oauthToken");
        return postLoginInternal$lib_auth_manager_externalRelease(oauthToken, null);
    }

    public final Single<LoginStatus> postLoginInternal$lib_auth_manager_externalRelease(OAuthToken oauthToken, final String backupCode) {
        Intrinsics.checkNotNullParameter(oauthToken, "oauthToken");
        Single<LoginStatus> singleSubscribeOn = Single.just(oauthToken).map(new Function() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$postLoginInternal$1

            /* compiled from: RealAuthManager.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$postLoginInternal$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Challenge.Type.values().length];
                    try {
                        iArr[Challenge.Type.SMS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final LoginStatus apply(OAuthToken oAuthToken) {
                Intrinsics.checkNotNullParameter(oAuthToken, "oAuthToken");
                if (!TextUtils.isEmpty(oAuthToken.getAccessToken())) {
                    this.this$0.cachedUsername = null;
                    this.this$0.cachedPassword = null;
                    this.this$0.getOAuthTokenPref().set((MoshiSecurePreference<OAuthToken>) oAuthToken);
                    UUID userUuid = oAuthToken.getUserUuid();
                    if (userUuid == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.this$0.getUserUuidPref().set(userUuid.toString());
                    this.this$0.onSessionStarted();
                    if (backupCode != null) {
                        Challenge challenge = oAuthToken.getChallenge();
                        return new LoginStatus.SuccessWithBackupCode(challenge != null ? challenge.getId() : null);
                    }
                    return new LoginStatus.Success(oAuthToken.getRedirectUri());
                }
                if (Intrinsics.areEqual(oAuthToken.getMfaRequired(), Boolean.TRUE)) {
                    Challenge.Type mfaType = oAuthToken.getMfaType();
                    int i = mfaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mfaType.ordinal()];
                    if (i == 1) {
                        return LoginStatus.MfaRequired.Sms.INSTANCE;
                    }
                    if (i == 2) {
                        return LoginStatus.MfaRequired.App.INSTANCE;
                    }
                    Preconditions.INSTANCE.failUnknownEnumKotlin(oAuthToken.getMfaType());
                    throw new ExceptionsH();
                }
                throw new IllegalStateException("Unexpected login response: no token and MFA requirement");
            }
        }).flatMap(new Function() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$postLoginInternal$2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends LoginStatus> apply(LoginStatus status) {
                Intrinsics.checkNotNullParameter(status, "status");
                Timber.INSTANCE.mo3350d("Login status is " + status, new Object[0]);
                if ((status instanceof LoginStatus.Success) || (status instanceof LoginStatus.SuccessWithBackupCode)) {
                    return RxFactory.DefaultImpls.rxSingle$default(this.this$0.rxFactory, null, new C396421(this.this$0, status, null), 1, null);
                }
                if (!(status instanceof LoginStatus.MfaRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                Single singleJust = Single.just(status);
                Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
                return singleJust;
            }

            /* compiled from: RealAuthManager.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/login/LoginStatus;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$postLoginInternal$2$1", m3645f = "RealAuthManager.kt", m3646l = {546}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$postLoginInternal$2$1 */
            static final class C396421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super LoginStatus>, Object> {
                final /* synthetic */ LoginStatus $status;
                int label;
                final /* synthetic */ RealAuthManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C396421(RealAuthManager realAuthManager, LoginStatus loginStatus, Continuation<? super C396421> continuation) {
                    super(2, continuation);
                    this.this$0 = realAuthManager;
                    this.$status = loginStatus;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C396421(this.this$0, this.$status, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoginStatus> continuation) {
                    return ((C396421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ExperimentsStore experimentsStore = this.this$0.getExperimentsStore();
                        this.label = 1;
                        if (experimentsStore.refreshProcessInvariantExperiments(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return this.$status;
                }
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSessionStarted() {
        boolean zIsLoggedIn = isLoggedIn();
        if (zIsLoggedIn) {
            this.userStore.refresh(false);
        }
        getLoggedInFlow().setValue(Boolean.valueOf(zIsLoggedIn));
    }

    private final Completable logoutServer() {
        final Function1 function1 = new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealAuthManager.logoutServer$lambda$7(this.f$0, (Throwable) obj);
            }
        };
        Completable completableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this.rxFactory, null, new C396371(null), 1, null).onErrorResumeNext(new RealAuthManager8(new Function1() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealAuthManager.logoutServer$lambda$8(this.f$0, (Throwable) obj);
            }
        })).andThen(Completable.defer(new Callable() { // from class: com.robinhood.shared.security.authmanager.RealAuthManager.logoutServer.2
            @Override // java.util.concurrent.Callable
            public final CompletableSource call() {
                OAuthToken value = RealAuthManager.this.getOAuthTokenPref().getValue();
                if (value != null && !value.isReadOnlyScoped()) {
                    return RxFactory.DefaultImpls.rxCompletable$default(RealAuthManager.this.rxFactory, null, new AnonymousClass1(RealAuthManager.this, value, null), 1, null).onErrorResumeNext(new RealAuthManager8(function1));
                }
                return Completable.complete();
            }

            /* compiled from: RealAuthManager.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$2$1", m3645f = "RealAuthManager.kt", m3646l = {595}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ OAuthToken $oAuthToken;
                int label;
                final /* synthetic */ RealAuthManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RealAuthManager realAuthManager, OAuthToken oAuthToken, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = realAuthManager;
                    this.$oAuthToken = oAuthToken;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$oAuthToken, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Sheriff sheriff = this.this$0.getSheriff().get();
                        String accessToken = this.$oAuthToken.getAccessToken();
                        if (accessToken != null) {
                            ApiLogoutRequest apiLogoutRequest = new ApiLogoutRequest(accessToken, this.this$0.getEndpoint().getBrokebackOAuthClientId());
                            this.label = 1;
                            if (sheriff.oAuthRevokeToken(apiLogoutRequest, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new IllegalArgumentException("Auth token missing");
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
        })).onErrorResumeNext(new RealAuthManager8(function1)).andThen(RxFactory.DefaultImpls.rxCompletable$default(this.rxFactory, null, new C396393(null), 1, null)).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        return completableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Completable logoutServer$lambda$7(RealAuthManager realAuthManager, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Timber.INSTANCE.mo3364w(t, "Logout error ignored, best effort attempt", new Object[0]);
        Throwables.isNetworkRelated(t);
        realAuthManager.getAnalytics().logError(AnalyticsStrings.ERROR_LOGOUT_PROCESS, String.valueOf(Throwables.getHttpStatusCode(t)));
        return Completable.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Completable logoutServer$lambda$8(RealAuthManager realAuthManager, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Timber.INSTANCE.mo3364w(t, "Unregister device error ignored, best effort attempt", new Object[0]);
        Throwables.isNetworkRelated(t);
        realAuthManager.getAnalytics().logError(AnalyticsStrings.ERROR_UNREGISTER_DEVICE, String.valueOf(Throwables.getHttpStatusCode(t)));
        return Completable.complete();
    }

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$1", m3645f = "RealAuthManager.kt", m3646l = {587}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$1 */
    /* loaded from: classes6.dex */
    static final class C396371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396371(Continuation<? super C396371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GcmManager gcmManager = RealAuthManager.this.getGcmManager().get();
                this.label = 1;
                if (gcmManager.unregisterDevice(this) == coroutine_suspended) {
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

    /* compiled from: RealAuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$3", m3645f = "RealAuthManager.kt", m3646l = {608}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.authmanager.RealAuthManager$logoutServer$3 */
    /* loaded from: classes6.dex */
    static final class C396393 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C396393(Continuation<? super C396393> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthManager.this.new C396393(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C396393) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RealAuthManager realAuthManager = RealAuthManager.this;
                this.label = 1;
                if (realAuthManager.logoutLocal$lib_auth_manager_externalRelease(this) == coroutine_suspended) {
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (dispatch.core.Suspend.withMain$default(null, r8, r0, 1, null) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logoutLocal$lib_auth_manager_externalRelease(Continuation<? super Unit> continuation) {
        RealAuthManager2 realAuthManager2;
        if (continuation instanceof RealAuthManager2) {
            realAuthManager2 = (RealAuthManager2) continuation;
            int i = realAuthManager2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realAuthManager2.label = i - Integer.MIN_VALUE;
            } else {
                realAuthManager2 = new RealAuthManager2(this, continuation);
            }
        }
        Object obj = realAuthManager2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realAuthManager2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RealAuthManager3 realAuthManager3 = new RealAuthManager3(this, null);
            realAuthManager2.label = 1;
            if (Suspend.withDefault$default(null, realAuthManager3, realAuthManager2, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            RealAuthManager5 realAuthManager5 = new RealAuthManager5(this, null);
            realAuthManager2.label = 3;
        }
        RealAuthManager4 realAuthManager4 = new RealAuthManager4(this, null);
        realAuthManager2.label = 2;
        if (Suspend.withIO$default(null, realAuthManager4, realAuthManager2, 1, null) != coroutine_suspended) {
            RealAuthManager5 realAuthManager52 = new RealAuthManager5(this, null);
            realAuthManager2.label = 3;
        }
        return coroutine_suspended;
    }
}
