package com.robinhood.android.gold.upgrade.unified;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.upgrade.unified.AgreementDisplayDest;
import com.robinhood.android.gold.upgrade.unified.ErrorDest;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostEvent;
import com.robinhood.android.gold.upgrade.unified.MultiAgreementsDest;
import com.robinhood.android.gold.upgrade.unified.SingleAgreementDest;
import com.robinhood.android.gold.upgrade.unified.ValuePropsPromoDest;
import com.robinhood.android.navigation.compose.NavControllers;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldFlowScreen;
import gold_flow.proto.p466v1.PresentRouterMetadata;
import gold_flow.proto.p466v1.PresentationType;
import gold_flow.proto.p466v1.TransitionAnimation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GoldUnifiedNavController.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a3\u0010\r\u001a\u00020\u0005*\u00020\u00062%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050\u000fH\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0018H\u0000\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0002\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u001dH\u0000\u001a\u0016\u0010\u001e\u001a\u00020\f*\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"PRESENTATION_TYPE_KEY", "", "CUSTOM_BACK_ACTION", "SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION", "finishActivity", "", "Landroidx/navigation/NavHostController;", "result", "Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$Result;", "finishWithCancel", "finishWithComplete", "isSuccess", "", "navigateBackOrExit", "sendAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "pushScreen", "event", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PushScreen;", "presentRouter", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostEvent$PresentRouter;", "toComposeDest", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "Lgold_flow/proto/v1/GoldFlowScreen;", "toGoldFlowScreen", "Landroidx/navigation/NavDestination;", "isStartDestination", "navController", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavControllerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedNavController {
    public static final String CUSTOM_BACK_ACTION = "GoldUpgradeMicrogramCustomBackAction";
    public static final String PRESENTATION_TYPE_KEY = "GoldUpgradeMicrogramPresentationType";
    public static final String SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION = "GoldUpgradeMicrogramShouldDismissScreenWithCustomBackAction";

    /* compiled from: GoldUnifiedNavController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavControllerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransitionAnimation.values().length];
            try {
                iArr[TransitionAnimation.ANIMATION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransitionAnimation.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransitionAnimation.CROSS_FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransitionAnimation.SLIDE_HORIZONTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransitionAnimation.SLIDE_HORIZONTAL_REVERSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransitionAnimation.SLIDE_VERTICAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransitionAnimation.ENTER_NONE_POP_SLIDE_HORIZONTAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GoldFlowScreen.values().length];
            try {
                iArr2[GoldFlowScreen.SCREEN_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GoldFlowScreen.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GoldFlowScreen.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GoldFlowScreen.VALUE_PROPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[GoldFlowScreen.VALUE_PROPS_SDUI.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[GoldFlowScreen.VALUE_PROPS_PROMO.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[GoldFlowScreen.MULTI_AGREEMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[GoldFlowScreen.SINGLE_AGREEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[GoldFlowScreen.CONFIRMATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[GoldFlowScreen.SUGGESTED_ACTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[GoldFlowScreen.PLAN_SELECTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[GoldFlowScreen.UPDATE_APP.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[GoldFlowScreen.AGREEMENT_DISPLAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[GoldFlowScreen.SAGE_START_APPLICATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[GoldFlowScreen.SAGE_APPLICATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void finishActivity(NavHostController navHostController, GoldUpgradeContract.Result result) {
        NavigationActivityResultContract3.finishWithResult(BaseContexts.requireActivityBaseContext(navHostController.getContext()), result);
    }

    public static final void finishWithCancel(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        finishActivity(navHostController, GoldUpgradeContract.Result.Canceled.INSTANCE);
    }

    public static final void finishWithComplete(NavHostController navHostController, boolean z) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        finishActivity(navHostController, new GoldUpgradeContract.Result.Completed(z));
    }

    public static /* synthetic */ void navigateBackOrExit$default(NavHostController navHostController, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavControllerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GoldUnifiedNavController.navigateBackOrExit$lambda$0((Action) obj2);
                }
            };
        }
        navigateBackOrExit(navHostController, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateBackOrExit$lambda$0(Action action) {
        return Unit.INSTANCE;
    }

    public static final void navigateBackOrExit(NavHostController navHostController, Function1<? super Action, Unit> sendAction) {
        SavedStateHandle savedStateHandle;
        Action action;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(sendAction, "sendAction");
        NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
        PresentationType presentationType = null;
        SavedStateHandle savedStateHandle2 = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        if (savedStateHandle2 != null && (action = (Action) savedStateHandle2.get(CUSTOM_BACK_ACTION)) != null) {
            sendAction.invoke(action);
            if (Intrinsics.areEqual(savedStateHandle2.get(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION), Boolean.FALSE)) {
                return;
            }
            savedStateHandle2.set(CUSTOM_BACK_ACTION, null);
            savedStateHandle2.set(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION, null);
        }
        NavBackStackEntry currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
        if (currentBackStackEntry2 != null && (savedStateHandle = currentBackStackEntry2.getSavedStateHandle()) != null) {
            presentationType = (PresentationType) savedStateHandle.get(PRESENTATION_TYPE_KEY);
        }
        boolean z = presentationType == PresentationType.REPLACE || !navHostController.popBackStack();
        boolean zIsStartDestination = isStartDestination(navHostController.getCurrentDestination(), navHostController);
        if (z || zIsStartDestination) {
            finishWithCancel(navHostController);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: all -> 0x0082, IllegalArgumentException -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:15:0x004c, B:18:0x005a, B:23:0x008a, B:25:0x008e, B:26:0x00ac, B:28:0x00b0, B:29:0x00ce, B:31:0x00d2, B:32:0x010d, B:34:0x0111, B:35:0x0130, B:37:0x0134, B:39:0x013f, B:60:0x018b, B:58:0x0174, B:59:0x018a), top: B:93:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x0082, IllegalArgumentException -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:15:0x004c, B:18:0x005a, B:23:0x008a, B:25:0x008e, B:26:0x00ac, B:28:0x00b0, B:29:0x00ce, B:31:0x00d2, B:32:0x010d, B:34:0x0111, B:35:0x0130, B:37:0x0134, B:39:0x013f, B:60:0x018b, B:58:0x0174, B:59:0x018a), top: B:93:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void pushScreen(NavHostController navHostController, GoldUnifiedHostEvent.PushScreen event) {
        NavTransition navTransition;
        NavTransition navTransition2;
        PresentationType presentationType;
        Action customBackAction;
        SavedStateHandle savedStateHandle;
        SavedStateHandle savedStateHandle2;
        SavedStateHandle savedStateHandle3;
        SavedStateHandle savedStateHandle4;
        SavedStateHandle savedStateHandle5;
        SavedStateHandle savedStateHandle6;
        BaseComposableDestination composeDest;
        NavBackStackEntry currentBackStackEntry;
        NavBackStackEntry currentBackStackEntry2;
        NavBackStackEntry currentBackStackEntry3;
        SavedStateHandle savedStateHandle7;
        SavedStateHandle savedStateHandle8;
        SavedStateHandle savedStateHandle9;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (WhenMappings.$EnumSwitchMapping$0[event.getTransitionAnimation().ordinal()]) {
            case 1:
                navTransition = null;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction = event.getShouldDismissScreenWithCustomBackAction();
                try {
                    try {
                        composeDest = toComposeDest(event.getScreen());
                        if (composeDest instanceof SingleAgreementDest) {
                            NavControllers.navigate$default(navHostController, (ComposableDestinationWithArgs) composeDest, new SingleAgreementDest.Args(event.getGenericArgs().get("request_id"), event.getGenericArgs().get("theme_override")), navTransition, null, null, 24, null);
                        } else if (composeDest instanceof MultiAgreementsDest) {
                            NavControllers.navigate$default(navHostController, (ComposableDestinationWithArgs) composeDest, new MultiAgreementsDest.Args(event.getGenericArgs().get("theme_override")), navTransition, null, null, 24, null);
                        } else if (composeDest instanceof AgreementDisplayDest) {
                            NavControllers.navigate$default(navHostController, (ComposableDestinationWithArgs) composeDest, new AgreementDisplayDest.Args(event.getGenericArgs().get("theme_override")), navTransition, null, null, 24, null);
                        } else if (composeDest instanceof ValuePropsPromoDest) {
                            NavControllers.navigate$default(navHostController, (ComposableDestinationWithArgs) composeDest, new ValuePropsPromoDest.Args(Intrinsics.areEqual(event.getGenericArgs().get("button_color_change_when_scrolling"), "true"), event.getGenericArgs().get("screen_logging_identifier"), Intrinsics.areEqual(event.getGenericArgs().get("force_light_mode"), "true")), navTransition, null, null, 24, null);
                        } else if (composeDest instanceof ErrorDest) {
                            NavControllers.navigate$default(navHostController, (ComposableDestinationWithArgs) composeDest, new ErrorDest.Args(event.getGenericArgs().get("errorDescription")), navTransition, null, null, 24, null);
                        } else if (composeDest instanceof ComposableDestination) {
                            ComposableDestination composableDestination = (ComposableDestination) composeDest;
                            NavTransition navTransition3 = navTransition;
                            try {
                                NavControllers.navigate$default(navHostController, composableDestination, navTransition3, null, null, 12, null);
                            } catch (IllegalArgumentException e) {
                                e = e;
                                navTransition = navTransition3;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                                NavControllers.navigate$default(navHostController, UpdateAppDest.INSTANCE, navTransition, null, null, 12, null);
                                PresentationType presentationType2 = PresentationType.REPLACE;
                                NavBackStackEntry currentBackStackEntry4 = navHostController.getCurrentBackStackEntry();
                                if (currentBackStackEntry4 != null && (savedStateHandle6 = currentBackStackEntry4.getSavedStateHandle()) != null) {
                                    savedStateHandle6.set(PRESENTATION_TYPE_KEY, presentationType2);
                                }
                                NavBackStackEntry currentBackStackEntry5 = navHostController.getCurrentBackStackEntry();
                                if (currentBackStackEntry5 != null && (savedStateHandle5 = currentBackStackEntry5.getSavedStateHandle()) != null) {
                                    savedStateHandle5.set(CUSTOM_BACK_ACTION, null);
                                }
                                NavBackStackEntry currentBackStackEntry6 = navHostController.getCurrentBackStackEntry();
                                if (currentBackStackEntry6 == null || (savedStateHandle4 = currentBackStackEntry6.getSavedStateHandle()) == null) {
                                    return;
                                }
                                savedStateHandle4.set(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION, null);
                                return;
                            }
                        } else {
                            throw new IllegalArgumentException("GoldUpgradeMicrogram: Unknown screen: " + composeDest);
                        }
                        currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry != null && (savedStateHandle9 = currentBackStackEntry.getSavedStateHandle()) != null) {
                            savedStateHandle9.set(PRESENTATION_TYPE_KEY, presentationType);
                        }
                        currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry2 != null && (savedStateHandle8 = currentBackStackEntry2.getSavedStateHandle()) != null) {
                            savedStateHandle8.set(CUSTOM_BACK_ACTION, customBackAction);
                        }
                        currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry3 == null || (savedStateHandle7 = currentBackStackEntry3.getSavedStateHandle()) == null) {
                            return;
                        }
                        savedStateHandle7.set(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION, shouldDismissScreenWithCustomBackAction);
                        return;
                    } catch (Throwable th) {
                        NavBackStackEntry currentBackStackEntry7 = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry7 != null && (savedStateHandle3 = currentBackStackEntry7.getSavedStateHandle()) != null) {
                            savedStateHandle3.set(PRESENTATION_TYPE_KEY, presentationType);
                        }
                        NavBackStackEntry currentBackStackEntry8 = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry8 != null && (savedStateHandle2 = currentBackStackEntry8.getSavedStateHandle()) != null) {
                            savedStateHandle2.set(CUSTOM_BACK_ACTION, customBackAction);
                        }
                        NavBackStackEntry currentBackStackEntry9 = navHostController.getCurrentBackStackEntry();
                        if (currentBackStackEntry9 != null && (savedStateHandle = currentBackStackEntry9.getSavedStateHandle()) != null) {
                            savedStateHandle.set(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION, shouldDismissScreenWithCustomBackAction);
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                }
                break;
            case 2:
                navTransition2 = NavTransition.NONE;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction2 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                    savedStateHandle9.set(PRESENTATION_TYPE_KEY, presentationType);
                    break;
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                    savedStateHandle8.set(CUSTOM_BACK_ACTION, customBackAction);
                    break;
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                    return;
                } else {
                    return;
                }
            case 3:
                navTransition2 = NavTransition.CROSS_FADE;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction22 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                }
                break;
            case 4:
                navTransition2 = NavTransition.SLIDE_HORIZONTAL;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction222 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                }
                break;
            case 5:
                navTransition2 = NavTransition.SLIDE_HORIZONTAL_REVERSE;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction2222 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                }
                break;
            case 6:
                navTransition2 = NavTransition.SLIDE_VERTICAL;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction22222 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                }
                break;
            case 7:
                navTransition2 = NavTransition.ENTER_NONE_POP_SLIDE_HORIZONTAL;
                navTransition = navTransition2;
                presentationType = event.getPresentationType();
                customBackAction = event.getCustomBackAction();
                Boolean shouldDismissScreenWithCustomBackAction222222 = event.getShouldDismissScreenWithCustomBackAction();
                composeDest = toComposeDest(event.getScreen());
                if (composeDest instanceof SingleAgreementDest) {
                }
                currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null) {
                }
                currentBackStackEntry2 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry2 != null) {
                }
                currentBackStackEntry3 = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry3 == null) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void presentRouter(NavHostController navHostController, GoldUnifiedHostEvent.PresentRouter event) throws Resources.NotFoundException {
        Boolean dismiss_on_custom_back_action;
        NavBackStackEntry currentBackStackEntry;
        SavedStateHandle savedStateHandle;
        Action custom_back_action;
        NavBackStackEntry currentBackStackEntry2;
        SavedStateHandle savedStateHandle2;
        PresentationType presentation_type;
        NavBackStackEntry currentBackStackEntry3;
        SavedStateHandle savedStateHandle3;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        NavControllers.navigate$default(navHostController, MicrogramUiFragmentDest.INSTANCE, event.getFragmentKey(), null, null, null, 28, null);
        PresentRouterMetadata presentRouterMetadata = event.getPresentRouterMetadata();
        if (presentRouterMetadata != null && (presentation_type = presentRouterMetadata.getPresentation_type()) != null && (currentBackStackEntry3 = navHostController.getCurrentBackStackEntry()) != null && (savedStateHandle3 = currentBackStackEntry3.getSavedStateHandle()) != null) {
            savedStateHandle3.set(PRESENTATION_TYPE_KEY, presentation_type);
        }
        PresentRouterMetadata presentRouterMetadata2 = event.getPresentRouterMetadata();
        if (presentRouterMetadata2 != null && (custom_back_action = presentRouterMetadata2.getCustom_back_action()) != null && (currentBackStackEntry2 = navHostController.getCurrentBackStackEntry()) != null && (savedStateHandle2 = currentBackStackEntry2.getSavedStateHandle()) != null) {
            savedStateHandle2.set(CUSTOM_BACK_ACTION, custom_back_action);
        }
        PresentRouterMetadata presentRouterMetadata3 = event.getPresentRouterMetadata();
        if (presentRouterMetadata3 == null || (dismiss_on_custom_back_action = presentRouterMetadata3.getDismiss_on_custom_back_action()) == null || (currentBackStackEntry = navHostController.getCurrentBackStackEntry()) == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null) {
            return;
        }
        savedStateHandle.set(SHOULD_DISMISS_SCREEN_WITH_CUSTOM_BACK_ACTION, dismiss_on_custom_back_action);
    }

    private static final BaseComposableDestination toComposeDest(GoldFlowScreen goldFlowScreen) {
        switch (WhenMappings.$EnumSwitchMapping$1[goldFlowScreen.ordinal()]) {
            case 1:
                return ScreenUnspecifiedDest.INSTANCE;
            case 2:
                return LoadingDest.INSTANCE;
            case 3:
                return ErrorDest.INSTANCE;
            case 4:
                return ValuePropsDest.INSTANCE;
            case 5:
                return ValuePropsSduiDest.INSTANCE;
            case 6:
                return ValuePropsPromoDest.INSTANCE;
            case 7:
                return MultiAgreementsDest.INSTANCE;
            case 8:
                return SingleAgreementDest.INSTANCE;
            case 9:
                return ConfirmationDest.INSTANCE;
            case 10:
                return SuggestedActionDest.INSTANCE;
            case 11:
                return PlanSelectionDest.INSTANCE;
            case 12:
                return UpdateAppDest.INSTANCE;
            case 13:
                return AgreementDisplayDest.INSTANCE;
            case 14:
                return StartSageApplicationDest.INSTANCE;
            case 15:
                return SageApplicationDest.INSTANCE;
            default:
                return UpdateAppDest.INSTANCE;
        }
    }

    public static final GoldFlowScreen toGoldFlowScreen(NavDestination navDestination) {
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        String route = navDestination.getRoute();
        if (route == null || (listSplit$default = StringsKt.split$default((CharSequence) route, new String[]{"/"}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt.firstOrNull(listSplit$default)) == null) {
            return null;
        }
        try {
            return GoldFlowScreen.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean isStartDestination(NavDestination navDestination, NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return navDestination != null && navDestination.getId() == NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId();
    }
}
