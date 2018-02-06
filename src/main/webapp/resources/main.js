var Chamber = React.createClass({
    render: function() {
        return (
            <Main />
        );
    }
});
var App = React.createClass({
    render: function() {
        return (
            <div id="wrapper">
                <TopNav />
                <MainBody />
            </div>
        );
    }
});

var TopNav = React.createClass({
    render: function() {
        return(
        <header id="topnav">
            <div className="topbar-main">
                <div className="container-fluid">
                    <div className="logo">
                        <a href="/" className="logo">
                            <span className="logo-small"><i className="ion ion-help-buoy"></i></span>
                            <span className="logo-large"><i className="ion ion-help-buoy"></i> SKILL CHAMBER</span>
                        </a>
                    </div>
                    <div className="menu-extras topbar-custom">
                        <ul className="list-inline float-right mb-0">
                            <li className="menu-item list-inline-item">
                                <a className="navbar-toggle nav-link">
                                    <div className="lines">
                                        <span></span>
                                        <span></span>
                                        <span></span>
                                    </div>
                                </a>
                            </li>
                            <li className="list-inline-item dropdown notification-list">
                                <a className="nav-link dropdown-toggle arrow-none waves-effect" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                                    <i className="mdi mdi-bell noti-icon"></i>
                                    <span className="badge badge-pink noti-icon-badge">4</span>
                                </a>
                                <div className="dropdown-menu dropdown-menu-right dropdown-arrow dropdown-menu-lg" aria-labelledby="Preview">
                                    <div className="dropdown-item noti-title">
                                        <h5 className="font-16"><span class="badge badge-danger float-right">5</span>Notification</h5>
                                    </div>
                                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                                        <div className="notify-icon bg-success"><i class="mdi mdi-comment-account"></i></div>
                                        <p className="notify-details">Robert S. Taylor commented on Admin<small className="text-muted">1 min ago</small></p>
                                    </a>

                                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                                        <div className="notify-icon bg-info"><i className="mdi mdi-account"></i></div>
                                        <p className="notify-details">New user registered.<small className="text-muted">1 min ago</small></p>
                                    </a>

                                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                                        <div className="notify-icon bg-danger"><i className="mdi mdi-airplane"></i></div>
                                        <p className="notify-details">Carlos Crouch liked <b>Admin</b><small className="text-muted">1 min ago</small></p>
                                    </a>

                                    <a href="javascript:void(0);" className="dropdown-item notify-item notify-all">
                                        View All
                                    </a>

                                </div>
                            </li>

                            <li className="list-inline-item dropdown notification-list">
                                <a className="nav-link dropdown-toggle waves-effect nav-user" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                                    <img src="assets/images/users/avatar-1.jpg" alt="user" className="rounded-circle" />
                                </a>
                                <div className="dropdown-menu dropdown-menu-right profile-dropdown " aria-labelledby="Preview">
                                    <div className="dropdown-item noti-title">
                                        <h5 className="text-overflow"><small className="text-white">Welcome ! John</small> </h5>
                                    </div>
                                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                                        <i className="mdi mdi-account-star-variant"></i> <span>Profile</span>
                                    </a>
                                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                                        <i className="mdi mdi-settings"></i> <span>Settings</span>
                                    </a>

                                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                                        <i className="mdi mdi-lock-open"></i> <span>Lock Screen</span>
                                    </a>

                                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                                        <i className="mdi mdi-logout"></i> <span>Logout</span>
                                    </a>
                                </div>
                            </li>

                        </ul>
                    </div>
                    <div className="clearfix"></div>
                </div>
            </div>
            <div className="navbar-custom">
            <div className="container-fluid">
            <div id="navigation">
                <ul className="navigation-menu">
                    <li>
                        <i className="ti-home"></i><span> Chamber </span>
                    </li>
                    <li>
                        <i className="ti-home"></i><span> Admin </span>
                    </li>
                </ul>
    </div>
    </div>
    </div>
</header>
        )
    }
});

var MainBody = React.createClass({
    render: function() {
    return(
        <div className="wrapper">
        <div className="row">
            <div className="col-sm-4 col-lg-3 col-xs-12">

                <div className="card m-b-20">
                    <img className="card-img-top img-fluid" src="https://s3-us-west-2.amazonaws.com/skillchamber/images/latest.jpg" alt="Card image cap" />
                        <div className="card-body">
                            <h5 className="card-title">Card title</h5>
                            <p className="card-text">Some quick example text to build on the card title and make
                                up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Button</a>
                        </div>
                </div>

            </div>

            <div className="col-sm-4 col-lg-3 col-xs-12">

                <div className="card m-b-20">
                    <img className="card-img-top img-fluid" src="https://s3-us-west-2.amazonaws.com/skillchamber/images/masters.jpg" alt="Card image cap" />
                        <div className="card-body">
                            <h5 className="card-title">Card title</h5>
                            <p className="card-text">Some quick example text to build on the card title and make
                                up the bulk of the card's content.</p>
                        </div>
                        <ul className="list-group list-group-flush">
                            <li className="list-group-item">Cras justo odio</li>
                            <li className="list-group-item">Dapibus ac facilisis in</li>
                        </ul>
                        <div class="card-body">
                            <a href="#" class="card-link">Card link</a>
                            <a href="#" class="card-link">Another link</a>
                        </div>
                </div>

            </div>

            <div className="col-sm-4 col-lg-3 col-xs-12">

                <div className="card m-b-20">
                    <img className="card-img-top img-fluid" src="https://s3-us-west-2.amazonaws.com/skillchamber/images/train.jpg" alt="Card image cap" />
                        <div className="card-body">
                            <p className="card-text">Some quick example text to build on the card title and make
                                up the bulk of the card's content.</p>
                        </div>
                </div>

            </div>
            <div className="col-sm-4 col-lg-3 col-xs-12">

                <div className="card m-b-20">
                    <div className="card-body">
                        <h5 className="card-title">Card title</h5>
                        <h6 className="card-subtitle text-muted">Support card subtitle</h6>
                    </div>
                    <img className="img-fluid" src="https://s3-us-west-2.amazonaws.com/skillchamber/images/join.jpg" alt="Card image cap" />
                        <div className="card-body">
                            <p className="card-text">Some quick example text to build on the card title and make
                                up the bulk of the card's content.</p>
                            <a href="#" class="card-link">Card link</a>
                            <a href="#" class="card-link">Another link</a>
                        </div>
                </div>
            </div>
        </div>
        </div>
    )}

});

var hello = React.createClass({
    render: function(){
        return "hello"
    }

});

ReactDOM.render(
    <App />, document.getElementById('root')
);

ReactDOM.render((
    <Router>
        <Route path="/" component={hello} />
        <Route path="/users" component={Users} />
        <Route path="/widgets" component={Widgets} />
    </Router>
), document.getElementById('root'));