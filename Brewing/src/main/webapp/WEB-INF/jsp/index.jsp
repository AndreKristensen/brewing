<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ASK Brewing</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css"rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/static/css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/static/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  <!-- jQuery -->

<!--     Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>


<!--     Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/classie.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/cbpAnimatedHeader.js"></script>

<!--     Contact Form JavaScript -->
    <script src="${pageContext.request.contextPath}/static/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/contact_me.js"></script>

<!--     Custom Theme JavaScript -->
    <script src="${pageContext.request.contextPath}/static/js/freelancer.js"></script>
</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#page-top">ASK Brewing</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="#labels">Labels</a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="#brews">Brews</a>
                    </li>
                    
                    <li class="page-scroll">
                        <a href="#about">About</a>
                    </li>
                  
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/static/image/asklogo.png" alt="">
                    <div class="intro-text">
                        <span class="name">ASK Brewing</span>
                        <hr class="star-light">
                        <span class="skills">Brewing since May 2013</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

  
  <!-- Brews Section -->
    <section id="brews">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Brews</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 text-center">
               <table class="table table-striped table-bordered" >
		<tr>
			<th>Batch #</th>
			<th>Brew Name</th>
			<th>Measured ABV (‰)</th>
			<th>Style</th>
			<th>Type</th>
			<th>Version</th>
			<th>Date</th>
			<th>Bottle Date</th>
			<th>End Date</th>
			<th>Tot Hops (g)</th>
			<th>Tot Grains (kg)</th>
			<th>Measured Bottling (l)</th>
			<th>Measured Mash Eff (%)</th>
			
		</tr>
		<c:forEach items="${brews}" var="brew">
			<tr>
				<td>${brew.batchNumber}</td>
				<td>${brew.name}</td>
				<td>${brew.mABV}</td>
				<td>${brew.style}</td>
				<td>${brew.type}</td>
				<td>${brew.version}</td>
				<td>${brew.brewDate}</td>
				<td>${brew.bottledDate}</td>
				<td>${brew.endDate}</td>
				<td>${brew.hops}</td>
				<td>${brew.grains}</td>
				<td>${brew.mBottlingVolume}</td>
				<td>${brew.mMashEff}</td>
			</tr>
		</c:forEach>
	</table>
               
                </div>
            </div>
        </div>
    </section>
    
      <!-- Portfolio Grid Section -->
    <section id="labels">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Brew labels</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
            	<c:forEach items="${img}" var="i">
            	<div class="col-sm-4 portfolio-item">
            	<a href="#portfolioModal${i}" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
<!--                             <div class="caption-content"> -->
<!--                                 <i class="fa fa-search-plus fa-3x"></i> -->
<!--                             </div> -->
                        </div>
                        <img src="${pageContext.request.contextPath}/static/image/${i}" class="img-responsive" alt="">
                    </a>
                    </div>
				</c:forEach>
            
            </div>
        </div>
    </section>
    
    
    <!-- About Section -->
    <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>About</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p>Andre S. Kristensen</p>
                </div>
            </div>
          
        </div>
    </section>

  

    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-4">
                        <h3>Location</h3>
                        <p>TBA</p>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>Around the Web</h3>
                        <ul class="list-inline">
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                            </li>
                        </ul>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>About ASK Brewing</h3>
                        <p>TBA</a>.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; askbrewing 2014
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-top page-scroll visible-xs visble-sm">
        <a class="btn btn-primary" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>
    

</body>

</html>
